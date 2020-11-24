package typings.antvEventEmitter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends js.Object {
  
  var _events: js.Any = js.native
  
  /**
    * 触发一个事件
    * @param evt
    * @param args
    */
  def emit(evt: String, args: js.Any*): Unit = js.native
  
  def getEvents(): Record[String, js.Array[EventType]] = js.native
  
  /**
    * 取消监听一个事件，或者一个channel
    * @param evt
    * @param callback
    */
  def off(): this.type = js.native
  def off(evt: js.UndefOr[scala.Nothing], callback: js.Function): this.type = js.native
  def off(evt: String): this.type = js.native
  def off(evt: String, callback: js.Function): this.type = js.native
  
  /**
    * 监听一个事件
    * @param evt
    * @param callback
    * @param once
    */
  def on(evt: String, callback: js.Function): this.type = js.native
  def on(evt: String, callback: js.Function, once: Boolean): this.type = js.native
  
  /**
    * 监听一个事件一次
    * @param evt
    * @param callback
    */
  def once(evt: String, callback: js.Function): this.type = js.native
}
