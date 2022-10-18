package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.MaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListOrganizationAdminAccountsRequest {
  
  inline def apply(): ListOrganizationAdminAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsRequest]
  }
  
  extension [Self <: ListOrganizationAdminAccountsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
