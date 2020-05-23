package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedNumber extends js.Object {
  @JSName("MSHTML.SVGAnimatedNumber_typekey")
  var MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber
  var animVal: Double
  var baseVal: Double
}

object SVGAnimatedNumber {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber, animVal: Double, baseVal: Double): SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumber_typekey")(MSHTMLDotSVGAnimatedNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumber]
  }
}

