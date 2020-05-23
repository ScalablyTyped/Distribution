package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMSTransitionEvent extends js.Object {
  @JSName("MSHTML.DOMMSTransitionEvent_typekey")
  var MSHTMLDotDOMMSTransitionEvent_typekey: DOMMSTransitionEvent
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val elapsedTime: Double
  val eventPhase: Double
  val isTrusted: Boolean
  val propertyName: String
  val srcElement: IHTMLElement
  val target: IEventTarget
  val timeStamp: Double
  val `type`: String
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def initMSTransitionEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    propertyName: String,
    elapsedTime: Double
  ): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMMSTransitionEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMMSTransitionEvent_typekey: DOMMSTransitionEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMSTransitionEvent: (String, Boolean, Boolean, String, Double) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    propertyName: String,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMSTransitionEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMSTransitionEvent = js.Any.fromFunction5(initMSTransitionEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), propertyName = propertyName.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMSTransitionEvent_typekey")(MSHTMLDotDOMMSTransitionEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMSTransitionEvent]
  }
}

