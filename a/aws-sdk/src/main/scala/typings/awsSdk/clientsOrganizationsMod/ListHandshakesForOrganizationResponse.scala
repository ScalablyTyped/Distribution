package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHandshakesForOrganizationResponse extends StObject {
  
  /**
    * A list of Handshake objects with details about each of the handshakes that are associated with an organization.
    */
  var Handshakes: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Handshakes] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
}
object ListHandshakesForOrganizationResponse {
  
  inline def apply(): ListHandshakesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHandshakesForOrganizationResponse]
  }
  
  extension [Self <: ListHandshakesForOrganizationResponse](x: Self) {
    
    inline def setHandshakes(value: Handshakes): Self = StObject.set(x, "Handshakes", value.asInstanceOf[js.Any])
    
    inline def setHandshakesUndefined: Self = StObject.set(x, "Handshakes", js.undefined)
    
    inline def setHandshakesVarargs(value: Handshake*): Self = StObject.set(x, "Handshakes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
