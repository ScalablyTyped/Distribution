package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDevicesRequest extends StObject {
  
  /**
    * The filter values to use to search for a device.
    */
  var filters: SearchDevicesRequestFiltersList
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token used for pagination of results returned in the response. Use the token returned from the previous request continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object SearchDevicesRequest {
  
  inline def apply(filters: SearchDevicesRequestFiltersList): SearchDevicesRequest = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesRequest]
  }
  
  extension [Self <: SearchDevicesRequest](x: Self) {
    
    inline def setFilters(value: SearchDevicesRequestFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: SearchDevicesFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: SearchDevicesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
