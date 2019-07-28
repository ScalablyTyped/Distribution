package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceMetrics extends js.Object {
  var Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined
}

object PerformanceMetrics {
  @scala.inline
  def apply(Properties: PerformanceMetricsProperties = null): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    __obj.asInstanceOf[PerformanceMetrics]
  }
}

