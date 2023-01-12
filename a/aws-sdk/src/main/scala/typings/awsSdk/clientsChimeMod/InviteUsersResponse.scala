package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteUsersResponse extends StObject {
  
  /**
    * The email invitation details.
    */
  var Invites: js.UndefOr[InviteList] = js.undefined
}
object InviteUsersResponse {
  
  inline def apply(): InviteUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteUsersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InviteUsersResponse] (val x: Self) extends AnyVal {
    
    inline def setInvites(value: InviteList): Self = StObject.set(x, "Invites", value.asInstanceOf[js.Any])
    
    inline def setInvitesUndefined: Self = StObject.set(x, "Invites", js.undefined)
    
    inline def setInvitesVarargs(value: Invite*): Self = StObject.set(x, "Invites", js.Array(value*))
  }
}
