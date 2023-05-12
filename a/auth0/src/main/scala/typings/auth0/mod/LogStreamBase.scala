package typings.auth0.mod

import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogStreamBase extends StObject {
  
  var id: String
  
  var name: String
  
  var status: active | paused | suspended
}
object LogStreamBase {
  
  inline def apply(id: String, name: String, status: active | paused | suspended): LogStreamBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogStreamBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogStreamBase] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | paused | suspended): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
