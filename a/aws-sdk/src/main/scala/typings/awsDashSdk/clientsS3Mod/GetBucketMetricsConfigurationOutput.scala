package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketMetricsConfigurationOutput extends js.Object {
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MetricsConfiguration] = js.undefined
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply(MetricsConfiguration: MetricsConfiguration = null): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricsConfiguration != null) __obj.updateDynamic("MetricsConfiguration")(MetricsConfiguration)
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
}

