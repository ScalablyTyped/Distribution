package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchViewModelSelectResultEvent extends StObject {
  
  var result: SearchViewModelSelectResultEventResult
  
  var source: js.Any
  
  var sourceIndex: Double
}
object SearchViewModelSelectResultEvent {
  
  @scala.inline
  def apply(result: SearchViewModelSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchViewModelSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewModelSelectResultEvent]
  }
  
  @scala.inline
  implicit class SearchViewModelSelectResultEventMutableBuilder[Self <: SearchViewModelSelectResultEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SearchViewModelSelectResultEventResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
