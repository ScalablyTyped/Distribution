package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJobBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintJobListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJobBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds an {@link XPrintJobListener} to be notified about print progress. */
  def addPrintJobListener(xListener: XPrintJobListener): scala.Unit
  /** removes an {@link XPrintJobListener} . */
  def removePrintJobListener(xListener: XPrintJobListener): scala.Unit
}

object XPrintJobBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addPrintJobListener: js.Function1[XPrintJobListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePrintJobListener: js.Function1[XPrintJobListener, scala.Unit]
  ): XPrintJobBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPrintJobListener")(addPrintJobListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePrintJobListener")(removePrintJobListener)
    __obj.asInstanceOf[XPrintJobBroadcaster]
  }
}

