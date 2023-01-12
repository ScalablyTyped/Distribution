package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAddEventInfo
  extends StObject
     with CreateToolEventInfo
     with UpdateToolEventInfo {
  
  /**
    * An array of x,y coordinates representing the vertices added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var added: js.Array[Double]
  
  /**
    * Type is always `vertex-add`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var `type`: `vertex-add`
  
  /**
    * Contains the details of the added vertices to track changes in topology of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var vertices: js.Array[VertexAddEventInfoVertices]
}
object VertexAddEventInfo {
  
  inline def apply(added: js.Array[Double], vertices: js.Array[VertexAddEventInfoVertices]): VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-add")
    __obj.asInstanceOf[VertexAddEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexAddEventInfo] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[Double]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Double*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setType(value: `vertex-add`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[VertexAddEventInfoVertices]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: VertexAddEventInfoVertices*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
