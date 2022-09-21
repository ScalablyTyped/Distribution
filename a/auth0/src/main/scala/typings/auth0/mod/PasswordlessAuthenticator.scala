package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "PasswordlessAuthenticator")
@js.native
open class PasswordlessAuthenticator protected () extends StObject {
  def this(options: PasswordLessClientOptions, oauth: OAuthAuthenticator) = this()
  
  def sendEmail(userData: RequestEmailCodeOrLinkOptions): js.Promise[Any] = js.native
  def sendEmail(
    userData: RequestEmailCodeOrLinkOptions,
    cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]
  ): Unit = js.native
  def sendEmail(userData: RequestEmailCodeOrLinkOptions, options: PasswordlessOptions): js.Promise[Any] = js.native
  def sendEmail(
    userData: RequestEmailCodeOrLinkOptions,
    options: PasswordlessOptions,
    cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]
  ): Unit = js.native
  
  def sendSMS(userData: RequestSMSCodeOptions): js.Promise[Any] = js.native
  def sendSMS(userData: RequestSMSCodeOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  def sendSMS(userData: RequestSMSCodeOptions, options: PasswordlessOptions): js.Promise[Any] = js.native
  def sendSMS(
    userData: RequestSMSCodeOptions,
    options: PasswordlessOptions,
    cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]
  ): Unit = js.native
  
  def signIn(userData: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(userData: SignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
  def signIn(userData: SignInOptions, options: PasswordlessOptions): js.Promise[SignInToken] = js.native
  def signIn(
    userData: SignInOptions,
    options: PasswordlessOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]
  ): Unit = js.native
}
