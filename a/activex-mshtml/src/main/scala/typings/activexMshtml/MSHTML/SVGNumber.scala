package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGNumber extends StObject {
  
  @JSName("MSHTML.SVGNumber_typekey")
  var MSHTMLDotSVGNumber_typekey: SVGNumber = js.native
  
  var value: Double = js.native
}
object SVGNumber {
  
  @scala.inline
  def apply(MSHTMLDotSVGNumber_typekey: SVGNumber, value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGNumber_typekey")(MSHTMLDotSVGNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
  
  @scala.inline
  implicit class SVGNumberMutableBuilder[Self <: SVGNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGNumber_typekey(value: SVGNumber): Self = StObject.set(x, "MSHTML.SVGNumber_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
