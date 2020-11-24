package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationHistoryResponse extends js.Object {
  
  /**
    *  The list of configuration events and their corresponding details. 
    */
  var EventList: js.UndefOr[ConfigurationEventList] = js.native
  
  /**
    * The NextToken value to include in a future ListConfigurationHistory request. When the results of a ListConfigurationHistory request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListConfigurationHistoryResponse {
  
  @scala.inline
  def apply(): ListConfigurationHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationHistoryResponseOps[Self <: ListConfigurationHistoryResponse] (val x: Self) extends AnyVal {
    
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
    def setEventListVarargs(value: ConfigurationEvent*): Self = this.set("EventList", js.Array(value :_*))
    
    @scala.inline
    def setEventList(value: ConfigurationEventList): Self = this.set("EventList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventList: Self = this.set("EventList", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
