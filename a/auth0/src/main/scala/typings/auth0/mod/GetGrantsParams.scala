package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGrantsParams
  extends StObject
     with PagingOptions {
  
  var audience: String
  
  var client_id: String
  
  var user_id: String
}
object GetGrantsParams {
  
  inline def apply(audience: String, client_id: String, user_id: String): GetGrantsParams = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGrantsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGrantsParams] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
