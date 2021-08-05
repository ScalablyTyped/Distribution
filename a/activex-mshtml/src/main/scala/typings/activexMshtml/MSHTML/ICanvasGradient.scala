package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasGradient extends StObject {
  
  /* private */ @JSName("MSHTML.ICanvasGradient_typekey")
  var MSHTMLDotICanvasGradient_typekey: ICanvasGradient
  
  def addColorStop(offset: Double, color: String): Unit
}
object ICanvasGradient {
  
  inline def apply(MSHTMLDotICanvasGradient_typekey: ICanvasGradient, addColorStop: (Double, String) => Unit): ICanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.ICanvasGradient_typekey")(MSHTMLDotICanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasGradient]
  }
  
  extension [Self <: ICanvasGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotICanvasGradient_typekey(value: ICanvasGradient): Self = StObject.set(x, "MSHTML.ICanvasGradient_typekey", value.asInstanceOf[js.Any])
  }
}
