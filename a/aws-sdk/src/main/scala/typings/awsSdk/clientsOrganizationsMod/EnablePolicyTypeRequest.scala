package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePolicyTypeRequest extends StObject {
  
  /**
    * The policy type that you want to enable. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     SERVICE_CONTROL_POLICY     TAG_POLICY   
    */
  var PolicyType: typings.awsSdk.clientsOrganizationsMod.PolicyType
  
  /**
    * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lowercase letters or digits.
    */
  var RootId: typings.awsSdk.clientsOrganizationsMod.RootId
}
object EnablePolicyTypeRequest {
  
  inline def apply(PolicyType: PolicyType, RootId: RootId): EnablePolicyTypeRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any], RootId = RootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePolicyTypeRequest]
  }
  
  extension [Self <: EnablePolicyTypeRequest](x: Self) {
    
    inline def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setRootId(value: RootId): Self = StObject.set(x, "RootId", value.asInstanceOf[js.Any])
  }
}
