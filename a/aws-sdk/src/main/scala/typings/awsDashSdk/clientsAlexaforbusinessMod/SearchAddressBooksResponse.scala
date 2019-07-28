package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAddressBooksResponse extends js.Object {
  /**
    * The address books that meet the specified set of filter criteria, in sort order.
    */
  var AddressBooks: js.UndefOr[AddressBookDataList] = js.undefined
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The total number of address books returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchAddressBooksResponse {
  @scala.inline
  def apply(
    AddressBooks: AddressBookDataList = null,
    NextToken: NextToken = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): SearchAddressBooksResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBooks != null) __obj.updateDynamic("AddressBooks")(AddressBooks)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[SearchAddressBooksResponse]
  }
}

