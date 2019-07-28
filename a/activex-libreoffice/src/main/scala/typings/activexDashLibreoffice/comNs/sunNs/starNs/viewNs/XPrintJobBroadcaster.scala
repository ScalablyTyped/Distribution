package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XPrintJobBroadcaster extends XInterface {
  /** adds an {@link XPrintJobListener} to be notified about print progress. */
  def addPrintJobListener(xListener: XPrintJobListener): Unit
  /** removes an {@link XPrintJobListener} . */
  def removePrintJobListener(xListener: XPrintJobListener): Unit
}

object XPrintJobBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPrintJobListener: XPrintJobListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePrintJobListener: XPrintJobListener => Unit
  ): XPrintJobBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPrintJobListener = js.Any.fromFunction1(addPrintJobListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePrintJobListener = js.Any.fromFunction1(removePrintJobListener))
  
    __obj.asInstanceOf[XPrintJobBroadcaster]
  }
}

