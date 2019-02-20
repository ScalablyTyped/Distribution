package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintableBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintableListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintableListener
  */
trait XPrintableBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds an {@link XPrintableListener} to be notified about print progress. */
  def addPrintableListener(xListener: XPrintableListener): scala.Unit
  /** removes an {@link XPrintableListener} . */
  def removePrintableListener(xListener: XPrintableListener): scala.Unit
}

