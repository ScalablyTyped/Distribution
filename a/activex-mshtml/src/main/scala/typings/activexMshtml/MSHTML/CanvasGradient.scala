package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGradient extends StObject {
  
  /* private */ @JSName("MSHTML.CanvasGradient_typekey")
  var MSHTMLDotCanvasGradient_typekey: CanvasGradient
  
  def addColorStop(offset: Double, color: String): Unit
}
object CanvasGradient {
  
  inline def apply(MSHTMLDotCanvasGradient_typekey: CanvasGradient, addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.CanvasGradient_typekey")(MSHTMLDotCanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasGradient] (val x: Self) extends AnyVal {
    
    inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotCanvasGradient_typekey(value: CanvasGradient): Self = StObject.set(x, "MSHTML.CanvasGradient_typekey", value.asInstanceOf[js.Any])
  }
}
