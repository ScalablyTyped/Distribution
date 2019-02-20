package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a virtual printer.
  *
  * All properties are vetoable properties. If you change the properties between a call to {@link com.sun.star.awt.XPrinter.startPage()} and a call to
  * {@link com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  */
trait XPrinter extends XPrinterPropertySet {
  /**
    * notifies the printer spooler that the job is done and printing starts.
    * @see terminate
    */
  def end(): scala.Unit
  /** ends the current page. */
  def endPage(): scala.Unit
  /**
    * puts the job into the printer spooler.
    *
    * This call may block the thread. So release all resources (mutex, semaphore, etc.) before this call.
    */
  def start(nJobName: java.lang.String, nCopies: scala.Double, nCollate: scala.Boolean): scala.Boolean
  /** begins with a new page. */
  def startPage(): XDevice
  /**
    * stops the current print job.
    *
    * If the method {@link com.sun.star.awt.XPrinter.end()} is called beforehand, then this call does nothing. If you call {@link
    * com.sun.star.awt.XPrinter.terminate()} in or before the call to {@link com.sun.star.awt.XPrinter.start()} , {@link
    * com.sun.star.awt.XPrinter.terminate()} returns `FALSE` . This call must not block the thread.
    * @see end
    */
  def terminate(): scala.Unit
}

