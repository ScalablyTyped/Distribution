package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error specifying lack of correct authentication data (e.g., to log into an account). */
@js.native
trait AuthenticationRequest extends ClassifiedInteractionRequest {
  
  /**
    * Any already specified account.
    *
    * If HasAccount is false, this member should be ignored.
    */
  var Account: String = js.native
  
  /** Any diagnostic message about the failure to log in (if applicable; it will typically be an English phrase or sentence). */
  var Diagnostic: String = js.native
  
  /** Specifies if the authentication involves an "account" (as can be the case for FTP). */
  var HasAccount: Boolean = js.native
  
  /** Specifies if the authentication involves a "password" (as is almost always the case). */
  var HasPassword: Boolean = js.native
  
  /** Specifies if the authentication involves a "realm" (as can be the case for HTTP). */
  var HasRealm: Boolean = js.native
  
  /** Specifies if the authentication involves a "user name" (as is almost always the case). */
  var HasUserName: Boolean = js.native
  
  /**
    * Any already specified password.
    *
    * If HasPassword is false, this member should be ignored.
    */
  var Password: String = js.native
  
  /**
    * Any already specified realm.
    *
    * If HasRealm is false, this member should be ignored.
    */
  var Realm: String = js.native
  
  /** The name of the server (if applicable). */
  var ServerName: String = js.native
  
  /**
    * Any already specified user name.
    *
    * If HasUserName is false, this member should be ignored.
    */
  var UserName: String = js.native
}
object AuthenticationRequest {
  
  @scala.inline
  def apply(
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
  implicit class AuthenticationRequestOps[Self <: AuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: String): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnostic(value: String): Self = this.set("Diagnostic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccount(value: Boolean): Self = this.set("HasAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPassword(value: Boolean): Self = this.set("HasPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRealm(value: Boolean): Self = this.set("HasRealm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUserName(value: Boolean): Self = this.set("HasUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = this.set("Realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
