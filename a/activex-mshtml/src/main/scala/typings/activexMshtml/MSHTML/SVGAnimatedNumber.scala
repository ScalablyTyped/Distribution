package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedNumber extends StObject {
  
  @JSName("MSHTML.SVGAnimatedNumber_typekey")
  var MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber = js.native
  
  var animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedNumber {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedNumber_typekey: SVGAnimatedNumber, animVal: Double, baseVal: Double): SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumber_typekey")(MSHTMLDotSVGAnimatedNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumber]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberMutableBuilder[Self <: SVGAnimatedNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedNumber_typekey(value: SVGAnimatedNumber): Self = StObject.set(x, "MSHTML.SVGAnimatedNumber_typekey", value.asInstanceOf[js.Any])
  }
}
