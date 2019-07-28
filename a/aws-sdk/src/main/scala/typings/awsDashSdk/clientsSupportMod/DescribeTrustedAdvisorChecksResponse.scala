package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorChecksResponse extends js.Object {
  /**
    * Information about all available Trusted Advisor checks.
    */
  var checks: TrustedAdvisorCheckList
}

object DescribeTrustedAdvisorChecksResponse {
  @scala.inline
  def apply(checks: TrustedAdvisorCheckList): DescribeTrustedAdvisorChecksResponse = {
    val __obj = js.Dynamic.literal(checks = checks)
  
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksResponse]
  }
}

