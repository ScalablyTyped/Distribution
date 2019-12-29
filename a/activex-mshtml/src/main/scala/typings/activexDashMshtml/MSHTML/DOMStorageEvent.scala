package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMStorageEvent")
@js.native
class DOMStorageEvent protected () extends js.Object {
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

