package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFiltersResponse extends js.Object {
  var FilterNames: js.UndefOr[FilterNames] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFiltersResponse {
  @scala.inline
  def apply(FilterNames: FilterNames = null, NextToken: NextToken = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (FilterNames != null) __obj.updateDynamic("FilterNames")(FilterNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

