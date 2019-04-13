package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLunaClientsResponse extends js.Object {
  /**
    * The list of clients.
    */
  var ClientList: awsDashSdkLib.clientsCloudhsmMod.ClientList
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListLunaClientsResponse {
  @scala.inline
  def apply(ClientList: ClientList, NextToken: PaginationToken = null): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
}

