package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.event.EventListener
import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  /**
    * 注册DOM对象事件
    * @param instance 需注册事件的DOM对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @JSGlobal("AMap.event.addDomListener")
  @js.native
  def addDomListener[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */, E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[N] */ js.Any,
    eventName: E,
    handler: js.ThisFunction1[
      /* this */ C, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ /* event */ js.Any, 
      Unit
    ]
  ): EventListener[`0`] = js.native
  @JSGlobal("AMap.event.addDomListener")
  @js.native
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
  ): EventListener[`0`] = js.native
  
  /**
    * 给对象注册事件
    * @param instance 需注册事件的对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @JSGlobal("AMap.event.addListener")
  @js.native
  def addListener[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = js.native
  @JSGlobal("AMap.event.addListener")
  @js.native
  def addListener[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C
  ): EventListener[`1`] = js.native
  
  /**
    * 给对象注册一次性事件
    * @param instance 需注册事件的对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  @JSGlobal("AMap.event.addListenerOnce")
  @js.native
  def addListenerOnce[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = js.native
  @JSGlobal("AMap.event.addListenerOnce")
  @js.native
  def addListenerOnce[I /* <: typings.amapJsApi.AMap.EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C
  ): EventListener[`1`] = js.native
  
  /**
    * 删除事件
    * @param listener 侦听器
    */
  @JSGlobal("AMap.event.removeListener")
  @js.native
  def removeListener(listener: EventListener[`0` | `1`]): Unit = js.native
  
  /**
    * 触发非DOM事件
    * @param instance 触发对象
    * @param eventName 事件名称
    * @param data 事件数据
    */
  @JSGlobal("AMap.event.trigger")
  @js.native
  def trigger(instance: typings.amapJsApi.AMap.EventEmitter, eventName: String): Unit = js.native
  @JSGlobal("AMap.event.trigger")
  @js.native
  def trigger(instance: typings.amapJsApi.AMap.EventEmitter, eventName: String, data: js.Any): Unit = js.native
}
