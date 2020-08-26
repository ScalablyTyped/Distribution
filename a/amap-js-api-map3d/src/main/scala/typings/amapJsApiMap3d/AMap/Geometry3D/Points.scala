package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Points
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  val pointAreas: js.Array[Double] = js.native
  val pointSizes: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: points = js.native
}

object Points {
  @scala.inline
  def apply(
    pointAreas: js.Array[Double],
    pointSizes: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: points,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Points = {
    val __obj = js.Dynamic.literal(pointAreas = pointAreas.asInstanceOf[js.Any], pointSizes = pointSizes.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  @scala.inline
  implicit class PointsOps[Self <: Points] (val x: Self) extends AnyVal {
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
    def setPointAreasVarargs(value: Double*): Self = this.set("pointAreas", js.Array(value :_*))
    @scala.inline
    def setPointAreas(value: js.Array[Double]): Self = this.set("pointAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointSizesVarargs(value: Double*): Self = this.set("pointSizes", js.Array(value :_*))
    @scala.inline
    def setPointSizes(value: js.Array[Double]): Self = this.set("pointSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureIndicesVarargs(value: Double*): Self = this.set("textureIndices", js.Array(value :_*))
    @scala.inline
    def setTextureIndices(value: js.Array[Double]): Self = this.set("textureIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: points): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

