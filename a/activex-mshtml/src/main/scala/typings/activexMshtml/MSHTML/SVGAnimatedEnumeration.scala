package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedEnumeration extends js.Object {
  
  @JSName("MSHTML.SVGAnimatedEnumeration_typekey")
  var MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration = js.native
  
  var animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedEnumeration {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration, animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedEnumeration_typekey")(MSHTMLDotSVGAnimatedEnumeration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  
  @scala.inline
  implicit class SVGAnimatedEnumerationOps[Self <: SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGAnimatedEnumeration_typekey(value: SVGAnimatedEnumeration): Self = this.set("MSHTML.SVGAnimatedEnumeration_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimVal(value: Double): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
