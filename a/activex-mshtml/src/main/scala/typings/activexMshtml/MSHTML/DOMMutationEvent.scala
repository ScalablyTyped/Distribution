package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMutationEvent")
@js.native
class DOMMutationEvent protected () extends js.Object {
  @JSName("MSHTML.DOMMutationEvent_typekey")
  var MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent = js.native
  val attrChange: Double = js.native
  val attrName: String = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val newValue: String = js.native
  val prevValue: String = js.native
  val relatedNode: js.Any = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMutationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    relatedNodeArg: js.Any,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

