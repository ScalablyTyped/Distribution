package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & { readonly status :number,  readonly transporterStackTrace :std.Array<@algolia/transporter.@algolia/transporter.StackFrame>} */
@js.native
trait ApiError extends StObject {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  /**
    * The http status code.
    */
  val status: Double = js.native
  
  /**
    * Contains report of stack frames of the
    * execution of a certain request.
    */
  val transporterStackTrace: js.Array[StackFrame] = js.native
}
object ApiError {
  
  @scala.inline
  def apply(message: String, name: String, status: Double, transporterStackTrace: js.Array[StackFrame]): ApiError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  
  @scala.inline
  implicit class ApiErrorMutableBuilder[Self <: ApiError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransporterStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "transporterStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransporterStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "transporterStackTrace", js.Array(value :_*))
  }
}
