package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.PropertyKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshVertexAttributes extends AnonymousAccessor {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[Uint8Array] = js.native
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[Float32Array] = js.native
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: Float64Array = js.native
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1. The 4th element is a sign value (-1 or +1) indicating handedness of the tangent basis). Vertex tangents are used for normal mapping, see [MeshMaterial.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[Float32Array] = js.native
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[Float32Array] = js.native
}

object MeshVertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, MeshVertexAttributes]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], MeshVertexAttributes]])
  ): MeshVertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributes]
  }
  @scala.inline
  implicit class MeshVertexAttributesOps[Self <: MeshVertexAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPosition(value: Float64Array): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Uint8Array): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setNormal(value: Float32Array): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setTangent(value: Float32Array): Self = this.set("tangent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTangent: Self = this.set("tangent", js.undefined)
    @scala.inline
    def setUv(value: Float32Array): Self = this.set("uv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUv: Self = this.set("uv", js.undefined)
  }
  
}

