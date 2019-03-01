package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers printing functionality. */
trait XPrintable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  var Printer: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  def getPrinter(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * prints the object.
    * @param xOptions specifies the number of copies and some other values which do not affect formatting.
    * @see PrintOptions
    */
  def print(
    xOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * assigns a new printer to the object.
    *
    * Setting a new printer will cause reformatting.
    * @see PrinterDescriptor
    */
  def setPrinter(
    aPrinter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XPrintable {
  @scala.inline
  def apply(
    Printer: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    getPrinter: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    print: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPrinter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XPrintable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Printer")(Printer)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPrinter")(getPrinter)
    __obj.updateDynamic("print")(print)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setPrinter")(setPrinter)
    __obj.asInstanceOf[XPrintable]
  }
}

