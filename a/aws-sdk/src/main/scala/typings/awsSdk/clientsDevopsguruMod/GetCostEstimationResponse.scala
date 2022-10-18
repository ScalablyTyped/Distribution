package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostEstimationResponse extends StObject {
  
  /**
    * An array of ResourceCost objects that each contains details about the monthly cost estimate to analyze one of your Amazon Web Services resources.
    */
  var Costs: js.UndefOr[ServiceResourceCosts] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    * The collection of the Amazon Web Services resources used to create your monthly DevOps Guru cost estimate.
    */
  var ResourceCollection: js.UndefOr[CostEstimationResourceCollectionFilter] = js.undefined
  
  /**
    * The status of creating this cost estimate. If it's still in progress, the status ONGOING is returned. If it is finished, the status COMPLETED is returned.
    */
  var Status: js.UndefOr[CostEstimationStatus] = js.undefined
  
  /**
    * The start and end time of the cost estimation.
    */
  var TimeRange: js.UndefOr[CostEstimationTimeRange] = js.undefined
  
  /**
    * The estimated monthly cost to analyze the Amazon Web Services resources. This value is the sum of the estimated costs to analyze each resource in the Costs object in this response.
    */
  var TotalCost: js.UndefOr[Cost] = js.undefined
}
object GetCostEstimationResponse {
  
  inline def apply(): GetCostEstimationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostEstimationResponse]
  }
  
  extension [Self <: GetCostEstimationResponse](x: Self) {
    
    inline def setCosts(value: ServiceResourceCosts): Self = StObject.set(x, "Costs", value.asInstanceOf[js.Any])
    
    inline def setCostsUndefined: Self = StObject.set(x, "Costs", js.undefined)
    
    inline def setCostsVarargs(value: ServiceResourceCost*): Self = StObject.set(x, "Costs", js.Array(value*))
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceCollection(value: CostEstimationResourceCollectionFilter): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setStatus(value: CostEstimationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimeRange(value: CostEstimationTimeRange): Self = StObject.set(x, "TimeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "TimeRange", js.undefined)
    
    inline def setTotalCost(value: Cost): Self = StObject.set(x, "TotalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalCostUndefined: Self = StObject.set(x, "TotalCost", js.undefined)
  }
}
