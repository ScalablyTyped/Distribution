package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRescoreExecutionPlanRequest extends StObject {
  
  /**
    * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For more information on the default capacity and additional capacity units, see Adjusting capacity.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * A new description for the rescore execution plan.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.Description] = js.undefined
  
  /**
    * The identifier of the rescore execution plan that you want to update.
    */
  var Id: RescoreExecutionPlanId
  
  /**
    * A new name for the rescore execution plan.
    */
  var Name: js.UndefOr[RescoreExecutionPlanName] = js.undefined
}
object UpdateRescoreExecutionPlanRequest {
  
  inline def apply(Id: RescoreExecutionPlanId): UpdateRescoreExecutionPlanRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRescoreExecutionPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRescoreExecutionPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: RescoreExecutionPlanId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: RescoreExecutionPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
