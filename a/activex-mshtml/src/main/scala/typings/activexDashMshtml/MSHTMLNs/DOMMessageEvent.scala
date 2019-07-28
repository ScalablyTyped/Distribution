package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMessageEvent")
@js.native
class DOMMessageEvent protected () extends js.Object {
  var `MSHTML.DOMMessageEvent_typekey`: DOMMessageEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val data: String = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val origin: String = js.native
  @JSName("source")
  val source_Original: IHTMLWindow2 = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMessageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    data: String,
    origin: String,
    lastEventId: String,
    source: IHTMLWindow2
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def source(pvarIndex: js.Any): js.Any = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

