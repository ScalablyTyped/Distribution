package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typings.awsDashSdk.clientsRdsMod.EventSubscription] = js.undefined
}

object CreateEventSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): CreateEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[CreateEventSubscriptionResult]
  }
}

