package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedRect extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedRect_typekey")
  var MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect
  
  var animVal: SVGRect
  
  var baseVal: SVGRect
}
object SVGAnimatedRect {
  
  inline def apply(MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect, animVal: SVGRect, baseVal: SVGRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedRect_typekey")(MSHTMLDotSVGAnimatedRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedRect] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: SVGRect): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGRect): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedRect_typekey(value: SVGAnimatedRect): Self = StObject.set(x, "MSHTML.SVGAnimatedRect_typekey", value.asInstanceOf[js.Any])
  }
}
