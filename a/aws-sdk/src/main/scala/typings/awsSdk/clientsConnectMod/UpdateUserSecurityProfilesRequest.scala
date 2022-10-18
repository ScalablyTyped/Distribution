package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserSecurityProfilesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: typings.awsSdk.clientsConnectMod.SecurityProfileIds
  
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.clientsConnectMod.UserId
}
object UpdateUserSecurityProfilesRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileIds: SecurityProfileIds, UserId: UserId): UpdateUserSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
  }
  
  extension [Self <: UpdateUserSecurityProfilesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIds(value: SecurityProfileIds): Self = StObject.set(x, "SecurityProfileIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = StObject.set(x, "SecurityProfileIds", js.Array(value*))
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
