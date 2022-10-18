package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceSchedulersResponse extends StObject {
  
  /**
    * Provides information about the specified inference scheduler, including data upload frequency, model name and ARN, and status. 
    */
  var InferenceSchedulerSummaries: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of inference schedulers. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListInferenceSchedulersResponse {
  
  inline def apply(): ListInferenceSchedulersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceSchedulersResponse]
  }
  
  extension [Self <: ListInferenceSchedulersResponse](x: Self) {
    
    inline def setInferenceSchedulerSummaries(value: InferenceSchedulerSummaries): Self = StObject.set(x, "InferenceSchedulerSummaries", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerSummariesUndefined: Self = StObject.set(x, "InferenceSchedulerSummaries", js.undefined)
    
    inline def setInferenceSchedulerSummariesVarargs(value: InferenceSchedulerSummary*): Self = StObject.set(x, "InferenceSchedulerSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
