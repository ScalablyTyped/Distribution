package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodSetting extends StObject {
  
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
    * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/loglevel, and the available levels are OFF, ERROR, and INFO. Choose ERROR to write only error-level entries to CloudWatch Logs, or choose INFO to include all ERROR events as well as extra informational events.
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
  
  inline def apply(): MethodSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodSetting] (val x: Self) extends AnyVal {
    
    inline def setCacheDataEncrypted(value: Boolean): Self = StObject.set(x, "cacheDataEncrypted", value.asInstanceOf[js.Any])
    
    inline def setCacheDataEncryptedUndefined: Self = StObject.set(x, "cacheDataEncrypted", js.undefined)
    
    inline def setCacheTtlInSeconds(value: Integer): Self = StObject.set(x, "cacheTtlInSeconds", value.asInstanceOf[js.Any])
    
    inline def setCacheTtlInSecondsUndefined: Self = StObject.set(x, "cacheTtlInSeconds", js.undefined)
    
    inline def setCachingEnabled(value: Boolean): Self = StObject.set(x, "cachingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCachingEnabledUndefined: Self = StObject.set(x, "cachingEnabled", js.undefined)
    
    inline def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
    
    inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
    
    inline def setLoggingLevel(value: String): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
    
    inline def setMetricsEnabled(value: Boolean): Self = StObject.set(x, "metricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setMetricsEnabledUndefined: Self = StObject.set(x, "metricsEnabled", js.undefined)
    
    inline def setRequireAuthorizationForCacheControl(value: Boolean): Self = StObject.set(x, "requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    
    inline def setRequireAuthorizationForCacheControlUndefined: Self = StObject.set(x, "requireAuthorizationForCacheControl", js.undefined)
    
    inline def setThrottlingBurstLimit(value: Integer): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
    
    inline def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
    
    inline def setUnauthorizedCacheControlHeaderStrategy(value: UnauthorizedCacheControlHeaderStrategy): Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    
    inline def setUnauthorizedCacheControlHeaderStrategyUndefined: Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", js.undefined)
  }
}
