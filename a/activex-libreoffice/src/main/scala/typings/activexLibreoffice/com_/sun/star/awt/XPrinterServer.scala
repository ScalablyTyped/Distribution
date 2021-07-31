package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages several printers on one machine. */
trait XPrinterServer
  extends StObject
     with XInterface {
  
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
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInfoPrinter = js.Any.fromFunction1(createInfoPrinter), createPrinter = js.Any.fromFunction1(createPrinter), getPrinterNames = js.Any.fromFunction0(getPrinterNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrinterServer]
  }
  
  @scala.inline
  implicit class XPrinterServerMutableBuilder[Self <: XPrinterServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInfoPrinter(value: String => XInfoPrinter): Self = StObject.set(x, "createInfoPrinter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePrinter(value: String => XPrinter): Self = StObject.set(x, "createPrinter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrinterNames(value: () => SafeArray[String]): Self = StObject.set(x, "getPrinterNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrinterNames(value: SafeArray[String]): Self = StObject.set(x, "PrinterNames", value.asInstanceOf[js.Any])
  }
}
