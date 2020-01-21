package typings.awsLambda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSMessage extends js.Object {
  var Message: String
  var MessageAttributes: SNSMessageAttributes
  var MessageId: String
  var Signature: String
  var SignatureVersion: String
  var SigningCertUrl: String
  var Subject: String
  var Timestamp: String
  var TopicArn: String
  var Type: String
  var UnsubscribeUrl: String
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
}

