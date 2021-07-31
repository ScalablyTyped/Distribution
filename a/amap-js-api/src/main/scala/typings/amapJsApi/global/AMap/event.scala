package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.event.EventListener
import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSGlobal("AMap.event")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 注册DOM对象事件
    * @param instance 需注册事件的DOM对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @scala.inline
  def addDomListener[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */, E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[N] */ js.Any,
    eventName: E,
    handler: js.ThisFunction1[
      /* this */ C, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ /* event */ js.Any, 
      Unit
    ]
  ): EventListener[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener[`0`]]
  @scala.inline
  def addDomListener[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */, E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[N] */ js.Any,
    eventName: E,
    handler: js.ThisFunction1[
      /* this */ C, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ /* event */ js.Any, 
      Unit
    ],
    context: C
  ): EventListener[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener[`0`]]
  
  /**
    * 给对象注册事件
    * @param instance 需注册事件的对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @scala.inline
  def addListener[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener[`1`]]
  @scala.inline
  def addListener[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C
  ): EventListener[`1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener[`1`]]
  
  /**
    * 给对象注册一次性事件
    * @param instance 需注册事件的对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @scala.inline
  def addListenerOnce[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener[`1`]]
  @scala.inline
  def addListenerOnce[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C
  ): EventListener[`1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener[`1`]]
  
  /**
    * 删除事件
    * @param listener 侦听器
    */
  @scala.inline
  def removeListener(listener: EventListener[`0` | `1`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 触发非DOM事件
    * @param instance 触发对象
    * @param eventName 事件名称
    * @param data 事件数据
    */
  @scala.inline
  def trigger(instance: typings.amapJsApi.AMap.EventEmitter, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(instance: typings.amapJsApi.AMap.EventEmitter, eventName: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
