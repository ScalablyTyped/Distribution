package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDevicesRequest extends js.Object {
  
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
  implicit class SearchDevicesRequestOps[Self <: SearchDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiltersVarargs(value: SearchDevicesFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SearchDevicesRequestFiltersList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: SearchDevicesRequestMaxResultsInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
