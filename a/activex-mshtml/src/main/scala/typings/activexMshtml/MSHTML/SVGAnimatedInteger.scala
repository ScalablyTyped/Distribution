package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedInteger extends js.Object {
  @JSName("MSHTML.SVGAnimatedInteger_typekey")
  var MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger
  var animVal: Double
  var baseVal: Double
}

object SVGAnimatedInteger {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger, animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedInteger_typekey")(MSHTMLDotSVGAnimatedInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
}

