package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.AMap.Overlay.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Overlay")
@js.native
abstract class Overlay_[ExtraData] () extends EventEmitter {
  def this(options: Options[_]) = this()
  /**
    * 获取自定义数据
    */
  def getExtData(): ExtraData | js.Object = js.native
  def getHeight(): Double | String = js.native
  /**
    * 获取所属地图
    */
  def getMap(): js.UndefOr[Map | Null] = js.native
  /**
    * 隐藏覆盖物
    */
  def hide(): Unit = js.native
  /**
    * 设置自定义数据
    * @param extData 自定义数据
    */
  def setExtData(extData: ExtraData): Unit = js.native
  // internal
  def setHeight(): Unit = js.native
  def setHeight(height: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setMap(): Unit = js.native
  /**
    * 设置所属地图
    * @param map 地图
    */
  def setMap(map: Map): Unit = js.native
  /**
    * 显示覆盖物
    */
  def show(): Unit = js.native
}

