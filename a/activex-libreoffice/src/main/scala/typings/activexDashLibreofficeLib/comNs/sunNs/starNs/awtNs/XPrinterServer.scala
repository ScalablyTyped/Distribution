package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages several printers on one machine. */
trait XPrinterServer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns a list of all available printer names. */
  val PrinterNames: stdLib.SafeArray[java.lang.String]
  /**
    * creates a new information printer.
    *
    * You can get all information from this printer, but the printer cannot really print.
    */
  def createInfoPrinter(printerName: java.lang.String): XInfoPrinter
  /**
    * creates a new virtual printer.
    *
    * You must call {@link com.sun.star.awt.XPrinter.start()} to put the job into the printer spooler.
    */
  def createPrinter(printerName: java.lang.String): XPrinter
  /** returns a list of all available printer names. */
  def getPrinterNames(): stdLib.SafeArray[java.lang.String]
}

object XPrinterServer {
  @scala.inline
  def apply(
    PrinterNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    createInfoPrinter: java.lang.String => XInfoPrinter,
    createPrinter: java.lang.String => XPrinter,
    getPrinterNames: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPrinterServer = {
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames, acquire = js.Any.fromFunction0(acquire), createInfoPrinter = js.Any.fromFunction1(createInfoPrinter), createPrinter = js.Any.fromFunction1(createPrinter), getPrinterNames = js.Any.fromFunction0(getPrinterNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPrinterServer]
  }
}

