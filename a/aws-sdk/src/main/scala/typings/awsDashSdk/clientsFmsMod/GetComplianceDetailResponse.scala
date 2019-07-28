package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailResponse extends js.Object {
  /**
    * Information about the resources and the policy that you specified in the GetComplianceDetail request.
    */
  var PolicyComplianceDetail: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyComplianceDetail] = js.undefined
}

object GetComplianceDetailResponse {
  @scala.inline
  def apply(PolicyComplianceDetail: PolicyComplianceDetail = null): GetComplianceDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyComplianceDetail != null) __obj.updateDynamic("PolicyComplianceDetail")(PolicyComplianceDetail)
    __obj.asInstanceOf[GetComplianceDetailResponse]
  }
}

