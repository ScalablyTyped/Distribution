package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  /**
    * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
    */
  var event: InspectorEvent
  /**
    * The time at which SubscribeToEvent is called.
    */
  var subscribedAt: Timestamp
}

object EventSubscription {
  @scala.inline
  def apply(event: InspectorEvent, subscribedAt: Timestamp): EventSubscription = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], subscribedAt = subscribedAt)
  
    __obj.asInstanceOf[EventSubscription]
  }
}

