package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMWheelEvent")
@js.native
class DOMWheelEvent protected () extends js.Object {
  var `MSHTML.DOMWheelEvent_typekey`: DOMWheelEvent = js.native
  val altKey: scala.Boolean = js.native
  val bubbles: scala.Boolean = js.native
  val button: scala.Double = js.native
  val buttons: scala.Double = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val clientX: scala.Double = js.native
  val clientY: scala.Double = js.native
  val ctrlKey: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: scala.Boolean = js.native
  val deltaMode: scala.Double = js.native
  val deltaX: scala.Double = js.native
  val deltaY: scala.Double = js.native
  val deltaZ: scala.Double = js.native
  val detail: scala.Double = js.native
  val eventPhase: scala.Double = js.native
  val fromElement: IHTMLElement = js.native
  val isTrusted: scala.Boolean = js.native
  val layerX: scala.Double = js.native
  val layerY: scala.Double = js.native
  val metaKey: scala.Boolean = js.native
  val offsetX: scala.Double = js.native
  val offsetY: scala.Double = js.native
  val pageX: scala.Double = js.native
  val pageY: scala.Double = js.native
  val relatedTarget: IEventTarget = js.native
  val screenX: scala.Double = js.native
  val screenY: scala.Double = js.native
  val shiftKey: scala.Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val toElement: IHTMLElement = js.native
  val `type`: java.lang.String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  val which: scala.Double = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initMouseEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    viewArg: IHTMLWindow2,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: scala.Double,
    relatedTargetArg: IEventTarget
  ): scala.Unit = js.native
  def initUIEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    view: IHTMLWindow2,
    detail: scala.Double
  ): scala.Unit = js.native
  def initWheelEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    viewArg: IHTMLWindow2,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    buttonArg: scala.Double,
    relatedTargetArg: IEventTarget,
    modifiersListArg: java.lang.String,
    deltaX: scala.Double,
    deltaY: scala.Double,
    deltaZ: scala.Double,
    deltaMode: scala.Double
  ): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

