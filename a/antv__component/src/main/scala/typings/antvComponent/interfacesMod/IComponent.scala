package typings.antvComponent.interfacesMod

import typings.antvGBase.interfacesMod.IBase
import typings.antvGBase.typesMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponent extends IBase {
  
  /**
    * 清空组件
    */
  def clear(): js.Any = js.native
  
  /**
    * 组件在画布上的包围盒
    * @return {BBox} 包围盒
    */
  def getBBox(): BBox = js.native
  
  /**
    * 组件布局要求的包围盒，不一定等于 getBBox
    * @return {BBox} 包围盒
    */
  def getLayoutBBox(): BBox = js.native
  
  /**
    * 隐藏
    */
  def hide(): js.Any = js.native
  
  /**
    * 初始化组件
    */
  def init(): Unit = js.native
  
  /**
    * 是否是列表
    */
  def isList(): Boolean = js.native
  
  /**
    * 是否是 slider
    */
  def isSlider(): Boolean = js.native
  
  /**
    * 渲染组件
    */
  def render(): js.Any = js.native
  
  /**
    * 是否可以响应事件
    * @param capture 是否可以响应事件
    */
  def setCapture(capture: Boolean): Unit = js.native
  
  /**
    * 显示
    */
  def show(): js.Any = js.native
  
  /**
    * 更新组件
    * @param {object} cfg 更新的配置项
    */
  def update(cfg: js.Object): js.Any = js.native
}
