package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDrawActionDrawCompleteEvent extends StObject {
  
  var defaultPrevented: Boolean = js.native
  
  var preventDefault: js.Function = js.native
  
  var `type`: `draw-complete` = js.native
  
  var vertices: js.Array[js.Array[Double]] = js.native
}
object SegmentDrawActionDrawCompleteEvent {
  
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `draw-complete`,
    vertices: js.Array[js.Array[Double]]
  ): SegmentDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentDrawActionDrawCompleteEvent]
  }
  
  @scala.inline
  implicit class SegmentDrawActionDrawCompleteEventMutableBuilder[Self <: SegmentDrawActionDrawCompleteEvent] (val x: Self) extends AnyVal {
    
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
