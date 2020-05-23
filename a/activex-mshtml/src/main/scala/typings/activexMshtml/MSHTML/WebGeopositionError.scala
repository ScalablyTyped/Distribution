package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGeopositionError extends js.Object {
  @JSName("MSHTML.WebGeopositionError_typekey")
  var MSHTMLDotWebGeopositionError_typekey: WebGeopositionError
  val code: Double
  val message: String
}

object WebGeopositionError {
  @scala.inline
  def apply(MSHTMLDotWebGeopositionError_typekey: WebGeopositionError, code: Double, message: String): WebGeopositionError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeopositionError_typekey")(MSHTMLDotWebGeopositionError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeopositionError]
  }
}

