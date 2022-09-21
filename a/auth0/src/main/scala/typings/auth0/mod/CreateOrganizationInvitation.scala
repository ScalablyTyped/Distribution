package typings.auth0.mod

import typings.auth0.anon.EmailString
import typings.auth0.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationInvitation extends StObject {
  
  var app_metadata: js.UndefOr[Any] = js.undefined
  
  var client_id: String
  
  var connection_id: js.UndefOr[String] = js.undefined
  
  var invitee: EmailString
  
  var inviter: NameString
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var send_invitation_email: js.UndefOr[Boolean] = js.undefined
  
  var ttl_sec: js.UndefOr[Double] = js.undefined
  
  var user_metadata: js.UndefOr[Any] = js.undefined
}
object CreateOrganizationInvitation {
  
  inline def apply(client_id: String, invitee: EmailString, inviter: NameString): CreateOrganizationInvitation = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationInvitation]
  }
  
  extension [Self <: CreateOrganizationInvitation](x: Self) {
    
    inline def setApp_metadata(value: Any): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    inline def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    inline def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    inline def setInvitee(value: EmailString): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    inline def setInviter(value: NameString): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSend_invitation_email(value: Boolean): Self = StObject.set(x, "send_invitation_email", value.asInstanceOf[js.Any])
    
    inline def setSend_invitation_emailUndefined: Self = StObject.set(x, "send_invitation_email", js.undefined)
    
    inline def setTtl_sec(value: Double): Self = StObject.set(x, "ttl_sec", value.asInstanceOf[js.Any])
    
    inline def setTtl_secUndefined: Self = StObject.set(x, "ttl_sec", js.undefined)
    
    inline def setUser_metadata(value: Any): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    inline def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
  }
}
