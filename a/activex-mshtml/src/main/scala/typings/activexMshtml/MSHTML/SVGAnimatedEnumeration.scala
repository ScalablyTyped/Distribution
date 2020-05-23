package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedEnumeration extends js.Object {
  @JSName("MSHTML.SVGAnimatedEnumeration_typekey")
  var MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration
  var animVal: Double
  var baseVal: Double
}

object SVGAnimatedEnumeration {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration, animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedEnumeration_typekey")(MSHTMLDotSVGAnimatedEnumeration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
}

