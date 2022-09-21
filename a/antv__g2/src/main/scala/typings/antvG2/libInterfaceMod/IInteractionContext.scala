package typings.antvG2.libInterfaceMod

import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInteractionContext
  extends StObject
     with LooseObject {
  
  /**
    * @title 交互相关的 Actions
    */
  var actions: js.Array[IAction] = js.native
  
  /**
    * 添加 action
    * @param action 指定交互 action
    */
  def addAction(action: IAction): Any = js.native
  
  /**
    * 缓存属性，用于上下文传递信息
    * @param key 键名
    * @param value 值
    */
  def cache(key: String): Any = js.native
  def cache(key: String, value: Any): Any = js.native
  
  /**
    * 销毁
    */
  def destroy(): Any = js.native
  
  /**
    * @title 事件对象
    */
  var event: LooseObject = js.native
  
  /**
    * 获取 action
    * @param name - action 的名称
    * @returns 指定 name 的 Action
    */
  def getAction(name: Any): IAction = js.native
  
  /**
    * 获取当前的点
    * @returns 返回当前的点
    */
  def getCurrentPoint(): Point = js.native
  
  /**
    * 获取当前的图形
    */
  def getCurrentShape(): IShape = js.native
  
  /**
    * 是否在组件的包围盒内
    * @param name 组件名，可省略
    */
  def isInComponent(): Any = js.native
  def isInComponent(name: String): Any = js.native
  
  /**
    * 事件触发时是否在 view 内部
    */
  def isInPlot(): Any = js.native
  
  /**
    * 是否在指定的图形内
    * @param name shape 的名称
    */
  def isInShape(name: Any): Any = js.native
  
  /**
    * 移除 action
    * @param action 移除的 action
    */
  def removeAction(action: IAction): Any = js.native
  
  /**
    * 当前的 view
    */
  var view: View = js.native
}
