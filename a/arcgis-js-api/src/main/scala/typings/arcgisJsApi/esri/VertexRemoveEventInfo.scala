package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexRemoveEventInfo
  extends StObject
     with UpdateToolEventInfo {
  
  /**
    * An array of x,y coordinates representing the vertices removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var removed: js.Array[Double]
  
  /**
    * Type is always `vertex-remove`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var `type`: `vertex-remove`
  
  /**
    * Contains the details of the removed vertices to track changes in topology of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var vertices: js.Array[VertexRemoveEventInfoVertices]
}
object VertexRemoveEventInfo {
  
  inline def apply(removed: js.Array[Double], vertices: js.Array[VertexRemoveEventInfoVertices]): VertexRemoveEventInfo = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-remove")
    __obj.asInstanceOf[VertexRemoveEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexRemoveEventInfo] (val x: Self) extends AnyVal {
    
    inline def setRemoved(value: js.Array[Double]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Double*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setType(value: `vertex-remove`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[VertexRemoveEventInfoVertices]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: VertexRemoveEventInfoVertices*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
