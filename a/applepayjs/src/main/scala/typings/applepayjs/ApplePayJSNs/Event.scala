package typings.applepayjs.ApplePayJSNs

import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ApplePayJS.Event")
@js.native
abstract class Event () extends js.Object {
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val composed: Boolean = js.native
  val currentTarget: EventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  var returnValue: Boolean = js.native
  val srcElement: EventTarget = js.native
  val target: EventTarget = js.native
  val timeStamp: String = js.native
  val `type`: String = js.native
  def composedPath(): js.Array[Node] = js.native
  def initEvent(): Unit = js.native
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

/* static members */
@JSGlobal("ApplePayJS.Event")
@js.native
object Event extends js.Object {
  val AT_TARGET: Double = js.native
  val BLUR: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
  val CHANGE: Double = js.native
  val CLICK: Double = js.native
  val DBLCLICK: Double = js.native
  val DRAGDROP: Double = js.native
  val FOCUS: Double = js.native
  val KEYDOWN: Double = js.native
  val KEYPRESS: Double = js.native
  val KEYUP: Double = js.native
  val MOUSEDOWN: Double = js.native
  val MOUSEDRAG: Double = js.native
  val MOUSEMOVE: Double = js.native
  val MOUSEOUT: Double = js.native
  val MOUSEOVER: Double = js.native
  val MOUSEUP: Double = js.native
  val NONE: Double = js.native
  val SELECT: Double = js.native
}

