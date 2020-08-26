package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedString extends js.Object {
  @JSName("MSHTML.SVGAnimatedString_typekey")
  var MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString = js.native
  val animVal: String = js.native
  var baseVal: String = js.native
}

object SVGAnimatedString {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString, animVal: String, baseVal: String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedString_typekey")(MSHTMLDotSVGAnimatedString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
  @scala.inline
  implicit class SVGAnimatedStringOps[Self <: SVGAnimatedString] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGAnimatedString_typekey(value: SVGAnimatedString): Self = this.set("MSHTML.SVGAnimatedString_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimVal(value: String): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: String): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

