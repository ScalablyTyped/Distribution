package typings.amapJsApi.AMap

import typings.amapJsApi.anon.PartialOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaLayer_[E /* <: HTMLElement */] extends Layer {
  
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
