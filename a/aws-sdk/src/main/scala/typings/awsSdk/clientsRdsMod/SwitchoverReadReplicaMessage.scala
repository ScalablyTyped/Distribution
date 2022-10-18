package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchoverReadReplicaMessage extends StObject {
  
  /**
    * The DB instance identifier of the current standby database. This value is stored as a lowercase string. Constraints:   Must match the identiﬁer of an existing Oracle read replica DB instance.  
    */
  var DBInstanceIdentifier: String
}
object SwitchoverReadReplicaMessage {
  
  inline def apply(DBInstanceIdentifier: String): SwitchoverReadReplicaMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchoverReadReplicaMessage]
  }
  
  extension [Self <: SwitchoverReadReplicaMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
