package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshTrustedAdvisorCheckResponse extends js.Object {
  /**
    * The current refresh status for a check, including the amount of time until the check is eligible for refresh.
    */
  var status: TrustedAdvisorCheckRefreshStatus
}

object RefreshTrustedAdvisorCheckResponse {
  @scala.inline
  def apply(status: TrustedAdvisorCheckRefreshStatus): RefreshTrustedAdvisorCheckResponse = {
    val __obj = js.Dynamic.literal(status = status)
  
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckResponse]
  }
}

