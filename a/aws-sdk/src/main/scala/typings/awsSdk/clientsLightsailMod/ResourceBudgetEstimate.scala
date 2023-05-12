package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBudgetEstimate extends StObject {
  
  /**
    * The cost estimate for the specified budget.
    */
  var costEstimates: js.UndefOr[CostEstimates] = js.undefined
  
  /**
    * The estimate end time.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The resource name.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of resource the budget will track.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The estimate start time.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object ResourceBudgetEstimate {
  
  inline def apply(): ResourceBudgetEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceBudgetEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceBudgetEstimate] (val x: Self) extends AnyVal {
    
    inline def setCostEstimates(value: CostEstimates): Self = StObject.set(x, "costEstimates", value.asInstanceOf[js.Any])
    
    inline def setCostEstimatesUndefined: Self = StObject.set(x, "costEstimates", js.undefined)
    
    inline def setCostEstimatesVarargs(value: CostEstimate*): Self = StObject.set(x, "costEstimates", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
