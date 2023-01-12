package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDBInstanceMessage extends StObject {
  
  /**
    * The user-supplied instance identifier.
    */
  var DBInstanceIdentifier: String
}
object StartDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): StartDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDBInstanceMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDBInstanceMessage] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
