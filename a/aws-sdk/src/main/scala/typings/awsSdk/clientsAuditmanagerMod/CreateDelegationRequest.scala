package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDelegationRequest extends StObject {
  
  /**
    *  A comment that's related to the delegation request. 
    */
  var comment: js.UndefOr[DelegationComment] = js.undefined
  
  /**
    *  The unique identifier for the control set. 
    */
  var controlSetId: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: js.UndefOr[IamArn] = js.undefined
  
  /**
    *  The type of customer persona.   In CreateAssessment, roleType can only be PROCESS_OWNER.  In UpdateSettings, roleType can only be PROCESS_OWNER. In BatchCreateDelegationByAssessment, roleType can only be RESOURCE_OWNER. 
    */
  var roleType: js.UndefOr[RoleType] = js.undefined
}
object CreateDelegationRequest {
  
  inline def apply(): CreateDelegationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDelegationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDelegationRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: DelegationComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlSetIdUndefined: Self = StObject.set(x, "controlSetId", js.undefined)
    
    inline def setRoleArn(value: IamArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
    
    inline def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
  }
}
