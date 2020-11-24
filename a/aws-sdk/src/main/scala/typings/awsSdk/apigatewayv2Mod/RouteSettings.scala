package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSettings extends js.Object {
  
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
  implicit class RouteSettingsOps[Self <: RouteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataTraceEnabled(value: boolean): Self = this.set("DataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("DataTraceEnabled", js.undefined)
    
    @scala.inline
    def setDetailedMetricsEnabled(value: boolean): Self = this.set("DetailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedMetricsEnabled: Self = this.set("DetailedMetricsEnabled", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: LoggingLevel): Self = this.set("LoggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingLevel: Self = this.set("LoggingLevel", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: integer): Self = this.set("ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("ThrottlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: double): Self = this.set("ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("ThrottlingRateLimit", js.undefined)
  }
}
