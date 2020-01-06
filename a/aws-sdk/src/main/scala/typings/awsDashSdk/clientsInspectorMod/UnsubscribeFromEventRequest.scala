package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeFromEventRequest extends js.Object {
  /**
    * The event for which you want to stop receiving SNS notifications.
    */
  var event: InspectorEvent = js.native
  /**
    * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS notifications.
    */
  var resourceArn: Arn = js.native
  /**
    * The ARN of the SNS topic to which SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}

object UnsubscribeFromEventRequest {
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): UnsubscribeFromEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeFromEventRequest]
  }
}

