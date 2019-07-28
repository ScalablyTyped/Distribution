package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList
}

object DescribeTrustedAdvisorCheckSummariesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds)
  
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
}

