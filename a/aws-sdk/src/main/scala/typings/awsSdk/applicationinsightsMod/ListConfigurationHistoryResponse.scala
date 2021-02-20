package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationHistoryResponse extends StObject {
  
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
  implicit class ListConfigurationHistoryResponseMutableBuilder[Self <: ListConfigurationHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventList(value: ConfigurationEventList): Self = StObject.set(x, "EventList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventListUndefined: Self = StObject.set(x, "EventList", js.undefined)
    
    @scala.inline
    def setEventListVarargs(value: ConfigurationEvent*): Self = StObject.set(x, "EventList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
