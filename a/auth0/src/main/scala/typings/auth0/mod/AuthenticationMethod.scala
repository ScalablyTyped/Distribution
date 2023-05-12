package typings.auth0.mod

import typings.auth0.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethod extends StObject {
  
  var authentication_methods: js.UndefOr[js.Array[Id]] = js.undefined
  
  var confirmed: js.UndefOr[Boolean] = js.undefined
  
  var created_at: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var enrolled_at: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var key_id: js.UndefOr[String] = js.undefined
  
  var last_auth_at: js.UndefOr[String] = js.undefined
  
  var link_id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var preferred_authentication_method: js.UndefOr[String] = js.undefined
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object AuthenticationMethod {
  
  inline def apply(created_at: String, id: String, `type`: String): AuthenticationMethod = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setAuthentication_methods(value: js.Array[Id]): Self = StObject.set(x, "authentication_methods", value.asInstanceOf[js.Any])
    
    inline def setAuthentication_methodsUndefined: Self = StObject.set(x, "authentication_methods", js.undefined)
    
    inline def setAuthentication_methodsVarargs(value: Id*): Self = StObject.set(x, "authentication_methods", js.Array(value*))
    
    inline def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    
    inline def setConfirmedUndefined: Self = StObject.set(x, "confirmed", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnrolled_at(value: String): Self = StObject.set(x, "enrolled_at", value.asInstanceOf[js.Any])
    
    inline def setEnrolled_atUndefined: Self = StObject.set(x, "enrolled_at", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
    
    inline def setLast_auth_at(value: String): Self = StObject.set(x, "last_auth_at", value.asInstanceOf[js.Any])
    
    inline def setLast_auth_atUndefined: Self = StObject.set(x, "last_auth_at", js.undefined)
    
    inline def setLink_id(value: String): Self = StObject.set(x, "link_id", value.asInstanceOf[js.Any])
    
    inline def setLink_idUndefined: Self = StObject.set(x, "link_id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPreferred_authentication_method(value: String): Self = StObject.set(x, "preferred_authentication_method", value.asInstanceOf[js.Any])
    
    inline def setPreferred_authentication_methodUndefined: Self = StObject.set(x, "preferred_authentication_method", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
