package typings
package amazonDashProductDashApiLib.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemSearchOptions extends js.Object {
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var itemPage: js.UndefOr[scala.Double] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var responseGroup: js.UndefOr[java.lang.String] = js.undefined
  var searchIndex: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object IItemSearchOptions {
  @scala.inline
  def apply(
    condition: java.lang.String = null,
    itemPage: scala.Int | scala.Double = null,
    keywords: java.lang.String = null,
    responseGroup: java.lang.String = null,
    searchIndex: java.lang.String = null,
    sort: java.lang.String = null
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

