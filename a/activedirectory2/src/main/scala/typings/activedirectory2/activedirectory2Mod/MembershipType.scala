package typings.activedirectory2.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activedirectory2.activedirectory2Strings.all
  - typings.activedirectory2.activedirectory2Strings.user
  - typings.activedirectory2.activedirectory2Strings.group
*/
trait MembershipType extends js.Object

object MembershipType {
  @scala.inline
  def all: typings.activedirectory2.activedirectory2Strings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def group: typings.activedirectory2.activedirectory2Strings.group = this.cast("group")
  @scala.inline
  def user: typings.activedirectory2.activedirectory2Strings.user = this.cast("user")
}

