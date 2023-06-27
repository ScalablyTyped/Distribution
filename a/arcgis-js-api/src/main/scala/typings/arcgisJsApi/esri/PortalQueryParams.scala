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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalQueryParams
  extends StObject
     with Accessor {
  
  /**
  		 * An array of categories stored within the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
  		 */
  var categories: js.Array[String | js.Array[String]] = js.native
  
  /**
  		 * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
  		 */
  var extent: Extent = js.native
  
  /**
  		 * Structured filter to use instead of the [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#filter)
  		 */
  var filter: String = js.native
  
  /**
  		 * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
  		 */
  var num: Double = js.native
  
  /**
  		 * The query string used for the search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
  		 */
  var query: String = js.native
  
  /**
  		 * A comma-delimited list of fields to sort.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
  		 */
  var sortField: title | uploaded | modified | username | created | typings.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views` = js.native
  
  /**
  		 * The order in which to sort the results.
  		 *
  		 * @default asc
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
  		 */
  var sortOrder: asc_ | desc_ = js.native
  
  /**
  		 * The index of the first entry in the result set response.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
  		 */
  var start: Double = js.native
}
