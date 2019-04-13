package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagOptionsInput extends js.Object {
  /**
    * The search filters. If no search filters are specified, the output includes all TagOptions.
    */
  var Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
}

object ListTagOptionsInput {
  @scala.inline
  def apply(
    Filters: ListTagOptionsFilters = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null
  ): ListTagOptionsInput = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListTagOptionsInput]
  }
}

