package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrossAccountAuthorizationsResponse extends StObject {
  
  /**
    * A list of cross-account authorizations.
    */
  var CrossAccountAuthorizations: js.UndefOr[listOfCrossAccountAuthorization] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListCrossAccountAuthorizationsResponse {
  
  inline def apply(): ListCrossAccountAuthorizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrossAccountAuthorizationsResponse]
  }
  
  extension [Self <: ListCrossAccountAuthorizationsResponse](x: Self) {
    
    inline def setCrossAccountAuthorizations(value: listOfCrossAccountAuthorization): Self = StObject.set(x, "CrossAccountAuthorizations", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountAuthorizationsUndefined: Self = StObject.set(x, "CrossAccountAuthorizations", js.undefined)
    
    inline def setCrossAccountAuthorizationsVarargs(value: CrossAccountAuthorization*): Self = StObject.set(x, "CrossAccountAuthorizations", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
