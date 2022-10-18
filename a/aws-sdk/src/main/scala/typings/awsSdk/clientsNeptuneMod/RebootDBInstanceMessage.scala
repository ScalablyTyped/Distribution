package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootDBInstanceMessage extends StObject {
  
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    *  When true, the reboot is conducted through a MultiAZ failover. Constraint: You can't specify true if the instance is not configured for MultiAZ.
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
}
object RebootDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): RebootDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBInstanceMessage]
  }
  
  extension [Self <: RebootDBInstanceMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setForceFailover(value: BooleanOptional): Self = StObject.set(x, "ForceFailover", value.asInstanceOf[js.Any])
    
    inline def setForceFailoverUndefined: Self = StObject.set(x, "ForceFailover", js.undefined)
  }
}
