package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartAreaStyleSettings extends StObject {
  
  /**
    * The visibility settings of a radar chart.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object RadarChartAreaStyleSettings {
  
  inline def apply(): RadarChartAreaStyleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartAreaStyleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartAreaStyleSettings] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
