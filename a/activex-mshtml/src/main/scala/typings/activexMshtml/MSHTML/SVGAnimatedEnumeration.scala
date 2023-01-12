package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedEnumeration extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedEnumeration_typekey")
  var MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration
  
  var animVal: Double
  
  var baseVal: Double
}
object SVGAnimatedEnumeration {
  
  inline def apply(MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration, animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedEnumeration_typekey")(MSHTMLDotSVGAnimatedEnumeration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedEnumeration_typekey(value: SVGAnimatedEnumeration): Self = StObject.set(x, "MSHTML.SVGAnimatedEnumeration_typekey", value.asInstanceOf[js.Any])
  }
}
