package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGException extends js.Object {
  @JSName("MSHTML.SVGException_typekey")
  var MSHTMLDotSVGException_typekey: SVGException
  var code: Double
  val message: String
}

object SVGException {
  @scala.inline
  def apply(MSHTMLDotSVGException_typekey: SVGException, code: Double, message: String): SVGException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGException_typekey")(MSHTMLDotSVGException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGException]
  }
}

