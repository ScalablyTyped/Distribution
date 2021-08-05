package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillOpacity extends StObject {
  
  /**
    * 辅助框填充的颜色
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * 辅助框的背景透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * 辅助框的边框宽度
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
}
object FillOpacity {
  
  inline def apply(): FillOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOpacity]
  }
  
  extension [Self <: FillOpacity](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
