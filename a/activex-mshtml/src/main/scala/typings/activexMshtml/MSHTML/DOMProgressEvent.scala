package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMProgressEvent extends js.Object {
  @JSName("MSHTML.DOMProgressEvent_typekey")
  var MSHTMLDotDOMProgressEvent_typekey: DOMProgressEvent
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val eventPhase: Double
  val isTrusted: Boolean
  val lengthComputable: Boolean
  val loaded: Double
  val srcElement: IHTMLElement
  val target: IEventTarget
  val timeStamp: Double
  val total: Double
  val `type`: String
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def initProgressEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMProgressEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMProgressEvent_typekey: DOMProgressEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initProgressEvent: (String, Boolean, Boolean, Boolean, Double, Double) => Unit,
    isTrusted: Boolean,
    lengthComputable: Boolean,
    loaded: Double,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    total: Double,
    `type`: String
  ): DOMProgressEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initProgressEvent = js.Any.fromFunction6(initProgressEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMProgressEvent_typekey")(MSHTMLDotDOMProgressEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMProgressEvent]
  }
}

