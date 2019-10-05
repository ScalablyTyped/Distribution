package typings.amapDashJsDashSdk.AMap

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.event")
@js.native
object event extends js.Object {
  /**
    * 注册DOM对象事件：给DOM对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
    * @param instance：需注册事件的DOM对象（必填）
    * @param eventName：事件名称（必填）
    * @param handler：事件功能函数（必填）
    * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
    */
  def addDomListener(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
  def addDomListener(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
  /**
    * 注册对象事件：给对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
    * @param instance：需注册事件的对象（必填）
    * @param eventName：事件名称（必填）
    * @param handler：事件功能函数（必填）
    * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
    */
  def addListener(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
  def addListener(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
  /**
    * 类似于addListener，但处理程序会在处理完第一个事件后将自已移除。
    */
  def addListenerOnce(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
  def addListenerOnce(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
  /**
    * 删除由上述 event.addDomListener 和 event.addListener 传回的指定侦听器。
    */
  def removeListener(listener: EventListener): Unit = js.native
  /**
    * 触发非DOM事件：触发非DOM事件eventName，extArgs将扩展到事件监听函数（handler）接受到的event参数中。如:在extArgs内写入{m:10,p:2}，eventName监听函数（handler）可以接收到包含m,p两个key值的event对象。
    */
  def trigger(instance: js.Any, eventName: String, extArgs: js.Any): Unit = js.native
}

