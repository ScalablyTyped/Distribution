package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteReadReplicaDBClusterMessage extends StObject {
  
  /**
    * The identifier of the DB cluster read replica to promote. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DB cluster read replica.   Example: my-cluster-replica1 
    */
  var DBClusterIdentifier: String
}
object PromoteReadReplicaDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
  }
  
  extension [Self <: PromoteReadReplicaDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
