package typings.auth0.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "AuthenticationClient")
@js.native
class AuthenticationClient protected () extends StObject {
  def this(options: AuthenticationClientOptions) = this()
  
  def changePassword(data: ResetPasswordOptions): js.Promise[_] = js.native
  def changePassword(data: ResetPasswordOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def clientCredentialsGrant(options: ClientCredentialsGrantOptions): js.Promise[TokenResponse] = js.native
  def clientCredentialsGrant(
    options: ClientCredentialsGrantOptions,
    cb: js.Function2[/* err */ Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  // Members
  var database: js.UndefOr[DatabaseAuthenticator[AppMetadata, UserMetadata]] = js.native
  
  def getClientInfo(): ClientInfo = js.native
  
  def getDelegationToken(data: DelegationTokenOptions): js.Promise[_] = js.native
  def getDelegationToken(data: DelegationTokenOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def getProfile(accessToken: String): js.Promise[_] = js.native
  def getProfile(accessToken: String, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  var oauth: js.UndefOr[OAuthAuthenticator] = js.native
  
  def passwordGrant(options: PasswordGrantOptions): js.Promise[TokenResponse] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  var passwordless: js.UndefOr[PasswordlessAuthenticator] = js.native
  
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[_] = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def requestEmailCode(data: RequestEmailOptions): js.Promise[_] = js.native
  def requestEmailCode(data: RequestEmailOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def requestMagicLink(data: RequestEmailOptions): js.Promise[_] = js.native
  def requestMagicLink(data: RequestEmailOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def requestSMSCode(data: RequestSMSOptions): js.Promise[_] = js.native
  def requestSMSCode(data: RequestSMSOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  var tokens: js.UndefOr[TokenManager] = js.native
  
  var users: js.UndefOr[UsersManager[AppMetadata, UserMetadata]] = js.native
  
  def verifyEmailCode(data: VerifyOptions): js.Promise[_] = js.native
  def verifyEmailCode(data: VerifyOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def verifySMSCode(data: VerifyOptions): js.Promise[_] = js.native
  def verifySMSCode(data: VerifyOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
}
