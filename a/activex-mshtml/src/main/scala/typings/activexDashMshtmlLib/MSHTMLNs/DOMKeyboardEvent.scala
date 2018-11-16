package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMKeyboardEvent")
@js.native
class DOMKeyboardEvent protected () extends js.Object {
  var `MSHTML.DOMKeyboardEvent_typekey`: DOMKeyboardEvent = js.native
  val altKey: scala.Boolean = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val charCode: scala.Double = js.native
  val ctrlKey: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: scala.Boolean = js.native
  val detail: scala.Double = js.native
  val eventPhase: scala.Double = js.native
  val ie9_char: js.Any = js.native
  val isTrusted: scala.Boolean = js.native
  val key: java.lang.String = js.native
  val keyCode: scala.Double = js.native
  val locale: java.lang.String = js.native
  val location: scala.Double = js.native
  val metaKey: scala.Boolean = js.native
  val repeat: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val `type`: java.lang.String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  val which: scala.Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initKeyboardEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    viewArg: IHTMLWindow2,
    keyArg: java.lang.String,
    locationArg: scala.Double,
    modifiersListArg: java.lang.String,
    repeat: scala.Boolean,
    locale: java.lang.String
  ): scala.Unit = js.native
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

