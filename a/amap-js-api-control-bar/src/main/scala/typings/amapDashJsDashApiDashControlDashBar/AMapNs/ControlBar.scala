package typings.amapDashJsDashApiDashControlDashBar.AMapNs

import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApiDashControlDashBar.AMapNs.ControlBarNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ControlBar")
@js.native
/**
  * 组合了旋转、倾斜、复位、缩放在内的地图控件
  * @param options 选项
  */
class ControlBar () extends EventEmitter {
  def this(options: Options) = this()
  def hide(): Unit = js.native
  // internal
  def show(): Unit = js.native
}

