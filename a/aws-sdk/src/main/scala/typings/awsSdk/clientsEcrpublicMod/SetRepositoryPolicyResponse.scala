package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRepositoryPolicyResponse extends StObject {
  
  /**
    * The JSON repository policy text that's applied to the repository.
    */
  var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
  
  /**
    * The registry ID that's associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name that's associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object SetRepositoryPolicyResponse {
  
  inline def apply(): SetRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRepositoryPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRepositoryPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyText(value: RepositoryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
