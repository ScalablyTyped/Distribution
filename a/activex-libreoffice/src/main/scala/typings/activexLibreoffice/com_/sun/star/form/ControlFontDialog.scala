package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
@js.native
trait ControlFontDialog extends XExecutableDialog {
  def createWithGridModel(GridModel: XPropertySet): Unit = js.native
}

object ControlFontDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithGridModel: XPropertySet => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): ControlFontDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithGridModel = js.Any.fromFunction1(createWithGridModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ControlFontDialog]
  }
  @scala.inline
  implicit class ControlFontDialogOps[Self <: ControlFontDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateWithGridModel(value: XPropertySet => Unit): Self = this.set("createWithGridModel", js.Any.fromFunction1(value))
  }
  
}

