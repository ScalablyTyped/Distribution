package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceExecutionsRequest extends StObject {
  
  /**
    * The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the inference execution. 
    */
  var DataEndTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the inference execution. 
    */
  var DataStartTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the inference scheduler for the inference execution listed. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
  
  /**
    * Specifies the maximum number of inference executions to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token indicating where to continue the listing of inference executions.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
  
  /**
    * The status of the inference execution. 
    */
  var Status: js.UndefOr[InferenceExecutionStatus] = js.undefined
}
object ListInferenceExecutionsRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): ListInferenceExecutionsRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInferenceExecutionsRequest]
  }
  
  extension [Self <: ListInferenceExecutionsRequest](x: Self) {
    
    inline def setDataEndTimeBefore(value: js.Date): Self = StObject.set(x, "DataEndTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setDataEndTimeBeforeUndefined: Self = StObject.set(x, "DataEndTimeBefore", js.undefined)
    
    inline def setDataStartTimeAfter(value: js.Date): Self = StObject.set(x, "DataStartTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setDataStartTimeAfterUndefined: Self = StObject.set(x, "DataStartTimeAfter", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: InferenceExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
