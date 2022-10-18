package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptResourceShareInvitationResponse extends StObject {
  
  /**
    * The idempotency identifier associated with this request. If you want to repeat the same operation in an idempotent manner then you must include this value in the clientToken request parameter of that later call. All other parameters must also have the same values that you used in the first call.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object that contains information about the specified invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
}
object AcceptResourceShareInvitationResponse {
  
  inline def apply(): AcceptResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptResourceShareInvitationResponse]
  }
  
  extension [Self <: AcceptResourceShareInvitationResponse](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareInvitation(value: ResourceShareInvitation): Self = StObject.set(x, "resourceShareInvitation", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationUndefined: Self = StObject.set(x, "resourceShareInvitation", js.undefined)
  }
}
