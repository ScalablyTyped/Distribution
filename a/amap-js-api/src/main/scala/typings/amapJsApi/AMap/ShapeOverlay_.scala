package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeOverlay_[ExtraData] extends Overlay[ExtraData] {
  /**
    * 获得属性
    */
  def getOptions(): js.Object = js.native
  /**
    * 返回可见
    */
  def getVisible(): Boolean = js.native
  /**
    * 获得层级
    */
  def getzIndex(): Double = js.native
  /**
    * 设置是否可以拖拽
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  /**
    * 设置覆盖物属性
    * @param options 属性
    */
  def setOptions(options: js.Object): Unit = js.native
  /**
    * 设置层级
    * @param zIndex 层级
    */
  def setzIndex(zIndex: Double): Unit = js.native
}

