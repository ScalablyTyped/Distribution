package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "DatabaseAuthenticator")
@js.native
open class DatabaseAuthenticator[A, U] protected () extends StObject {
  def this(options: DatabaseClientOptions, oauth: OAuthAuthenticator) = this()
  
  def changePassword(data: ResetPasswordOptions): js.Promise[Any] = js.native
  def changePassword(data: ResetPasswordOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[Any] = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
  
  def signUp(data: SignUpUserData): js.Promise[User[A, U]] = js.native
  def signUp(
    data: SignUpUserData,
    cb: js.Function2[/* err */ js.Error, /* data */ User[AppMetadata, UserMetadata], Unit]
  ): Unit = js.native
}
