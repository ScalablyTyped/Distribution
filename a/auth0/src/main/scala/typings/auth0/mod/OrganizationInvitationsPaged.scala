package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<auth0.auth0.Page, 'length'> */
trait OrganizationInvitationsPaged extends StObject {
  
  var invitations: js.Array[OrganizationInvitation]
  
  var limit: Double
  
  var start: Double
  
  var total: Double
}
object OrganizationInvitationsPaged {
  
  inline def apply(invitations: js.Array[OrganizationInvitation], limit: Double, start: Double, total: Double): OrganizationInvitationsPaged = {
    val __obj = js.Dynamic.literal(invitations = invitations.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationInvitationsPaged]
  }
  
  extension [Self <: OrganizationInvitationsPaged](x: Self) {
    
    inline def setInvitations(value: js.Array[OrganizationInvitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsVarargs(value: OrganizationInvitation*): Self = StObject.set(x, "invitations", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
