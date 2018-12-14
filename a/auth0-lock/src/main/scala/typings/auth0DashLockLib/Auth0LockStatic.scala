package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockStatic
  extends org.scalablytyped.runtime.Instantiable2[/* clientId */ java.lang.String, /* domain */ java.lang.String, Auth0LockStatic]
     with org.scalablytyped.runtime.Instantiable3[
      /* clientId */ java.lang.String, 
      /* domain */ java.lang.String, 
      /* options */ Auth0LockConstructorOptions, 
      Auth0LockStatic
    ] {
  def checkSession(
    options: js.Any,
    callback: js.Function2[
      /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
      /* authResult */ js.UndefOr[AuthResult], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // deprecated
  def getProfile(
    token: java.lang.String,
    callback: js.Function2[
      /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
      /* profile */ auth0DashJsLib.auth0DashJsMod.Auth0UserProfile, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getUserInfo(
    token: java.lang.String,
    callback: js.Function2[
      /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
      /* profile */ auth0DashJsLib.auth0DashJsMod.Auth0UserProfile, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def logout(query: js.Any): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_authenticated(
    event: auth0DashLockLib.auth0DashLockLibStrings.authenticated,
    callback: js.Function1[/* authResult */ AuthResult, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_authorization_error(
    event: auth0DashLockLib.auth0DashLockLibStrings.authorization_error,
    callback: js.Function1[/* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_hide(event: auth0DashLockLib.auth0DashLockLibStrings.hide, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_show(event: auth0DashLockLib.auth0DashLockLibStrings.show, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_unrecoverable_error(
    event: auth0DashLockLib.auth0DashLockLibStrings.unrecoverable_error,
    callback: js.Function1[/* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, scala.Unit]
  ): scala.Unit = js.native
  // https://github.com/auth0/lock#resumeauthhash-callback
  def resumeAuth(
    hash: java.lang.String,
    callback: js.Function2[
      /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
      /* authResult */ AuthResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(options: Auth0LockShowOptions): scala.Unit = js.native
}

