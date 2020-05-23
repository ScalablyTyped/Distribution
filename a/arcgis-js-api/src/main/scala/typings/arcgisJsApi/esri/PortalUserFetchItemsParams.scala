package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalUserFetchItemsParams extends Object {
  /**
    * The folder to retrieve items from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  /**
    * The maximum number of results to be included in the result set response. The maximum value allowed is 100. The start property combined with the num property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default 10
    */
  var num: js.UndefOr[Double] = js.undefined
  /**
    * A comma-delimited list of fields to sort by. Allowed values are `created`, `modified`, `size`, and `type`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default created
    */
  var sortField: js.UndefOr[String] = js.undefined
  /**
    * The order in which to sort the results. Allowed values are `asc` for ascending order and `desc` for descending order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default asc
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  /**
    * The index of the first entry in the result set response. The index is 1-based.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default 1
    */
  var start: js.UndefOr[Double] = js.undefined
}

object PortalUserFetchItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    folder: PortalFolder = null,
    num: js.UndefOr[Double] = js.undefined,
    sortField: String = null,
    sortOrder: String = null,
    start: js.UndefOr[Double] = js.undefined
  ): PortalUserFetchItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (!js.isUndefined(num)) __obj.updateDynamic("num")(num.get.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalUserFetchItemsParams]
  }
}

