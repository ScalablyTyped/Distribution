package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeFromEventRequest extends js.Object {
  /**
    * The event for which you want to stop receiving SNS notifications.
    */
  var event: InspectorEvent
  /**
    * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS notifications.
    */
  var resourceArn: Arn
  /**
    * The ARN of the SNS topic to which SNS notifications are sent.
    */
  var topicArn: Arn
}

object UnsubscribeFromEventRequest {
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): UnsubscribeFromEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn, topicArn = topicArn)
  
    __obj.asInstanceOf[UnsubscribeFromEventRequest]
  }
}

