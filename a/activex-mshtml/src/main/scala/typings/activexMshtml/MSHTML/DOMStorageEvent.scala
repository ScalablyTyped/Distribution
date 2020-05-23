package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMStorageEvent extends js.Object {
  @JSName("MSHTML.DOMStorageEvent_typekey")
  var MSHTMLDotDOMStorageEvent_typekey: DOMStorageEvent
  val bubbles: Boolean
  var cancelBubble: Boolean
  val cancelable: Boolean
  val currentTarget: IEventTarget
  val defaultPrevented: Boolean
  val eventPhase: Double
  val isTrusted: Boolean
  val key: String
  val newValue: String
  val oldValue: String
  val srcElement: IHTMLElement
  val storageArea: IHTMLStorage
  val target: IEventTarget
  val timeStamp: Double
  val `type`: String
  val url: String
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  def initStorageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    keyArg: String,
    oldValueArg: String,
    newValueArg: String,
    urlArg: String,
    storageAreaArg: IHTMLStorage
  ): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object DOMStorageEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMStorageEvent_typekey: DOMStorageEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initStorageEvent: (String, Boolean, Boolean, String, String, String, String, IHTMLStorage) => Unit,
    isTrusted: Boolean,
    key: String,
    newValue: String,
    oldValue: String,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    storageArea: IHTMLStorage,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String,
    url: String
  ): DOMStorageEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initStorageEvent = js.Any.fromFunction8(initStorageEvent), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), storageArea = storageArea.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMStorageEvent_typekey")(MSHTMLDotDOMStorageEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMStorageEvent]
  }
}

