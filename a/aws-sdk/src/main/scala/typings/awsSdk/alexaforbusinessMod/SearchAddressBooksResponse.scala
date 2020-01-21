package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAddressBooksResponse extends js.Object {
  /**
    * The address books that meet the specified set of filter criteria, in sort order.
    */
  var AddressBooks: js.UndefOr[AddressBookDataList] = js.native
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The total number of address books returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchAddressBooksResponse {
  @scala.inline
  def apply(
    AddressBooks: AddressBookDataList = null,
    NextToken: NextToken = null,
    TotalCount: Int | Double = null
  ): SearchAddressBooksResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBooks != null) __obj.updateDynamic("AddressBooks")(AddressBooks.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAddressBooksResponse]
  }
}

