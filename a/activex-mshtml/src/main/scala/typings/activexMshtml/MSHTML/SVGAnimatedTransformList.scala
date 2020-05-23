package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedTransformList extends js.Object {
  @JSName("MSHTML.SVGAnimatedTransformList_typekey")
  var MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList
  var animVal: SVGTransformList
  var baseVal: SVGTransformList
}

object SVGAnimatedTransformList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList,
    animVal: SVGTransformList,
    baseVal: SVGTransformList
  ): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedTransformList_typekey")(MSHTMLDotSVGAnimatedTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
}

