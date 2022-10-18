package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInvitationsCountResponse extends StObject {
  
  /**
    * The total number of invitations that were received by the account, not including the currently accepted invitation.
    */
  var invitationsCount: js.UndefOr[long] = js.undefined
}
object GetInvitationsCountResponse {
  
  inline def apply(): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
  
  extension [Self <: GetInvitationsCountResponse](x: Self) {
    
    inline def setInvitationsCount(value: long): Self = StObject.set(x, "invitationsCount", value.asInstanceOf[js.Any])
    
    inline def setInvitationsCountUndefined: Self = StObject.set(x, "invitationsCount", js.undefined)
  }
}
