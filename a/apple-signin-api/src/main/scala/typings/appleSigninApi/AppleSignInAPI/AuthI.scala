package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/authi
@js.native
trait AuthI extends js.Object {
  def init(config: ClientConfigI): js.Promise[Unit] = js.native
  def renderButton(): Unit = js.native
  def signIn(): js.Promise[SignInResponseI | SignInErrorI] = js.native
  def signIn(signInConfig: ClientConfigI): js.Promise[SignInResponseI | SignInErrorI] = js.native
}

