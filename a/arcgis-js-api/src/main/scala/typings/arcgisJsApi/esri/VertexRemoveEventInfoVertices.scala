package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexRemoveEventInfoVertices
  extends StObject
     with Object {
  
  /**
    * The ring/path index of the removed vertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var componentIndex: Double
  
  /**
    * The [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries representing the vertices that were added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var coordinates: js.Array[Graphic]
  
  /**
    * The index of the vertex position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var vertexIndex: Double
}
object VertexRemoveEventInfoVertices {
  
  inline def apply(
    componentIndex: Double,
    constructor: js.Function,
    coordinates: js.Array[Graphic],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertexIndex: Double
  ): VertexRemoveEventInfoVertices = {
    val __obj = js.Dynamic.literal(componentIndex = componentIndex.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexRemoveEventInfoVertices]
  }
  
  extension [Self <: VertexRemoveEventInfoVertices](x: Self) {
    
    inline def setComponentIndex(value: Double): Self = StObject.set(x, "componentIndex", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[Graphic]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Graphic*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
  }
}
