package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: IamArn
  
  /**
    *  The type of customer persona.   In CreateAssessment, roleType can only be PROCESS_OWNER.  In UpdateSettings, roleType can only be PROCESS_OWNER. In BatchCreateDelegationByAssessment, roleType can only be RESOURCE_OWNER. 
    */
  var roleType: RoleType
}
object Role {
  
  inline def apply(roleArn: IamArn, roleType: RoleType): Role = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], roleType = roleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: IamArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
  }
}
