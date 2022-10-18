package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteAccountToOrganizationResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake that is created to support this invitation request.
    */
  var Handshake: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Handshake] = js.undefined
}
object InviteAccountToOrganizationResponse {
  
  inline def apply(): InviteAccountToOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAccountToOrganizationResponse]
  }
  
  extension [Self <: InviteAccountToOrganizationResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
