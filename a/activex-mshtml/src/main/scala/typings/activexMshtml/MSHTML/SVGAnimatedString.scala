package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedString extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedString_typekey")
  var MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString
  
  val animVal: String
  
  var baseVal: String
}
object SVGAnimatedString {
  
  inline def apply(MSHTMLDotSVGAnimatedString_typekey: SVGAnimatedString, animVal: String, baseVal: String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedString_typekey")(MSHTMLDotSVGAnimatedString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedString] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: String): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: String): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedString_typekey(value: SVGAnimatedString): Self = StObject.set(x, "MSHTML.SVGAnimatedString_typekey", value.asInstanceOf[js.Any])
  }
}
