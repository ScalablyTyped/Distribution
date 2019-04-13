package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookingOptions extends js.Object {
  /**
    * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
    */
  var AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * The resource's ability to automatically decline any conflicting requests.
    */
  var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * The resource's ability to automatically decline any recurring requests.
    */
  var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
}

object BookingOptions {
  @scala.inline
  def apply(
    AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined,
    AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined,
    AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
  ): BookingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoAcceptRequests)) __obj.updateDynamic("AutoAcceptRequests")(AutoAcceptRequests)
    if (!js.isUndefined(AutoDeclineConflictingRequests)) __obj.updateDynamic("AutoDeclineConflictingRequests")(AutoDeclineConflictingRequests)
    if (!js.isUndefined(AutoDeclineRecurringRequests)) __obj.updateDynamic("AutoDeclineRecurringRequests")(AutoDeclineRecurringRequests)
    __obj.asInstanceOf[BookingOptions]
  }
}

