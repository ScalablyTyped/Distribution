package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0Js.auth0JsStrings.timeout
  - typings.auth0Js.auth0JsStrings.request_error
  - typings.auth0Js.auth0JsStrings.invalid_token
*/
trait LibErrorCodes extends js.Object

object LibErrorCodes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid_token: typings.auth0Js.auth0JsStrings.invalid_token = this.cast("invalid_token")
  @scala.inline
  def request_error: typings.auth0Js.auth0JsStrings.request_error = this.cast("request_error")
  @scala.inline
  def timeout: typings.auth0Js.auth0JsStrings.timeout = this.cast("timeout")
}

