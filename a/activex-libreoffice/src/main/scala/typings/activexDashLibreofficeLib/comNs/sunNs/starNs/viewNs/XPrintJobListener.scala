package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events about print job progress.
  *
  * {@link XPrintJobListener} can be registered to {@link XPrintJobBroadcaster} . Then, the client object will be notified when a new print job starts or
  * its state changes.
  * @see XPrintJobBroadcaster
  * @see XPrintJob
  * @since OOo 1.1.2
  */
trait XPrintJobListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * informs the user about the creation or the progress of a PrintJob
    * @param Event contains the {@link XPrintJob} having changed state and the new state.
    */
  def printJobEvent(Event: PrintJobEvent): scala.Unit
}

object XPrintJobListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    printJobEvent: js.Function1[PrintJobEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPrintJobListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, printJobEvent = printJobEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPrintJobListener]
  }
}

