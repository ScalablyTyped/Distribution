package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsResponse extends js.Object {
  var IpSetIds: js.UndefOr[IpSetIds] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IpSetIds: IpSetIds = null, NextToken: NextToken = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (IpSetIds != null) __obj.updateDynamic("IpSetIds")(IpSetIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

