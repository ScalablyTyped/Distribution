package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCasesResponse extends js.Object {
  /**
    * The details for the cases that match the request.
    */
  var cases: js.UndefOr[CaseList] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCasesResponse {
  @scala.inline
  def apply(cases: CaseList = null, nextToken: NextToken = null): DescribeCasesResponse = {
    val __obj = js.Dynamic.literal()
    if (cases != null) __obj.updateDynamic("cases")(cases.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCasesResponse]
  }
}

