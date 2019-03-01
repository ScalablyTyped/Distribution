package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshVertexAttributes extends AnonymousAccessor {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[stdLib.Uint8Array] = js.undefined
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[stdLib.Float32Array] = js.undefined
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: stdLib.Float64Array
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[stdLib.Float32Array] = js.undefined
}

object MeshVertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    position: stdLib.Float64Array,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: stdLib.Uint8Array = null,
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    normal: stdLib.Float32Array = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, MeshVertexAttributes]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], MeshVertexAttributes]) = null,
    uv: stdLib.Float32Array = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): MeshVertexAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (get != null) __obj.updateDynamic("get")(get)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (set != null) __obj.updateDynamic("set")(set)
    if (uv != null) __obj.updateDynamic("uv")(uv)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[MeshVertexAttributes]
  }
}

