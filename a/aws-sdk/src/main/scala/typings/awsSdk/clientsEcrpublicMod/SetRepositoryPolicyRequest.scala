package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRepositoryPolicyRequest extends StObject {
  
  /**
    * If the policy that you want to set on a repository policy would prevent you from setting another policy in the future, you must force the SetRepositoryPolicy operation. This prevents accidental repository lockouts.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  
  /**
    * The JSON repository policy text to apply to the repository. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  var policyText: RepositoryPolicyText
  
  /**
    * The Amazon Web Services account ID that's associated with the registry that contains the repository. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName
}
object SetRepositoryPolicyRequest {
  
  inline def apply(policyText: RepositoryPolicyText, repositoryName: RepositoryName): SetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(policyText = policyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRepositoryPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRepositoryPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setPolicyText(value: RepositoryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
