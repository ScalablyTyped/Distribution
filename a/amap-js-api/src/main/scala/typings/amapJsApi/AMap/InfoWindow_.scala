package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.InfoWindow.Anchor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoWindow_[ExtraData] extends Overlay[ExtraData] {
  /**
    * 关闭信息窗体
    */
  def close(): Unit = js.native
  /**
    * 获取锚点
    */
  def getAnchor(): js.UndefOr[Anchor] = js.native
  /**
    * 获取信息窗体内容
    */
  def getContent(): js.UndefOr[String | HTMLElement] = js.native
  /**
    * 获取信息窗体是否打开
    */
  def getIsOpen(): Boolean = js.native
  /**
    * 获取信息窗体显示基点位置
    */
  def getPosition(): js.UndefOr[LngLat] = js.native
  /**
    * 获取信息窗体大小
    */
  def getSize(): js.UndefOr[Size] = js.native
  /**
    * 在地图的指定位置打开信息窗体
    * @param map 地图
    * @param position 打开的位置
    */
  def open(map: Map): Unit = js.native
  def open(map: Map, position: LocationValue): Unit = js.native
  /**
    * 设置锚点
    * @param anchor 锚点
    */
  def setAnchor(): Unit = js.native
  def setAnchor(anchor: Anchor): Unit = js.native
  /**
    * 设置信息窗体内容
    * @param content 窗体内容
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  // internal
  def setOffset(offset: Pixel): Unit = js.native
  /**
    * 设置信息窗体显示基点位置
    * @param lnglat 位置经纬度
    */
  def setPosition(lnglat: LocationValue): Unit = js.native
  /**
    * 设置信息窗体大小
    * @param size 大小
    */
  def setSize(size: SizeValue): Unit = js.native
}

