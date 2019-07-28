package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIpRoutesResult extends js.Object {
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.IpRoutesInfo] = js.undefined
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object ListIpRoutesResult {
  @scala.inline
  def apply(IpRoutesInfo: IpRoutesInfo = null, NextToken: NextToken = null): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (IpRoutesInfo != null) __obj.updateDynamic("IpRoutesInfo")(IpRoutesInfo)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIpRoutesResult]
  }
}

