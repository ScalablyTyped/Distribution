package typings.auth0.mod

import typings.auth0.anon.EmailString
import typings.auth0.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationInvitation extends StObject {
  
  var app_metadata: js.UndefOr[Any] = js.undefined
  
  var client_id: String
  
  var connection_id: js.UndefOr[String] = js.undefined
  
  var created_at: String
  
  var expires_at: String
  
  var id: String
  
  var invitation_url: String
  
  var invitee: EmailString
  
  var inviter: NameString
  
  var organization_id: String
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var ticket_id: String
  
  var user_metadata: js.UndefOr[Any] = js.undefined
}
object OrganizationInvitation {
  
  inline def apply(
    client_id: String,
    created_at: String,
    expires_at: String,
    id: String,
    invitation_url: String,
    invitee: EmailString,
    inviter: NameString,
    organization_id: String,
    ticket_id: String
  ): OrganizationInvitation = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_url = invitation_url.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], ticket_id = ticket_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationInvitation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationInvitation] (val x: Self) extends AnyVal {
    
    inline def setApp_metadata(value: Any): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    inline def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    inline def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvitation_url(value: String): Self = StObject.set(x, "invitation_url", value.asInstanceOf[js.Any])
    
    inline def setInvitee(value: EmailString): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    inline def setInviter(value: NameString): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    inline def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTicket_id(value: String): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
    
    inline def setUser_metadata(value: Any): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    inline def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
  }
}
