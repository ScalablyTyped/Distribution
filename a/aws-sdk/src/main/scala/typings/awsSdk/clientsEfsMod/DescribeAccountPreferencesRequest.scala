package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountPreferencesRequest extends StObject {
  
  /**
    * (Optional) When retrieving account preferences, you can optionally specify the MaxItems parameter to limit the number of objects returned in a response. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEfsMod.MaxResults] = js.undefined
  
  /**
    * (Optional) You can use NextToken in a subsequent request to fetch the next page of Amazon Web Services account preferences if the response payload was paginated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeAccountPreferencesRequest {
  
  inline def apply(): DescribeAccountPreferencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountPreferencesRequest]
  }
  
  extension [Self <: DescribeAccountPreferencesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
