package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends Object {
  /**
    * Indicates if the number should be formatted with a thousands separator. This is equivalent to [`useGrouping`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat#Parameters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
    */
  var digitSeparator: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the number of decimal places that should appear in the formatted number. Any places beyond this value are rounded. This is equivalent to defining [`minimumFractionDigits`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat#Parameters) and [`maximumFractionDigits`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat#Parameters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
    */
  var places: js.UndefOr[Double] = js.undefined
}

object NumberFormat {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    digitSeparator: js.UndefOr[Boolean] = js.undefined,
    places: Int | Double = null
  ): NumberFormat = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(digitSeparator)) __obj.updateDynamic("digitSeparator")(digitSeparator)
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}

