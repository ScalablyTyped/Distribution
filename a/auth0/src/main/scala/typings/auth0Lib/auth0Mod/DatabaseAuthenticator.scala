package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "DatabaseAuthenticator")
@js.native
class DatabaseAuthenticator[A, U] protected () extends js.Object {
  def this(options: DatabaseClientOptions, oauth: OAuthAuthenticator) = this()
  def changePassword(data: ResetPasswordOptions): js.Promise[_] = js.native
  def changePassword(
    data: ResetPasswordOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[_] = js.native
  def requestChangePasswordEmail(
    data: ResetPasswordEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def signIn(
    data: CreateUserData,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User[AppMetadata, UserMetadata], scala.Unit]
  ): scala.Unit = js.native
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ SignInToken, scala.Unit]): scala.Unit = js.native
  def signUp(data: CreateUserData): js.Promise[User[A, U]] = js.native
}

