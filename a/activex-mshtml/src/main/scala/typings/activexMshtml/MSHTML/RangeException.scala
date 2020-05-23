package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeException extends js.Object {
  @JSName("MSHTML.RangeException_typekey")
  var MSHTMLDotRangeException_typekey: RangeException
  var code: Double
  val message: String
}

object RangeException {
  @scala.inline
  def apply(MSHTMLDotRangeException_typekey: RangeException, code: Double, message: String): RangeException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.RangeException_typekey")(MSHTMLDotRangeException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeException]
  }
}

