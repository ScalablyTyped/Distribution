package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDevicesRequest extends StObject {
  
  /**
    * The filter values to use to search for a device.
    */
  var filters: SearchDevicesRequestFiltersList = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger] = js.native
  
  /**
    * A token used for pagination of results returned in the response. Use the token returned from the previous request continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object SearchDevicesRequest {
  
  @scala.inline
  def apply(filters: SearchDevicesRequestFiltersList): SearchDevicesRequest = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesRequest]
  }
  
  @scala.inline
  implicit class SearchDevicesRequestMutableBuilder[Self <: SearchDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SearchDevicesRequestFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: SearchDevicesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: SearchDevicesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
