package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegation extends StObject {
  
  /**
    *  The identifier for the assessment that's associated with the delegation. 
    */
  var assessmentId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the assessment that's associated with the delegation. 
    */
  var assessmentName: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  The comment that's related to the delegation. 
    */
  var comment: js.UndefOr[DelegationComment] = js.undefined
  
  /**
    *  The identifier for the control set that's associated with the delegation. 
    */
  var controlSetId: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    *  The IAM user or role that created the delegation. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    *  Specifies when the delegation was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier for the delegation. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  Specifies when the delegation was last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: js.UndefOr[IamArn] = js.undefined
  
  /**
    *  The type of customer persona.   In CreateAssessment, roleType can only be PROCESS_OWNER.  In UpdateSettings, roleType can only be PROCESS_OWNER. In BatchCreateDelegationByAssessment, roleType can only be RESOURCE_OWNER. 
    */
  var roleType: js.UndefOr[RoleType] = js.undefined
  
  /**
    *  The status of the delegation. 
    */
  var status: js.UndefOr[DelegationStatus] = js.undefined
}
object Delegation {
  
  inline def apply(): Delegation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegation]
  }
  
  extension [Self <: Delegation](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
    
    inline def setAssessmentName(value: AssessmentName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setComment(value: DelegationComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlSetIdUndefined: Self = StObject.set(x, "controlSetId", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setRoleArn(value: IamArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
    
    inline def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
    
    inline def setStatus(value: DelegationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
