package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented in order to support listener management. */
trait XFilePickerNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Interface for clients to register as {@link XFilePickerListener}
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def addFilePickerListener(xListener: XFilePickerListener): scala.Unit
  /**
    * Interface for clients to unregister as {@link XFilePickerListener} .
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def removeFilePickerListener(xListener: XFilePickerListener): scala.Unit
}

object XFilePickerNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addFilePickerListener: js.Function1[XFilePickerListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFilePickerListener: js.Function1[XFilePickerListener, scala.Unit]
  ): XFilePickerNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFilePickerListener")(addFilePickerListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFilePickerListener")(removeFilePickerListener)
    __obj.asInstanceOf[XFilePickerNotifier]
  }
}

