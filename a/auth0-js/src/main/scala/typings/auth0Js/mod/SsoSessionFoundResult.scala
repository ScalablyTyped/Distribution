package typings.auth0Js.mod

import typings.auth0Js.anon.Name
import typings.auth0Js.auth0JsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsoSessionFoundResult extends SsoDataResult {
  
  var lastUsedClientID: String = js.native
  
  var lastUsedConnection: Name = js.native
  
  var lastUsedUserID: String = js.native
  
  var lastUsedUsername: String = js.native
  
  var sessionClients: js.Array[String] = js.native
  
  var sso: `true` = js.native
}
object SsoSessionFoundResult {
  
  @scala.inline
  def apply(
    lastUsedClientID: String,
    lastUsedConnection: Name,
    lastUsedUserID: String,
    lastUsedUsername: String,
    sessionClients: js.Array[String],
    sso: `true`
  ): SsoSessionFoundResult = {
    val __obj = js.Dynamic.literal(lastUsedClientID = lastUsedClientID.asInstanceOf[js.Any], lastUsedConnection = lastUsedConnection.asInstanceOf[js.Any], lastUsedUserID = lastUsedUserID.asInstanceOf[js.Any], lastUsedUsername = lastUsedUsername.asInstanceOf[js.Any], sessionClients = sessionClients.asInstanceOf[js.Any], sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoSessionFoundResult]
  }
  
  @scala.inline
  implicit class SsoSessionFoundResultMutableBuilder[Self <: SsoSessionFoundResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUsedClientID(value: String): Self = StObject.set(x, "lastUsedClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedConnection(value: Name): Self = StObject.set(x, "lastUsedConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedUserID(value: String): Self = StObject.set(x, "lastUsedUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedUsername(value: String): Self = StObject.set(x, "lastUsedUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionClients(value: js.Array[String]): Self = StObject.set(x, "sessionClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionClientsVarargs(value: String*): Self = StObject.set(x, "sessionClients", js.Array(value :_*))
    
    @scala.inline
    def setSso(value: `true`): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
  }
}
