package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMutationEvent extends js.Object {
  @JSName("MSHTML.DOMMutationEvent_typekey")
  var MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent
  val attrChange: Double
  val attrName: String
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val eventPhase: Double
  val isTrusted: Boolean
  val newValue: String
  val prevValue: String
  val relatedNode: js.Any
  val srcElement: IHTMLElement
  val target: IEventTarget
  val timeStamp: Double
  val `type`: String
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def initMutationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    relatedNodeArg: js.Any,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: Double
  ): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMMutationEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent,
    attrChange: Double,
    attrName: String,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMutationEvent: (String, Boolean, Boolean, js.Any, String, String, String, Double) => Unit,
    isTrusted: Boolean,
    newValue: String,
    prevValue: String,
    preventDefault: () => Unit,
    relatedNode: js.Any,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMutationEvent = {
    val __obj = js.Dynamic.literal(attrChange = attrChange.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedNode = relatedNode.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMutationEvent_typekey")(MSHTMLDotDOMMutationEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMutationEvent]
  }
}

