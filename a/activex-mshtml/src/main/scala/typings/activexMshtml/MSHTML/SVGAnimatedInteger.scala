package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedInteger extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedInteger_typekey")
  var MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger
  
  var animVal: Double
  
  var baseVal: Double
}
object SVGAnimatedInteger {
  
  inline def apply(MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger, animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedInteger_typekey")(MSHTMLDotSVGAnimatedInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
  
  extension [Self <: SVGAnimatedInteger](x: Self) {
    
    inline def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedInteger_typekey(value: SVGAnimatedInteger): Self = StObject.set(x, "MSHTML.SVGAnimatedInteger_typekey", value.asInstanceOf[js.Any])
  }
}
