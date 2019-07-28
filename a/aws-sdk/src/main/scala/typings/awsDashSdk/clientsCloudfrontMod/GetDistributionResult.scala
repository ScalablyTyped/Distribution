package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDistributionResult extends js.Object {
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.Distribution] = js.undefined
  /**
    * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}

object GetDistributionResult {
  @scala.inline
  def apply(Distribution: Distribution = null, ETag: String = null): GetDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (Distribution != null) __obj.updateDynamic("Distribution")(Distribution)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    __obj.asInstanceOf[GetDistributionResult]
  }
}

