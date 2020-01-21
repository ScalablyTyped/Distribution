package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.MediaLayer.Options
import typings.amapJsApi.PartialOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.MediaLayer")
@js.native
/**
  * @param options 图层选项
  */
abstract class MediaLayer_[E /* <: HTMLElement */] () extends Layer {
  def this(options: Options) = this()
  /**
    * 获取显示的范围
    */
  def getBounds(): Bounds = js.native
  /**
    * 获取元素
    */
  def getElement(): E | Null = js.native
  /**
    * 获取图层选项
    */
  def getOptions(): PartialOptions = js.native
  /**
    * 设置显示范围
    * @param bounds 显示范围
    */
  def setBounds(bounds: Bounds): Unit = js.native
  /**
    * 设置图层选项
    * @param options 图层选项
    */
  def setOptions(options: PartialOptions): Unit = js.native
}

