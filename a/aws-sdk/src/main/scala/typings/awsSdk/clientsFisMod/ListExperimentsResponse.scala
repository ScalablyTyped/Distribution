package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperimentsResponse extends StObject {
  
  /**
    * The experiments.
    */
  var experiments: js.UndefOr[ExperimentSummaryList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListExperimentsResponse {
  
  inline def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  
  extension [Self <: ListExperimentsResponse](x: Self) {
    
    inline def setExperiments(value: ExperimentSummaryList): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setExperimentsVarargs(value: ExperimentSummary*): Self = StObject.set(x, "experiments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
