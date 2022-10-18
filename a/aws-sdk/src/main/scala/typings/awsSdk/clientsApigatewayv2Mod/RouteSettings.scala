package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSettings extends StObject {
  
  /**
    * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var DataTraceEnabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies the logging level for this route: INFO, ERROR, or OFF. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var LoggingLevel: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.LoggingLevel] = js.undefined
  
  /**
    * Specifies the throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies the throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[double] = js.undefined
}
object RouteSettings {
  
  inline def apply(): RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings]
  }
  
  extension [Self <: RouteSettings](x: Self) {
    
    inline def setDataTraceEnabled(value: boolean): Self = StObject.set(x, "DataTraceEnabled", value.asInstanceOf[js.Any])
    
    inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "DataTraceEnabled", js.undefined)
    
    inline def setDetailedMetricsEnabled(value: boolean): Self = StObject.set(x, "DetailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "DetailedMetricsEnabled", js.undefined)
    
    inline def setLoggingLevel(value: LoggingLevel): Self = StObject.set(x, "LoggingLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggingLevelUndefined: Self = StObject.set(x, "LoggingLevel", js.undefined)
    
    inline def setThrottlingBurstLimit(value: integer): Self = StObject.set(x, "ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "ThrottlingBurstLimit", js.undefined)
    
    inline def setThrottlingRateLimit(value: double): Self = StObject.set(x, "ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "ThrottlingRateLimit", js.undefined)
  }
}
