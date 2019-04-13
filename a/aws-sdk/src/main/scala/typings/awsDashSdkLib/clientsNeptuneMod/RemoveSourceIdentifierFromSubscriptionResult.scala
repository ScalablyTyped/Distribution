package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
}

object RemoveSourceIdentifierFromSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription)
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
}

