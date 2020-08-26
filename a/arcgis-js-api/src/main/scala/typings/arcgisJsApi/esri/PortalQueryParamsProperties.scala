package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`avg-rating`
import typings.arcgisJsApi.arcgisJsApiStrings.`num-comments`
import typings.arcgisJsApi.arcgisJsApiStrings.`num-ratings`
import typings.arcgisJsApi.arcgisJsApiStrings.`num-views`
import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.created
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import typings.arcgisJsApi.arcgisJsApiStrings.modified
import typings.arcgisJsApi.arcgisJsApiStrings.owner
import typings.arcgisJsApi.arcgisJsApiStrings.title
import typings.arcgisJsApi.arcgisJsApiStrings.uploaded
import typings.arcgisJsApi.arcgisJsApiStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalQueryParamsProperties extends js.Object {
  /**
    * An array of categories stored within the item. Use this property to filter the results from [Portal.queryItems()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryItems) and [PortalGroup.queryItems()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#queryItems). It accepts an array of:
    *   * individual string elements or
    *   * an array of strings.
    *
    *
    * The query looks at each element within the array and performs a SQL `AND` operation on them. If the element is an array instead of a single string element, the elements within this array are read as `OR`. See the snippet below:
    * > Note: String[] elements are only supported by [ArcGIS Online](http://doc.arcgis.com/en/arcgis-online/reference/what-is-agol.htm) and version 10.6.1 of [Portal for ArcGIS Enterprise](https://enterprise.arcgis.com/en/portal/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
    */
  var categories: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  /**
    * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html). When specified, restricts the results of the query to the extent defined here.  The [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#spatialReference) of the given extent must be WGS84 (wkid 4326) or Web Mercator (wkid 3857).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response. The maximum value allowed is `100`. The [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start) property combined with the `num` property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
    *
    * @default 10
    */
  var num: js.UndefOr[Double] = js.native
  /**
    * The query string used for the search. View the [ArcGIS REST API Search Reference](https://developers.arcgis.com/rest/users-groups-and-items/search-reference.htm) for details on constructing a valid query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
    */
  var query: js.UndefOr[String] = js.native
  /**
    * A comma-delimited list of fields to sort. Field names may vary depending on what is being queried. For example, the fields allowed for a user query are much more limited than if performing a basic search query for portal items. A list of possible field names is listed below. These names correspond to either item (search), group, and/or user queries.
    *
    * Field name | Query functionality
    * ---------------|------------
    * title | search, group
    * uploaded | search
    * modified | search
    * username | user
    * created | user, group
    * type | search
    * owner | search, group
    * avg-rating | search
    * num-ratings | search
    * num-comments | search
    * num-views | search
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
    */
  var sortField: js.UndefOr[
    title | uploaded | modified | username | created | typings.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
  ] = js.native
  /**
    * The order in which to sort the results.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sort the results in ascending order.
    * desc | Sort the results in descending order.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
    *
    * @default asc
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.native
  /**
    * The index of the first entry in the result set response. The index is 1-based. The [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start) property, along with the [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num) property can be used to paginate the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
    *
    * @default 1
    */
  var start: js.UndefOr[Double] = js.native
}

object PortalQueryParamsProperties {
  @scala.inline
  def apply(): PortalQueryParamsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalQueryParamsProperties]
  }
  @scala.inline
  implicit class PortalQueryParamsPropertiesOps[Self <: PortalQueryParamsProperties] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: (String | js.Array[String])*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String | js.Array[String]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setExtent(value: ExtentProperties): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSortField(
      value: title | uploaded | modified | username | created | typings.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
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

