package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAccountsRequest extends StObject {
  
  /**
    * Specifies the number of member account IDs that you want Firewall Manager to return for this request. If you have more IDs than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of member account IDs.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * If you specify a value for MaxResults and you have more account IDs than the number that you specify for MaxResults, Firewall Manager returns a NextToken value in the response that allows you to list another group of IDs. For the second and subsequent ListMemberAccountsRequest requests, specify the value of NextToken from the previous response to get information about another batch of member account IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMemberAccountsRequest {
  
  inline def apply(): ListMemberAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMemberAccountsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
