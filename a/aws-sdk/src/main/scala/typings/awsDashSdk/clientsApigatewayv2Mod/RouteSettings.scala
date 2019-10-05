package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSettings extends js.Object {
  /**
    * Specifies whether (true) or not (false) data trace
    logging is enabled for this route. This property affects the log entries pushed to
    Amazon CloudWatch Logs.
    */
  var DataTraceEnabled: js.UndefOr[__boolean] = js.undefined
  /**
    * Specifies whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[__boolean] = js.undefined
  /**
    * Specifies the logging level for this route: DEBUG, INFO,
    or WARN. This property affects the log entries pushed to Amazon
    CloudWatch Logs.
    */
  var LoggingLevel: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.LoggingLevel] = js.undefined
  /**
    * Specifies the throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[__integer] = js.undefined
  /**
    * Specifies the throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[__double] = js.undefined
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
    if (!js.isUndefined(DataTraceEnabled)) __obj.updateDynamic("DataTraceEnabled")(DataTraceEnabled)
    if (!js.isUndefined(DetailedMetricsEnabled)) __obj.updateDynamic("DetailedMetricsEnabled")(DetailedMetricsEnabled)
    if (LoggingLevel != null) __obj.updateDynamic("LoggingLevel")(LoggingLevel.asInstanceOf[js.Any])
    if (ThrottlingBurstLimit != null) __obj.updateDynamic("ThrottlingBurstLimit")(ThrottlingBurstLimit.asInstanceOf[js.Any])
    if (ThrottlingRateLimit != null) __obj.updateDynamic("ThrottlingRateLimit")(ThrottlingRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSettings]
  }
}

