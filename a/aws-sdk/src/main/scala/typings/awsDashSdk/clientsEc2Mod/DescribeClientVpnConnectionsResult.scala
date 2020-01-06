package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnConnectionsResult extends js.Object {
  /**
    * Information about the active and terminated client connections.
    */
  var Connections: js.UndefOr[ClientVpnConnectionSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
}

object DescribeClientVpnConnectionsResult {
  @scala.inline
  def apply(Connections: ClientVpnConnectionSet = null, NextToken: NextToken = null): DescribeClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnConnectionsResult]
  }
}

