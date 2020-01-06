package typings.awsDashSdk.clientsAppsyncMod

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
  def apply(
    apiCachingBehavior: ApiCachingBehavior = null,
    atRestEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    status: ApiCacheStatus = null,
    transitEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: Int | Double = null,
    `type`: ApiCacheType = null
  ): ApiCache = {
    val __obj = js.Dynamic.literal()
    if (apiCachingBehavior != null) __obj.updateDynamic("apiCachingBehavior")(apiCachingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(atRestEncryptionEnabled)) __obj.updateDynamic("atRestEncryptionEnabled")(atRestEncryptionEnabled.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(transitEncryptionEnabled)) __obj.updateDynamic("transitEncryptionEnabled")(transitEncryptionEnabled.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiCache]
  }
}

