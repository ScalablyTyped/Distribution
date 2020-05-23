package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedPreserveAspectRatio extends js.Object {
  @JSName("MSHTML.SVGAnimatedPreserveAspectRatio_typekey")
  var MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey: SVGAnimatedPreserveAspectRatio
  var animVal: SVGPreserveAspectRatio
  var baseVal: SVGPreserveAspectRatio
}

object SVGAnimatedPreserveAspectRatio {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey: SVGAnimatedPreserveAspectRatio,
    animVal: SVGPreserveAspectRatio,
    baseVal: SVGPreserveAspectRatio
  ): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedPreserveAspectRatio_typekey")(MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
}

