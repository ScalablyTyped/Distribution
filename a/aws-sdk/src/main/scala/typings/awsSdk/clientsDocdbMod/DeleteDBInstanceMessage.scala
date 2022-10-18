package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceMessage extends StObject {
  
  /**
    * The instance identifier for the instance to be deleted. This parameter isn't case sensitive. Constraints:   Must match the name of an existing instance.  
    */
  var DBInstanceIdentifier: String
}
object DeleteDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): DeleteDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceMessage]
  }
  
  extension [Self <: DeleteDBInstanceMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
