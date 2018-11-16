package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMCompositionEvent")
@js.native
class DOMCompositionEvent protected () extends js.Object {
  var `MSHTML.DOMCompositionEvent_typekey`: DOMCompositionEvent = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val data: java.lang.String = js.native
  val defaultPrevented: scala.Boolean = js.native
  val detail: scala.Double = js.native
  val eventPhase: scala.Double = js.native
  val isTrusted: scala.Boolean = js.native
  val locale: java.lang.String = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val `type`: java.lang.String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  def initCompositionEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    viewArg: IHTMLWindow2,
    data: java.lang.String,
    locale: java.lang.String
  ): scala.Unit = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initUIEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    view: IHTMLWindow2,
    detail: scala.Double
  ): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

