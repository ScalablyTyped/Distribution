package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredMaintenanceWindow extends js.Object {
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
}

object DeferredMaintenanceWindow {
  @scala.inline
  def apply(
    DeferMaintenanceEndTime: TStamp = null,
    DeferMaintenanceIdentifier: String = null,
    DeferMaintenanceStartTime: TStamp = null
  ): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (DeferMaintenanceEndTime != null) __obj.updateDynamic("DeferMaintenanceEndTime")(DeferMaintenanceEndTime)
    if (DeferMaintenanceIdentifier != null) __obj.updateDynamic("DeferMaintenanceIdentifier")(DeferMaintenanceIdentifier)
    if (DeferMaintenanceStartTime != null) __obj.updateDynamic("DeferMaintenanceStartTime")(DeferMaintenanceStartTime)
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
}

