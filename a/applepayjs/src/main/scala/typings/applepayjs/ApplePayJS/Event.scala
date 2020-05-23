package typings.applepayjs.ApplePayJS

import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
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

