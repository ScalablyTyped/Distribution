package typings.amapJsApi.anon

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.event.EventListener
import typings.amapJsApi.amapJsApiInts.`0`
import typings.amapJsApi.amapJsApiInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofevent extends StObject {
  
  /**
    * 注册DOM对象事件
    * @param instance 需注册事件的DOM对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  def addDomListener[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.amapJsApi.amapJsApiStrings.a, typings.amapJsApi.amapJsApiStrings.abbr, typings.amapJsApi.amapJsApiStrings.address */ Any */, E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.amapJsApi.amapJsApiStrings.fullscreenchange, typings.amapJsApi.amapJsApiStrings.fullscreenerror, typings.amapJsApi.amapJsApiStrings.copy */ Any */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[N] */ js.Any,
    eventName: E,
    handler: js.ThisFunction1[
      /* this */ C, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ /* event */ js.Any, 
      Unit
    ]
  ): EventListener[`0`] = js.native
  def addDomListener[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.amapJsApi.amapJsApiStrings.a, typings.amapJsApi.amapJsApiStrings.abbr, typings.amapJsApi.amapJsApiStrings.address */ Any */, E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.amapJsApi.amapJsApiStrings.fullscreenchange, typings.amapJsApi.amapJsApiStrings.fullscreenerror, typings.amapJsApi.amapJsApiStrings.copy */ Any */, C](
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
    handler: js.ThisFunction1[/* this */ C, /* event */ Any, Unit]
  ): EventListener[`1`] = js.native
  def addListener[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ Any, Unit],
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
    handler: js.ThisFunction1[/* this */ C, /* event */ Any, Unit]
  ): EventListener[`1`] = js.native
  def addListenerOnce[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ Any, Unit],
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
  def trigger(instance: EventEmitter, eventName: String, data: Any): Unit = js.native
}
