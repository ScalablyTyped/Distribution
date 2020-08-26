package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMStorageEvent extends js.Object {
  @JSName("MSHTML.DOMStorageEvent_typekey")
  var MSHTMLDotDOMStorageEvent_typekey: DOMStorageEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val key: String = js.native
  val newValue: String = js.native
  val oldValue: String = js.native
  val srcElement: IHTMLElement = js.native
  val storageArea: IHTMLStorage = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  val url: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initStorageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    keyArg: String,
    oldValueArg: String,
    newValueArg: String,
    urlArg: String,
    storageAreaArg: IHTMLStorage
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
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
  @scala.inline
  implicit class DOMStorageEventOps[Self <: DOMStorageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotDOMStorageEvent_typekey(value: DOMStorageEvent): Self = this.set("MSHTML.DOMStorageEvent_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = this.set("initEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setInitStorageEvent(value: (String, Boolean, Boolean, String, String, String, String, IHTMLStorage) => Unit): Self = this.set("initStorageEvent", js.Any.fromFunction8(value))
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStorageArea(value: IHTMLStorage): Self = this.set("storageArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: IEventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

