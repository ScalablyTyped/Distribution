package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait ControlFontDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createWithGridModel(GridModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
}

object ControlFontDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createWithGridModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): ControlFontDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithGridModel = createWithGridModel, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[ControlFontDialog]
  }
}

