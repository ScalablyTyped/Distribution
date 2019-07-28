package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMinuteUsageResponse extends js.Object {
  /**
    * Estimated number of minutes remaining for an account, specific to the month being requested.
    */
  var estimatedMinutesRemaining: js.UndefOr[Integer] = js.undefined
  /**
    * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month being requested.
    */
  var isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined
  /**
    * Total number of reserved minutes allocated, specific to the month being requested.
    */
  var totalReservedMinuteAllocation: js.UndefOr[Integer] = js.undefined
  /**
    * Total scheduled minutes for an account, specific to the month being requested.
    */
  var totalScheduledMinutes: js.UndefOr[Integer] = js.undefined
  /**
    * Upcoming minutes scheduled for an account, specific to the month being requested.
    */
  var upcomingMinutesScheduled: js.UndefOr[Integer] = js.undefined
}

object GetMinuteUsageResponse {
  @scala.inline
  def apply(
    estimatedMinutesRemaining: js.UndefOr[Integer] = js.undefined,
    isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined,
    totalReservedMinuteAllocation: js.UndefOr[Integer] = js.undefined,
    totalScheduledMinutes: js.UndefOr[Integer] = js.undefined,
    upcomingMinutesScheduled: js.UndefOr[Integer] = js.undefined
  ): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(estimatedMinutesRemaining)) __obj.updateDynamic("estimatedMinutesRemaining")(estimatedMinutesRemaining)
    if (!js.isUndefined(isReservedMinutesCustomer)) __obj.updateDynamic("isReservedMinutesCustomer")(isReservedMinutesCustomer)
    if (!js.isUndefined(totalReservedMinuteAllocation)) __obj.updateDynamic("totalReservedMinuteAllocation")(totalReservedMinuteAllocation)
    if (!js.isUndefined(totalScheduledMinutes)) __obj.updateDynamic("totalScheduledMinutes")(totalScheduledMinutes)
    if (!js.isUndefined(upcomingMinutesScheduled)) __obj.updateDynamic("upcomingMinutesScheduled")(upcomingMinutesScheduled)
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
}

