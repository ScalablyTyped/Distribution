package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedInteger extends js.Object {
  @JSName("MSHTML.SVGAnimatedInteger_typekey")
  var MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger = js.native
  var animVal: Double = js.native
  var baseVal: Double = js.native
}

object SVGAnimatedInteger {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger, animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedInteger_typekey")(MSHTMLDotSVGAnimatedInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
  @scala.inline
  implicit class SVGAnimatedIntegerOps[Self <: SVGAnimatedInteger] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedInteger_typekey(value: SVGAnimatedInteger): Self = this.set("MSHTML.SVGAnimatedInteger_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: Double): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: Double): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

