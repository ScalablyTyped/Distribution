package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsersRequest extends StObject {
  
  /**
    * Filter to determine the list of users to return.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsMemorydbMod.UserName] = js.undefined
}
object DescribeUsersRequest {
  
  inline def apply(): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersRequest]
  }
  
  extension [Self <: DescribeUsersRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
