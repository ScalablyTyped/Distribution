package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpgradeHistoryRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsEsMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.undefined
}

object GetUpgradeHistoryRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): GetUpgradeHistoryRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetUpgradeHistoryRequest]
  }
}

