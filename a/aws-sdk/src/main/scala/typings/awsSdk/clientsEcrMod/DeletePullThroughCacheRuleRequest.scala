package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePullThroughCacheRuleRequest extends StObject {
  
  /**
    * The Amazon ECR repository prefix associated with the pull through cache rule to delete.
    */
  var ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the pull through cache rule. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
}
object DeletePullThroughCacheRuleRequest {
  
  inline def apply(ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix): DeletePullThroughCacheRuleRequest = {
    val __obj = js.Dynamic.literal(ecrRepositoryPrefix = ecrRepositoryPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullThroughCacheRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePullThroughCacheRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setEcrRepositoryPrefix(value: PullThroughCacheRuleRepositoryPrefix): Self = StObject.set(x, "ecrRepositoryPrefix", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
  }
}
