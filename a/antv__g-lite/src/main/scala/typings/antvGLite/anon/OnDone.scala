package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDone extends StObject {
  
  var onDone: Any
  
  var onError: Any
  
  var onResult: Any
  
  var rethrowIfPossible: Any
}
object OnDone {
  
  inline def apply(onDone: Any, onError: Any, onResult: Any, rethrowIfPossible: Any): OnDone = {
    val __obj = js.Dynamic.literal(onDone = onDone.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onResult = onResult.asInstanceOf[js.Any], rethrowIfPossible = rethrowIfPossible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDone] (val x: Self) extends AnyVal {
    
    inline def setOnDone(value: Any): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnResult(value: Any): Self = StObject.set(x, "onResult", value.asInstanceOf[js.Any])
    
    inline def setRethrowIfPossible(value: Any): Self = StObject.set(x, "rethrowIfPossible", value.asInstanceOf[js.Any])
  }
}
