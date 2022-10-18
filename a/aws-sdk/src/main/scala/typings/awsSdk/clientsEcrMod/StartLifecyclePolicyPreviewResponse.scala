package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLifecyclePolicyPreviewResponse extends StObject {
  
  /**
    * The JSON repository policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The status of the lifecycle policy preview request.
    */
  var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
}
object StartLifecyclePolicyPreviewResponse {
  
  inline def apply(): StartLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLifecyclePolicyPreviewResponse]
  }
  
  extension [Self <: StartLifecyclePolicyPreviewResponse](x: Self) {
    
    inline def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "lifecyclePolicyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setStatus(value: LifecyclePolicyPreviewStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
