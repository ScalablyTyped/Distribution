package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an extended property set for printer properties.
  *
  * All properties are vetoable properties. If you change the properties between {@link com.sun.star.awt.XPrinter.startPage()} and {@link
  * com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  * @see XPrinter
  * @see XInfoPrinter
  */
trait XPrinterPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** returns a binary encoded version of the printer setup. */
  var BinarySetup: activexDashInteropLib.SafeArray[scala.Double]
  /** returns descriptions of all available printer forms. */
  val FormDescriptions: activexDashInteropLib.SafeArray[java.lang.String]
  /** returns a binary encoded version of the printer setup. */
  def getBinarySetup(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns descriptions of all available printer forms. */
  def getFormDescriptions(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * sets the form that should be used.
    *
    * Indirectly a printer is selected.
    */
  def selectForm(aFormDescription: java.lang.String): scala.Unit
  /**
    * sets the data specific to the printer driver.
    *
    * Get this data from the info printer and set the data to the printer.
    */
  def setBinarySetup(data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /** sets the orientation. */
  def setHorizontal(bHorizontal: scala.Boolean): scala.Unit
}

