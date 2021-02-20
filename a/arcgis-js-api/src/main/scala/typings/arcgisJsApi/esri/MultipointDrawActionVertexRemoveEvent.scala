package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipointDrawActionVertexRemoveEvent extends StObject {
  
  var defaultPrevented: Boolean = js.native
  
  var preventDefault: js.Function = js.native
  
  var `type`: `vertex-remove` = js.native
  
  var vertexIndex: Double = js.native
  
  var vertices: js.Array[js.Array[Double]] = js.native
}
object MultipointDrawActionVertexRemoveEvent {
  
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `vertex-remove`,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionVertexRemoveEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipointDrawActionVertexRemoveEvent]
  }
  
  @scala.inline
  implicit class MultipointDrawActionVertexRemoveEventMutableBuilder[Self <: MultipointDrawActionVertexRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `vertex-remove`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
