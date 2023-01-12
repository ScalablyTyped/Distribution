package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentControlSet extends StObject {
  
  /**
    *  The list of controls that's contained with the control set. 
    */
  var controls: js.UndefOr[AssessmentControls] = js.undefined
  
  /**
    *  The delegations that are associated with the control set. 
    */
  var delegations: js.UndefOr[Delegations] = js.undefined
  
  /**
    *  The description for the control set. 
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The identifier of the control set in the assessment. This is the control set name in a plain string format. 
    */
  var id: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    *  The total number of evidence objects that are uploaded manually to the control set. 
    */
  var manualEvidenceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The roles that are associated with the control set. 
    */
  var roles: js.UndefOr[Roles] = js.undefined
  
  /**
    *  Specifies the current status of the control set. 
    */
  var status: js.UndefOr[ControlSetStatus] = js.undefined
  
  /**
    *  The total number of evidence objects that are retrieved automatically for the control set. 
    */
  var systemEvidenceCount: js.UndefOr[Integer] = js.undefined
}
object AssessmentControlSet {
  
  inline def apply(): AssessmentControlSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentControlSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentControlSet] (val x: Self) extends AnyVal {
    
    inline def setControls(value: AssessmentControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: AssessmentControl*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setDelegations(value: Delegations): Self = StObject.set(x, "delegations", value.asInstanceOf[js.Any])
    
    inline def setDelegationsUndefined: Self = StObject.set(x, "delegations", js.undefined)
    
    inline def setDelegationsVarargs(value: Delegation*): Self = StObject.set(x, "delegations", js.Array(value*))
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ControlSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManualEvidenceCount(value: Integer): Self = StObject.set(x, "manualEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setManualEvidenceCountUndefined: Self = StObject.set(x, "manualEvidenceCount", js.undefined)
    
    inline def setRoles(value: Roles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setStatus(value: ControlSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSystemEvidenceCount(value: Integer): Self = StObject.set(x, "systemEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setSystemEvidenceCountUndefined: Self = StObject.set(x, "systemEvidenceCount", js.undefined)
  }
}
