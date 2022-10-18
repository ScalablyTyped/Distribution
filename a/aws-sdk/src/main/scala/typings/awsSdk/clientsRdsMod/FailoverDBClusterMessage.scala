package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverDBClusterMessage extends StObject {
  
  /**
    * A DB cluster identifier to force a failover for. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String
  
  /**
    * The name of the DB instance to promote to the primary DB instance. Specify the DB instance identifier for an Aurora Replica or a Multi-AZ readable standby in the DB cluster, for example mydbcluster-replica1. This setting isn't supported for RDS for MySQL Multi-AZ DB clusters.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
}
object FailoverDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  
  extension [Self <: FailoverDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDBInstanceIdentifier(value: String): Self = StObject.set(x, "TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDBInstanceIdentifierUndefined: Self = StObject.set(x, "TargetDBInstanceIdentifier", js.undefined)
  }
}
