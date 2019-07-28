package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToEventRequest extends js.Object {
  /**
    * The event for which you want to receive SNS notifications.
    */
  var event: InspectorEvent
  /**
    * The ARN of the assessment template that is used during the event for which you want to receive SNS notifications.
    */
  var resourceArn: Arn
  /**
    * The ARN of the SNS topic to which the SNS notifications are sent.
    */
  var topicArn: Arn
}

object SubscribeToEventRequest {
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): SubscribeToEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn, topicArn = topicArn)
  
    __obj.asInstanceOf[SubscribeToEventRequest]
  }
}

