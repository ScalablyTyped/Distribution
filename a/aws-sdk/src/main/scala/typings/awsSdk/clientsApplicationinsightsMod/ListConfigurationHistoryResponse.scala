package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationHistoryResponse extends StObject {
  
  /**
    *  The list of configuration events and their corresponding details. 
    */
  var EventList: js.UndefOr[ConfigurationEventList] = js.undefined
  
  /**
    * The NextToken value to include in a future ListConfigurationHistory request. When the results of a ListConfigurationHistory request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListConfigurationHistoryResponse {
  
  inline def apply(): ListConfigurationHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryResponse]
  }
  
  extension [Self <: ListConfigurationHistoryResponse](x: Self) {
    
    inline def setEventList(value: ConfigurationEventList): Self = StObject.set(x, "EventList", value.asInstanceOf[js.Any])
    
    inline def setEventListUndefined: Self = StObject.set(x, "EventList", js.undefined)
    
    inline def setEventListVarargs(value: ConfigurationEvent*): Self = StObject.set(x, "EventList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
