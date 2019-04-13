package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventSubscriptionResponse extends js.Object {
  /**
    * The event subscription that was created.
    */
  var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
}

object CreateEventSubscriptionResponse {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): CreateEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[CreateEventSubscriptionResponse]
  }
}

