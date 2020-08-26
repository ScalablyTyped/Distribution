package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshProperties extends GeometryProperties {
  /**
    * An array of mesh components that can be used to apply materials to different regions of the same mesh. There are three common usage patterns for components.  1. **Specify a material for the whole mesh.** In this case, use a single component with only a material (leaving faces as `null`). 2. **Reuse vertex attributes.** When modeling continuous surfaces, it can be convenient to only specify vertices once and then simply refer to them. In this case, use a single component with faces set to index the vertex attributes that form triangles. 3. **Specify multiple materials for the same mesh.** In this case, use multiple components with faces that determine to which region of the mesh the material of the component applies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#components)
    */
  var components: js.UndefOr[js.Array[MeshComponentProperties]] = js.native
  /**
    * Object describing the attributes of each vertex of the mesh. Vertex attributes are flat numerical arrays that describe the position (mandatory), normal (used for lighting calculations and shading) and uv (used for mapping material images to the mesh surface) for each vertex.  Vertex attributes can be addressed by indices specified in the components [faces](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces) property. If the mesh does not contain any components, or if a component does not specify any faces, then the vertex attributes are interpreted as if each consecutive vertex triple makes up a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var vertexAttributes: js.UndefOr[MeshVertexAttributesProperties] = js.native
}

object MeshProperties {
  @scala.inline
  def apply(): MeshProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshProperties]
  }
  @scala.inline
  implicit class MeshPropertiesOps[Self <: MeshProperties] (val x: Self) extends AnyVal {
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
    def setComponentsVarargs(value: MeshComponentProperties*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: js.Array[MeshComponentProperties]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setVertexAttributes(value: MeshVertexAttributesProperties): Self = this.set("vertexAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexAttributes: Self = this.set("vertexAttributes", js.undefined)
  }
  
}

