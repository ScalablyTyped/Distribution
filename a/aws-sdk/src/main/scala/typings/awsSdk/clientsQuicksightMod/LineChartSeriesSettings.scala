package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartSeriesSettings extends StObject {
  
  /**
    * Line styles options for a line series in LineChartVisual.
    */
  var LineStyleSettings: js.UndefOr[LineChartLineStyleSettings] = js.undefined
  
  /**
    * Marker styles options for a line series in LineChartVisual.
    */
  var MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings] = js.undefined
}
object LineChartSeriesSettings {
  
  inline def apply(): LineChartSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartSeriesSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartSeriesSettings] (val x: Self) extends AnyVal {
    
    inline def setLineStyleSettings(value: LineChartLineStyleSettings): Self = StObject.set(x, "LineStyleSettings", value.asInstanceOf[js.Any])
    
    inline def setLineStyleSettingsUndefined: Self = StObject.set(x, "LineStyleSettings", js.undefined)
    
    inline def setMarkerStyleSettings(value: LineChartMarkerStyleSettings): Self = StObject.set(x, "MarkerStyleSettings", value.asInstanceOf[js.Any])
    
    inline def setMarkerStyleSettingsUndefined: Self = StObject.set(x, "MarkerStyleSettings", js.undefined)
  }
}
