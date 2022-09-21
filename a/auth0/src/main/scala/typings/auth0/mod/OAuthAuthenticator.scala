package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "OAuthAuthenticator")
@js.native
open class OAuthAuthenticator protected () extends StObject {
  def this(options: OAuthClientOptions) = this()
  
  def authorizationCodeGrant(data: AuthorizationCodeGrantOptions): js.Promise[SignInToken] = js.native
  def authorizationCodeGrant(
    data: AuthorizationCodeGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]
  ): Unit = js.native
  
  def passwordGrant(options: PasswordGrantOptions): js.Promise[SignInToken] = js.native
  def passwordGrant(options: PasswordGrantOptions, additionalOptions: PasswordGrantAdditionalOptions): js.Promise[SignInToken] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    additionalOptions: PasswordGrantAdditionalOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ SignInToken, Unit]
  ): Unit = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ SignInToken, Unit]
  ): Unit = js.native
  
  def refreshToken(options: RefreshTokenOptions): js.Promise[TokenResponse] = js.native
  def refreshToken(
    options: RefreshTokenOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ TokenResponse, Unit]
  ): Unit = js.native
  
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
  
  def socialSignIn(data: SocialSignInOptions): js.Promise[SignInToken] = js.native
  def socialSignIn(data: SocialSignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
}
