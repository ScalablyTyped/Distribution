package typings.a11yDashDialog.a11yDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.a11yDashDialog.a11yDashDialogStrings.show
  - typings.a11yDashDialog.a11yDashDialogStrings.hide
  - typings.a11yDashDialog.a11yDashDialogStrings.destroy
  - typings.a11yDashDialog.a11yDashDialogStrings.create
*/
trait DialogEvents extends js.Object

object DialogEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.a11yDashDialog.a11yDashDialogStrings.create = this.cast("create")
  @scala.inline
  def destroy: typings.a11yDashDialog.a11yDashDialogStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typings.a11yDashDialog.a11yDashDialogStrings.hide = this.cast("hide")
  @scala.inline
  def show: typings.a11yDashDialog.a11yDashDialogStrings.show = this.cast("show")
}

