package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyTerminateProvisionedProductEngineWorkflowResultInput extends StObject {
  
  /**
    *  The reason why the terminate engine execution failed. 
    */
  var FailureReason: js.UndefOr[EngineWorkflowFailureReason] = js.undefined
  
  /**
    *  The idempotency token that identifies the terminate engine execution. 
    */
  var IdempotencyToken: typings.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    *  The identifier of the record. 
    */
  var RecordId: Id
  
  /**
    *  The status of the terminate engine execution. 
    */
  var Status: EngineWorkflowStatus
  
  /**
    *  The encrypted contents of the terminate engine execution payload that Service Catalog sends after the Terraform product terminate workflow starts. 
    */
  var WorkflowToken: EngineWorkflowToken
}
object NotifyTerminateProvisionedProductEngineWorkflowResultInput {
  
  inline def apply(
    IdempotencyToken: IdempotencyToken,
    RecordId: Id,
    Status: EngineWorkflowStatus,
    WorkflowToken: EngineWorkflowToken
  ): NotifyTerminateProvisionedProductEngineWorkflowResultInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], RecordId = RecordId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], WorkflowToken = WorkflowToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyTerminateProvisionedProductEngineWorkflowResultInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyTerminateProvisionedProductEngineWorkflowResultInput] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: EngineWorkflowFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EngineWorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setWorkflowToken(value: EngineWorkflowToken): Self = StObject.set(x, "WorkflowToken", value.asInstanceOf[js.Any])
  }
}
