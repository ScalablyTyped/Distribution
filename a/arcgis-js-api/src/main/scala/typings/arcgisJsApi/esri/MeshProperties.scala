package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshProperties extends GeometryProperties {
  
  /**
    * An array of mesh components that can be used to apply materials to different regions of the same mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#components)
    */
  var components: js.UndefOr[js.Array[MeshComponentProperties]] = js.native
  
  /**
    * Object describing the attributes of each vertex of the mesh.
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
