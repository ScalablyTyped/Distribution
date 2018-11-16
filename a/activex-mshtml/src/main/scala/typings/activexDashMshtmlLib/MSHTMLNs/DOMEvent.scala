package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMEvent")
@js.native
class DOMEvent protected () extends js.Object {
  var `MSHTML.DOMEvent_typekey`: DOMEvent = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: scala.Double = js.native
  val isTrusted: scala.Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

