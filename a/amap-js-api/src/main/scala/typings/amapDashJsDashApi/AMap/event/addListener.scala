package typings.amapDashJsDashApi.AMap.event

import typings.amapDashJsDashApi.AMap.EventEmitter
import typings.amapDashJsDashApi.amapDashJsDashApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.event.addListener")
@js.native
object addListener extends js.Object {
  /**
    * 给对象注册事件
    * @param instance 需注册事件的对象
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  def apply[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]
  ): EventListener[`1`] = js.native
  def apply[I /* <: EventEmitter */, C](
    // tslint:disable-next-line: no-unnecessary-generics
  instance: I,
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C
  ): EventListener[`1`] = js.native
}

