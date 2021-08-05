package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedTransformList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedTransformList_typekey")
  var MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList
  
  var animVal: SVGTransformList
  
  var baseVal: SVGTransformList
}
object SVGAnimatedTransformList {
  
  inline def apply(
    MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList,
    animVal: SVGTransformList,
    baseVal: SVGTransformList
  ): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedTransformList_typekey")(MSHTMLDotSVGAnimatedTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
  
  extension [Self <: SVGAnimatedTransformList](x: Self) {
    
    inline def setAnimVal(value: SVGTransformList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGTransformList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedTransformList_typekey(value: SVGAnimatedTransformList): Self = StObject.set(x, "MSHTML.SVGAnimatedTransformList_typekey", value.asInstanceOf[js.Any])
  }
}
