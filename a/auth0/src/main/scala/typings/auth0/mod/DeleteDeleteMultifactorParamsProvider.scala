package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.auth0Strings.duo
  - typings.auth0.auth0Strings.`google-authenticator`
*/
trait DeleteDeleteMultifactorParamsProvider extends js.Object

object DeleteDeleteMultifactorParamsProvider {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duo: typings.auth0.auth0Strings.duo = this.cast("duo")
  @scala.inline
  def `google-authenticator`: typings.auth0.auth0Strings.`google-authenticator` = this.cast("google-authenticator")
}

