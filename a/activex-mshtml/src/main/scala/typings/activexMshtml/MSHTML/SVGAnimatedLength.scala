package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedLength extends js.Object {
  @JSName("MSHTML.SVGAnimatedLength_typekey")
  var MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength
  var animVal: SVGLength
  var baseVal: SVGLength
}

object SVGAnimatedLength {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength, animVal: SVGLength, baseVal: SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLength_typekey")(MSHTMLDotSVGAnimatedLength_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
}

