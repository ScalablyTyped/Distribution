package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.flat
import typings.arcgisJsApi.arcgisJsApiStrings.smooth
import typings.arcgisJsApi.arcgisJsApiStrings.source
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshComponentProperties extends js.Object {
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs. Each triple of indices defines a triangle to render (i.e. the faces array must always have a length that is a multiple of 3). Note that the indices refer to **vertices** and not to the index of the first coordinate of a vertex in the [vertexAttributes.position](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) array.  If faces is `null`, then all the vertices in the mesh will be rendered as triangles for this component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: js.UndefOr[Uint32Array | js.Array[Double] | Uint16Array] = js.native
  /**
    * The material determines how the component is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: js.UndefOr[MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties] = js.native
  /**
    * Specifies the type of normals used for lighting. This determines whether the object has a smooth or an angular appearance. The following shading types are supported:
    *
    * | Type | Description |
    * |------|-------------|
    * | source | Shading uses the normals as defined in the vertex attributes. If no normals are defined, then shading defaults back to `flat` |
    * | flat | Shading uses normals created per triangle face. This type of shading is good for objects with sharp edges such as boxes. |
    * | smooth | Shading uses per-vertex normals that average the normals of all the faces a vertex is a part of. This type of shading is good for meshes that approximate curved surfaces such as spheres. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#shading)
    */
  var shading: js.UndefOr[source | flat | smooth] = js.native
}

object MeshComponentProperties {
  @scala.inline
  def apply(): MeshComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshComponentProperties]
  }
  @scala.inline
  implicit class MeshComponentPropertiesOps[Self <: MeshComponentProperties] (val x: Self) extends AnyVal {
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
    def setFacesVarargs(value: Double*): Self = this.set("faces", js.Array(value :_*))
    @scala.inline
    def setFaces(value: Uint32Array | js.Array[Double] | Uint16Array): Self = this.set("faces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaces: Self = this.set("faces", js.undefined)
    @scala.inline
    def setMaterial(value: MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setShading(value: source | flat | smooth): Self = this.set("shading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
  }
  
}

