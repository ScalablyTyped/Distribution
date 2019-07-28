package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEnabledStandardsResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.undefined
  /**
    * A list of StandardsSubscriptions objects that include information about the enabled standards.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.StandardsSubscriptions] = js.undefined
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

