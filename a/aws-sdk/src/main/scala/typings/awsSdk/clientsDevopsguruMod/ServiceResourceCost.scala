package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceResourceCost extends StObject {
  
  /**
    * The total estimated monthly cost to analyze the active resources for this resource.
    */
  var Cost: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.Cost] = js.undefined
  
  /**
    * The number of active resources analyzed for this service to create a monthly cost estimate.
    */
  var Count: js.UndefOr[CostEstimationServiceResourceCount] = js.undefined
  
  /**
    * The state of the resource. The resource is ACTIVE if it produces metrics, events, or logs within an hour, otherwise it is INACTIVE. You pay for the number of active Amazon Web Services resource hours analyzed for each resource. Inactive resources are not charged. 
    */
  var State: js.UndefOr[CostEstimationServiceResourceState] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The price per hour to analyze the resources in the service. For more information, see Estimate your Amazon DevOps Guru costs and Amazon DevOps Guru pricing.
    */
  var UnitCost: js.UndefOr[Cost] = js.undefined
}
object ServiceResourceCost {
  
  inline def apply(): ServiceResourceCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResourceCost]
  }
  
  extension [Self <: ServiceResourceCost](x: Self) {
    
    inline def setCost(value: Cost): Self = StObject.set(x, "Cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "Cost", js.undefined)
    
    inline def setCount(value: CostEstimationServiceResourceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setState(value: CostEstimationServiceResourceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUnitCost(value: Cost): Self = StObject.set(x, "UnitCost", value.asInstanceOf[js.Any])
    
    inline def setUnitCostUndefined: Self = StObject.set(x, "UnitCost", js.undefined)
  }
}
