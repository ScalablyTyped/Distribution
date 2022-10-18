package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSharedReportGroupsInput extends StObject {
  
  /**
    *  The maximum number of paginated shared report groups per response. Use nextToken to iterate pages in the list of returned ReportGroup objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The criterion to be used to list report groups shared with the current Amazon Web Services account or user. Valid values include:     ARN: List based on the ARN.     MODIFIED_TIME: List based on when information about the shared report group was last changed.   
    */
  var sortBy: js.UndefOr[SharedResourceSortByType] = js.undefined
  
  /**
    * The order in which to list shared report groups. Valid values include:    ASCENDING: List in ascending order.    DESCENDING: List in descending order.  
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.undefined
}
object ListSharedReportGroupsInput {
  
  inline def apply(): ListSharedReportGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedReportGroupsInput]
  }
  
  extension [Self <: ListSharedReportGroupsInput](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: SharedResourceSortByType): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
