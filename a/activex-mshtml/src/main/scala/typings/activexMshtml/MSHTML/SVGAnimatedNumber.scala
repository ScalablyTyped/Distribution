package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedNumber extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedNumber_typekey")
  var MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber
  
  var animVal: Double
  
  var baseVal: Double
}
object SVGAnimatedNumber {
  
  inline def apply(MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber, animVal: Double, baseVal: Double): SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumber_typekey")(MSHTMLDotSVGAnimatedNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedNumber] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedNumber_typekey(value: SVGAnimatedNumber): Self = StObject.set(x, "MSHTML.SVGAnimatedNumber_typekey", value.asInstanceOf[js.Any])
  }
}
