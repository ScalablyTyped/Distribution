package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProfilesResponse extends StObject {
  
  /**
    * The list of Profiles matching the search criteria.
    */
  var Items: js.UndefOr[ProfileList] = js.undefined
  
  /**
    * The pagination token from the previous SearchProfiles API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object SearchProfilesResponse {
  
  inline def apply(): SearchProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ProfileList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Profile*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
