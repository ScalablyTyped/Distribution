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

