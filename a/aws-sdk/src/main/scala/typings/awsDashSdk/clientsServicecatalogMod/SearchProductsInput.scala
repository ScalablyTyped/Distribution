package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProductsInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The search filters. If no search filters are specified, the output includes all products to which the caller has access.
    */
  var Filters: js.UndefOr[ProductViewFilters] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.undefined
  /**
    * The sort field. If no value is specified, the results are not sorted.
    */
  var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SortOrder] = js.undefined
}

object SearchProductsInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    Filters: ProductViewFilters = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null,
    SortBy: ProductViewSortBy = null,
    SortOrder: SortOrder = null
  ): SearchProductsInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProductsInput]
  }
}

