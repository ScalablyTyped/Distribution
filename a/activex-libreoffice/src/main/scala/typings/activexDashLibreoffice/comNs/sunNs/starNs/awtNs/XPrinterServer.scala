package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages several printers on one machine. */
trait XPrinterServer extends XInterface {
  /** returns a list of all available printer names. */
  val PrinterNames: SafeArray[String]
  /**
    * creates a new information printer.
    *
    * You can get all information from this printer, but the printer cannot really print.
    */
  def createInfoPrinter(printerName: String): XInfoPrinter
  /**
    * creates a new virtual printer.
    *
    * You must call {@link com.sun.star.awt.XPrinter.start()} to put the job into the printer spooler.
    */
  def createPrinter(printerName: String): XPrinter
  /** returns a list of all available printer names. */
  def getPrinterNames(): SafeArray[String]
}

object XPrinterServer {
  @scala.inline
  def apply(
    PrinterNames: SafeArray[String],
    acquire: () => Unit,
    createInfoPrinter: String => XInfoPrinter,
    createPrinter: String => XPrinter,
    getPrinterNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrinterServer = {
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames, acquire = js.Any.fromFunction0(acquire), createInfoPrinter = js.Any.fromFunction1(createInfoPrinter), createPrinter = js.Any.fromFunction1(createPrinter), getPrinterNames = js.Any.fromFunction0(getPrinterNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPrinterServer]
  }
}

