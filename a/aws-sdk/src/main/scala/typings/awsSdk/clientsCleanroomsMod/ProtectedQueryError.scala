package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryError extends StObject {
  
  /**
    * An error code for the error.
    */
  var code: String
  
  /**
    * A description of why the query failed.
    */
  var message: String
}
object ProtectedQueryError {
  
  inline def apply(code: String, message: String): ProtectedQueryError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQueryError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
