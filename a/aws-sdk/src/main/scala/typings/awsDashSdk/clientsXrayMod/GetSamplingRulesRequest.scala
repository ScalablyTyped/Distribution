package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingRulesRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetSamplingRulesRequest {
  @scala.inline
  def apply(NextToken: String = null): GetSamplingRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetSamplingRulesRequest]
  }
}

