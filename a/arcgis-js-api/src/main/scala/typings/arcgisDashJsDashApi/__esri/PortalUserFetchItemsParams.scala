package typings.arcgisDashJsDashApi.__esri

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
    num: Int | Double = null,
    start: Int | Double = null
  ): PortalUserFetchItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (num != null) __obj.updateDynamic("num")(num.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalUserFetchItemsParams]
  }
}

