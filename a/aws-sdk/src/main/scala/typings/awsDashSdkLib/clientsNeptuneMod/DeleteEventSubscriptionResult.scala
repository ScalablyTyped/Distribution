package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
}

object DeleteEventSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): DeleteEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[DeleteEventSubscriptionResult]
  }
}

