package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiCacheRequest extends js.Object {
  
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resolvers that you specify are cached.  
    */
  var apiCachingBehavior: ApiCachingBehavior = js.native
  
  /**
    * The GraphQL API Id.
    */
  var apiId: String = js.native
  
  /**
    * At rest encryption flag for cache. This setting cannot be updated after creation.
    */
  var atRestEncryptionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
    */
  var transitEncryptionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * TTL in seconds for cache entries. Valid values are between 1 and 3600 seconds.
    */
  var ttl: Long = js.native
  
  /**
    * The cache instance type. Valid values are     SMALL     MEDIUM     LARGE     XLARGE     LARGE_2X     LARGE_4X     LARGE_8X (not available in all regions)    LARGE_12X    Historically, instance types were identified by an EC2-style value. As of July 2020, this is deprecated, and the generic identifiers above should be used. The following legacy instance types are available, but their use is discouraged:    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: ApiCacheType = js.native
}
object CreateApiCacheRequest {
  
  @scala.inline
  def apply(apiCachingBehavior: ApiCachingBehavior, apiId: String, ttl: Long, `type`: ApiCacheType): CreateApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiCachingBehavior = apiCachingBehavior.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiCacheRequest]
  }
  
  @scala.inline
  implicit class CreateApiCacheRequestOps[Self <: CreateApiCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiCachingBehavior(value: ApiCachingBehavior): Self = this.set("apiCachingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Long): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApiCacheType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: Boolean): Self = this.set("atRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("atRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: Boolean): Self = this.set("transitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("transitEncryptionEnabled", js.undefined)
  }
}
