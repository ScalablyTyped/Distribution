package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGNumber extends js.Object {
  @JSName("MSHTML.SVGNumber_typekey")
  var MSHTMLDotSVGNumber_typekey: SVGNumber
  var value: Double
}

object SVGNumber {
  @scala.inline
  def apply(MSHTMLDotSVGNumber_typekey: SVGNumber, value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGNumber_typekey")(MSHTMLDotSVGNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
}

