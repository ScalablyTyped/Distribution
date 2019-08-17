package typings.amapDashJsDashApiDashMap3d.AMapNs.Object3DNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Pixel
import typings.amapDashJsDashApiDashMap3d.AMapNs.Geometry3D
import typings.amapDashJsDashApiDashMap3d.AMapNs.Object3D
import typings.amapDashJsDashApiDashMap3d.AMapNs.Object3DNs.MeshLineNs.Options
import typings.amapDashJsDashApiDashMap3d.Anon_Directions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// inherit from WideLine
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
class MeshLine protected () extends Object3D {
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

