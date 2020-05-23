package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedString extends js.Object {
  @JSName("MSHTML.SVGAnimatedString_typekey")
  var MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString
  val animVal: String
  var baseVal: String
}

object SVGAnimatedString {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString, animVal: String, baseVal: String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedString_typekey")(MSHTMLDotSVGAnimatedString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
}

