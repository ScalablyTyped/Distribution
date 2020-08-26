package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedBoolean extends js.Object {
  @JSName("MSHTML.SVGAnimatedBoolean_typekey")
  var MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean = js.native
  var animVal: Boolean = js.native
  var baseVal: Boolean = js.native
}

object SVGAnimatedBoolean {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean, animVal: Boolean, baseVal: Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedBoolean_typekey")(MSHTMLDotSVGAnimatedBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
  @scala.inline
  implicit class SVGAnimatedBooleanOps[Self <: SVGAnimatedBoolean] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedBoolean_typekey(value: SVGAnimatedBoolean): Self = this.set("MSHTML.SVGAnimatedBoolean_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: Boolean): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: Boolean): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

