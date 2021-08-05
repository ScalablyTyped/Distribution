package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasPattern extends StObject {
  
  /* private */ @JSName("MSHTML.ICanvasPattern_typekey")
  var MSHTMLDotICanvasPattern_typekey: ICanvasPattern
}
object ICanvasPattern {
  
  inline def apply(MSHTMLDotICanvasPattern_typekey: ICanvasPattern): ICanvasPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ICanvasPattern_typekey")(MSHTMLDotICanvasPattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasPattern]
  }
  
  extension [Self <: ICanvasPattern](x: Self) {
    
    inline def setMSHTMLDotICanvasPattern_typekey(value: ICanvasPattern): Self = StObject.set(x, "MSHTML.ICanvasPattern_typekey", value.asInstanceOf[js.Any])
  }
}
