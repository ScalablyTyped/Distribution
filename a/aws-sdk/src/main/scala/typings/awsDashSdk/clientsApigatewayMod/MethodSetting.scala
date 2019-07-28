package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSetting extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted. The PATCH path for this setting is /{method_setting_key}/caching/dataEncrypted, and the value is a Boolean.
    */
  var cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached. The PATCH path for this setting is /{method_setting_key}/caching/ttlInSeconds, and the value is an integer.
    */
  var cacheTtlInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached. The PATCH path for this setting is /{method_setting_key}/caching/enabled, and the value is a Boolean.
    */
  var cachingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/dataTrace, and the value is a Boolean.
    */
  var dataTraceEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/loglevel, and the available levels are OFF, ERROR, and INFO.
    */
  var loggingLevel: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is /{method_setting_key}/metrics/enabled, and the value is a Boolean.
    */
  var metricsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is /{method_setting_key}/caching/requireAuthorizationForCacheControl, and the value is a Boolean.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the throttling burst limit. The PATCH path for this setting is /{method_setting_key}/throttling/burstLimit, and the value is an integer.
    */
  var throttlingBurstLimit: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the throttling rate limit. The PATCH path for this setting is /{method_setting_key}/throttling/rateLimit, and the value is a double.
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.undefined
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is /{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy, and the available values are FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.undefined
}

object MethodSetting {
  @scala.inline
  def apply(
    cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
    cacheTtlInSeconds: js.UndefOr[Integer] = js.undefined,
    cachingEnabled: js.UndefOr[Boolean] = js.undefined,
    dataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
    loggingLevel: String = null,
    metricsEnabled: js.UndefOr[Boolean] = js.undefined,
    requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
    throttlingBurstLimit: js.UndefOr[Integer] = js.undefined,
    throttlingRateLimit: js.UndefOr[Double] = js.undefined,
    unauthorizedCacheControlHeaderStrategy: UnauthorizedCacheControlHeaderStrategy = null
  ): MethodSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheDataEncrypted)) __obj.updateDynamic("cacheDataEncrypted")(cacheDataEncrypted)
    if (!js.isUndefined(cacheTtlInSeconds)) __obj.updateDynamic("cacheTtlInSeconds")(cacheTtlInSeconds)
    if (!js.isUndefined(cachingEnabled)) __obj.updateDynamic("cachingEnabled")(cachingEnabled)
    if (!js.isUndefined(dataTraceEnabled)) __obj.updateDynamic("dataTraceEnabled")(dataTraceEnabled)
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel)
    if (!js.isUndefined(metricsEnabled)) __obj.updateDynamic("metricsEnabled")(metricsEnabled)
    if (!js.isUndefined(requireAuthorizationForCacheControl)) __obj.updateDynamic("requireAuthorizationForCacheControl")(requireAuthorizationForCacheControl)
    if (!js.isUndefined(throttlingBurstLimit)) __obj.updateDynamic("throttlingBurstLimit")(throttlingBurstLimit)
    if (!js.isUndefined(throttlingRateLimit)) __obj.updateDynamic("throttlingRateLimit")(throttlingRateLimit)
    if (unauthorizedCacheControlHeaderStrategy != null) __obj.updateDynamic("unauthorizedCacheControlHeaderStrategy")(unauthorizedCacheControlHeaderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSetting]
  }
}

