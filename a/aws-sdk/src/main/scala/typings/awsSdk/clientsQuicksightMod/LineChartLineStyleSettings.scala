package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartLineStyleSettings extends StObject {
  
  /**
    * Interpolation style for line series.    LINEAR: Show as default, linear style.    SMOOTH: Show as a smooth curve.    STEPPED: Show steps in line.  
    */
  var LineInterpolation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LineInterpolation] = js.undefined
  
  /**
    * Line style for line series.    SOLID: Show as a solid line.    DOTTED: Show as a dotted line.    DASHED: Show as a dashed line.  
    */
  var LineStyle: js.UndefOr[LineChartLineStyle] = js.undefined
  
  /**
    * Configuration option that determines whether to show the line for the series.
    */
  var LineVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Width that determines the line thickness.
    */
  var LineWidth: js.UndefOr[PixelLength] = js.undefined
}
object LineChartLineStyleSettings {
  
  inline def apply(): LineChartLineStyleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartLineStyleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartLineStyleSettings] (val x: Self) extends AnyVal {
    
    inline def setLineInterpolation(value: LineInterpolation): Self = StObject.set(x, "LineInterpolation", value.asInstanceOf[js.Any])
    
    inline def setLineInterpolationUndefined: Self = StObject.set(x, "LineInterpolation", js.undefined)
    
    inline def setLineStyle(value: LineChartLineStyle): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "LineStyle", js.undefined)
    
    inline def setLineVisibility(value: Visibility): Self = StObject.set(x, "LineVisibility", value.asInstanceOf[js.Any])
    
    inline def setLineVisibilityUndefined: Self = StObject.set(x, "LineVisibility", js.undefined)
    
    inline def setLineWidth(value: PixelLength): Self = StObject.set(x, "LineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "LineWidth", js.undefined)
  }
}
