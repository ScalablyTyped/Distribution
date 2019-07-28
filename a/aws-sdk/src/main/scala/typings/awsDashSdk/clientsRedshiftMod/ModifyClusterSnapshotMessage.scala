package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClusterSnapshotMessage extends js.Object {
  /**
    * A Boolean option to override an exception if the retention period has already passed.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately delete the snapshot. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The identifier of the snapshot whose setting you want to modify.
    */
  var SnapshotIdentifier: String
}

object ModifyClusterSnapshotMessage {
  @scala.inline
  def apply(
    SnapshotIdentifier: String,
    Force: js.UndefOr[Boolean] = js.undefined,
    ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  ): ModifyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod)
    __obj.asInstanceOf[ModifyClusterSnapshotMessage]
  }
}

