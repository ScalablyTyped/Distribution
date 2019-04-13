package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDistributionConfigResult extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
}

object GetDistributionConfigResult {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig = null, ETag: java.lang.String = null): GetDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DistributionConfig != null) __obj.updateDynamic("DistributionConfig")(DistributionConfig)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    __obj.asInstanceOf[GetDistributionConfigResult]
  }
}

