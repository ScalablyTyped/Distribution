package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0Identity extends StObject {
  
  var connection: String
  
  var isSocial: Boolean
  
  var provider: String
  
  var user_id: String
}
object Auth0Identity {
  
  inline def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Auth0Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Identity]
  }
  
  extension [Self <: Auth0Identity](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
