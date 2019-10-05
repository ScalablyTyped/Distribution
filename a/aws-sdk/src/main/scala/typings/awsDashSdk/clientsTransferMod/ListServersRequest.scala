package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServersRequest extends js.Object {
  /**
    * Specifies the number of servers to return as a response to the ListServers query.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsTransferMod.MaxResults] = js.undefined
  /**
    * When additional results are obtained from the ListServers command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional servers.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTransferMod.NextToken] = js.undefined
}

object ListServersRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListServersRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListServersRequest]
  }
}

