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
  
  @scala.inline
  def apply(message: String, name: String, transporterStackTrace: js.Array[StackFrame]): RetryError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryError]
  }
  
  @scala.inline
  implicit class RetryErrorMutableBuilder[Self <: RetryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransporterStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "transporterStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransporterStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "transporterStackTrace", js.Array(value :_*))
  }
}
