package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IError extends StObject {
  
  var args: js.Array[js.Any]
  
  var error: String
  
  var kwargs: js.Any
}
object IError {
  
  @scala.inline
  def apply(args: js.Array[js.Any], error: String, kwargs: js.Any): IError = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKwargs(value: js.Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
  }
}
