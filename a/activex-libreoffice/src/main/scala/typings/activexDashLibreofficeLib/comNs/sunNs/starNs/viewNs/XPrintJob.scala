package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

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
trait XPrintJob
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the {@link PrintOptions} used for the print job */
  val PrintOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** returns the printed object used for the print job */
  val Printable: XPrintable
  /** returns the Printer used for the print job */
  val Printer: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  def cancelJob(): scala.Unit
  /** returns the {@link PrintOptions} used for the print job */
  def getPrintOptions(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** returns the printed object used for the print job */
  def getPrintable(): XPrintable
  /** returns the Printer used for the print job */
  def getPrinter(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
}

object XPrintJob {
  @scala.inline
  def apply(
    PrintOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Printable: XPrintable,
    Printer: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    cancelJob: js.Function0[scala.Unit],
    getPrintOptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getPrintable: js.Function0[XPrintable],
    getPrinter: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPrintJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrintOptions")(PrintOptions)
    __obj.updateDynamic("Printable")(Printable)
    __obj.updateDynamic("Printer")(Printer)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancelJob")(cancelJob)
    __obj.updateDynamic("getPrintOptions")(getPrintOptions)
    __obj.updateDynamic("getPrintable")(getPrintable)
    __obj.updateDynamic("getPrinter")(getPrinter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPrintJob]
  }
}

