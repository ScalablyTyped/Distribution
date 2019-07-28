package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReceiptFiltersResponse extends js.Object {
  /**
    * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filters: js.UndefOr[ReceiptFilterList] = js.undefined
}

object ListReceiptFiltersResponse {
  @scala.inline
  def apply(Filters: ReceiptFilterList = null): ListReceiptFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    __obj.asInstanceOf[ListReceiptFiltersResponse]
  }
}

