package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartSeriesSettings extends StObject {
  
  /**
    * The area style settings of a radar chart.
    */
  var AreaStyleSettings: js.UndefOr[RadarChartAreaStyleSettings] = js.undefined
}
object RadarChartSeriesSettings {
  
  inline def apply(): RadarChartSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartSeriesSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartSeriesSettings] (val x: Self) extends AnyVal {
    
    inline def setAreaStyleSettings(value: RadarChartAreaStyleSettings): Self = StObject.set(x, "AreaStyleSettings", value.asInstanceOf[js.Any])
    
    inline def setAreaStyleSettingsUndefined: Self = StObject.set(x, "AreaStyleSettings", js.undefined)
  }
}
