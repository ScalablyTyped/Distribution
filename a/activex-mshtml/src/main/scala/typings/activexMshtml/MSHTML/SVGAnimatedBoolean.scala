package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedBoolean extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedBoolean_typekey")
  var MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean
  
  var animVal: Boolean
  
  var baseVal: Boolean
}
object SVGAnimatedBoolean {
  
  inline def apply(MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean, animVal: Boolean, baseVal: Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedBoolean_typekey")(MSHTMLDotSVGAnimatedBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedBoolean] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: Boolean): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Boolean): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedBoolean_typekey(value: SVGAnimatedBoolean): Self = StObject.set(x, "MSHTML.SVGAnimatedBoolean_typekey", value.asInstanceOf[js.Any])
  }
}
