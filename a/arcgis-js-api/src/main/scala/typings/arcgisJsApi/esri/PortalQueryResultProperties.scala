package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalQueryResultProperties extends js.Object {
  /**
    * The query parameters for the next set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#nextQueryParams)
    */
  var nextQueryParams: js.UndefOr[PortalQueryParamsProperties] = js.native
  /**
    * The query parameters for the first set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#queryParams)
    */
  var queryParams: js.UndefOr[PortalQueryParamsProperties] = js.native
  /**
    * An array of result item objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results)
    */
  var results: js.UndefOr[js.Array[_]] = js.native
  /**
    * The total number of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#total)
    */
  var total: js.UndefOr[Double] = js.native
}

object PortalQueryResultProperties {
  @scala.inline
  def apply(): PortalQueryResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalQueryResultProperties]
  }
  @scala.inline
  implicit class PortalQueryResultPropertiesOps[Self <: PortalQueryResultProperties] (val x: Self) extends AnyVal {
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
    def setNextQueryParams(value: PortalQueryParamsProperties): Self = this.set("nextQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextQueryParams: Self = this.set("nextQueryParams", js.undefined)
    @scala.inline
    def setQueryParams(value: PortalQueryParamsProperties): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

