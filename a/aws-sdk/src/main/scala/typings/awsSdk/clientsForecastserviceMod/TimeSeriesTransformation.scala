package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesTransformation extends StObject {
  
  /**
    * An array of actions that define a time series and how it is transformed. These transformations create a new time series that is used for the what-if analysis.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Action] = js.undefined
  
  /**
    * An array of conditions that define which members of the related time series are transformed.
    */
  var TimeSeriesConditions: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeSeriesConditions] = js.undefined
}
object TimeSeriesTransformation {
  
  inline def apply(): TimeSeriesTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesTransformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSeriesTransformation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setTimeSeriesConditions(value: TimeSeriesConditions): Self = StObject.set(x, "TimeSeriesConditions", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesConditionsUndefined: Self = StObject.set(x, "TimeSeriesConditions", js.undefined)
    
    inline def setTimeSeriesConditionsVarargs(value: TimeSeriesCondition*): Self = StObject.set(x, "TimeSeriesConditions", js.Array(value*))
  }
}
