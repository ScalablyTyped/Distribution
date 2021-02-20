package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSelectResultEvent extends StObject {
  
  var result: SearchSelectResultEventResult = js.native
  
  var source: js.Any = js.native
  
  var sourceIndex: Double = js.native
}
object SearchSelectResultEvent {
  
  @scala.inline
  def apply(result: SearchSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSelectResultEvent]
  }
  
  @scala.inline
  implicit class SearchSelectResultEventMutableBuilder[Self <: SearchSelectResultEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SearchSelectResultEventResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
  }
}
