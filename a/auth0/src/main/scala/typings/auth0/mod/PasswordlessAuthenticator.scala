package typings.auth0.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "PasswordlessAuthenticator")
@js.native
class PasswordlessAuthenticator protected () extends StObject {
  def this(options: PasswordLessClientOptions, oauth: OAuthAuthenticator) = this()
  
  def sendEmail(data: RequestEmailCodeOrLinkOptions): js.Promise[js.Any] = js.native
  def sendEmail(data: RequestEmailCodeOrLinkOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def sendSMS(data: RequestSMSCodeOptions): js.Promise[js.Any] = js.native
  def sendSMS(data: RequestSMSCodeOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ Error, /* data */ SignInToken, Unit]): Unit = js.native
}
