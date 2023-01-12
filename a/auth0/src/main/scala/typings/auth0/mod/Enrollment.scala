package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enrollment extends StObject {
  
  var auth_method: AuthMethod
  
  var enrolled_at: String
  
  var id: String
  
  var last_auth: String
  
  var status: EnrollmentStatus
  
  var `type`: String
}
object Enrollment {
  
  inline def apply(
    auth_method: AuthMethod,
    enrolled_at: String,
    id: String,
    last_auth: String,
    status: EnrollmentStatus,
    `type`: String
  ): Enrollment = {
    val __obj = js.Dynamic.literal(auth_method = auth_method.asInstanceOf[js.Any], enrolled_at = enrolled_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_auth = last_auth.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enrollment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enrollment] (val x: Self) extends AnyVal {
    
    inline def setAuth_method(value: AuthMethod): Self = StObject.set(x, "auth_method", value.asInstanceOf[js.Any])
    
    inline def setEnrolled_at(value: String): Self = StObject.set(x, "enrolled_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_auth(value: String): Self = StObject.set(x, "last_auth", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EnrollmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
