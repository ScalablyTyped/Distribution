package typings.amapDashJsDashApi.AMap.event

import typings.amapDashJsDashApi.AMap.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.event.trigger")
@js.native
object trigger extends js.Object {
  /**
    * 触发非DOM事件
    * @param instance 触发对象
    * @param eventName 事件名称
    * @param data 事件数据
    */
  def apply(instance: EventEmitter, eventName: String): Unit = js.native
  def apply(instance: EventEmitter, eventName: String, data: js.Any): Unit = js.native
}

