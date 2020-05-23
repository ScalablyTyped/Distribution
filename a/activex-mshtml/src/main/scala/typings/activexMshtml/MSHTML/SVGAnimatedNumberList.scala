package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedNumberList extends js.Object {
  @JSName("MSHTML.SVGAnimatedNumberList_typekey")
  var MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList
  var animVal: SVGNumberList
  var baseVal: SVGNumberList
}

object SVGAnimatedNumberList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList,
    animVal: SVGNumberList,
    baseVal: SVGNumberList
  ): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumberList_typekey")(MSHTMLDotSVGAnimatedNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
}

