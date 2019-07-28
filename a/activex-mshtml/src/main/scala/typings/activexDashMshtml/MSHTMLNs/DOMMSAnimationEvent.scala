package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMSAnimationEvent")
@js.native
class DOMMSAnimationEvent protected () extends js.Object {
  var `MSHTML.DOMMSAnimationEvent_typekey`: DOMMSAnimationEvent = js.native
  val animationName: String = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val elapsedTime: Double = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMSAnimationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    animationName: String,
    elapsedTime: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

