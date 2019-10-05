package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableSnapshotCopyMessage extends js.Object {
  /**
    * The unique identifier of the source cluster to copy snapshots from. Constraints: Must be the valid name of an existing cluster that does not already have cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String
  /**
    * The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services General Reference. 
    */
  var DestinationRegion: String
  /**
    * The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Default: 7. Constraints: Must be at least 1 and no more than 35.
    */
  var RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
}

object EnableSnapshotCopyMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    DestinationRegion: String,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    RetentionPeriod: Int | scala.Double = null,
    SnapshotCopyGrantName: String = null
  ): EnableSnapshotCopyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, DestinationRegion = DestinationRegion)
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (RetentionPeriod != null) __obj.updateDynamic("RetentionPeriod")(RetentionPeriod.asInstanceOf[js.Any])
    if (SnapshotCopyGrantName != null) __obj.updateDynamic("SnapshotCopyGrantName")(SnapshotCopyGrantName)
    __obj.asInstanceOf[EnableSnapshotCopyMessage]
  }
}

