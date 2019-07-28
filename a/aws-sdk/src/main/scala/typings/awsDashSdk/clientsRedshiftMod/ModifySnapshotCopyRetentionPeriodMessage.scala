package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
  /**
    * The unique identifier of the cluster for which you want to change the retention period for either automated or manual snapshots that are copied to a destination AWS Region. Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String
  /**
    * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated snapshots.
    */
  var Manual: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this only changes the retention period of copied automated snapshots.  If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall outside of the new retention period. Constraints: Must be at least 1 and no more than 35 for automated snapshots.  If you specify the manual option, only newly copied manual snapshots will have the new retention period.  If you specify the value of -1 newly copied manual snapshots are retained indefinitely. Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
    */
  var RetentionPeriod: Integer
}

object ModifySnapshotCopyRetentionPeriodMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, RetentionPeriod: Integer, Manual: js.UndefOr[Boolean] = js.undefined): ModifySnapshotCopyRetentionPeriodMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, RetentionPeriod = RetentionPeriod)
    if (!js.isUndefined(Manual)) __obj.updateDynamic("Manual")(Manual)
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
  }
}

