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
    acquire: js.Function0[scala.Unit],
    createWithModel: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      scala.Unit
    ],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): TabOrderDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithModel = createWithModel, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[TabOrderDialog]
  }
}

