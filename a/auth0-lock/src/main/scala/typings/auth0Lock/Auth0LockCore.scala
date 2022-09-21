package typings.auth0Lock

import typings.auth0Js.mod.Auth0Error
import typings.auth0Js.mod.Auth0UserProfile
import typings.auth0Lock.auth0LockStrings.authenticated
import typings.auth0Lock.auth0LockStrings.authorization_error
import typings.auth0Lock.auth0LockStrings.hide
import typings.auth0Lock.auth0LockStrings.show
import typings.auth0Lock.auth0LockStrings.unrecoverable_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockCore extends StObject {
  
  def checkSession(
    options: Auth0LockAuthParamsOptions,
    callback: js.Function2[/* error */ Auth0Error, /* authResult */ js.UndefOr[AuthResult], Unit]
  ): Unit = js.native
  
  // deprecated
  def getProfile(
    token: String,
    callback: js.Function2[/* error */ Auth0Error, /* profile */ Auth0UserProfile, Unit]
  ): Unit = js.native
  
  def getUserInfo(
    token: String,
    callback: js.Function2[/* error */ Auth0Error, /* profile */ Auth0UserProfile, Unit]
  ): Unit = js.native
  
  def hide(): Unit = js.native
  
  def logout(query: Any): Unit = js.native
  
  // though not documented, these methods are inherited from EventEmitter
  // https://github.com/browserify/events/blob/48e3d18659caf72d94d319871106f089bb40002d/events.js#L321
  def off(event: show | hide, callback: js.Function0[Unit]): Unit = js.native
  def off(
    event: unrecoverable_error | authorization_error,
    callback: js.Function1[/* error */ Auth0Error, Unit]
  ): Unit = js.native
  def off(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  @JSName("off")
  def off_authenticated(event: authenticated, callback: js.Function1[/* authResult */ AuthResult, Unit]): Unit = js.native
  
  def on(event: show | hide, callback: js.Function0[Unit]): Unit = js.native
  def on(
    event: unrecoverable_error | authorization_error,
    callback: js.Function1[/* error */ Auth0Error, Unit]
  ): Unit = js.native
  def on(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_authenticated(event: authenticated, callback: js.Function1[/* authResult */ AuthResult, Unit]): Unit = js.native
  
  // https://github.com/auth0/lock#resumeauthhash-callback
  def resumeAuth(hash: String, callback: js.Function2[/* error */ Auth0Error, /* authResult */ AuthResult, Unit]): Unit = js.native
  
  def show(): Unit = js.native
  def show(options: Auth0LockShowOptions): Unit = js.native
}
