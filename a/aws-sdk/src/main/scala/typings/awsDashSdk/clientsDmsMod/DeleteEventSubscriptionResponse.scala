package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventSubscriptionResponse extends js.Object {
  /**
    * The event subscription that was deleted.
    */
  var EventSubscription: js.UndefOr[typings.awsDashSdk.clientsDmsMod.EventSubscription] = js.undefined
}

object DeleteEventSubscriptionResponse {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): DeleteEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[DeleteEventSubscriptionResponse]
  }
}

