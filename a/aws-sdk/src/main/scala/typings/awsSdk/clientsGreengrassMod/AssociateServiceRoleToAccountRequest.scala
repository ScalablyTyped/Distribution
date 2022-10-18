package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateServiceRoleToAccountRequest extends StObject {
  
  /**
    * The ARN of the service role you wish to associate with your account.
    */
  var RoleArn: string
}
object AssociateServiceRoleToAccountRequest {
  
  inline def apply(RoleArn: string): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
  
  extension [Self <: AssociateServiceRoleToAccountRequest](x: Self) {
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
