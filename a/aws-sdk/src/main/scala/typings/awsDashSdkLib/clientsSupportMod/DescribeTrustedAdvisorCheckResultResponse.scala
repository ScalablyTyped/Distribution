package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
  /**
    * The detailed results of the Trusted Advisor check.
    */
  var result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
}

object DescribeTrustedAdvisorCheckResultResponse {
  @scala.inline
  def apply(result: TrustedAdvisorCheckResult = null): DescribeTrustedAdvisorCheckResultResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
  }
}

