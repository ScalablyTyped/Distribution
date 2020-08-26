package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCache extends js.Object {
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resovlers that you specify are cached.  
    */
  var apiCachingBehavior: js.UndefOr[ApiCachingBehavior] = js.native
  /**
    * At rest encryption flag for cache. This setting cannot be updated after creation.
    */
  var atRestEncryptionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The cache instance status.    AVAILABLE: The instance is available for use.    CREATING: The instance is currently creating.    DELETING: The instance is currently deleting.    MODIFYING: The instance is currently modifying.    FAILED: The instance has failed creation.  
    */
  var status: js.UndefOr[ApiCacheStatus] = js.native
  /**
    * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
    */
  var transitEncryptionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * TTL in seconds for cache entries. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
  /**
    * The cache instance type.    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: js.UndefOr[ApiCacheType] = js.native
}

object ApiCache {
  @scala.inline
  def apply(): ApiCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCache]
  }
  @scala.inline
  implicit class ApiCacheOps[Self <: ApiCache] (val x: Self) extends AnyVal {
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
    def deleteApiCachingBehavior: Self = this.set("apiCachingBehavior", js.undefined)
    @scala.inline
    def setAtRestEncryptionEnabled(value: Boolean): Self = this.set("atRestEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("atRestEncryptionEnabled", js.undefined)
    @scala.inline
    def setStatus(value: ApiCacheStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTransitEncryptionEnabled(value: Boolean): Self = this.set("transitEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("transitEncryptionEnabled", js.undefined)
    @scala.inline
    def setTtl(value: Long): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setType(value: ApiCacheType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

