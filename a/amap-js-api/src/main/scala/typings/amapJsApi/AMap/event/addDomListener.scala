package typings.amapJsApi.AMap.event

import typings.amapJsApi.amapJsApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.event.addDomListener")
@js.native
object addDomListener extends js.Object {
  /**
    * 注册DOM对象事件
    * @param instance 需注册事件的DOM对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  def apply[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */, E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[N] */ js.Any,
    eventName: E,
    handler: js.ThisFunction1[
      /* this */ C, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ /* event */ js.Any, 
      Unit
    ]
  ): EventListener[`0`] = js.native
  def apply[N /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */, E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */, C](
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
}

