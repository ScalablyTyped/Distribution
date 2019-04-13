package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotCopyStatus extends js.Object {
  /**
    * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[String] = js.undefined
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region.
    */
  var RetentionPeriod: js.UndefOr[Long] = js.undefined
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
}

object ClusterSnapshotCopyStatus {
  @scala.inline
  def apply(
    DestinationRegion: String = null,
    ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined,
    RetentionPeriod: js.UndefOr[Long] = js.undefined,
    SnapshotCopyGrantName: String = null
  ): ClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    if (DestinationRegion != null) __obj.updateDynamic("DestinationRegion")(DestinationRegion)
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod)
    if (!js.isUndefined(RetentionPeriod)) __obj.updateDynamic("RetentionPeriod")(RetentionPeriod)
    if (SnapshotCopyGrantName != null) __obj.updateDynamic("SnapshotCopyGrantName")(SnapshotCopyGrantName)
    __obj.asInstanceOf[ClusterSnapshotCopyStatus]
  }
}

