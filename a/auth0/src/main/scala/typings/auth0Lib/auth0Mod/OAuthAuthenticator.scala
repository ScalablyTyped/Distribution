package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "OAuthAuthenticator")
@js.native
class OAuthAuthenticator protected () extends js.Object {
  def this(options: OAuthClientOptions) = this()
  def passwordGrant(options: PasswordGrantOptions): js.Promise[SignInToken] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ SignInToken, scala.Unit]
  ): scala.Unit = js.native
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ SignInToken, scala.Unit]): scala.Unit = js.native
  def socialSignIn(data: SocialSignInOptions): js.Promise[SignInToken] = js.native
  def socialSignIn(
    data: SocialSignInOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ SignInToken, scala.Unit]
  ): scala.Unit = js.native
}

