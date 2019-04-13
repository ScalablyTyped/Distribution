package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEnabledStandardsResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The standards subscription details returned by the operation.
    */
  var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
}

object GetEnabledStandardsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, StandardsSubscriptions: StandardsSubscriptions = null): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StandardsSubscriptions != null) __obj.updateDynamic("StandardsSubscriptions")(StandardsSubscriptions)
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
}

