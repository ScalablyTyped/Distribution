package typings.algoliaTransporter.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryError
  extends StObject
     with Error {
  
  /**
    * Contains report of stack frames of the
    * execution of a certain request.
    */
  val transporterStackTrace: js.Array[StackFrame]
}
object RetryError {
  
  inline def apply(message: String, name: String, transporterStackTrace: js.Array[StackFrame]): RetryError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryError]
  }
  
  extension [Self <: RetryError](x: Self) {
    
    inline def setTransporterStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "transporterStackTrace", value.asInstanceOf[js.Any])
    
    inline def setTransporterStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "transporterStackTrace", js.Array(value :_*))
  }
}
