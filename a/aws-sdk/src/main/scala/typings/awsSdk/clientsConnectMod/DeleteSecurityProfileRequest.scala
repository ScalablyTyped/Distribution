package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecurityProfileRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the security profle.
    */
  var SecurityProfileId: typings.awsSdk.clientsConnectMod.SecurityProfileId
}
object DeleteSecurityProfileRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileId: SecurityProfileId): DeleteSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileId = SecurityProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityProfileRequest]
  }
  
  extension [Self <: DeleteSecurityProfileRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileId(value: SecurityProfileId): Self = StObject.set(x, "SecurityProfileId", value.asInstanceOf[js.Any])
  }
}
