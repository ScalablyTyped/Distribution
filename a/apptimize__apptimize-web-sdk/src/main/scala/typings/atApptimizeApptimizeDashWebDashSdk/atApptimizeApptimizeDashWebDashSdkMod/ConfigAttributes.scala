package typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkMod

import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_DEBUG
import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_ERROR
import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_INFO
import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_NONE
import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_VERBOSE
import typings.atApptimizeApptimizeDashWebDashSdk.atApptimizeApptimizeDashWebDashSdkStrings.LOG_LEVEL_WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigAttributes extends js.Object {
  var log_level: js.UndefOr[
    LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
  ] = js.undefined
  var result_post_delay_ms: js.UndefOr[Double] = js.undefined
}

object ConfigAttributes {
  @scala.inline
  def apply(
    log_level: LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE = null,
    result_post_delay_ms: Int | Double = null
  ): ConfigAttributes = {
    val __obj = js.Dynamic.literal()
    if (log_level != null) __obj.updateDynamic("log_level")(log_level.asInstanceOf[js.Any])
    if (result_post_delay_ms != null) __obj.updateDynamic("result_post_delay_ms")(result_post_delay_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigAttributes]
  }
}

