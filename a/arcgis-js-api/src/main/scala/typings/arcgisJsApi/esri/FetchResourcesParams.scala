package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.created
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchResourcesParams extends Object {
  /**
    * The maximum number of results to be included in the result set response. The maximum value allowed is `100`. The [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#start) property combined with the `num` property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var num: js.UndefOr[Double] = js.native
  /**
    * A field to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortField: js.UndefOr[
    created | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.`type`
  ] = js.native
  /**
    * The order in which to sort the results.
    *
    *   Possible Value | Description
    *   ---------------|------------
    *   asc | Sort the results in ascending order.
    *   desc | Sort the results in descending order.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.native
  /**
    * The index of the first entry in the result set response. The index is 1-based. The [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#start) property, along with the [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#num) property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var start: js.UndefOr[Double] = js.native
}

object FetchResourcesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchResourcesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchResourcesParams]
  }
  @scala.inline
  implicit class FetchResourcesParamsOps[Self <: FetchResourcesParams] (val x: Self) extends AnyVal {
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
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    @scala.inline
    def setSortField(
      value: created | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.`type`
    ): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: asc_ | desc_): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

