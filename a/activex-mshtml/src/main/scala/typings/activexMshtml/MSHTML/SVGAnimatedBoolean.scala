package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedBoolean extends js.Object {
  @JSName("MSHTML.SVGAnimatedBoolean_typekey")
  var MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean
  var animVal: Boolean
  var baseVal: Boolean
}

object SVGAnimatedBoolean {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean, animVal: Boolean, baseVal: Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedBoolean_typekey")(MSHTMLDotSVGAnimatedBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
}

