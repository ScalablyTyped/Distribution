package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServersRequest extends js.Object {
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.MaxResults] = js.undefined
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NextToken] = js.undefined
  /**
    * Describes the server with the specified ServerName.
    */
  var ServerName: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.ServerName] = js.undefined
}

object DescribeServersRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ServerName: ServerName = null
  ): DescribeServersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    __obj.asInstanceOf[DescribeServersRequest]
  }
}

