package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartDefaultSeriesSettings extends StObject {
  
  /**
    * The axis to which you are binding all line series to.
    */
  var AxisBinding: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AxisBinding] = js.undefined
  
  /**
    * Line styles options for all line series in the visual.
    */
  var LineStyleSettings: js.UndefOr[LineChartLineStyleSettings] = js.undefined
  
  /**
    * Marker styles options for all line series in the visual.
    */
  var MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings] = js.undefined
}
object LineChartDefaultSeriesSettings {
  
  inline def apply(): LineChartDefaultSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartDefaultSeriesSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartDefaultSeriesSettings] (val x: Self) extends AnyVal {
    
    inline def setAxisBinding(value: AxisBinding): Self = StObject.set(x, "AxisBinding", value.asInstanceOf[js.Any])
    
    inline def setAxisBindingUndefined: Self = StObject.set(x, "AxisBinding", js.undefined)
    
    inline def setLineStyleSettings(value: LineChartLineStyleSettings): Self = StObject.set(x, "LineStyleSettings", value.asInstanceOf[js.Any])
    
    inline def setLineStyleSettingsUndefined: Self = StObject.set(x, "LineStyleSettings", js.undefined)
    
    inline def setMarkerStyleSettings(value: LineChartMarkerStyleSettings): Self = StObject.set(x, "MarkerStyleSettings", value.asInstanceOf[js.Any])
    
    inline def setMarkerStyleSettingsUndefined: Self = StObject.set(x, "MarkerStyleSettings", js.undefined)
  }
}
