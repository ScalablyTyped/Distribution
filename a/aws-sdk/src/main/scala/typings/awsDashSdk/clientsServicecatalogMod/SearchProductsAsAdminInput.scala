package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProductsAsAdminInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The search filters. If no search filters are specified, the output includes all products to which the administrator has access.
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
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.undefined
  /**
    * Access level of the source of the product.
    */
  var ProductSource: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductSource] = js.undefined
  /**
    * The sort field. If no value is specified, the results are not sorted.
    */
  var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SortOrder] = js.undefined
}

object SearchProductsAsAdminInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    Filters: ProductViewFilters = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null,
    PortfolioId: Id = null,
    ProductSource: ProductSource = null,
    SortBy: ProductViewSortBy = null,
    SortOrder: SortOrder = null
  ): SearchProductsAsAdminInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (PortfolioId != null) __obj.updateDynamic("PortfolioId")(PortfolioId)
    if (ProductSource != null) __obj.updateDynamic("ProductSource")(ProductSource.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProductsAsAdminInput]
  }
}

