package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCaseResponse extends js.Object {
  /**
    * The status of the case after the ResolveCase request was processed.
    */
  var finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined
  /**
    * The status of the case when the ResolveCase request was sent.
    */
  var initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined
}

object ResolveCaseResponse {
  @scala.inline
  def apply(finalCaseStatus: CaseStatus = null, initialCaseStatus: CaseStatus = null): ResolveCaseResponse = {
    val __obj = js.Dynamic.literal()
    if (finalCaseStatus != null) __obj.updateDynamic("finalCaseStatus")(finalCaseStatus)
    if (initialCaseStatus != null) __obj.updateDynamic("initialCaseStatus")(initialCaseStatus)
    __obj.asInstanceOf[ResolveCaseResponse]
  }
}

