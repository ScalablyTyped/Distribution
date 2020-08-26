package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedTransformList extends js.Object {
  @JSName("MSHTML.SVGAnimatedTransformList_typekey")
  var MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList = js.native
  var animVal: SVGTransformList = js.native
  var baseVal: SVGTransformList = js.native
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
  @scala.inline
  implicit class SVGAnimatedTransformListOps[Self <: SVGAnimatedTransformList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotSVGAnimatedTransformList_typekey(value: SVGAnimatedTransformList): Self = this.set("MSHTML.SVGAnimatedTransformList_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: SVGTransformList): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGTransformList): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

