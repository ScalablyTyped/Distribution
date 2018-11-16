package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMessageEvent")
@js.native
class DOMMessageEvent protected () extends js.Object {
  var `MSHTML.DOMMessageEvent_typekey`: DOMMessageEvent = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val data: java.lang.String = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: scala.Double = js.native
  val isTrusted: scala.Boolean = js.native
  val origin: java.lang.String = js.native
  @JSName("source")
  val source_Original: IHTMLWindow2 = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initMessageEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    data: java.lang.String,
    origin: java.lang.String,
    lastEventId: java.lang.String,
    source: IHTMLWindow2
  ): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def source(pvarIndex: js.Any): js.Any = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

