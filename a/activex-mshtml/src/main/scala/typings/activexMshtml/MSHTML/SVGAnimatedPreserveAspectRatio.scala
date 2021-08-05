package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedPreserveAspectRatio_typekey")
  var MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey: SVGAnimatedPreserveAspectRatio
  
  var animVal: SVGPreserveAspectRatio
  
  var baseVal: SVGPreserveAspectRatio
}
object SVGAnimatedPreserveAspectRatio {
  
  inline def apply(
    MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey: SVGAnimatedPreserveAspectRatio,
    animVal: SVGPreserveAspectRatio,
    baseVal: SVGPreserveAspectRatio
  ): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedPreserveAspectRatio_typekey")(MSHTMLDotSVGAnimatedPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  
  extension [Self <: SVGAnimatedPreserveAspectRatio](x: Self) {
    
    inline def setAnimVal(value: SVGPreserveAspectRatio): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGPreserveAspectRatio): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedPreserveAspectRatio_typekey(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "MSHTML.SVGAnimatedPreserveAspectRatio_typekey", value.asInstanceOf[js.Any])
  }
}
