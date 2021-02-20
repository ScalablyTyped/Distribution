package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvasPattern extends StObject {
  
  @JSName("MSHTML.ICanvasPattern_typekey")
  var MSHTMLDotICanvasPattern_typekey: ICanvasPattern = js.native
}
object ICanvasPattern {
  
  @scala.inline
  def apply(MSHTMLDotICanvasPattern_typekey: ICanvasPattern): ICanvasPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ICanvasPattern_typekey")(MSHTMLDotICanvasPattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasPattern]
  }
  
  @scala.inline
  implicit class ICanvasPatternMutableBuilder[Self <: ICanvasPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotICanvasPattern_typekey(value: ICanvasPattern): Self = StObject.set(x, "MSHTML.ICanvasPattern_typekey", value.asInstanceOf[js.Any])
  }
}
