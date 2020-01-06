package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB cluster to create a snapshot for. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The identifier of the DB cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1-snapshot1 
    */
  var DBClusterSnapshotIdentifier: String = js.native
  /**
    * The tags to be assigned to the DB cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, DBClusterSnapshotIdentifier: String, Tags: TagList = null): CreateDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
  }
}

