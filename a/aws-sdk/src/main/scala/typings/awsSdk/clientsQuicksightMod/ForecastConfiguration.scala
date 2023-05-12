package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastConfiguration extends StObject {
  
  /**
    * The forecast properties setup of a forecast in the line chart.
    */
  var ForecastProperties: js.UndefOr[TimeBasedForecastProperties] = js.undefined
  
  /**
    * The forecast scenario of a forecast in the line chart.
    */
  var Scenario: js.UndefOr[ForecastScenario] = js.undefined
}
object ForecastConfiguration {
  
  inline def apply(): ForecastConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForecastConfiguration] (val x: Self) extends AnyVal {
    
    inline def setForecastProperties(value: TimeBasedForecastProperties): Self = StObject.set(x, "ForecastProperties", value.asInstanceOf[js.Any])
    
    inline def setForecastPropertiesUndefined: Self = StObject.set(x, "ForecastProperties", js.undefined)
    
    inline def setScenario(value: ForecastScenario): Self = StObject.set(x, "Scenario", value.asInstanceOf[js.Any])
    
    inline def setScenarioUndefined: Self = StObject.set(x, "Scenario", js.undefined)
  }
}
