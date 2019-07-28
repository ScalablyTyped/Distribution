package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
  /**
    * The refresh status of the specified Trusted Advisor checks.
    */
  var statuses: TrustedAdvisorCheckRefreshStatusList
}

object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
  @scala.inline
  def apply(statuses: TrustedAdvisorCheckRefreshStatusList): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
    val __obj = js.Dynamic.literal(statuses = statuses)
  
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  }
}

