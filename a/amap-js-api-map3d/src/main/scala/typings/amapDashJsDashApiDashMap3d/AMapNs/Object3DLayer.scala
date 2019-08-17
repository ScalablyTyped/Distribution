package typings.amapDashJsDashApiDashMap3d.AMapNs

import typings.amapDashJsDashApi.AMapNs.Layer
import typings.amapDashJsDashApiDashMap3d.AMapNs.Object3DLayerNs.Options
import typings.amapDashJsDashApiDashMap3d.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3DLayer")
@js.native
class Object3DLayer () extends Layer {
  def this(options: Options) = this()
  def add(object3d: Object3D): Unit = js.native
  def clear(): Unit = js.native
  def reDraw(): Unit = js.native
  def remove(object3d: Object3D): Unit = js.native
  // internal
  def setOption(options: Anon_Height): Unit = js.native
}

