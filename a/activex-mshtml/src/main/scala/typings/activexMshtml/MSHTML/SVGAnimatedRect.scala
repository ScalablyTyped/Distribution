package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedRect extends js.Object {
  @JSName("MSHTML.SVGAnimatedRect_typekey")
  var MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect
  var animVal: SVGRect
  var baseVal: SVGRect
}

object SVGAnimatedRect {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect, animVal: SVGRect, baseVal: SVGRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedRect_typekey")(MSHTMLDotSVGAnimatedRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
}

