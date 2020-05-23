package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMException extends js.Object {
  @JSName("MSHTML.DOMException_typekey")
  var MSHTMLDotDOMException_typekey: DOMException
  var code: Double
  val message: String
}

object DOMException {
  @scala.inline
  def apply(MSHTMLDotDOMException_typekey: DOMException, code: Double, message: String): DOMException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMException_typekey")(MSHTMLDotDOMException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
}

