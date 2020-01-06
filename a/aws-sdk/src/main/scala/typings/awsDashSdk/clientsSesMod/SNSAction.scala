package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSAction extends js.Object {
  /**
    * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all special characters. The default value is UTF-8.
    */
  var Encoding: js.UndefOr[SNSActionEncoding] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName = js.native
}

object SNSAction {
  @scala.inline
  def apply(TopicArn: AmazonResourceName, Encoding: SNSActionEncoding = null): SNSAction = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    if (Encoding != null) __obj.updateDynamic("Encoding")(Encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSAction]
  }
}

