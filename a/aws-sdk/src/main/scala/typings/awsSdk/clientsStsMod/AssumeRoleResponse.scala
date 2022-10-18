package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.clientsStsMod.AssumedRoleUser] = js.undefined
  
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsStsMod.Credentials] = js.undefined
  
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  
  /**
    * The source identity specified by the principal that is calling the AssumeRole operation. You can require users to specify a source identity when they assume a role. You do this by using the sts:SourceIdentity condition key in a role trust policy. You can use source identity information in CloudTrail logs to determine who took actions with a role. You can use the aws:SourceIdentity condition key to further control access to Amazon Web Services resources based on the value of source identity. For more information about using source identity, see Monitor and control actions taken with assumed roles in the IAM User Guide. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var SourceIdentity: js.UndefOr[sourceIdentityType] = js.undefined
}
object AssumeRoleResponse {
  
  inline def apply(): AssumeRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleResponse]
  }
  
  extension [Self <: AssumeRoleResponse](x: Self) {
    
    inline def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setPackedPolicySize(value: nonNegativeIntegerType): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    inline def setSourceIdentity(value: sourceIdentityType): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
  }
}
