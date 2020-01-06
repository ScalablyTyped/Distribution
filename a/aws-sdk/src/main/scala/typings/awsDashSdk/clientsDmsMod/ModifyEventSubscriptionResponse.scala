package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEventSubscriptionResponse extends js.Object {
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[typings.awsDashSdk.clientsDmsMod.EventSubscription] = js.native
}

object ModifyEventSubscriptionResponse {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
}

