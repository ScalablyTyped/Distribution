package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipointDrawActionDrawCompleteEvent extends StObject {
  
  var defaultPrevented: Boolean
  
  var preventDefault: js.Function
  
  var `type`: `draw-complete`
  
  var vertices: js.Array[js.Array[Double]]
}
object MultipointDrawActionDrawCompleteEvent {
  
  @scala.inline
  def apply(defaultPrevented: Boolean, preventDefault: js.Function, vertices: js.Array[js.Array[Double]]): MultipointDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw-complete")
    __obj.asInstanceOf[MultipointDrawActionDrawCompleteEvent]
  }
  
  @scala.inline
  implicit class MultipointDrawActionDrawCompleteEventMutableBuilder[Self <: MultipointDrawActionDrawCompleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `draw-complete`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
