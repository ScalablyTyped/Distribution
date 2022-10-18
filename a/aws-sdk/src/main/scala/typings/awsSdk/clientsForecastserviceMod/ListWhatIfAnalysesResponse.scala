package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWhatIfAnalysesResponse extends StObject {
  
  /**
    * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
  
  /**
    * An array of WhatIfAnalysisSummary objects that describe the matched analyses.
    */
  var WhatIfAnalyses: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.WhatIfAnalyses] = js.undefined
}
object ListWhatIfAnalysesResponse {
  
  inline def apply(): ListWhatIfAnalysesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWhatIfAnalysesResponse]
  }
  
  extension [Self <: ListWhatIfAnalysesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWhatIfAnalyses(value: WhatIfAnalyses): Self = StObject.set(x, "WhatIfAnalyses", value.asInstanceOf[js.Any])
    
    inline def setWhatIfAnalysesUndefined: Self = StObject.set(x, "WhatIfAnalyses", js.undefined)
    
    inline def setWhatIfAnalysesVarargs(value: WhatIfAnalysisSummary*): Self = StObject.set(x, "WhatIfAnalyses", js.Array(value*))
  }
}
