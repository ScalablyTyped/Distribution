package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionConfigResult extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.DistributionConfig] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetDistributionConfigResult {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig = null, ETag: String = null): GetDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DistributionConfig != null) __obj.updateDynamic("DistributionConfig")(DistributionConfig.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigResult]
  }
}

