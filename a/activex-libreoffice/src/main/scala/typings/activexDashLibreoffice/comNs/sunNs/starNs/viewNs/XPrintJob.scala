package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJob} is implemented by print jobs that are created by classes that implement {@link XPrintable} . It gives information about the context
  * of the print job.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJob extends XInterface {
  /** returns the {@link PrintOptions} used for the print job */
  val PrintOptions: SafeArray[PropertyValue]
  /** returns the printed object used for the print job */
  val Printable: XPrintable
  /** returns the Printer used for the print job */
  val Printer: SafeArray[PropertyValue]
  def cancelJob(): Unit
  /** returns the {@link PrintOptions} used for the print job */
  def getPrintOptions(): SafeArray[PropertyValue]
  /** returns the printed object used for the print job */
  def getPrintable(): XPrintable
  /** returns the Printer used for the print job */
  def getPrinter(): SafeArray[PropertyValue]
}

object XPrintJob {
  @scala.inline
  def apply(
    PrintOptions: SafeArray[PropertyValue],
    Printable: XPrintable,
    Printer: SafeArray[PropertyValue],
    acquire: () => Unit,
    cancelJob: () => Unit,
    getPrintOptions: () => SafeArray[PropertyValue],
    getPrintable: () => XPrintable,
    getPrinter: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrintJob = {
    val __obj = js.Dynamic.literal(PrintOptions = PrintOptions, Printable = Printable, Printer = Printer, acquire = js.Any.fromFunction0(acquire), cancelJob = js.Any.fromFunction0(cancelJob), getPrintOptions = js.Any.fromFunction0(getPrintOptions), getPrintable = js.Any.fromFunction0(getPrintable), getPrinter = js.Any.fromFunction0(getPrinter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPrintJob]
  }
}

