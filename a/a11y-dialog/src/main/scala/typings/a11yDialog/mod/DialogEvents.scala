package typings.a11yDialog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.a11yDialog.a11yDialogStrings.show
  - typings.a11yDialog.a11yDialogStrings.hide
  - typings.a11yDialog.a11yDialogStrings.destroy
  - typings.a11yDialog.a11yDialogStrings.create
*/
trait DialogEvents extends js.Object

object DialogEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.a11yDialog.a11yDialogStrings.create = this.cast("create")
  @scala.inline
  def destroy: typings.a11yDialog.a11yDialogStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typings.a11yDialog.a11yDialogStrings.hide = this.cast("hide")
  @scala.inline
  def show: typings.a11yDialog.a11yDialogStrings.show = this.cast("show")
}

