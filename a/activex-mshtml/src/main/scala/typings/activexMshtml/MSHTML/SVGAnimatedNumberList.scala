package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedNumberList extends StObject {
  
  @JSName("MSHTML.SVGAnimatedNumberList_typekey")
  var MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList
  
  var animVal: SVGNumberList
  
  var baseVal: SVGNumberList
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
  implicit class SVGAnimatedNumberListMutableBuilder[Self <: SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedNumberList_typekey(value: SVGAnimatedNumberList): Self = StObject.set(x, "MSHTML.SVGAnimatedNumberList_typekey", value.asInstanceOf[js.Any])
  }
}
