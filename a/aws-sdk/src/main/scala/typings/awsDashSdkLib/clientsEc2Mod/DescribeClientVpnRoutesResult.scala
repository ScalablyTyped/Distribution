package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnRoutesResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the Client VPN endpoint routes.
    */
  var Routes: js.UndefOr[ClientVpnRouteSet] = js.undefined
}

object DescribeClientVpnRoutesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Routes: ClientVpnRouteSet = null): DescribeClientVpnRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Routes != null) __obj.updateDynamic("Routes")(Routes)
    __obj.asInstanceOf[DescribeClientVpnRoutesResult]
  }
}

