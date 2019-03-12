package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait TabOrderDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createWithModel(
    TabbingModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel,
    ControlContext: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): scala.Unit
}

object TabOrderDialog {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createWithModel: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow) => scala.Unit,
    execute: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): TabOrderDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction3(createWithModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[TabOrderDialog]
  }
}

