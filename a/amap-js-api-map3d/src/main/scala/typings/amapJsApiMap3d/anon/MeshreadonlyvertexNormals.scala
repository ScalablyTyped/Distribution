package typings.amapJsApiMap3d.anon

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-map3d.AMap.Geometry3D.Mesh & { readonly vertexNormals  :std.Array<number>} */
trait MeshreadonlyvertexNormals extends js.Object {
  val faces: js.Array[Double]
  val textureIndices: js.Array[Double]
  val `type`: mesh
  val vertexColors: js.Array[Double]
  val vertexNormals: js.Array[Double]
  val vertexUVs: js.Array[Double]
  val vertices: js.Array[Double]
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
}

