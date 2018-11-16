package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ApplePayJS.Event")
@js.native
abstract class Event () extends js.Object {
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val composed: scala.Boolean = js.native
  val currentTarget: stdLib.EventTarget = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: scala.Double = js.native
  val isTrusted: scala.Boolean = js.native
  var returnValue: scala.Boolean = js.native
  val srcElement: stdLib.EventTarget = js.native
  val target: stdLib.EventTarget = js.native
  val timeStamp: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  def composedPath(): js.Array[stdLib.Node] = js.native
  def initEvent(): scala.Unit = js.native
  def initEvent(`type`: java.lang.String): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("ApplePayJS.Event")
@js.native
object Event extends js.Object {
  val AT_TARGET: scala.Double = js.native
  val BLUR: scala.Double = js.native
  val BUBBLING_PHASE: scala.Double = js.native
  val CAPTURING_PHASE: scala.Double = js.native
  val CHANGE: scala.Double = js.native
  val CLICK: scala.Double = js.native
  val DBLCLICK: scala.Double = js.native
  val DRAGDROP: scala.Double = js.native
  val FOCUS: scala.Double = js.native
  val KEYDOWN: scala.Double = js.native
  val KEYPRESS: scala.Double = js.native
  val KEYUP: scala.Double = js.native
  val MOUSEDOWN: scala.Double = js.native
  val MOUSEDRAG: scala.Double = js.native
  val MOUSEMOVE: scala.Double = js.native
  val MOUSEOUT: scala.Double = js.native
  val MOUSEOVER: scala.Double = js.native
  val MOUSEUP: scala.Double = js.native
  val NONE: scala.Double = js.native
  val SELECT: scala.Double = js.native
}

