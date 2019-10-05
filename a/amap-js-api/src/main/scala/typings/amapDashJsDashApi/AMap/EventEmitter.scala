package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.EventEmitter")
@js.native
abstract class EventEmitter () extends js.Object {
  /**
    * 触发事件
    * @param eventName 事件名称
    * @param data 事件数据
    */
  def emit(eventName: String): this.type = js.native
  def emit(eventName: String, data: js.Any): this.type = js.native
  /**
    * 移除事件绑定
    * @param eventName 事件名称
    * @param handler 事件功能函数
    * @param context 事件上下文
    */
  def off[C](eventName: String, handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]): this.type = js.native
  def off[C](eventName: String, handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit], context: C): this.type = js.native
  @JSName("off")
  def off_mv[C](eventName: String, handler: mv): this.type = js.native
  @JSName("off")
  def off_mv[C](eventName: String, handler: mv, context: C): this.type = js.native
  /**
    * 注册事件
    * @param eventName 事件名称
    * @param handler 事件回调函数
    * @param context 事件回调中的上下文
    * @param once 触发一次
    * @param unshift 更改事件顺序
    */
  def on[C](eventName: String, handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit]): this.type = js.native
  def on[C](eventName: String, handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit], context: C): this.type = js.native
  def on[C](
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C,
    once: Boolean
  ): this.type = js.native
  def on[C](
    eventName: String,
    handler: js.ThisFunction1[/* this */ C, /* event */ js.Any, Unit],
    context: C,
    once: Boolean,
    unshift: Boolean
  ): this.type = js.native
}

