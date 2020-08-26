package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedLengthList extends js.Object {
  @JSName("MSHTML.SVGAnimatedLengthList_typekey")
  var MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList = js.native
  var animVal: SVGLengthList = js.native
  var baseVal: SVGLengthList = js.native
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
  @scala.inline
  implicit class SVGAnimatedLengthListOps[Self <: SVGAnimatedLengthList] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedLengthList_typekey(value: SVGAnimatedLengthList): Self = this.set("MSHTML.SVGAnimatedLengthList_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: SVGLengthList): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGLengthList): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

