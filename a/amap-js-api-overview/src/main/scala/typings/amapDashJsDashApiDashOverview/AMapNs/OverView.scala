package typings.amapDashJsDashApiDashOverview.AMapNs

import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApi.AMapNs.TileLayer
import typings.amapDashJsDashApiDashOverview.AMapNs.OverViewNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图鹰眼插件
  */
@JSGlobal("AMap.OverView")
@js.native
class OverView[L /* <: TileLayer */] () extends EventEmitter {
  def this(options: Options[L]) = this()
  /***
    * 折叠鹰眼窗口
    */
  def close(): Unit = js.native
  /**
    * 获取窗体中显示的切片图层
    */
  def getTileLayer(): L = js.native
  /**
    * 隐藏鹰眼窗体
    */
  def hide(): Unit = js.native
  /**
    * 展开鹰眼窗口
    */
  def open(): Unit = js.native
  /**
    * 设置鹰眼中需显示的切片图层
    * @param tileLayer 切片图层
    */
  def setTileLayer(tileLayer: L): Unit = js.native
  /**
    * 显示鹰眼窗体
    */
  def show(): Unit = js.native
}

