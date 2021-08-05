package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error specifying lack of correct authentication data (e.g., to log into an account).
  * @since OOo 3.2
  */
trait URLAuthenticationRequest
  extends StObject
     with AuthenticationRequest {
  
  /** The URL for which authentication is requested. */
  var URL: String
}
object URLAuthenticationRequest {
  
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
    URL: String,
    UserName: String
  ): URLAuthenticationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], HasAccount = HasAccount.asInstanceOf[js.Any], HasPassword = HasPassword.asInstanceOf[js.Any], HasRealm = HasRealm.asInstanceOf[js.Any], HasUserName = HasUserName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLAuthenticationRequest]
  }
  
  extension [Self <: URLAuthenticationRequest](x: Self) {
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
