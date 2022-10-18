package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCostEstimationRequest extends StObject {
  
  /**
    * The idempotency token used to identify each cost estimate request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ClientToken] = js.undefined
  
  /**
    * The collection of Amazon Web Services resources used to create a monthly DevOps Guru cost estimate.
    */
  var ResourceCollection: CostEstimationResourceCollectionFilter
}
object StartCostEstimationRequest {
  
  inline def apply(ResourceCollection: CostEstimationResourceCollectionFilter): StartCostEstimationRequest = {
    val __obj = js.Dynamic.literal(ResourceCollection = ResourceCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCostEstimationRequest]
  }
  
  extension [Self <: StartCostEstimationRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setResourceCollection(value: CostEstimationResourceCollectionFilter): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
  }
}
