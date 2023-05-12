package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRescoreExecutionPlanResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rescore execution plan.
    */
  var Arn: js.UndefOr[RescoreExecutionPlanArn] = js.undefined
  
  /**
    * The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore execution plan is using the default capacity. For more information on the default capacity and additional capacity units, see Adjusting capacity.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * The Unix timestamp of when the rescore execution plan was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the rescore execution plan.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.Description] = js.undefined
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the rescore execution plan.
    */
  var Id: js.UndefOr[RescoreExecutionPlanId] = js.undefined
  
  /**
    * The name for the rescore execution plan.
    */
  var Name: js.UndefOr[RescoreExecutionPlanName] = js.undefined
  
  /**
    * The current status of the rescore execution plan. When the value is ACTIVE, the rescore execution plan is ready for use. If the Status field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var Status: js.UndefOr[RescoreExecutionPlanStatus] = js.undefined
  
  /**
    * The Unix timestamp of when the rescore execution plan was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeRescoreExecutionPlanResponse {
  
  inline def apply(): DescribeRescoreExecutionPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRescoreExecutionPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRescoreExecutionPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RescoreExecutionPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
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
