package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSetting extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted. The PATCH path for this setting is /{method_setting_key}/caching/dataEncrypted, and the value is a Boolean.
    */
  var cacheDataEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached. The PATCH path for this setting is /{method_setting_key}/caching/ttlInSeconds, and the value is an integer.
    */
  var cacheTtlInSeconds: js.UndefOr[Integer] = js.native
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached. The PATCH path for this setting is /{method_setting_key}/caching/enabled, and the value is a Boolean.
    */
  var cachingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/dataTrace, and the value is a Boolean.
    */
  var dataTraceEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/loglevel, and the available levels are OFF, ERROR, and INFO. Choose ERROR to write only error-level entries to CloudWatch Logs, or choose INFO to include all ERROR events as well as extra informational events.
    */
  var loggingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is /{method_setting_key}/metrics/enabled, and the value is a Boolean.
    */
  var metricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is /{method_setting_key}/caching/requireAuthorizationForCacheControl, and the value is a Boolean.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the throttling burst limit. The PATCH path for this setting is /{method_setting_key}/throttling/burstLimit, and the value is an integer.
    */
  var throttlingBurstLimit: js.UndefOr[Integer] = js.native
  /**
    * Specifies the throttling rate limit. The PATCH path for this setting is /{method_setting_key}/throttling/rateLimit, and the value is a double.
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.native
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is /{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy, and the available values are FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.native
}

object MethodSetting {
  @scala.inline
  def apply(): MethodSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSetting]
  }
  @scala.inline
  implicit class MethodSettingOps[Self <: MethodSetting] (val x: Self) extends AnyVal {
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
    def setCacheDataEncrypted(value: Boolean): Self = this.set("cacheDataEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheDataEncrypted: Self = this.set("cacheDataEncrypted", js.undefined)
    @scala.inline
    def setCacheTtlInSeconds(value: Integer): Self = this.set("cacheTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTtlInSeconds: Self = this.set("cacheTtlInSeconds", js.undefined)
    @scala.inline
    def setCachingEnabled(value: Boolean): Self = this.set("cachingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingEnabled: Self = this.set("cachingEnabled", js.undefined)
    @scala.inline
    def setDataTraceEnabled(value: Boolean): Self = this.set("dataTraceEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("dataTraceEnabled", js.undefined)
    @scala.inline
    def setLoggingLevel(value: String): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingLevel: Self = this.set("loggingLevel", js.undefined)
    @scala.inline
    def setMetricsEnabled(value: Boolean): Self = this.set("metricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsEnabled: Self = this.set("metricsEnabled", js.undefined)
    @scala.inline
    def setRequireAuthorizationForCacheControl(value: Boolean): Self = this.set("requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireAuthorizationForCacheControl: Self = this.set("requireAuthorizationForCacheControl", js.undefined)
    @scala.inline
    def setThrottlingBurstLimit(value: Integer): Self = this.set("throttlingBurstLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("throttlingBurstLimit", js.undefined)
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = this.set("throttlingRateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("throttlingRateLimit", js.undefined)
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategy(value: UnauthorizedCacheControlHeaderStrategy): Self = this.set("unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnauthorizedCacheControlHeaderStrategy: Self = this.set("unauthorizedCacheControlHeaderStrategy", js.undefined)
  }
  
}

