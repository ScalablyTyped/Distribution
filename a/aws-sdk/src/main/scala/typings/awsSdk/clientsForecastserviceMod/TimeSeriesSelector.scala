package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesSelector extends StObject {
  
  /**
    * Details about the import file that contains the time series for which you want to create forecasts.
    */
  var TimeSeriesIdentifiers: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeSeriesIdentifiers] = js.undefined
}
object TimeSeriesSelector {
  
  inline def apply(): TimeSeriesSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSeriesSelector] (val x: Self) extends AnyVal {
    
    inline def setTimeSeriesIdentifiers(value: TimeSeriesIdentifiers): Self = StObject.set(x, "TimeSeriesIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdentifiersUndefined: Self = StObject.set(x, "TimeSeriesIdentifiers", js.undefined)
  }
}
