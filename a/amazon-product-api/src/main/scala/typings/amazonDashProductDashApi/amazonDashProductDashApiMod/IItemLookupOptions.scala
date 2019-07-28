package typings.amazonDashProductDashApi.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemLookupOptions extends js.Object {
  var condition: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var idType: js.UndefOr[String] = js.undefined
  var includeReviewsSummary: js.UndefOr[Boolean] = js.undefined
  var itemId: js.UndefOr[String | js.Array[String]] = js.undefined
  var request: js.UndefOr[js.Function] = js.undefined
  var responseGroup: js.UndefOr[String] = js.undefined
  var searchIndex: js.UndefOr[String] = js.undefined
  var truncateReviewsAt: js.UndefOr[Double] = js.undefined
  var variationPage: js.UndefOr[String] = js.undefined
}

object IItemLookupOptions {
  @scala.inline
  def apply(
    condition: String = null,
    domain: String = null,
    idType: String = null,
    includeReviewsSummary: js.UndefOr[Boolean] = js.undefined,
    itemId: String | js.Array[String] = null,
    request: js.Function = null,
    responseGroup: String = null,
    searchIndex: String = null,
    truncateReviewsAt: Int | Double = null,
    variationPage: String = null
  ): IItemLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (idType != null) __obj.updateDynamic("idType")(idType)
    if (!js.isUndefined(includeReviewsSummary)) __obj.updateDynamic("includeReviewsSummary")(includeReviewsSummary)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request)
    if (responseGroup != null) __obj.updateDynamic("responseGroup")(responseGroup)
    if (searchIndex != null) __obj.updateDynamic("searchIndex")(searchIndex)
    if (truncateReviewsAt != null) __obj.updateDynamic("truncateReviewsAt")(truncateReviewsAt.asInstanceOf[js.Any])
    if (variationPage != null) __obj.updateDynamic("variationPage")(variationPage)
    __obj.asInstanceOf[IItemLookupOptions]
  }
}

