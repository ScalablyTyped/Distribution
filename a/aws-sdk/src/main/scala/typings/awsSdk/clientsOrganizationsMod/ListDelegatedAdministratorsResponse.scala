package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDelegatedAdministratorsResponse extends StObject {
  
  /**
    * The list of delegated administrators in your organization.
    */
  var DelegatedAdministrators: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.DelegatedAdministrators] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
}
object ListDelegatedAdministratorsResponse {
  
  inline def apply(): ListDelegatedAdministratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedAdministratorsResponse]
  }
  
  extension [Self <: ListDelegatedAdministratorsResponse](x: Self) {
    
    inline def setDelegatedAdministrators(value: DelegatedAdministrators): Self = StObject.set(x, "DelegatedAdministrators", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdministratorsUndefined: Self = StObject.set(x, "DelegatedAdministrators", js.undefined)
    
    inline def setDelegatedAdministratorsVarargs(value: DelegatedAdministrator*): Self = StObject.set(x, "DelegatedAdministrators", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
