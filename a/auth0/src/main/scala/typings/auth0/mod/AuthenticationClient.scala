package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "AuthenticationClient")
@js.native
open class AuthenticationClient protected () extends StObject {
  def this(options: AuthenticationClientOptions) = this()
  
  def changePassword(data: ResetPasswordOptions): js.Promise[Any] = js.native
  def changePassword(data: ResetPasswordOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def clientCredentialsGrant(options: ClientCredentialsGrantOptions): js.Promise[TokenResponse] = js.native
  def clientCredentialsGrant(
    options: ClientCredentialsGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  // Members
  var database: js.UndefOr[DatabaseAuthenticator[AppMetadata, UserMetadata]] = js.native
  
  def getClientInfo(): ClientInfo = js.native
  
  def getDelegationToken(data: DelegationTokenOptions): js.Promise[Any] = js.native
  def getDelegationToken(data: DelegationTokenOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def getProfile(accessToken: String): js.Promise[Any] = js.native
  def getProfile(accessToken: String, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  var oauth: js.UndefOr[OAuthAuthenticator] = js.native
  
  def passwordGrant(options: PasswordGrantOptions): js.Promise[TokenResponse] = js.native
  def passwordGrant(options: PasswordGrantOptions, additionalOptions: PasswordGrantAdditionalOptions): js.Promise[TokenResponse] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    additionalOptions: PasswordGrantAdditionalOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  var passwordless: js.UndefOr[PasswordlessAuthenticator] = js.native
  
  def refreshToken(options: AuthenticationClientRefreshTokenOptions): js.Promise[TokenResponse] = js.native
  def refreshToken(
    options: AuthenticationClientRefreshTokenOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[Any] = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def requestEmailCode(data: RequestEmailOptions): js.Promise[Any] = js.native
  def requestEmailCode(data: RequestEmailOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def requestMagicLink(data: RequestEmailOptions): js.Promise[Any] = js.native
  def requestMagicLink(data: RequestEmailOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def requestSMSCode(data: RequestSMSOptions): js.Promise[Any] = js.native
  def requestSMSCode(data: RequestSMSOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  var tokens: js.UndefOr[TokensManager] = js.native
  
  var users: js.UndefOr[UsersManager[AppMetadata, UserMetadata]] = js.native
  
  def verifyEmailCode(data: VerifyEmailOptions): js.Promise[Any] = js.native
  def verifyEmailCode(data: VerifyEmailOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def verifySMSCode(data: VerifySMSOptions): js.Promise[Any] = js.native
  def verifySMSCode(data: VerifySMSOptionsDeprecated): js.Promise[Any] = js.native
  def verifySMSCode(data: VerifySMSOptionsDeprecated, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  def verifySMSCode(data: VerifySMSOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
}
