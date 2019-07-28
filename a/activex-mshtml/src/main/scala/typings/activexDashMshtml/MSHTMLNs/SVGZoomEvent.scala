package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGZoomEvent")
@js.native
class SVGZoomEvent protected () extends js.Object {
  var `MSHTML.SVGZoomEvent_typekey`: SVGZoomEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val detail: Double = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val newScale: Double = js.native
  val newTranslate: SVGPoint = js.native
  val previousScale: Double = js.native
  val previousTranslate: SVGPoint = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
  val zoomRectScreen: SVGRect = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
  def view(pvarIndex: js.Any): js.Any = js.native
}

