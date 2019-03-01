package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error specifying lack of correct authentication data (e.g., to log into an account).
  * @since OOo 3.2
  */
trait URLAuthenticationRequest extends AuthenticationRequest {
  /** The URL for which authentication is requested. */
  var URL: java.lang.String
}

object URLAuthenticationRequest {
  @scala.inline
  def apply(
    Account: java.lang.String,
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Diagnostic: java.lang.String,
    HasAccount: scala.Boolean,
    HasPassword: scala.Boolean,
    HasRealm: scala.Boolean,
    HasUserName: scala.Boolean,
    Message: java.lang.String,
    Password: java.lang.String,
    Realm: java.lang.String,
    ServerName: java.lang.String,
    URL: java.lang.String,
    UserName: java.lang.String
  ): URLAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Account")(Account)
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Diagnostic")(Diagnostic)
    __obj.updateDynamic("HasAccount")(HasAccount)
    __obj.updateDynamic("HasPassword")(HasPassword)
    __obj.updateDynamic("HasRealm")(HasRealm)
    __obj.updateDynamic("HasUserName")(HasUserName)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("Realm")(Realm)
    __obj.updateDynamic("ServerName")(ServerName)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[URLAuthenticationRequest]
  }
}

