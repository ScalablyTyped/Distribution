package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSelectResultEvent extends StObject {
  
  var result: SearchViewModelSelectResultEventResult
  
  var source: Any
  
  var sourceIndex: Double
}
object SearchViewModelSelectResultEvent {
  
  inline def apply(result: SearchViewModelSelectResultEventResult, source: Any, sourceIndex: Double): SearchViewModelSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSelectResultEvent]
  }
  
  extension [Self <: SearchViewModelSelectResultEvent](x: Self) {
    
    inline def setResult(value: SearchViewModelSelectResultEventResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
