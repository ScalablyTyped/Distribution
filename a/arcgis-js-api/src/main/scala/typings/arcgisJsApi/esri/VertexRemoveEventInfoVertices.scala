package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexRemoveEventInfoVertices extends Object {
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
  @scala.inline
  def apply(
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
}

