package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnConnectionsResult extends js.Object {
  /**
    * Information about the active and terminated client connections.
    */
  var Connections: js.UndefOr[ClientVpnConnectionSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeClientVpnConnectionsResult {
  @scala.inline
  def apply(Connections: ClientVpnConnectionSet = null, NextToken: NextToken = null): DescribeClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClientVpnConnectionsResult]
  }
}

