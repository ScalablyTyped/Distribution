package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMSTransitionEvent")
@js.native
class DOMMSTransitionEvent protected () extends js.Object {
  @JSName("MSHTML.DOMMSTransitionEvent_typekey")
  var MSHTMLDotDOMMSTransitionEvent_typekey: DOMMSTransitionEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val elapsedTime: Double = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val propertyName: String = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMSTransitionEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    propertyName: String,
    elapsedTime: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

