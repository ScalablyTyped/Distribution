package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSourceIdentifierToSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
}

object AddSourceIdentifierToSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): AddSourceIdentifierToSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
  }
}

