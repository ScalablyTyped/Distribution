package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.auth0Strings.link
  - typings.auth0.auth0Strings.code
*/
trait SendType extends js.Object

object SendType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.auth0.auth0Strings.code = this.cast("code")
  @scala.inline
  def link: typings.auth0.auth0Strings.link = this.cast("link")
}

