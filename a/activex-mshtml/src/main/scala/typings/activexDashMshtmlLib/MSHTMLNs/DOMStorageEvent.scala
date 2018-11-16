package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMStorageEvent")
@js.native
class DOMStorageEvent protected () extends js.Object {
  var `MSHTML.DOMStorageEvent_typekey`: DOMStorageEvent = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: scala.Double = js.native
  val isTrusted: scala.Boolean = js.native
  val key: java.lang.String = js.native
  val newValue: java.lang.String = js.native
  val oldValue: java.lang.String = js.native
  val srcElement: IHTMLElement = js.native
  val storageArea: IHTMLStorage = js.native
  val target: IEventTarget = js.native
  val timeStamp: scala.Double = js.native
  val `type`: java.lang.String = js.native
  val url: java.lang.String = js.native
  def initEvent(eventType: java.lang.String, canBubble: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initStorageEvent(
    eventType: java.lang.String,
    canBubble: scala.Boolean,
    cancelable: scala.Boolean,
    keyArg: java.lang.String,
    oldValueArg: java.lang.String,
    newValueArg: java.lang.String,
    urlArg: java.lang.String,
    storageAreaArg: IHTMLStorage
  ): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

