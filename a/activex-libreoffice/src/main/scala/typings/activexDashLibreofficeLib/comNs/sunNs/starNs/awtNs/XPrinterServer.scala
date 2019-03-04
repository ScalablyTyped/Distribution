package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages several printers on one machine. */
trait XPrinterServer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns a list of all available printer names. */
  val PrinterNames: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getPrinterNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XPrinterServer {
  @scala.inline
  def apply(
    PrinterNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    createInfoPrinter: js.Function1[java.lang.String, XInfoPrinter],
    createPrinter: js.Function1[java.lang.String, XPrinter],
    getPrinterNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPrinterServer = {
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames, acquire = acquire, createInfoPrinter = createInfoPrinter, createPrinter = createPrinter, getPrinterNames = getPrinterNames, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPrinterServer]
  }
}

