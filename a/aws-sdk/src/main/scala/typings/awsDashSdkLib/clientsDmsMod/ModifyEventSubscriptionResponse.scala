package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEventSubscriptionResponse extends js.Object {
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
}

object ModifyEventSubscriptionResponse {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
}

