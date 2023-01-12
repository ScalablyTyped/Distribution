package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAddEventInfoVertices extends StObject {
  
  /**
    * The ring/path index of the added vertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var componentIndex: Double
  
  /**
    * An array of x,y coordinates representing the vertices added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var coordinates: js.Array[Double]
  
  /**
    * The index of the vertex position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var vertexIndex: Double
}
object VertexAddEventInfoVertices {
  
  inline def apply(componentIndex: Double, coordinates: js.Array[Double], vertexIndex: Double): VertexAddEventInfoVertices = {
    val __obj = js.Dynamic.literal(componentIndex = componentIndex.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAddEventInfoVertices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexAddEventInfoVertices] (val x: Self) extends AnyVal {
    
    inline def setComponentIndex(value: Double): Self = StObject.set(x, "componentIndex", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
  }
}
