package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWhatIfForecastsResponse extends StObject {
  
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
  
  /**
    * An array of WhatIfForecasts objects that describe the matched forecasts.
    */
  var WhatIfForecasts: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.WhatIfForecasts] = js.undefined
}
object ListWhatIfForecastsResponse {
  
  inline def apply(): ListWhatIfForecastsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWhatIfForecastsResponse]
  }
  
  extension [Self <: ListWhatIfForecastsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWhatIfForecasts(value: WhatIfForecasts): Self = StObject.set(x, "WhatIfForecasts", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastsUndefined: Self = StObject.set(x, "WhatIfForecasts", js.undefined)
    
    inline def setWhatIfForecastsVarargs(value: WhatIfForecastSummary*): Self = StObject.set(x, "WhatIfForecasts", js.Array(value*))
  }
}
