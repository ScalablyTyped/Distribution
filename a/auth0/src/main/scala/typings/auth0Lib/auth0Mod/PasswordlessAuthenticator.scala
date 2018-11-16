package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "PasswordlessAuthenticator")
@js.native
class PasswordlessAuthenticator protected () extends js.Object {
  def this(options: PasswordLessClientOptions, oauth: OAuthAuthenticator) = this()
  def sendEmail(data: RequestEmailCodeOrLinkOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def sendEmail(
    data: RequestEmailCodeOrLinkOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sendSMS(data: RequestSMSCodeOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def sendSMS(
    data: RequestSMSCodeOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def signIn(data: SignInOptions): bluebirdLib.bluebirdMod.namespaced[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ SignInToken, scala.Unit]): scala.Unit = js.native
}

