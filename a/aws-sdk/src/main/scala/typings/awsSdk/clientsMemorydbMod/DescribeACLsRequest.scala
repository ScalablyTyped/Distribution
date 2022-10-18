package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeACLsRequest extends StObject {
  
  /**
    * The name of the ACL
    */
  var ACLName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeACLsRequest {
  
  inline def apply(): DescribeACLsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeACLsRequest]
  }
  
  extension [Self <: DescribeACLsRequest](x: Self) {
    
    inline def setACLName(value: String): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setACLNameUndefined: Self = StObject.set(x, "ACLName", js.undefined)
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
