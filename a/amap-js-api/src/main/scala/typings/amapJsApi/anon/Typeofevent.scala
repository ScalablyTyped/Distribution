package typings.amapJsApi.anon

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.event.EventListener
import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofevent extends js.Object {
  
  /**
    * 注册DOM对象事件
    * @param instance 需注册事件的DOM对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
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
  def addListener[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = js.native
  def addListener[I /* <: EventEmitter */, C](
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
  def addListenerOnce[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = js.native
  def addListenerOnce[I /* <: EventEmitter */, C](
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
  def removeListener(listener: EventListener[`0` | `1`]): Unit = js.native
  
  /**
    * 触发非DOM事件
    * @param instance 触发对象
    * @param eventName 事件名称
    * @param data 事件数据
    */
  def trigger(instance: EventEmitter, eventName: String): Unit = js.native
  def trigger(instance: EventEmitter, eventName: String, data: js.Any): Unit = js.native
}
