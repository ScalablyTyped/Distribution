package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMStorageEvent")
@js.native
class DOMStorageEvent protected ()
  extends typings.activexMshtml.MSHTML.DOMStorageEvent {
  /* CompleteClass */
  @JSName("MSHTML.DOMStorageEvent_typekey")
  override var MSHTMLDotDOMStorageEvent_typekey: typings.activexMshtml.MSHTML.DOMStorageEvent = js.native
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: Boolean = js.native
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  /* CompleteClass */
  override val currentTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  /* CompleteClass */
  override val key: String = js.native
  /* CompleteClass */
  override val newValue: String = js.native
  /* CompleteClass */
  override val oldValue: String = js.native
  /* CompleteClass */
  override val srcElement: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  /* CompleteClass */
  override val storageArea: typings.activexMshtml.MSHTML.IHTMLStorage = js.native
  /* CompleteClass */
  override val target: typings.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val `type`: String = js.native
  /* CompleteClass */
  override val url: String = js.native
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  /* CompleteClass */
  override def initStorageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    keyArg: String,
    oldValueArg: String,
    newValueArg: String,
    urlArg: String,
    storageAreaArg: typings.activexMshtml.MSHTML.IHTMLStorage
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

