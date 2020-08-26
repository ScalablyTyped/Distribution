package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUserFetchItemsParams extends Object {
  /**
    * The folder to retrieve items from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    */
  var folder: js.UndefOr[PortalFolder] = js.native
  /**
    * The maximum number of results to be included in the result set response. The maximum value allowed is 100. The start property combined with the num property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default 10
    */
  var num: js.UndefOr[Double] = js.native
  /**
    * A comma-delimited list of fields to sort by. Allowed values are `created`, `modified`, `size`, and `type`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default created
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * The order in which to sort the results. Allowed values are `asc` for ascending order and `desc` for descending order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default asc
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * The index of the first entry in the result set response. The index is 1-based.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @default 1
    */
  var start: js.UndefOr[Double] = js.native
}

object PortalUserFetchItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalUserFetchItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalUserFetchItemsParams]
  }
  @scala.inline
  implicit class PortalUserFetchItemsParamsOps[Self <: PortalUserFetchItemsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolder(value: PortalFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

