package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAllowListsResponse extends StObject {
  
  /**
    * An array of objects, one for each allow list.
    */
  var allowLists: js.UndefOr[listOfAllowListSummary] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListAllowListsResponse {
  
  inline def apply(): ListAllowListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAllowListsResponse]
  }
  
  extension [Self <: ListAllowListsResponse](x: Self) {
    
    inline def setAllowLists(value: listOfAllowListSummary): Self = StObject.set(x, "allowLists", value.asInstanceOf[js.Any])
    
    inline def setAllowListsUndefined: Self = StObject.set(x, "allowLists", js.undefined)
    
    inline def setAllowListsVarargs(value: AllowListSummary*): Self = StObject.set(x, "allowLists", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
