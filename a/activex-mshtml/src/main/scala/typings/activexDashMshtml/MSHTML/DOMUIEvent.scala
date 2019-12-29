package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMUIEvent")
@js.native
class DOMUIEvent protected () extends js.Object {
  @JSName("MSHTML.DOMUIEvent_typekey")
  var MSHTMLDotDOMUIEvent_typekey: DOMUIEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val detail: Double = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

