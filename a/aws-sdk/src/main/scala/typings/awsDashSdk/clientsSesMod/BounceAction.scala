package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceAction extends js.Object {
  /**
    * Human-readable text to include in the bounce message.
    */
  var Message: BounceMessage
  /**
    * The email address of the sender of the bounced email. This is the address from which the bounce message will be sent.
    */
  var Sender: Address
  /**
    * The SMTP reply code, as defined by RFC 5321.
    */
  var SmtpReplyCode: BounceSmtpReplyCode
  /**
    * The SMTP enhanced status code, as defined by RFC 3463.
    */
  var StatusCode: js.UndefOr[BounceStatusCode] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object BounceAction {
  @scala.inline
  def apply(
    Message: BounceMessage,
    Sender: Address,
    SmtpReplyCode: BounceSmtpReplyCode,
    StatusCode: BounceStatusCode = null,
    TopicArn: AmazonResourceName = null
  ): BounceAction = {
    val __obj = js.Dynamic.literal(Message = Message, Sender = Sender, SmtpReplyCode = SmtpReplyCode)
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode)
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[BounceAction]
  }
}

