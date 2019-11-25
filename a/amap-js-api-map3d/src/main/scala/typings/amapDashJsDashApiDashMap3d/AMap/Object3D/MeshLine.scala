package typings.amapDashJsDashApiDashMap3d.AMap.Object3D

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApiDashMap3d.AMap.Geometry3D
import typings.amapDashJsDashApiDashMap3d.AMap.Object3D.MeshLine.Options
import typings.amapDashJsDashApiDashMap3d.Anon_Color
import typings.amapDashJsDashApiDashMap3d.Anon_Directions
import typings.amapDashJsDashApiDashMap3d.Anon_Meter
import typings.amapDashJsDashApiDashMap3d.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// inherit from WideLine
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
class MeshLine protected ()
  extends typings.amapDashJsDashApiDashMap3d.AMap.Object3D {
  def this(options: Options) = this()
  @JSName("geometry")
  val geometry_MeshLine: Geometry3D with Anon_Directions = js.native
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
  type Options = Anon_Color with (Anon_Meter | Anon_Path)
}

