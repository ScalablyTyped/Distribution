package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasTextMetrics extends StObject {
  
  @JSName("MSHTML.ICanvasTextMetrics_typekey")
  var MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics
  
  val width: Double
}
object ICanvasTextMetrics {
  
  @scala.inline
  def apply(MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics, width: Double): ICanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasTextMetrics_typekey")(MSHTMLDotICanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasTextMetrics]
  }
  
  @scala.inline
  implicit class ICanvasTextMetricsMutableBuilder[Self <: ICanvasTextMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotICanvasTextMetrics_typekey(value: ICanvasTextMetrics): Self = StObject.set(x, "MSHTML.ICanvasTextMetrics_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
