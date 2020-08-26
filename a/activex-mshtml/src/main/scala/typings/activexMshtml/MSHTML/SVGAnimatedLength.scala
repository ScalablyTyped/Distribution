package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedLength extends js.Object {
  @JSName("MSHTML.SVGAnimatedLength_typekey")
  var MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength = js.native
  var animVal: SVGLength = js.native
  var baseVal: SVGLength = js.native
}

object SVGAnimatedLength {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength, animVal: SVGLength, baseVal: SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLength_typekey")(MSHTMLDotSVGAnimatedLength_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  @scala.inline
  implicit class SVGAnimatedLengthOps[Self <: SVGAnimatedLength] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedLength_typekey(value: SVGAnimatedLength): Self = this.set("MSHTML.SVGAnimatedLength_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: SVGLength): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGLength): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

