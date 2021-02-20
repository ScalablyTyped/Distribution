package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedLength extends StObject {
  
  @JSName("MSHTML.SVGAnimatedLength_typekey")
  var MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength = js.native
  
  var animVal: SVGLength = js.native
  
  var baseVal: SVGLength = js.native
}
object SVGAnimatedLength {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedLength_typekey: SVGAnimatedLength, animVal: SVGLength, baseVal: SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLength_typekey")(MSHTMLDotSVGAnimatedLength_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  
  @scala.inline
  implicit class SVGAnimatedLengthMutableBuilder[Self <: SVGAnimatedLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGLength): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGLength): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedLength_typekey(value: SVGAnimatedLength): Self = StObject.set(x, "MSHTML.SVGAnimatedLength_typekey", value.asInstanceOf[js.Any])
  }
}
