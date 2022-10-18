package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityProfileRequest extends StObject {
  
  /**
    * The description of the security profile.
    */
  var Description: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The permissions granted to a security profile. For a list of valid permissions, see List of security profile permissions.
    */
  var Permissions: js.UndefOr[PermissionsList] = js.undefined
  
  /**
    * The identifier for the security profle.
    */
  var SecurityProfileId: typings.awsSdk.clientsConnectMod.SecurityProfileId
}
object UpdateSecurityProfileRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileId: SecurityProfileId): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileId = SecurityProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
  
  extension [Self <: UpdateSecurityProfileRequest](x: Self) {
    
    inline def setDescription(value: SecurityProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: PermissionsList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SecurityProfilePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSecurityProfileId(value: SecurityProfileId): Self = StObject.set(x, "SecurityProfileId", value.asInstanceOf[js.Any])
  }
}
