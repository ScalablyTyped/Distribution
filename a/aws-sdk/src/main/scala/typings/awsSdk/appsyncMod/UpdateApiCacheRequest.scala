package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiCacheRequest extends js.Object {
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resovlers that you specify are cached.  
    */
  var apiCachingBehavior: ApiCachingBehavior = js.native
  /**
    * The GraphQL API Id.
    */
  var apiId: String = js.native
  /**
    * TTL in seconds for cache entries. Valid values are between 1 and 3600 seconds.
    */
  var ttl: Long = js.native
  /**
    * The cache instance type.    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: ApiCacheType = js.native
}

object UpdateApiCacheRequest {
  @scala.inline
  def apply(apiCachingBehavior: ApiCachingBehavior, apiId: String, ttl: Long, `type`: ApiCacheType): UpdateApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiCachingBehavior = apiCachingBehavior.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiCacheRequest]
  }
  @scala.inline
  implicit class UpdateApiCacheRequestOps[Self <: UpdateApiCacheRequest] (val x: Self) extends AnyVal {
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
  }
  
}

