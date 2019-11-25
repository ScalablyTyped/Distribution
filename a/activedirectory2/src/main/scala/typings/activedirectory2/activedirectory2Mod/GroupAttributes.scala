package typings.activedirectory2.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activedirectory2.activedirectory2Strings.distinguishedName
  - typings.activedirectory2.activedirectory2Strings.objectCategory
  - typings.activedirectory2.activedirectory2Strings.cn
  - typings.activedirectory2.activedirectory2Strings.description
*/
trait GroupAttributes extends js.Object

object GroupAttributes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cn: typings.activedirectory2.activedirectory2Strings.cn = this.cast("cn")
  @scala.inline
  def description: typings.activedirectory2.activedirectory2Strings.description = this.cast("description")
  @scala.inline
  def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = this.cast("distinguishedName")
  @scala.inline
  def objectCategory: typings.activedirectory2.activedirectory2Strings.objectCategory = this.cast("objectCategory")
}

