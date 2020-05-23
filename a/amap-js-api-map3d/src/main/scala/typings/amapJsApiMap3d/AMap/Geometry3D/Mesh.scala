package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mesh
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  val faces: js.Array[Double]
  val textureIndices: js.Array[Double]
  val `type`: mesh
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
}

