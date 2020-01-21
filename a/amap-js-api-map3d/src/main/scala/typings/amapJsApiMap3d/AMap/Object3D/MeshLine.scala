package typings.amapJsApiMap3d.AMap.Object3D

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.AMap.Geometry3D
import typings.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typings.amapJsApiMap3d.AnonColor
import typings.amapJsApiMap3d.AnonDirections
import typings.amapJsApiMap3d.AnonMeter
import typings.amapJsApiMap3d.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// inherit from WideLine
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
class MeshLine protected ()
  extends typings.amapJsApiMap3d.AMap.Object3D {
  def this(options: Options) = this()
  @JSName("geometry")
  val geometry_MeshLine: Geometry3D with AnonDirections = js.native
  var width: Double = js.native
  def setColor(color: String): Unit = js.native
  def setHeight(height: js.Array[Double]): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setPath(path: js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

@JSGlobal("AMap.Object3D.MeshLine")
@js.native
object MeshLine extends js.Object {
  type Options = AnonColor with (AnonMeter | AnonPath)
}

