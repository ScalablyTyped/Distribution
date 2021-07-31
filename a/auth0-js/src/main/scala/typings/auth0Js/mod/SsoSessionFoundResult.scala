package typings.auth0Js.mod

import typings.auth0Js.anon.Name
import typings.auth0Js.auth0JsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsoSessionFoundResult
  extends StObject
     with SsoDataResult {
  
  var lastUsedClientID: String
  
  var lastUsedConnection: Name
  
  var lastUsedUserID: String
  
  var lastUsedUsername: String
  
  var sessionClients: js.Array[String]
  
  var sso: `true`
}
object SsoSessionFoundResult {
  
  @scala.inline
  def apply(
    lastUsedClientID: String,
    lastUsedConnection: Name,
    lastUsedUserID: String,
    lastUsedUsername: String,
    sessionClients: js.Array[String]
  ): SsoSessionFoundResult = {
    val __obj = js.Dynamic.literal(lastUsedClientID = lastUsedClientID.asInstanceOf[js.Any], lastUsedConnection = lastUsedConnection.asInstanceOf[js.Any], lastUsedUserID = lastUsedUserID.asInstanceOf[js.Any], lastUsedUsername = lastUsedUsername.asInstanceOf[js.Any], sessionClients = sessionClients.asInstanceOf[js.Any], sso = true)
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
