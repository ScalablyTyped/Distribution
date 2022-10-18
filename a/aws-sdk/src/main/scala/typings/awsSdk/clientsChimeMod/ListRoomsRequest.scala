package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoomsRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: js.UndefOr[String] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRoomsRequest {
  
  inline def apply(AccountId: NonEmptyString): ListRoomsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoomsRequest]
  }
  
  extension [Self <: ListRoomsRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMemberId(value: String): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
