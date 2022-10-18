package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiRegionAccessPointsRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * Not currently used. Do not use this parameter.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsS3controlMod.MaxResults] = js.undefined
  
  /**
    * Not currently used. Do not use this parameter.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}
object ListMultiRegionAccessPointsRequest {
  
  inline def apply(AccountId: AccountId): ListMultiRegionAccessPointsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiRegionAccessPointsRequest]
  }
  
  extension [Self <: ListMultiRegionAccessPointsRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
