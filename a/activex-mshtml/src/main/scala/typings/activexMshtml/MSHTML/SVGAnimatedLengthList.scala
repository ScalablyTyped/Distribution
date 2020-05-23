package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedLengthList extends js.Object {
  @JSName("MSHTML.SVGAnimatedLengthList_typekey")
  var MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList
  var animVal: SVGLengthList
  var baseVal: SVGLengthList
}

object SVGAnimatedLengthList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList,
    animVal: SVGLengthList,
    baseVal: SVGLengthList
  ): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLengthList_typekey")(MSHTMLDotSVGAnimatedLengthList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
}

