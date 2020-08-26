package typings.amapJsApiMap3d.anon

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-map3d.AMap.Geometry3D.Mesh & { readonly vertexNormals :std.Array<number>} */
@js.native
trait MeshreadonlyvertexNormals extends js.Object {
  val faces: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: mesh = js.native
  val vertexColors: js.Array[Double] = js.native
  val vertexNormals: js.Array[Double] = js.native
  val vertexUVs: js.Array[Double] = js.native
  val vertices: js.Array[Double] = js.native
}

object MeshreadonlyvertexNormals {
  @scala.inline
  def apply(
    faces: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: mesh,
    vertexColors: js.Array[Double],
    vertexNormals: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): MeshreadonlyvertexNormals = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshreadonlyvertexNormals]
  }
  @scala.inline
  implicit class MeshreadonlyvertexNormalsOps[Self <: MeshreadonlyvertexNormals] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVertexColorsVarargs(value: Double*): Self = this.set("vertexColors", js.Array(value :_*))
    @scala.inline
    def setVertexColors(value: js.Array[Double]): Self = this.set("vertexColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexNormalsVarargs(value: Double*): Self = this.set("vertexNormals", js.Array(value :_*))
    @scala.inline
    def setVertexNormals(value: js.Array[Double]): Self = this.set("vertexNormals", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexUVsVarargs(value: Double*): Self = this.set("vertexUVs", js.Array(value :_*))
    @scala.inline
    def setVertexUVs(value: js.Array[Double]): Self = this.set("vertexUVs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: Double*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[Double]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

