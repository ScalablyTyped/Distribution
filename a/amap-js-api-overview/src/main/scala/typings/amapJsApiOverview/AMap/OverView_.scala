package typings.amapJsApiOverview.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图鹰眼插件
  */
@js.native
trait OverView_[L /* <: TileLayer */] extends EventEmitter {
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

