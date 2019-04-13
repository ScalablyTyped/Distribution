package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB cluster snapshot to delete. Constraints: Must be the name of an existing DB cluster snapshot in the available state.
    */
  var DBClusterSnapshotIdentifier: String
}

object DeleteDBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterSnapshotIdentifier: String): DeleteDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier)
  
    __obj.asInstanceOf[DeleteDBClusterSnapshotMessage]
  }
}

