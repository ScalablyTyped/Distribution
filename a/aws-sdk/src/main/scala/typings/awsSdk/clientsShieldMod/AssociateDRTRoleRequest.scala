package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDRTRoleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the role the SRT will use to access your Amazon Web Services account. Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to this role. For more information see Attaching and Detaching IAM Policies.
    */
  var RoleArn: typings.awsSdk.clientsShieldMod.RoleArn
}
object AssociateDRTRoleRequest {
  
  inline def apply(RoleArn: RoleArn): AssociateDRTRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDRTRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateDRTRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
