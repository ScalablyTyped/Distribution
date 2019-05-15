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
  var database: js.UndefOr[DatabaseAuthenticator[AppMetadata, UserMetadata]] = js.native
  var oauth: js.UndefOr[OAuthAuthenticator] = js.native
  var passwordless: js.UndefOr[PasswordlessAuthenticator] = js.native
  var tokens: js.UndefOr[TokenManager] = js.native
  var users: js.UndefOr[UsersManager[AppMetadata, UserMetadata]] = js.native
  def changePassword(data: ResetPasswordOptions): js.Promise[_] = js.native
  def changePassword(
    data: ResetPasswordOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def clientCredentialsGrant(options: ClientCredentialsGrantOptions): js.Promise[_] = js.native
  def clientCredentialsGrant(
    options: ClientCredentialsGrantOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  def getDelegationToken(data: DelegationTokenOptions): js.Promise[_] = js.native
  def getDelegationToken(
    data: DelegationTokenOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getProfile(accessToken: java.lang.String): js.Promise[_] = js.native
  def getProfile(
    accessToken: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def passwordGrant(options: PasswordGrantOptions): js.Promise[_] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[_] = js.native
  def requestChangePasswordEmail(
    data: ResetPasswordEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestEmailCode(data: RequestEmailOptions): js.Promise[_] = js.native
  def requestEmailCode(
    data: RequestEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestMagicLink(data: RequestEmailOptions): js.Promise[_] = js.native
  def requestMagicLink(
    data: RequestEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestSMSCode(data: RequestSMSOptions): js.Promise[_] = js.native
  def requestSMSCode(
    data: RequestSMSOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def verifyEmailCode(data: VerifyOptions): js.Promise[_] = js.native
  def verifyEmailCode(
    data: VerifyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def verifySMSCode(data: VerifyOptions): js.Promise[_] = js.native
  def verifySMSCode(
    data: VerifyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

