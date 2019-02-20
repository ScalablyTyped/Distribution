package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog in asynchronous mode. */
trait XAsynchronousExecutableDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setDialogTitle(aTitle: java.lang.String): scala.Unit
  /**
    * Executes (shows) the dialog and returns immediately.
    * @param xListener This listener will be called when the dialog is closed.
    */
  def startExecuteModal(xListener: XDialogClosedListener): scala.Unit
}

