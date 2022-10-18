package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFileSystemPolicyRequest extends StObject {
  
  /**
    * (Optional) A boolean that specifies whether or not to bypass the FileSystemPolicy lockout safety check. The lockout safety check determines whether the policy in the request will lock out, or prevent, the IAM principal that is making the request from making future PutFileSystemPolicy requests on this file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the IAM principal that is making the request from making subsequent PutFileSystemPolicy requests on this file system. The default value is False. 
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[typings.awsSdk.clientsEfsMod.BypassPolicyLockoutSafetyCheck] = js.undefined
  
  /**
    * The ID of the EFS file system that you want to create or update the FileSystemPolicy for.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
  
  /**
    * The FileSystemPolicy that you're creating. Accepts a JSON formatted policy definition. EFS file system policies have a 20,000 character limit. To find out more about the elements that make up a file system policy, see EFS Resource-based Policies. 
    */
  var Policy: typings.awsSdk.clientsEfsMod.Policy
}
object PutFileSystemPolicyRequest {
  
  inline def apply(FileSystemId: FileSystemId, Policy: Policy): PutFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileSystemPolicyRequest]
  }
  
  extension [Self <: PutFileSystemPolicyRequest](x: Self) {
    
    inline def setBypassPolicyLockoutSafetyCheck(value: BypassPolicyLockoutSafetyCheck): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
