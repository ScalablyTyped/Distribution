package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientParams extends StObject {
  
  var client_id: String
}
object ClientParams {
  
  inline def apply(client_id: String): ClientParams = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientParams] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
