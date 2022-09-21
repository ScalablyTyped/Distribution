package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onDone: Any
  
  var onError: Any
  
  var rethrowIfPossible: Any
}
object OnError {
  
  inline def apply(onDone: Any, onError: Any, rethrowIfPossible: Any): OnError = {
    val __obj = js.Dynamic.literal(onDone = onDone.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], rethrowIfPossible = rethrowIfPossible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnDone(value: Any): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setRethrowIfPossible(value: Any): Self = StObject.set(x, "rethrowIfPossible", value.asInstanceOf[js.Any])
  }
}
