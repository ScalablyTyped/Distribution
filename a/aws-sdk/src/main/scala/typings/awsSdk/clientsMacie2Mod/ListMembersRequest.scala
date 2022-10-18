package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersRequest extends StObject {
  
  /**
    * The maximum number of items to include in each page of a paginated response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies which accounts to include in the response, based on the status of an account's relationship with the administrator account. By default, the response includes only current member accounts. To include all accounts, set this value to false.
    */
  var onlyAssociated: js.UndefOr[string] = js.undefined
}
object ListMembersRequest {
  
  inline def apply(): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  extension [Self <: ListMembersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOnlyAssociated(value: string): Self = StObject.set(x, "onlyAssociated", value.asInstanceOf[js.Any])
    
    inline def setOnlyAssociatedUndefined: Self = StObject.set(x, "onlyAssociated", js.undefined)
  }
}
