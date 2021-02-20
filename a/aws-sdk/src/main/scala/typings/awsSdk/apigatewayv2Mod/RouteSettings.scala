package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSettings extends StObject {
  
  /**
    * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var DataTraceEnabled: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies the logging level for this route: INFO, ERROR, or OFF. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var LoggingLevel: js.UndefOr[typings.awsSdk.apigatewayv2Mod.LoggingLevel] = js.native
  
  /**
    * Specifies the throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[integer] = js.native
  
  /**
    * Specifies the throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[double] = js.native
}
object RouteSettings {
  
  @scala.inline
  def apply(): RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings]
  }
  
  @scala.inline
  implicit class RouteSettingsMutableBuilder[Self <: RouteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTraceEnabled(value: boolean): Self = StObject.set(x, "DataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTraceEnabledUndefined: Self = StObject.set(x, "DataTraceEnabled", js.undefined)
    
    @scala.inline
    def setDetailedMetricsEnabled(value: boolean): Self = StObject.set(x, "DetailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "DetailedMetricsEnabled", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: LoggingLevel): Self = StObject.set(x, "LoggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingLevelUndefined: Self = StObject.set(x, "LoggingLevel", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: integer): Self = StObject.set(x, "ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "ThrottlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: double): Self = StObject.set(x, "ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingRateLimitUndefined: Self = StObject.set(x, "ThrottlingRateLimit", js.undefined)
  }
}
