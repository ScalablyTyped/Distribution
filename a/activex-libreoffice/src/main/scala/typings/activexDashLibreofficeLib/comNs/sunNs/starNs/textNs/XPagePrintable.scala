package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print several pages on one printer page. */
trait XPagePrintable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  var PagePrintSettings: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  def getPagePrintSettings(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * prints the pages according to the {@link PagePrintSettings} .
    * @see com.sun.star.view.PrintOptions
    */
  def printPages(
    xOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * adjusts the settings of the page printing.
    * @see getPagePrintSettings
    */
  def setPagePrintSettings(
    aSettings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

