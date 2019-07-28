package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.EventSubscription] = js.undefined
}

object ModifyEventSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): ModifyEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[ModifyEventSubscriptionResult]
  }
}

