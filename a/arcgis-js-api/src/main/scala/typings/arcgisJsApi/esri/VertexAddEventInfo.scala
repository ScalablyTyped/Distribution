package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAddEventInfo
  extends Object
     with CreateToolEventInfo
     with UpdateToolEventInfo {
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries representing the vertices that were added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var added: js.Array[Graphic]
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
  @scala.inline
  def apply(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `vertex-add`,
    vertices: js.Array[VertexAddEventInfoVertices]
  ): VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAddEventInfo]
  }
}

