package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLunaClientsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListLunaClientsRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null): ListLunaClientsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLunaClientsRequest]
  }
}

