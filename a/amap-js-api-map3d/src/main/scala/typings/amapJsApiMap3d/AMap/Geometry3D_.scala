package typings.amapJsApiMap3d.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry3D_ extends js.Object {
  val vertexColors: js.Array[Double]
  val vertexUVs: js.Array[Double]
  val vertices: js.Array[Double]
}

object Geometry3D_ {
  @scala.inline
  def apply(vertexColors: js.Array[Double], vertexUVs: js.Array[Double], vertices: js.Array[Double]): Geometry3D_ = {
    val __obj = js.Dynamic.literal(vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry3D_]
  }
}

