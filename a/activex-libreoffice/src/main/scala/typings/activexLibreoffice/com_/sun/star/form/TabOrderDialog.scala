package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
@js.native
trait TabOrderDialog extends XExecutableDialog {
  def createWithModel(TabbingModel: XTabControllerModel, ControlContext: XControlContainer, ParentWindow: XWindow): Unit = js.native
}

object TabOrderDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithModel: (XTabControllerModel, XControlContainer, XWindow) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): TabOrderDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction3(createWithModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TabOrderDialog]
  }
  @scala.inline
  implicit class TabOrderDialogOps[Self <: TabOrderDialog] (val x: Self) extends AnyVal {
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
    def setCreateWithModel(value: (XTabControllerModel, XControlContainer, XWindow) => Unit): Self = this.set("createWithModel", js.Any.fromFunction3(value))
  }
  
}

