package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTextMetrics extends StObject {
  
  /* private */ @JSName("MSHTML.CanvasTextMetrics_typekey")
  var MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics
  
  val width: Double
}
object CanvasTextMetrics {
  
  inline def apply(MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics, width: Double): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasTextMetrics_typekey")(MSHTMLDotCanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextMetrics]
  }
  
  extension [Self <: CanvasTextMetrics](x: Self) {
    
    inline def setMSHTMLDotCanvasTextMetrics_typekey(value: CanvasTextMetrics): Self = StObject.set(x, "MSHTML.CanvasTextMetrics_typekey", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
