package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomaliesForInsightResponse extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  An array of ProactiveAnomalySummary objects that represent the requested anomalies 
    */
  var ProactiveAnomalies: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ProactiveAnomalies] = js.undefined
  
  /**
    *  An array of ReactiveAnomalySummary objects that represent the requested anomalies 
    */
  var ReactiveAnomalies: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ReactiveAnomalies] = js.undefined
}
object ListAnomaliesForInsightResponse {
  
  inline def apply(): ListAnomaliesForInsightResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomaliesForInsightResponse]
  }
  
  extension [Self <: ListAnomaliesForInsightResponse](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProactiveAnomalies(value: ProactiveAnomalies): Self = StObject.set(x, "ProactiveAnomalies", value.asInstanceOf[js.Any])
    
    inline def setProactiveAnomaliesUndefined: Self = StObject.set(x, "ProactiveAnomalies", js.undefined)
    
    inline def setProactiveAnomaliesVarargs(value: ProactiveAnomalySummary*): Self = StObject.set(x, "ProactiveAnomalies", js.Array(value*))
    
    inline def setReactiveAnomalies(value: ReactiveAnomalies): Self = StObject.set(x, "ReactiveAnomalies", value.asInstanceOf[js.Any])
    
    inline def setReactiveAnomaliesUndefined: Self = StObject.set(x, "ReactiveAnomalies", js.undefined)
    
    inline def setReactiveAnomaliesVarargs(value: ReactiveAnomalySummary*): Self = StObject.set(x, "ReactiveAnomalies", js.Array(value*))
  }
}
