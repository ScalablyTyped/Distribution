package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Specifies the throttling burst limit. Supported only for WebSocket APIs.
    */
  var ThrottlingBurstLimit: js.UndefOr[integer] = js.native
  /**
    * Specifies the throttling rate limit. Supported only for WebSocket APIs.
    */
  var ThrottlingRateLimit: js.UndefOr[double] = js.native
}

object RouteSettings {
  @scala.inline
  def apply(
    DataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
    DetailedMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
    LoggingLevel: LoggingLevel = null,
    ThrottlingBurstLimit: Int | Double = null,
    ThrottlingRateLimit: Int | Double = null
  ): RouteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DataTraceEnabled)) __obj.updateDynamic("DataTraceEnabled")(DataTraceEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(DetailedMetricsEnabled)) __obj.updateDynamic("DetailedMetricsEnabled")(DetailedMetricsEnabled.asInstanceOf[js.Any])
    if (LoggingLevel != null) __obj.updateDynamic("LoggingLevel")(LoggingLevel.asInstanceOf[js.Any])
    if (ThrottlingBurstLimit != null) __obj.updateDynamic("ThrottlingBurstLimit")(ThrottlingBurstLimit.asInstanceOf[js.Any])
    if (ThrottlingRateLimit != null) __obj.updateDynamic("ThrottlingRateLimit")(ThrottlingRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSettings]
  }
}

