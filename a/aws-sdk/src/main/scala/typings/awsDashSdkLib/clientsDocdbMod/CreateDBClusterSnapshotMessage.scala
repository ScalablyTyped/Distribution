package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB cluster to create a snapshot for. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster 
    */
  var DBClusterIdentifier: String
  /**
    * The identifier of the DB cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot1 
    */
  var DBClusterSnapshotIdentifier: String
  /**
    * The tags to be assigned to the DB cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateDBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, DBClusterSnapshotIdentifier: String, Tags: TagList = null): CreateDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
  }
}

