package typings.algoliaTransporter.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiError
  extends StObject
     with Error {
  
  /**
    * The http status code.
    */
  val status: Double
  
  /**
    * Contains report of stack frames of the
    * execution of a certain request.
    */
  val transporterStackTrace: js.Array[StackFrame]
}
object ApiError {
  
  inline def apply(message: String, name: String, status: Double, transporterStackTrace: js.Array[StackFrame]): ApiError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  
  extension [Self <: ApiError](x: Self) {
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransporterStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "transporterStackTrace", value.asInstanceOf[js.Any])
    
    inline def setTransporterStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "transporterStackTrace", js.Array(value :_*))
  }
}
