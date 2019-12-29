package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMWheelEvent")
@js.native
class DOMWheelEvent protected () extends js.Object {
  @JSName("MSHTML.DOMWheelEvent_typekey")
  var MSHTMLDotDOMWheelEvent_typekey: DOMWheelEvent = js.native
  val altKey: Boolean = js.native
  val bubbles: Boolean = js.native
  val button: Double = js.native
  val buttons: Double = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val ctrlKey: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val deltaMode: Double = js.native
  val deltaX: Double = js.native
  val deltaY: Double = js.native
  val deltaZ: Double = js.native
  val detail: Double = js.native
  val eventPhase: Double = js.native
  val fromElement: IHTMLElement = js.native
  val isTrusted: Boolean = js.native
  val layerX: Double = js.native
  val layerY: Double = js.native
  val metaKey: Boolean = js.native
  val offsetX: Double = js.native
  val offsetY: Double = js.native
  val pageX: Double = js.native
  val pageY: Double = js.native
  val relatedTarget: IEventTarget = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val shiftKey: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val toElement: IHTMLElement = js.native
  val `type`: String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  val which: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
  def getModifierState(keyArg: String): Boolean = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMouseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: IEventTarget
  ): Unit = js.native
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  def initWheelEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: IEventTarget,
    modifiersListArg: String,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    deltaMode: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

