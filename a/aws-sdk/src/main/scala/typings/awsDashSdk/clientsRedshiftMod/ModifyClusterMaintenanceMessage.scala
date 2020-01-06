package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterMaintenanceMessage extends js.Object {
  /**
    * A unique identifier for the cluster.
    */
  var ClusterIdentifier: String = js.native
  /**
    * A boolean indicating whether to enable the deferred maintenance window. 
    */
  var DeferMaintenance: js.UndefOr[BooleanOptional] = js.native
  /**
    * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
    */
  var DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.native
  /**
    * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.native
  /**
    * A unique identifier for the deferred maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  /**
    * A timestamp indicating the start time for the deferred maintenance window.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.native
}

object ModifyClusterMaintenanceMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    DeferMaintenance: js.UndefOr[scala.Boolean] = js.undefined,
    DeferMaintenanceDuration: Int | scala.Double = null,
    DeferMaintenanceEndTime: TStamp = null,
    DeferMaintenanceIdentifier: String = null,
    DeferMaintenanceStartTime: TStamp = null
  ): ModifyClusterMaintenanceMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(DeferMaintenance)) __obj.updateDynamic("DeferMaintenance")(DeferMaintenance.asInstanceOf[js.Any])
    if (DeferMaintenanceDuration != null) __obj.updateDynamic("DeferMaintenanceDuration")(DeferMaintenanceDuration.asInstanceOf[js.Any])
    if (DeferMaintenanceEndTime != null) __obj.updateDynamic("DeferMaintenanceEndTime")(DeferMaintenanceEndTime.asInstanceOf[js.Any])
    if (DeferMaintenanceIdentifier != null) __obj.updateDynamic("DeferMaintenanceIdentifier")(DeferMaintenanceIdentifier.asInstanceOf[js.Any])
    if (DeferMaintenanceStartTime != null) __obj.updateDynamic("DeferMaintenanceStartTime")(DeferMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterMaintenanceMessage]
  }
}

