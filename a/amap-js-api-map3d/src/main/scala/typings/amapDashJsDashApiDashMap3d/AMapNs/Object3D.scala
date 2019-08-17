package typings.amapDashJsDashApiDashMap3d.AMapNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3D")
@js.native
class Object3D () extends js.Object {
  var DEPTH_TEST: Boolean = js.native
  val geometry: Geometry3D = js.native
  var needUpdate: Boolean = js.native
  var textures: js.Array[String | HTMLCanvasElement] = js.native
  var transparent: Boolean = js.native
  def reDraw(): Unit = js.native
  // internal
  def reset(): Unit = js.native
}

