package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryPolicyResponse extends StObject {
  
  /**
    * The repository policy text associated with the repository. The policy text will be in JSON format.
    */
  var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object GetRepositoryPolicyResponse {
  
  inline def apply(): GetRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryPolicyResponse]
  }
  
  extension [Self <: GetRepositoryPolicyResponse](x: Self) {
    
    inline def setPolicyText(value: RepositoryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
