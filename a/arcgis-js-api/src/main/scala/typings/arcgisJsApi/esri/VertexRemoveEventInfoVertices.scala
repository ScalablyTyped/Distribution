package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexRemoveEventInfoVertices extends StObject {
  
  /**
  		 * The ring/path index of the removed vertex.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
  		 */
  var componentIndex: Double
  
  /**
  		 * An array of x,y coordinates representing the vertices removed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
  		 */
  var coordinates: js.Array[Double]
  
  /**
  		 * The index of the vertex position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
  		 */
  var vertexIndex: Double
}
object VertexRemoveEventInfoVertices {
  
  inline def apply(componentIndex: Double, coordinates: js.Array[Double], vertexIndex: Double): VertexRemoveEventInfoVertices = {
    val __obj = js.Dynamic.literal(componentIndex = componentIndex.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexRemoveEventInfoVertices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexRemoveEventInfoVertices] (val x: Self) extends AnyVal {
    
    inline def setComponentIndex(value: Double): Self = StObject.set(x, "componentIndex", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
  }
}
