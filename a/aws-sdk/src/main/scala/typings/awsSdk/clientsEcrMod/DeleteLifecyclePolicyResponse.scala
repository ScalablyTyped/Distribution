package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLifecyclePolicyResponse extends StObject {
  
  /**
    * The time stamp of the last time that the lifecycle policy was run.
    */
  var lastEvaluatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The JSON lifecycle policy text.
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
}
object DeleteLifecyclePolicyResponse {
  
  inline def apply(): DeleteLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
  }
  
  extension [Self <: DeleteLifecyclePolicyResponse](x: Self) {
    
    inline def setLastEvaluatedAt(value: js.Date): Self = StObject.set(x, "lastEvaluatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedAtUndefined: Self = StObject.set(x, "lastEvaluatedAt", js.undefined)
    
    inline def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "lifecyclePolicyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
