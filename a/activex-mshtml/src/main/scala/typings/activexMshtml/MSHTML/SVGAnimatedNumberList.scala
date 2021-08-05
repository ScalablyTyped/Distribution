package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedNumberList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedNumberList_typekey")
  var MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList
  
  var animVal: SVGNumberList
  
  var baseVal: SVGNumberList
}
object SVGAnimatedNumberList {
  
  inline def apply(
    MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList,
    animVal: SVGNumberList,
    baseVal: SVGNumberList
  ): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumberList_typekey")(MSHTMLDotSVGAnimatedNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  extension [Self <: SVGAnimatedNumberList](x: Self) {
    
    inline def setAnimVal(value: SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedNumberList_typekey(value: SVGAnimatedNumberList): Self = StObject.set(x, "MSHTML.SVGAnimatedNumberList_typekey", value.asInstanceOf[js.Any])
  }
}
