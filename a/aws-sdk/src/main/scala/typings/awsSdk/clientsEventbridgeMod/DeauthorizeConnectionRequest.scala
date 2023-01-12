package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeauthorizeConnectionRequest extends StObject {
  
  /**
    * The name of the connection to remove authorization from.
    */
  var Name: ConnectionName
}
object DeauthorizeConnectionRequest {
  
  inline def apply(Name: ConnectionName): DeauthorizeConnectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthorizeConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeauthorizeConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: ConnectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
