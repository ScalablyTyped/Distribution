package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedNumberList extends js.Object {
  
  @JSName("MSHTML.SVGAnimatedNumberList_typekey")
  var MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList = js.native
  
  var animVal: SVGNumberList = js.native
  
  var baseVal: SVGNumberList = js.native
}
object SVGAnimatedNumberList {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList,
    animVal: SVGNumberList,
    baseVal: SVGNumberList
  ): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumberList_typekey")(MSHTMLDotSVGAnimatedNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberListOps[Self <: SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGAnimatedNumberList_typekey(value: SVGAnimatedNumberList): Self = this.set("MSHTML.SVGAnimatedNumberList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimVal(value: SVGNumberList): Self = this.set("animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGNumberList): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
}
