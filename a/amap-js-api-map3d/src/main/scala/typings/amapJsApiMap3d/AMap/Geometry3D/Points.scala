package typings.amapJsApiMap3d.AMap.Geometry3D

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points
  extends typings.amapJsApiMap3d.AMap.Geometry3D {
  val pointAreas: js.Array[Double]
  val pointSizes: js.Array[Double]
  val textureIndices: js.Array[Double]
  val `type`: points
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
}

