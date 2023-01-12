package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeRequestExecutionRequest extends StObject {
  
  /**
    * Indicates whether the change request can be approved automatically without the need for manual approvals. If AutoApprovable is enabled in a change template, then setting AutoApprove to true in StartChangeRequestExecution creates a change request that bypasses approver review.  Change Calendar restrictions are not bypassed in this scenario. If the state of an associated calendar is CLOSED, change freeze approvers must still grant permission for this change request to run. If they don't, the change won't be processed until the calendar state is again OPEN.  
    */
  var AutoApprove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User-provided details about the change. If no details are provided, content specified in the Template information section of the associated change template is added.
    */
  var ChangeDetails: js.UndefOr[ChangeDetailsValue] = js.undefined
  
  /**
    * The name of the change request associated with the runbook workflow to be run.
    */
  var ChangeRequestName: js.UndefOr[typings.awsSdk.clientsSsmMod.ChangeRequestName] = js.undefined
  
  /**
    * The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and can't be reused.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The name of the change template document to run during the runbook workflow.
    */
  var DocumentName: DocumentARN
  
  /**
    * The version of the change template document to run during the runbook workflow.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * A key-value map of parameters that match the declared parameters in the change template document.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * Information about the Automation runbooks that are run during the runbook workflow.  The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change request have been received. 
    */
  var Runbooks: typings.awsSdk.clientsSsmMod.Runbooks
  
  /**
    * The time that the requester expects the runbook workflow related to the change request to complete. The time is an estimate only that the requester provides for reviewers.
    */
  var ScheduledEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time specified in the change request to run the Automation runbooks.  The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change request have been received. 
    */
  var ScheduledTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a change request to identify an environment or target Amazon Web Services Region. In this case, you could specify the following key-value pairs:    Key=Environment,Value=Production     Key=Region,Value=us-east-2   
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartChangeRequestExecutionRequest {
  
  inline def apply(DocumentName: DocumentARN, Runbooks: Runbooks): StartChangeRequestExecutionRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any], Runbooks = Runbooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeRequestExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChangeRequestExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoApprove(value: Boolean): Self = StObject.set(x, "AutoApprove", value.asInstanceOf[js.Any])
    
    inline def setAutoApproveUndefined: Self = StObject.set(x, "AutoApprove", js.undefined)
    
    inline def setChangeDetails(value: ChangeDetailsValue): Self = StObject.set(x, "ChangeDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeDetailsUndefined: Self = StObject.set(x, "ChangeDetails", js.undefined)
    
    inline def setChangeRequestName(value: ChangeRequestName): Self = StObject.set(x, "ChangeRequestName", value.asInstanceOf[js.Any])
    
    inline def setChangeRequestNameUndefined: Self = StObject.set(x, "ChangeRequestName", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setParameters(value: AutomationParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRunbooks(value: Runbooks): Self = StObject.set(x, "Runbooks", value.asInstanceOf[js.Any])
    
    inline def setRunbooksVarargs(value: Runbook*): Self = StObject.set(x, "Runbooks", js.Array(value*))
    
    inline def setScheduledEndTime(value: js.Date): Self = StObject.set(x, "ScheduledEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "ScheduledEndTime", js.undefined)
    
    inline def setScheduledTime(value: js.Date): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeUndefined: Self = StObject.set(x, "ScheduledTime", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
