package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobError extends StObject {
  
  /**
    * The job error code.
    */
  var code: JobErrorCode
  
  /**
    * Specific information about the error. For example, which service quota was exceeded or which resource was not found.
    */
  var message: String
}
object JobError {
  
  inline def apply(code: JobErrorCode, message: String): JobError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
  
  extension [Self <: JobError](x: Self) {
    
    inline def setCode(value: JobErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
