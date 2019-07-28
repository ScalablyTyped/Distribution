package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchContactsResponse extends js.Object {
  /**
    * The contacts that meet the specified set of filter criteria, in sort order.
    */
  var Contacts: js.UndefOr[ContactDataList] = js.undefined
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The total number of contacts returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchContactsResponse {
  @scala.inline
  def apply(
    Contacts: ContactDataList = null,
    NextToken: NextToken = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    if (Contacts != null) __obj.updateDynamic("Contacts")(Contacts)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[SearchContactsResponse]
  }
}

