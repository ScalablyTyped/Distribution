package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedAngle extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedAngle_typekey")
  var MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle
  
  var animVal: SVGAngle
  
  var baseVal: SVGAngle
}
object SVGAnimatedAngle {
  
  inline def apply(MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle, animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(MSHTMLDotSVGAnimatedAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: SVGAngle): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGAngle): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedAngle_typekey(value: SVGAnimatedAngle): Self = StObject.set(x, "MSHTML.SVGAnimatedAngle_typekey", value.asInstanceOf[js.Any])
  }
}
