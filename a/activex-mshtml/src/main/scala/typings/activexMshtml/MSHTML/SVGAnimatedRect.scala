package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedRect extends js.Object {
  
  @JSName("MSHTML.SVGAnimatedRect_typekey")
  var MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect = js.native
  
  var animVal: SVGRect = js.native
  
  var baseVal: SVGRect = js.native
}
object SVGAnimatedRect {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect, animVal: SVGRect, baseVal: SVGRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedRect_typekey")(MSHTMLDotSVGAnimatedRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  @scala.inline
  implicit class SVGAnimatedRectOps[Self <: SVGAnimatedRect] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGAnimatedRect_typekey(value: SVGAnimatedRect): Self = this.set("MSHTML.SVGAnimatedRect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimVal(value: SVGRect): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGRect): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
