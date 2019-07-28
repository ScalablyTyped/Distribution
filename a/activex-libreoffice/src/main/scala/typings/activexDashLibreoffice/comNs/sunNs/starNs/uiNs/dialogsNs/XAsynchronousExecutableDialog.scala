package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog in asynchronous mode. */
trait XAsynchronousExecutableDialog extends XInterface {
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setDialogTitle(aTitle: String): Unit
  /**
    * Executes (shows) the dialog and returns immediately.
    * @param xListener This listener will be called when the dialog is closed.
    */
  def startExecuteModal(xListener: XDialogClosedListener): Unit
}

object XAsynchronousExecutableDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDialogTitle: String => Unit,
    startExecuteModal: XDialogClosedListener => Unit
  ): XAsynchronousExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDialogTitle = js.Any.fromFunction1(setDialogTitle), startExecuteModal = js.Any.fromFunction1(startExecuteModal))
  
    __obj.asInstanceOf[XAsynchronousExecutableDialog]
  }
}

