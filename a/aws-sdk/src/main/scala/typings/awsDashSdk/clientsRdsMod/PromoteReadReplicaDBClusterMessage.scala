package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoteReadReplicaDBClusterMessage extends js.Object {
  /**
    * The identifier of the DB cluster Read Replica to promote. This parameter is not case-sensitive.  Constraints:   Must match the identifier of an existing DBCluster Read Replica.   Example: my-cluster-replica1 
    */
  var DBClusterIdentifier: String
}

object PromoteReadReplicaDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
  
    __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
  }
}

