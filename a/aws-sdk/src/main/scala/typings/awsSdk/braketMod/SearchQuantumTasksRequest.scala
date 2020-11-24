package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQuantumTasksRequest extends js.Object {
  
  /**
    * Array of SearchQuantumTasksFilter objects.
    */
  var filters: SearchQuantumTasksRequestFiltersList = js.native
  
  /**
    * Maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger] = js.native
  
  /**
    * A token used for pagination of results returned in the response. Use the token returned from the previous request continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object SearchQuantumTasksRequest {
  
  @scala.inline
  def apply(filters: SearchQuantumTasksRequestFiltersList): SearchQuantumTasksRequest = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksRequest]
  }
  
  @scala.inline
  implicit class SearchQuantumTasksRequestOps[Self <: SearchQuantumTasksRequest] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: SearchQuantumTasksFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SearchQuantumTasksRequestFiltersList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: SearchQuantumTasksRequestMaxResultsInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
