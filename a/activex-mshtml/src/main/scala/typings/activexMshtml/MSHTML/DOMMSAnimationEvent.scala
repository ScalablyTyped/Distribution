package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMSAnimationEvent extends js.Object {
  @JSName("MSHTML.DOMMSAnimationEvent_typekey")
  var MSHTMLDotDOMMSAnimationEvent_typekey: DOMMSAnimationEvent
  val animationName: String
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val elapsedTime: Double
  val eventPhase: Double
  val isTrusted: Boolean
  val srcElement: IHTMLElement
  val target: IEventTarget
  val timeStamp: Double
  val `type`: String
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def initMSAnimationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    animationName: String,
    elapsedTime: Double
  ): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMMSAnimationEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMMSAnimationEvent_typekey: DOMMSAnimationEvent,
    animationName: String,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMSAnimationEvent: (String, Boolean, Boolean, String, Double) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMSAnimationEvent = {
    val __obj = js.Dynamic.literal(animationName = animationName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMSAnimationEvent = js.Any.fromFunction5(initMSAnimationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMSAnimationEvent_typekey")(MSHTMLDotDOMMSAnimationEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMSAnimationEvent]
  }
}

