package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoneReturns extends StObject {
  
  var doneReturns: Any
  
  var onDone: Any
  
  var onError: Any
  
  var onResult: Any
  
  var resultReturns: Any
  
  var rethrowIfPossible: Any
}
object DoneReturns {
  
  inline def apply(
    doneReturns: Any,
    onDone: Any,
    onError: Any,
    onResult: Any,
    resultReturns: Any,
    rethrowIfPossible: Any
  ): DoneReturns = {
    val __obj = js.Dynamic.literal(doneReturns = doneReturns.asInstanceOf[js.Any], onDone = onDone.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onResult = onResult.asInstanceOf[js.Any], resultReturns = resultReturns.asInstanceOf[js.Any], rethrowIfPossible = rethrowIfPossible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoneReturns] (val x: Self) extends AnyVal {
    
    inline def setDoneReturns(value: Any): Self = StObject.set(x, "doneReturns", value.asInstanceOf[js.Any])
    
    inline def setOnDone(value: Any): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnResult(value: Any): Self = StObject.set(x, "onResult", value.asInstanceOf[js.Any])
    
    inline def setResultReturns(value: Any): Self = StObject.set(x, "resultReturns", value.asInstanceOf[js.Any])
    
    inline def setRethrowIfPossible(value: Any): Self = StObject.set(x, "rethrowIfPossible", value.asInstanceOf[js.Any])
  }
}
