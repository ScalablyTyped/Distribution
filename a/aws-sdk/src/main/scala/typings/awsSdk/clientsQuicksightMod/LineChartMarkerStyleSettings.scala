package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartMarkerStyleSettings extends StObject {
  
  /**
    * Color of marker in the series.
    */
  var MarkerColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * Shape option for markers in the series.    CIRCLE: Show marker as a circle.    TRIANGLE: Show marker as a triangle.    SQUARE: Show marker as a square.    DIAMOND: Show marker as a diamond.    ROUNDED_SQUARE: Show marker as a rounded square.  
    */
  var MarkerShape: js.UndefOr[LineChartMarkerShape] = js.undefined
  
  /**
    * Size of marker in the series.
    */
  var MarkerSize: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * Configuration option that determines whether to show the markers in the series.
    */
  var MarkerVisibility: js.UndefOr[Visibility] = js.undefined
}
object LineChartMarkerStyleSettings {
  
  inline def apply(): LineChartMarkerStyleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartMarkerStyleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartMarkerStyleSettings] (val x: Self) extends AnyVal {
    
    inline def setMarkerColor(value: HexColor): Self = StObject.set(x, "MarkerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "MarkerColor", js.undefined)
    
    inline def setMarkerShape(value: LineChartMarkerShape): Self = StObject.set(x, "MarkerShape", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeUndefined: Self = StObject.set(x, "MarkerShape", js.undefined)
    
    inline def setMarkerSize(value: PixelLength): Self = StObject.set(x, "MarkerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "MarkerSize", js.undefined)
    
    inline def setMarkerVisibility(value: Visibility): Self = StObject.set(x, "MarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setMarkerVisibilityUndefined: Self = StObject.set(x, "MarkerVisibility", js.undefined)
  }
}
