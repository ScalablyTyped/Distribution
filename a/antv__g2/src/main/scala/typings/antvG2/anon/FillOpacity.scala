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
  
  @scala.inline
  def apply(): FillOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOpacity]
  }
  
  @scala.inline
  implicit class FillOpacityMutableBuilder[Self <: FillOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
