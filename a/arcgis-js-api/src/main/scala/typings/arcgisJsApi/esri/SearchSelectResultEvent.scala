package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSelectResultEvent extends StObject {
  
  var result: SearchSelectResultEventResult
  
  var source: js.Any
  
  var sourceIndex: Double
}
object SearchSelectResultEvent {
  
  inline def apply(result: SearchSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSelectResultEvent]
  }
  
  extension [Self <: SearchSelectResultEvent](x: Self) {
    
    inline def setResult(value: SearchSelectResultEventResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
