package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error specifying lack of correct authentication data (e.g., to log into an account).
  * @since OOo 3.2
  */
trait URLAuthenticationRequest extends AuthenticationRequest {
  /** The URL for which authentication is requested. */
  var URL: String
}

object URLAuthenticationRequest {
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
    URL: String,
    UserName: String
  ): URLAuthenticationRequest = {
    val __obj = js.Dynamic.literal(Account = Account, Classification = Classification, Context = Context, Diagnostic = Diagnostic, HasAccount = HasAccount, HasPassword = HasPassword, HasRealm = HasRealm, HasUserName = HasUserName, Message = Message, Password = Password, Realm = Realm, ServerName = ServerName, URL = URL, UserName = UserName)
  
    __obj.asInstanceOf[URLAuthenticationRequest]
  }
}

