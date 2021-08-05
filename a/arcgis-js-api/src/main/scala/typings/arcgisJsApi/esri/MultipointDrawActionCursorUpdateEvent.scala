package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipointDrawActionCursorUpdateEvent extends StObject {
  
  var defaultPrevented: Boolean
  
  var preventDefault: js.Function
  
  var `type`: `cursor-update`
  
  var vertexIndex: Double
  
  var vertices: js.Array[js.Array[Double]]
}
object MultipointDrawActionCursorUpdateEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[MultipointDrawActionCursorUpdateEvent]
  }
  
  extension [Self <: MultipointDrawActionCursorUpdateEvent](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setType(value: `cursor-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
