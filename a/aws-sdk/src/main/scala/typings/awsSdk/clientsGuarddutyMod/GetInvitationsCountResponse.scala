package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInvitationsCountResponse extends StObject {
  
  /**
    * The number of received invitations.
    */
  var InvitationsCount: js.UndefOr[Integer] = js.undefined
}
object GetInvitationsCountResponse {
  
  inline def apply(): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
  
  extension [Self <: GetInvitationsCountResponse](x: Self) {
    
    inline def setInvitationsCount(value: Integer): Self = StObject.set(x, "InvitationsCount", value.asInstanceOf[js.Any])
    
    inline def setInvitationsCountUndefined: Self = StObject.set(x, "InvitationsCount", js.undefined)
  }
}
