package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperimentsResponse extends StObject {
  
  /**
    * A list of the summaries of your experiments.
    */
  var ExperimentSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentSummaries] = js.undefined
  
  /**
    * A token for getting the next set of experiments, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListExperimentsResponse {
  
  inline def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  
  extension [Self <: ListExperimentsResponse](x: Self) {
    
    inline def setExperimentSummaries(value: ExperimentSummaries): Self = StObject.set(x, "ExperimentSummaries", value.asInstanceOf[js.Any])
    
    inline def setExperimentSummariesUndefined: Self = StObject.set(x, "ExperimentSummaries", js.undefined)
    
    inline def setExperimentSummariesVarargs(value: ExperimentSummary*): Self = StObject.set(x, "ExperimentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
