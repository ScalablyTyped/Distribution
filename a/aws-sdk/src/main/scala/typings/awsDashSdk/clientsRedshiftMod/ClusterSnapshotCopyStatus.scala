package typings.awsDashSdk.clientsRedshiftMod

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
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    RetentionPeriod: Int | scala.Double = null,
    SnapshotCopyGrantName: String = null
  ): ClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    if (DestinationRegion != null) __obj.updateDynamic("DestinationRegion")(DestinationRegion)
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (RetentionPeriod != null) __obj.updateDynamic("RetentionPeriod")(RetentionPeriod.asInstanceOf[js.Any])
    if (SnapshotCopyGrantName != null) __obj.updateDynamic("SnapshotCopyGrantName")(SnapshotCopyGrantName)
    __obj.asInstanceOf[ClusterSnapshotCopyStatus]
  }
}

