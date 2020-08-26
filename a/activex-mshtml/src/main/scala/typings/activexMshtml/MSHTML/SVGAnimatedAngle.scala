package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedAngle extends js.Object {
  @JSName("MSHTML.SVGAnimatedAngle_typekey")
  var MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle = js.native
  var animVal: SVGAngle = js.native
  var baseVal: SVGAngle = js.native
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle, animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(MSHTMLDotSVGAnimatedAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  @scala.inline
  implicit class SVGAnimatedAngleOps[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedAngle_typekey(value: SVGAnimatedAngle): Self = this.set("MSHTML.SVGAnimatedAngle_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: SVGAngle): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGAngle): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

