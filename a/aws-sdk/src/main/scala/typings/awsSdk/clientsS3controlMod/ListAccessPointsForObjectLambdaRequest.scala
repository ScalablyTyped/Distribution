package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPointsForObjectLambdaRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified Object Lambda Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The maximum number of access points that you want to include in the list. The response may contain fewer access points but will never contain more. If there are more than this number of access points, then the response will include a continuation token in the NextToken field that you can use to retrieve the next page of access points.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsS3controlMod.MaxResults] = js.undefined
  
  /**
    * If the list has more access points than can be returned in one call to this API, this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}
object ListAccessPointsForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId): ListAccessPointsForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPointsForObjectLambdaRequest]
  }
  
  extension [Self <: ListAccessPointsForObjectLambdaRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
