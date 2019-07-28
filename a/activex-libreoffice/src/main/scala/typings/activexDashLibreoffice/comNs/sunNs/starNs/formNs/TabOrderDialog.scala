package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XTabControllerModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait TabOrderDialog extends XExecutableDialog {
  def createWithModel(TabbingModel: XTabControllerModel, ControlContext: XControlContainer, ParentWindow: XWindow): Unit
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
}

