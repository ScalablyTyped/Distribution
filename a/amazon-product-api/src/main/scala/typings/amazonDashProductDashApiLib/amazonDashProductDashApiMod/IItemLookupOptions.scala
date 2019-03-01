package typings
package amazonDashProductDashApiLib.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemLookupOptions extends js.Object {
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var idType: js.UndefOr[java.lang.String] = js.undefined
  var includeReviewsSummary: js.UndefOr[scala.Boolean] = js.undefined
  var itemId: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var request: js.UndefOr[js.Function] = js.undefined
  var responseGroup: js.UndefOr[java.lang.String] = js.undefined
  var searchIndex: js.UndefOr[java.lang.String] = js.undefined
  var truncateReviewsAt: js.UndefOr[scala.Double] = js.undefined
  var variationPage: js.UndefOr[java.lang.String] = js.undefined
}

object IItemLookupOptions {
  @scala.inline
  def apply(
    condition: java.lang.String = null,
    domain: java.lang.String = null,
    idType: java.lang.String = null,
    includeReviewsSummary: js.UndefOr[scala.Boolean] = js.undefined,
    itemId: java.lang.String | js.Array[java.lang.String] = null,
    request: js.Function = null,
    responseGroup: java.lang.String = null,
    searchIndex: java.lang.String = null,
    truncateReviewsAt: scala.Int | scala.Double = null,
    variationPage: java.lang.String = null
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

