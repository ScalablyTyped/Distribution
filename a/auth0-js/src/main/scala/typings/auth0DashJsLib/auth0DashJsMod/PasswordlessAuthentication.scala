package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "PasswordlessAuthentication")
@js.native
class PasswordlessAuthentication protected () extends js.Object {
  def this(request: js.Any, option: js.Any) = this()
  /**
       * Builds and returns the passwordless TOTP verify url in order to initialize a new authN/authZ transaction
       *
       */
  def buildVerifyUrl(options: PasswordlessVerifyOptions): java.lang.String = js.native
  /**
       * Initializes a new passwordless authN/authZ transaction
       *
       * @param options: https://auth0.com/docs/api/authentication#passwordless
       */
  def start(options: PasswordlessStartOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Verifies the passwordless TOTP and returns an error if any.
       *
       */
  def verify(options: PasswordlessVerifyOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
}

