package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLMediaError extends js.Object {
  @JSName("MSHTML.HTMLMediaError_typekey")
  var MSHTMLDotHTMLMediaError_typekey: HTMLMediaError
  val code: Double
}

object HTMLMediaError {
  @scala.inline
  def apply(MSHTMLDotHTMLMediaError_typekey: HTMLMediaError, code: Double): HTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMediaError_typekey")(MSHTMLDotHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMediaError]
  }
}

