package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiCache extends StObject {
  
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resolvers that you specify are cached.  
    */
  var apiCachingBehavior: js.UndefOr[ApiCachingBehavior] = js.undefined
  
  /**
    * At-rest encryption flag for cache. You cannot update this setting after creation.
    */
  var atRestEncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The cache instance status.    AVAILABLE: The instance is available for use.    CREATING: The instance is currently creating.    DELETING: The instance is currently deleting.    MODIFYING: The instance is currently modifying.    FAILED: The instance has failed creation.  
    */
  var status: js.UndefOr[ApiCacheStatus] = js.undefined
  
  /**
    * Transit encryption flag when connecting to cache. You cannot update this setting after creation.
    */
  var transitEncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TTL in seconds for cache entries. Valid values are 1–3,600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.undefined
  
  /**
    * The cache instance type. Valid values are     SMALL     MEDIUM     LARGE     XLARGE     LARGE_2X     LARGE_4X     LARGE_8X (not available in all regions)    LARGE_12X    Historically, instance types were identified by an EC2-style value. As of July 2020, this is deprecated, and the generic identifiers above should be used. The following legacy instance types are available, but their use is discouraged:    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: js.UndefOr[ApiCacheType] = js.undefined
}
object ApiCache {
  
  inline def apply(): ApiCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCache]
  }
  
  extension [Self <: ApiCache](x: Self) {
    
    inline def setApiCachingBehavior(value: ApiCachingBehavior): Self = StObject.set(x, "apiCachingBehavior", value.asInstanceOf[js.Any])
    
    inline def setApiCachingBehaviorUndefined: Self = StObject.set(x, "apiCachingBehavior", js.undefined)
    
    inline def setAtRestEncryptionEnabled(value: Boolean): Self = StObject.set(x, "atRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "atRestEncryptionEnabled", js.undefined)
    
    inline def setStatus(value: ApiCacheStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransitEncryptionEnabled(value: Boolean): Self = StObject.set(x, "transitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "transitEncryptionEnabled", js.undefined)
    
    inline def setTtl(value: Long): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: ApiCacheType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
