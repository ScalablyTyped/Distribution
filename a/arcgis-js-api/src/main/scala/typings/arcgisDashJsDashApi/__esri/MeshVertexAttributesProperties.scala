package typings.arcgisDashJsDashApi.__esri

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshVertexAttributesProperties extends Object {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[Uint8Array | js.Array[Double] | Uint8ClampedArray] = js.undefined
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[Float32Array | js.Array[Double] | Float64Array] = js.undefined
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.UndefOr[Float64Array | js.Array[Double] | Float32Array] = js.undefined
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[Float32Array | js.Array[Double] | Float64Array] = js.undefined
}

object MeshVertexAttributesProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Uint8Array | js.Array[Double] | Uint8ClampedArray = null,
    normal: Float32Array | js.Array[Double] | Float64Array = null,
    position: Float64Array | js.Array[Double] | Float32Array = null,
    uv: Float32Array | js.Array[Double] | Float64Array = null
  ): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
}

