package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCaseResponse extends js.Object {
  /**
    * The status of the case after the ResolveCase request was processed.
    */
  var finalCaseStatus: js.UndefOr[CaseStatus] = js.native
  /**
    * The status of the case when the ResolveCase request was sent.
    */
  var initialCaseStatus: js.UndefOr[CaseStatus] = js.native
}

object ResolveCaseResponse {
  @scala.inline
  def apply(finalCaseStatus: CaseStatus = null, initialCaseStatus: CaseStatus = null): ResolveCaseResponse = {
    val __obj = js.Dynamic.literal()
    if (finalCaseStatus != null) __obj.updateDynamic("finalCaseStatus")(finalCaseStatus.asInstanceOf[js.Any])
    if (initialCaseStatus != null) __obj.updateDynamic("initialCaseStatus")(initialCaseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCaseResponse]
  }
}

