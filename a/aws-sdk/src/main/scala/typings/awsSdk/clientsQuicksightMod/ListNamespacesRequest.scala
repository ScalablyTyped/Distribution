package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamespacesRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the Amazon QuickSight namespaces that you want to list.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * A unique pagination token that can be used in a subsequent request. You will receive a pagination token in the response body of a previous ListNameSpaces API call if there is more data that can be returned. To receive the data, make another ListNamespaces API call with the returned token to retrieve the next page of data. Each token is valid for 24 hours. If you try to make a ListNamespaces API call with an expired token, you will receive a HTTP 400 InvalidNextTokenException error.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListNamespacesRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): ListNamespacesRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamespacesRequest]
  }
  
  extension [Self <: ListNamespacesRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
