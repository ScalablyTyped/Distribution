package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceRequest extends StObject {
  
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString
  
  /**
    * The new role to use for the given resource registered in Lake Formation.
    */
  var RoleArn: IAMRoleArn
}
object UpdateResourceRequest {
  
  inline def apply(ResourceArn: ResourceArnString, RoleArn: IAMRoleArn): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
  
  extension [Self <: UpdateResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
