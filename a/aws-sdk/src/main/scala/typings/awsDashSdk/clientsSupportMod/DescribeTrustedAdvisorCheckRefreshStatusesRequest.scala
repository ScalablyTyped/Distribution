package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks to get the status of. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkIds: StringList = js.native
}

object DescribeTrustedAdvisorCheckRefreshStatusesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
  }
}

