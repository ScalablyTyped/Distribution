package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLCanvasElement")
@js.native
class IHTMLCanvasElement protected () extends js.Object {
  @JSName("MSHTML.IHTMLCanvasElement_typekey")
  var MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement = js.native
  var height: Double = js.native
  var width: Double = js.native
  def getContext(contextId: String): ICanvasRenderingContext2D = js.native
  def toDataURL(`type`: String, jpegquality: js.Any): String = js.native
}

