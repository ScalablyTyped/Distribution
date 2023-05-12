package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceExperimentsResponse extends StObject {
  
  /**
    * List of inference experiments.
    */
  var InferenceExperiments: js.UndefOr[InferenceExperimentList] = js.undefined
  
  /**
    * The token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListInferenceExperimentsResponse {
  
  inline def apply(): ListInferenceExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceExperimentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInferenceExperimentsResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperiments(value: InferenceExperimentList): Self = StObject.set(x, "InferenceExperiments", value.asInstanceOf[js.Any])
    
    inline def setInferenceExperimentsUndefined: Self = StObject.set(x, "InferenceExperiments", js.undefined)
    
    inline def setInferenceExperimentsVarargs(value: InferenceExperimentSummary*): Self = StObject.set(x, "InferenceExperiments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
