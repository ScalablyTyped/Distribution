package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshVertexAttributesProperties
  extends stdLib.Object {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[stdLib.Uint8Array | js.Array[scala.Double] | stdLib.Uint8ClampedArray] = js.undefined
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[stdLib.Float32Array | js.Array[scala.Double] | stdLib.Float64Array] = js.undefined
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.UndefOr[stdLib.Float64Array | js.Array[scala.Double] | stdLib.Float32Array] = js.undefined
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[stdLib.Float32Array | js.Array[scala.Double] | stdLib.Float64Array] = js.undefined
}

object MeshVertexAttributesProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: stdLib.Uint8Array | js.Array[scala.Double] | stdLib.Uint8ClampedArray = null,
    normal: stdLib.Float32Array | js.Array[scala.Double] | stdLib.Float64Array = null,
    position: stdLib.Float64Array | js.Array[scala.Double] | stdLib.Float32Array = null,
    uv: stdLib.Float32Array | js.Array[scala.Double] | stdLib.Float64Array = null
  ): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
}

