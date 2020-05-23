package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMKeyboardEvent extends js.Object {
  @JSName("MSHTML.DOMKeyboardEvent_typekey")
  var MSHTMLDotDOMKeyboardEvent_typekey: DOMKeyboardEvent = js.native
  val altKey: Boolean = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val charCode: Double = js.native
  val ctrlKey: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val detail: Double = js.native
  val eventPhase: Double = js.native
  val ie9_char: js.Any = js.native
  val isTrusted: Boolean = js.native
  val key: String = js.native
  val keyCode: Double = js.native
  val locale: String = js.native
  val location: Double = js.native
  val metaKey: Boolean = js.native
  val repeat: Boolean = js.native
  val shiftKey: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  val which: Double = js.native
  def getModifierState(keyArg: String): Boolean = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initKeyboardEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    keyArg: String,
    locationArg: Double,
    modifiersListArg: String,
    repeat: Boolean,
    locale: String
  ): Unit = js.native
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

