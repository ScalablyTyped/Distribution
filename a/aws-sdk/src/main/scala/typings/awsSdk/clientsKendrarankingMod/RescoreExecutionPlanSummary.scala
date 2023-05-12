package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RescoreExecutionPlanSummary extends StObject {
  
  /**
    * The Unix timestamp when the rescore execution plan was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the rescore execution plan.
    */
  var Id: js.UndefOr[RescoreExecutionPlanId] = js.undefined
  
  /**
    * The name of the rescore execution plan.
    */
  var Name: js.UndefOr[RescoreExecutionPlanName] = js.undefined
  
  /**
    * The current status of the rescore execution plan. When the value is ACTIVE, the rescore execution plan is ready for use.
    */
  var Status: js.UndefOr[RescoreExecutionPlanStatus] = js.undefined
  
  /**
    * The Unix timestamp when the rescore execution plan was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object RescoreExecutionPlanSummary {
  
  inline def apply(): RescoreExecutionPlanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RescoreExecutionPlanSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RescoreExecutionPlanSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setId(value: RescoreExecutionPlanId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: RescoreExecutionPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: RescoreExecutionPlanStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
