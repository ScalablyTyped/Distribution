package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to notify listeners about dialog-closed events.
  *
  * Registered listeners will be notified with a {@link DialogClosedEvent} when a {@link XAsynchronousExecutableDialog} is closed.
  * @see XAsynchronousExecutableDialog
  * @see DialogClosedEvent
  */
trait XDialogClosedListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * A client receives this event if a dialog is closed.
    * @param aEvent of type {@link DialogClosedEvent} that describes the event
    * @see EndDialogEvent
    */
  def dialogClosed(aEvent: DialogClosedEvent): scala.Unit
}

object XDialogClosedListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    dialogClosed: js.Function1[DialogClosedEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDialogClosedListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, dialogClosed = dialogClosed, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDialogClosedListener]
  }
}

