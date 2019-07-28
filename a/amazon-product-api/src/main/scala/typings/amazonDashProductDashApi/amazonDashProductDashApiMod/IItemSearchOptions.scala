package typings.amazonDashProductDashApi.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemSearchOptions extends js.Object {
  var condition: js.UndefOr[String] = js.undefined
  var itemPage: js.UndefOr[Double] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var responseGroup: js.UndefOr[String] = js.undefined
  var searchIndex: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object IItemSearchOptions {
  @scala.inline
  def apply(
    condition: String = null,
    itemPage: Int | Double = null,
    keywords: String = null,
    responseGroup: String = null,
    searchIndex: String = null,
    sort: String = null
  ): IItemSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (itemPage != null) __obj.updateDynamic("itemPage")(itemPage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (responseGroup != null) __obj.updateDynamic("responseGroup")(responseGroup)
    if (searchIndex != null) __obj.updateDynamic("searchIndex")(searchIndex)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[IItemSearchOptions]
  }
}

