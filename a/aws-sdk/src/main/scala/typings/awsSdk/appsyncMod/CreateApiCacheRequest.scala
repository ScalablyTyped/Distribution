package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiCacheRequest extends js.Object {
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resovlers that you specify are cached.  
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
    * The cache instance type.    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: ApiCacheType = js.native
}

object CreateApiCacheRequest {
  @scala.inline
  def apply(
    apiCachingBehavior: ApiCachingBehavior,
    apiId: String,
    ttl: Long,
    `type`: ApiCacheType,
    atRestEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    transitEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiCachingBehavior = apiCachingBehavior.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(atRestEncryptionEnabled)) __obj.updateDynamic("atRestEncryptionEnabled")(atRestEncryptionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(transitEncryptionEnabled)) __obj.updateDynamic("transitEncryptionEnabled")(transitEncryptionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiCacheRequest]
  }
}

