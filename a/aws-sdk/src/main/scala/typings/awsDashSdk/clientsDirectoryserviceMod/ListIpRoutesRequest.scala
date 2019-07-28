package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIpRoutesRequest extends js.Object {
  /**
    * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The ListIpRoutes.NextToken value from a previous call to ListIpRoutes. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object ListIpRoutesRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Limit: js.UndefOr[Limit] = js.undefined, NextToken: NextToken = null): ListIpRoutesRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIpRoutesRequest]
  }
}

