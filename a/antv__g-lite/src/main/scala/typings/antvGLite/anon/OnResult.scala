package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResult extends StObject {
  
  var onDone: Any
  
  var onError: Any
  
  var onResult: Any
  
  var onTap: js.UndefOr[js.Function2[/* i */ Any, /* run */ Any, Any]] = js.undefined
  
  var rethrowIfPossible: Any
}
object OnResult {
  
  inline def apply(onDone: Any, onError: Any, onResult: Any, rethrowIfPossible: Any): OnResult = {
    val __obj = js.Dynamic.literal(onDone = onDone.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onResult = onResult.asInstanceOf[js.Any], rethrowIfPossible = rethrowIfPossible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnResult] (val x: Self) extends AnyVal {
    
    inline def setOnDone(value: Any): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnResult(value: Any): Self = StObject.set(x, "onResult", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: (/* i */ Any, /* run */ Any) => Any): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setRethrowIfPossible(value: Any): Self = StObject.set(x, "rethrowIfPossible", value.asInstanceOf[js.Any])
  }
}
