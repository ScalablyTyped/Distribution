package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsResponse extends js.Object {
  /**
    * The IDs of the IPSet resources.
    */
  var IpSetIds: typings.awsDashSdk.clientsGuarddutyMod.IpSetIds
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IpSetIds: IpSetIds, NextToken: String = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal(IpSetIds = IpSetIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

