package typings.awesomplete.mod

import typings.awesomplete.anon.Value
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoFirst: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Function2[/* item */ Suggestion, /* input */ String, String]] = js.undefined
  var filter: js.UndefOr[js.Function2[/* text */ String, /* input */ String, Boolean]] = js.undefined
  var item: js.UndefOr[js.Function2[/* text */ String, /* input */ String, HTMLElement]] = js.undefined
  var list: js.UndefOr[String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var minChars: js.UndefOr[Double] = js.undefined
  var replace: js.UndefOr[js.Function1[/* suggestion */ String | Suggestion, Unit]] = js.undefined
  var sort: js.UndefOr[Boolean | SortFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFirst: js.UndefOr[Boolean] = js.undefined,
    data: (/* item */ Suggestion, /* input */ String) => String = null,
    filter: (/* text */ String, /* input */ String) => Boolean = null,
    item: (/* text */ String, /* input */ String) => HTMLElement = null,
    list: String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element = null,
    maxItems: js.UndefOr[Double] = js.undefined,
    minChars: js.UndefOr[Double] = js.undefined,
    replace: /* suggestion */ String | Suggestion => Unit = null,
    sort: Boolean | SortFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFirst)) __obj.updateDynamic("autoFirst")(autoFirst.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2(data))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction2(item))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minChars)) __obj.updateDynamic("minChars")(minChars.get.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

