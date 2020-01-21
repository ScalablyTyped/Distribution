package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGElementInstance")
@js.native
class SVGElementInstance protected () extends js.Object {
  @JSName("MSHTML.SVGElementInstance_typekey")
  var MSHTMLDotSVGElementInstance_typekey: SVGElementInstance = js.native
  val childNodes: ISVGElementInstanceList = js.native
  val correspondingElement: ISVGElement = js.native
  val correspondingUseElement: ISVGUseElement = js.native
  val firstChild: ISVGElementInstance = js.native
  val lastChild: ISVGElementInstance = js.native
  val nextSibling: ISVGElementInstance = js.native
  val parentNode: ISVGElementInstance = js.native
  val previousSibling: ISVGElementInstance = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

