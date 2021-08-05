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
  
  inline def apply(args: js.Array[js.Any], error: String, kwargs: js.Any): IError = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  extension [Self <: IError](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKwargs(value: js.Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
  }
}
