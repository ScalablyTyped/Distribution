package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSDestination extends js.Object {
  /**
    * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicARN: AmazonResourceName
}

object SNSDestination {
  @scala.inline
  def apply(TopicARN: AmazonResourceName): SNSDestination = {
    val __obj = js.Dynamic.literal(TopicARN = TopicARN)
  
    __obj.asInstanceOf[SNSDestination]
  }
}

