package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "AuthenticationClient")
@js.native
class AuthenticationClient protected () extends js.Object {
  def this(options: AuthenticationClientOptions) = this()
  // Members
  var database: js.UndefOr[DatabaseAuthenticator] = js.native
  var oauth: js.UndefOr[OAuthAuthenticator] = js.native
  var passwordless: js.UndefOr[PasswordlessAuthenticator] = js.native
  var tokens: js.UndefOr[TokenManager] = js.native
  var users: js.UndefOr[UsersManager] = js.native
  def changePassword(data: ResetPasswordOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def changePassword(
    data: ResetPasswordOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def clientCredentialsGrant(options: ClientCredentialsGrantOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def clientCredentialsGrant(
    options: ClientCredentialsGrantOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  def getDelegationToken(data: DelegationTokenOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getDelegationToken(
    data: DelegationTokenOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getProfile(accessToken: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getProfile(
    accessToken: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def passwordGrant(options: PasswordGrantOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def requestChangePasswordEmail(
    data: ResetPasswordEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestEmailCode(data: RequestEmailOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def requestEmailCode(
    data: RequestEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestMagicLink(data: RequestEmailOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def requestMagicLink(
    data: RequestEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestSMSCode(data: RequestSMSOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def requestSMSCode(
    data: RequestSMSOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def verifyEmailCode(data: VerifyOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def verifyEmailCode(
    data: VerifyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def verifySMSCode(data: VerifyOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def verifySMSCode(
    data: VerifyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

