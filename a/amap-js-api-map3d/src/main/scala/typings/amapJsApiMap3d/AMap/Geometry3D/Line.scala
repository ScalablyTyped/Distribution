package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  val segments: js.Array[Double]
  val textureIndices: js.Array[Double]
  val `type`: line
}

object Line {
  @scala.inline
  def apply(
    segments: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: line,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Line = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

