package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIpRoutesResult extends js.Object {
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.IpRoutesInfo] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
}

object ListIpRoutesResult {
  @scala.inline
  def apply(IpRoutesInfo: IpRoutesInfo = null, NextToken: NextToken = null): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (IpRoutesInfo != null) __obj.updateDynamic("IpRoutesInfo")(IpRoutesInfo.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIpRoutesResult]
  }
}

