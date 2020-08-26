package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  val segments: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: line = js.native
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
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
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
    def setSegmentsVarargs(value: Double*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[Double]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureIndicesVarargs(value: Double*): Self = this.set("textureIndices", js.Array(value :_*))
    @scala.inline
    def setTextureIndices(value: js.Array[Double]): Self = this.set("textureIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

