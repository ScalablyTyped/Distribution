package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAnalyticsConfigurationOutput extends js.Object {
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined
}

object GetBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration = null): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration)
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
}

