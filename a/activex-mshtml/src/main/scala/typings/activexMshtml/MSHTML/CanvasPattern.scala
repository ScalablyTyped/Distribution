package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPattern extends StObject {
  
  @JSName("MSHTML.CanvasPattern_typekey")
  var MSHTMLDotCanvasPattern_typekey: CanvasPattern
}
object CanvasPattern {
  
  @scala.inline
  def apply(MSHTMLDotCanvasPattern_typekey: CanvasPattern): CanvasPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.CanvasPattern_typekey")(MSHTMLDotCanvasPattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPattern]
  }
  
  @scala.inline
  implicit class CanvasPatternMutableBuilder[Self <: CanvasPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotCanvasPattern_typekey(value: CanvasPattern): Self = StObject.set(x, "MSHTML.CanvasPattern_typekey", value.asInstanceOf[js.Any])
  }
}
