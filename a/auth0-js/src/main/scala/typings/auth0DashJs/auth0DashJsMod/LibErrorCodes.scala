package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0DashJs.auth0DashJsStrings.timeout
  - typings.auth0DashJs.auth0DashJsStrings.request_error
  - typings.auth0DashJs.auth0DashJsStrings.invalid_token
*/
trait LibErrorCodes extends js.Object

object LibErrorCodes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid_token: typings.auth0DashJs.auth0DashJsStrings.invalid_token = this.cast("invalid_token")
  @scala.inline
  def request_error: typings.auth0DashJs.auth0DashJsStrings.request_error = this.cast("request_error")
  @scala.inline
  def timeout: typings.auth0DashJs.auth0DashJsStrings.timeout = this.cast("timeout")
}

