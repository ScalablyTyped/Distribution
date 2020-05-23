package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLCanvasElement extends js.Object {
  @JSName("MSHTML.IHTMLCanvasElement_typekey")
  var MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement
  var height: Double
  var width: Double
  def getContext(contextId: String): ICanvasRenderingContext2D
  def toDataURL(`type`: String, jpegquality: js.Any): String
}

object IHTMLCanvasElement {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement,
    getContext: String => ICanvasRenderingContext2D,
    height: Double,
    toDataURL: (String, js.Any) => String,
    width: Double
  ): IHTMLCanvasElement = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], toDataURL = js.Any.fromFunction2(toDataURL), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCanvasElement_typekey")(MSHTMLDotIHTMLCanvasElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCanvasElement]
  }
}

