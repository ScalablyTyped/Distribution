package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalQueryResultProperties extends StObject {
  
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
  implicit class PortalQueryResultPropertiesMutableBuilder[Self <: PortalQueryResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextQueryParams(value: PortalQueryParamsProperties): Self = StObject.set(x, "nextQueryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextQueryParamsUndefined: Self = StObject.set(x, "nextQueryParams", js.undefined)
    
    @scala.inline
    def setQueryParams(value: PortalQueryParamsProperties): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[_]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
