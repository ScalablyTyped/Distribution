package typings.amazonProductApi.mod

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
    itemPage: js.UndefOr[Double] = js.undefined,
    keywords: String = null,
    responseGroup: String = null,
    searchIndex: String = null,
    sort: String = null
  ): IItemSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(itemPage)) __obj.updateDynamic("itemPage")(itemPage.get.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (responseGroup != null) __obj.updateDynamic("responseGroup")(responseGroup.asInstanceOf[js.Any])
    if (searchIndex != null) __obj.updateDynamic("searchIndex")(searchIndex.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemSearchOptions]
  }
}

