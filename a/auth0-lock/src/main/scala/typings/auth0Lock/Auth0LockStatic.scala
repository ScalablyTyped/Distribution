package typings.auth0Lock

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.auth0Js.mod.Auth0Error
import typings.auth0Js.mod.Auth0UserProfile
import typings.auth0Lock.auth0LockStrings.authenticated
import typings.auth0Lock.auth0LockStrings.authorization_error
import typings.auth0Lock.auth0LockStrings.hide
import typings.auth0Lock.auth0LockStrings.show
import typings.auth0Lock.auth0LockStrings.unrecoverable_error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockStatic
  extends Instantiable2[/* clientId */ String, /* domain */ String, Auth0LockStatic]
     with Instantiable3[
      /* clientId */ String, 
      /* domain */ String, 
      /* options */ Auth0LockConstructorOptions, 
      Auth0LockStatic
    ] {
  def checkSession(
    options: js.Any,
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
  def logout(query: js.Any): Unit = js.native
  def on(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_authenticated(event: authenticated, callback: js.Function1[/* authResult */ AuthResult, Unit]): Unit = js.native
  @JSName("on")
  def on_authorizationerror(event: authorization_error, callback: js.Function1[/* error */ Auth0Error, Unit]): Unit = js.native
  @JSName("on")
  def on_hide(event: hide, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_show(event: show, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_unrecoverableerror(event: unrecoverable_error, callback: js.Function1[/* error */ Auth0Error, Unit]): Unit = js.native
  // https://github.com/auth0/lock#resumeauthhash-callback
  def resumeAuth(hash: String, callback: js.Function2[/* error */ Auth0Error, /* authResult */ AuthResult, Unit]): Unit = js.native
  def show(): Unit = js.native
  def show(options: Auth0LockShowOptions): Unit = js.native
}

