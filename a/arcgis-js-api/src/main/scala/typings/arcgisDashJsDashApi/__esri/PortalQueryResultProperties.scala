package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalQueryResultProperties extends js.Object {
  /**
    * The query parameters for the next set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#nextQueryParams)
    */
  var nextQueryParams: js.UndefOr[PortalQueryParamsProperties] = js.undefined
  /**
    * The query parameters for the first set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#queryParams)
    */
  var queryParams: js.UndefOr[PortalQueryParamsProperties] = js.undefined
  /**
    * An array of result item objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results)
    */
  var results: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The total number of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#total)
    */
  var total: js.UndefOr[Double] = js.undefined
}

object PortalQueryResultProperties {
  @scala.inline
  def apply(
    nextQueryParams: PortalQueryParamsProperties = null,
    queryParams: PortalQueryParamsProperties = null,
    results: js.Array[_] = null,
    total: Int | Double = null
  ): PortalQueryResultProperties = {
    val __obj = js.Dynamic.literal()
    if (nextQueryParams != null) __obj.updateDynamic("nextQueryParams")(nextQueryParams.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalQueryResultProperties]
  }
}

