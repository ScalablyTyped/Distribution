package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLMediaError extends js.Object {
  @JSName("MSHTML.IHTMLMediaError_typekey")
  var MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError
  val code: Double
}

object IHTMLMediaError {
  @scala.inline
  def apply(MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError, code: Double): IHTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLMediaError_typekey")(MSHTMLDotIHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLMediaError]
  }
}

