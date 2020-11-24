package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedNumber extends js.Object {
  
  @JSName("MSHTML.SVGAnimatedNumber_typekey")
  var MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber = js.native
  
  var animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedNumber {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber, animVal: Double, baseVal: Double): SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumber_typekey")(MSHTMLDotSVGAnimatedNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumber]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberOps[Self <: SVGAnimatedNumber] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGAnimatedNumber_typekey(value: SVGAnimatedNumber): Self = this.set("MSHTML.SVGAnimatedNumber_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimVal(value: Double): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
