package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyUpdateProvisionedProductEngineWorkflowResultInput extends StObject {
  
  /**
    *  The reason why the update engine execution failed. 
    */
  var FailureReason: js.UndefOr[EngineWorkflowFailureReason] = js.undefined
  
  /**
    *  The idempotency token that identifies the update engine execution. 
    */
  var IdempotencyToken: typings.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    *  The output of the update engine execution. 
    */
  var Outputs: js.UndefOr[RecordOutputs] = js.undefined
  
  /**
    *  The identifier of the record. 
    */
  var RecordId: Id
  
  /**
    *  The status of the update engine execution. 
    */
  var Status: EngineWorkflowStatus
  
  /**
    *  The encrypted contents of the update engine execution payload that Service Catalog sends after the Terraform product update workflow starts. 
    */
  var WorkflowToken: EngineWorkflowToken
}
object NotifyUpdateProvisionedProductEngineWorkflowResultInput {
  
  inline def apply(
    IdempotencyToken: IdempotencyToken,
    RecordId: Id,
    Status: EngineWorkflowStatus,
    WorkflowToken: EngineWorkflowToken
  ): NotifyUpdateProvisionedProductEngineWorkflowResultInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], RecordId = RecordId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], WorkflowToken = WorkflowToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyUpdateProvisionedProductEngineWorkflowResultInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyUpdateProvisionedProductEngineWorkflowResultInput] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: EngineWorkflowFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: RecordOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: RecordOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EngineWorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setWorkflowToken(value: EngineWorkflowToken): Self = StObject.set(x, "WorkflowToken", value.asInstanceOf[js.Any])
  }
}
