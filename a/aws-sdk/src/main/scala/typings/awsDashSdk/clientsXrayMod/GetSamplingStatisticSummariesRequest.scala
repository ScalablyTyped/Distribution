package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingStatisticSummariesRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetSamplingStatisticSummariesRequest {
  @scala.inline
  def apply(NextToken: String = null): GetSamplingStatisticSummariesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetSamplingStatisticSummariesRequest]
  }
}

