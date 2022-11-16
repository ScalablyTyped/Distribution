package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.created
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResourcesParams extends StObject {
  
  /**
    * The maximum number of results to be included in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
    * A field to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortField: js.UndefOr[
    created | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.`type`
  ] = js.undefined
  
  /**
    * The order in which to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.undefined
  
  /**
    * The index of the first entry in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var start: js.UndefOr[Double] = js.undefined
}
object FetchResourcesParams {
  
  inline def apply(): FetchResourcesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchResourcesParams]
  }
  
  extension [Self <: FetchResourcesParams](x: Self) {
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setSortField(
      value: created | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.`type`
    ): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: asc_ | desc_): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
