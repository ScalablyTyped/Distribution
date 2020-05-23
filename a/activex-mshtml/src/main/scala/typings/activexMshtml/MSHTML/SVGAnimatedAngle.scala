package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedAngle extends js.Object {
  @JSName("MSHTML.SVGAnimatedAngle_typekey")
  var MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle
  var animVal: SVGAngle
  var baseVal: SVGAngle
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle, animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(MSHTMLDotSVGAnimatedAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
}

