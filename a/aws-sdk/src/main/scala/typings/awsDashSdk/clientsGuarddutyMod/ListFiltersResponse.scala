package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFiltersResponse extends js.Object {
  /**
    * A list of filter names
    */
  var FilterNames: typings.awsDashSdk.clientsGuarddutyMod.FilterNames
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListFiltersResponse {
  @scala.inline
  def apply(FilterNames: FilterNames, NextToken: String = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal(FilterNames = FilterNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

