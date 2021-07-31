package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAddEventInfoVertices
  extends StObject
     with Object {
  
  /**
    * The ring/path index of the added vertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var componentIndex: Double
  
  /**
    * The [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries representing the vertices that were added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var coordinates: js.Array[Graphic]
  
  /**
    * The index of the vertex position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var vertexIndex: Double
}
object VertexAddEventInfoVertices {
  
  @scala.inline
  def apply(
    componentIndex: Double,
    constructor: js.Function,
    coordinates: js.Array[Graphic],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertexIndex: Double
  ): VertexAddEventInfoVertices = {
    val __obj = js.Dynamic.literal(componentIndex = componentIndex.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAddEventInfoVertices]
  }
  
  @scala.inline
  implicit class VertexAddEventInfoVerticesMutableBuilder[Self <: VertexAddEventInfoVertices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentIndex(value: Double): Self = StObject.set(x, "componentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinates(value: js.Array[Graphic]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: Graphic*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
  }
}
