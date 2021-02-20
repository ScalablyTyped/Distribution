package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedEnumeration extends StObject {
  
  @JSName("MSHTML.SVGAnimatedEnumeration_typekey")
  var MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration = js.native
  
  var animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedEnumeration {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedEnumeration_typekey: SVGAnimatedEnumeration, animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedEnumeration_typekey")(MSHTMLDotSVGAnimatedEnumeration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  
  @scala.inline
  implicit class SVGAnimatedEnumerationMutableBuilder[Self <: SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedEnumeration_typekey(value: SVGAnimatedEnumeration): Self = StObject.set(x, "MSHTML.SVGAnimatedEnumeration_typekey", value.asInstanceOf[js.Any])
  }
}
