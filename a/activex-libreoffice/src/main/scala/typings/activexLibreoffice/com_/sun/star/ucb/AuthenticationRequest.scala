package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error specifying lack of correct authentication data (e.g., to log into an account). */
trait AuthenticationRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /**
    * Any already specified account.
    *
    * If HasAccount is false, this member should be ignored.
    */
  var Account: String
  
  /** Any diagnostic message about the failure to log in (if applicable; it will typically be an English phrase or sentence). */
  var Diagnostic: String
  
  /** Specifies if the authentication involves an "account" (as can be the case for FTP). */
  var HasAccount: Boolean
  
  /** Specifies if the authentication involves a "password" (as is almost always the case). */
  var HasPassword: Boolean
  
  /** Specifies if the authentication involves a "realm" (as can be the case for HTTP). */
  var HasRealm: Boolean
  
  /** Specifies if the authentication involves a "user name" (as is almost always the case). */
  var HasUserName: Boolean
  
  /**
    * Any already specified password.
    *
    * If HasPassword is false, this member should be ignored.
    */
  var Password: String
  
  /**
    * Any already specified realm.
    *
    * If HasRealm is false, this member should be ignored.
    */
  var Realm: String
  
  /** The name of the server (if applicable). */
  var ServerName: String
  
  /**
    * Any already specified user name.
    *
    * If HasUserName is false, this member should be ignored.
    */
  var UserName: String
}
object AuthenticationRequest {
  
  inline def apply(
    Account: String,
    Classification: InteractionClassification,
    Context: XInterface,
    Diagnostic: String,
    HasAccount: Boolean,
    HasPassword: Boolean,
    HasRealm: Boolean,
    HasUserName: Boolean,
    Message: String,
    Password: String,
    Realm: String,
    ServerName: String,
    UserName: String
  ): AuthenticationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], HasAccount = HasAccount.asInstanceOf[js.Any], HasPassword = HasPassword.asInstanceOf[js.Any], HasRealm = HasRealm.asInstanceOf[js.Any], HasUserName = HasUserName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setDiagnostic(value: String): Self = StObject.set(x, "Diagnostic", value.asInstanceOf[js.Any])
    
    inline def setHasAccount(value: Boolean): Self = StObject.set(x, "HasAccount", value.asInstanceOf[js.Any])
    
    inline def setHasPassword(value: Boolean): Self = StObject.set(x, "HasPassword", value.asInstanceOf[js.Any])
    
    inline def setHasRealm(value: Boolean): Self = StObject.set(x, "HasRealm", value.asInstanceOf[js.Any])
    
    inline def setHasUserName(value: Boolean): Self = StObject.set(x, "HasUserName", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "Realm", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
