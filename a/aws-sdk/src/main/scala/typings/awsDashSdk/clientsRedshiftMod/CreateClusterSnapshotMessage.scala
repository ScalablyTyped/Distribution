package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSnapshotMessage extends js.Object {
  /**
    * The cluster identifier for which you want a snapshot.
    */
  var ClusterIdentifier: String
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A unique identifier for the snapshot that you are requesting. This identifier must be unique for all snapshots within the AWS account. Constraints:   Cannot be null, empty, or blank   Must contain from 1 to 255 alphanumeric characters or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var SnapshotIdentifier: String
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateClusterSnapshotMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    SnapshotIdentifier: String,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    Tags: TagList = null
  ): CreateClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, SnapshotIdentifier = SnapshotIdentifier)
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterSnapshotMessage]
  }
}

