package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog. */
trait XExecutableDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Executes (shows) the dialog.
    * @returns A status code of type {@link ExecutableDialogResults} .
    */
  def execute(): scala.Double
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setTitle(aTitle: java.lang.String): scala.Unit
}

object XExecutableDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[XExecutableDialog]
  }
}

