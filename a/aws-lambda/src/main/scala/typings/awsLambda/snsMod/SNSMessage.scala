package typings.awsLambda.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSMessage extends js.Object {
  var Message: String = js.native
  var MessageAttributes: SNSMessageAttributes = js.native
  var MessageId: String = js.native
  var Signature: String = js.native
  var SignatureVersion: String = js.native
  var SigningCertUrl: String = js.native
  var Subject: String = js.native
  var Timestamp: String = js.native
  var TopicArn: String = js.native
  var Type: String = js.native
  var UnsubscribeUrl: String = js.native
}

object SNSMessage {
  @scala.inline
  def apply(
    Message: String,
    MessageAttributes: SNSMessageAttributes,
    MessageId: String,
    Signature: String,
    SignatureVersion: String,
    SigningCertUrl: String,
    Subject: String,
    Timestamp: String,
    TopicArn: String,
    Type: String,
    UnsubscribeUrl: String
  ): SNSMessage = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], MessageAttributes = MessageAttributes.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureVersion = SignatureVersion.asInstanceOf[js.Any], SigningCertUrl = SigningCertUrl.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnsubscribeUrl = UnsubscribeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSMessage]
  }
  @scala.inline
  implicit class SNSMessageOps[Self <: SNSMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageAttributes(value: SNSMessageAttributes): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureVersion(value: String): Self = this.set("SignatureVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningCertUrl(value: String): Self = this.set("SigningCertUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: String): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribeUrl(value: String): Self = this.set("UnsubscribeUrl", value.asInstanceOf[js.Any])
  }
  
}

