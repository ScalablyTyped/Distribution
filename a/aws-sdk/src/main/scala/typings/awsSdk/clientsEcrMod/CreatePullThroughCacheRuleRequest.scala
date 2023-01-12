package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePullThroughCacheRuleRequest extends StObject {
  
  /**
    * The repository name prefix to use when caching images from the source registry.
    */
  var ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix
  
  /**
    * The Amazon Web Services account ID associated with the registry to create the pull through cache rule for. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The registry URL of the upstream public registry to use as the source for the pull through cache rule.
    */
  var upstreamRegistryUrl: Url
}
object CreatePullThroughCacheRuleRequest {
  
  inline def apply(ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix, upstreamRegistryUrl: Url): CreatePullThroughCacheRuleRequest = {
    val __obj = js.Dynamic.literal(ecrRepositoryPrefix = ecrRepositoryPrefix.asInstanceOf[js.Any], upstreamRegistryUrl = upstreamRegistryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullThroughCacheRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePullThroughCacheRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setEcrRepositoryPrefix(value: PullThroughCacheRuleRepositoryPrefix): Self = StObject.set(x, "ecrRepositoryPrefix", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setUpstreamRegistryUrl(value: Url): Self = StObject.set(x, "upstreamRegistryUrl", value.asInstanceOf[js.Any])
  }
}
