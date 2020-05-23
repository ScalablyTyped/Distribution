package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error specifying lack of correct authentication data (e.g., to log into an account). */
trait AuthenticationRequest extends ClassifiedInteractionRequest {
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
}

