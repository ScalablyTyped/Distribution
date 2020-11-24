package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/signinwithapplejs/authi
@js.native
trait AuthI extends js.Object {
  
  def init(config: ClientConfigI): Unit = js.native
  
  def renderButton(): Unit = js.native
  
  def signIn(): js.Promise[SignInResponseI] = js.native
  def signIn(signInConfig: ClientConfigI): js.Promise[SignInResponseI] = js.native
}
