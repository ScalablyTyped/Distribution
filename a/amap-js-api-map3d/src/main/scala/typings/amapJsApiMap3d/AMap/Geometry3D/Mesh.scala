package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  
  val faces: js.Array[Double] = js.native
  
  val textureIndices: js.Array[Double] = js.native
  
  val `type`: mesh = js.native
}
object Mesh {
  
  @scala.inline
  def apply(
    faces: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: mesh,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Mesh = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    
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
    def setFaces(value: js.Array[Double]): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureIndicesVarargs(value: Double*): Self = this.set("textureIndices", js.Array(value :_*))
    
    @scala.inline
    def setTextureIndices(value: js.Array[Double]): Self = this.set("textureIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: mesh): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
