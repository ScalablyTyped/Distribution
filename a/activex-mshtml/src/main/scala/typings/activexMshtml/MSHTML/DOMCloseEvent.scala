package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMCloseEvent extends js.Object {
  @JSName("MSHTML.DOMCloseEvent_typekey")
  var MSHTMLDotDOMCloseEvent_typekey: DOMCloseEvent
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val eventPhase: Double
  val isTrusted: Boolean
  val srcElement: IHTMLElement
  val target: IEventTarget
  val timeStamp: Double
  val `type`: String
  val wasClean: Boolean
  def initCloseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    wasClean: Boolean,
    code: Double,
    reason: String
  ): Unit
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMCloseEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMCloseEvent_typekey: DOMCloseEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initCloseEvent: (String, Boolean, Boolean, Boolean, Double, String) => Unit,
    initEvent: (String, Boolean, Boolean) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String,
    wasClean: Boolean
  ): DOMCloseEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCloseEvent = js.Any.fromFunction6(initCloseEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMCloseEvent_typekey")(MSHTMLDotDOMCloseEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMCloseEvent]
  }
}

