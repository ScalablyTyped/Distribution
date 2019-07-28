package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceStartTimeInput extends js.Object {
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.  This value is only available for tape and volume gateways. 
    */
  var DayOfMonth: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DayOfMonth] = js.undefined
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DayOfWeek] = js.undefined
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typings.awsDashSdk.clientsStoragegatewayMod.HourOfDay
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typings.awsDashSdk.clientsStoragegatewayMod.MinuteOfHour
}

object UpdateMaintenanceStartTimeInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    HourOfDay: HourOfDay,
    MinuteOfHour: MinuteOfHour,
    DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
    DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  ): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, HourOfDay = HourOfDay, MinuteOfHour = MinuteOfHour)
    if (!js.isUndefined(DayOfMonth)) __obj.updateDynamic("DayOfMonth")(DayOfMonth)
    if (!js.isUndefined(DayOfWeek)) __obj.updateDynamic("DayOfWeek")(DayOfWeek)
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
}

