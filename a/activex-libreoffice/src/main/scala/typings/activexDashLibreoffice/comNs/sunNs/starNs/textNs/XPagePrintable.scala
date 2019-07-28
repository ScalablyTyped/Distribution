package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print several pages on one printer page. */
trait XPagePrintable extends XInterface {
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  var PagePrintSettings: SafeArray[PropertyValue]
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  def getPagePrintSettings(): SafeArray[PropertyValue]
  /**
    * prints the pages according to the {@link PagePrintSettings} .
    * @see com.sun.star.view.PrintOptions
    */
  def printPages(xOptions: SeqEquiv[PropertyValue]): Unit
  /**
    * adjusts the settings of the page printing.
    * @see getPagePrintSettings
    */
  def setPagePrintSettings(aSettings: SeqEquiv[PropertyValue]): Unit
}

object XPagePrintable {
  @scala.inline
  def apply(
    PagePrintSettings: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPagePrintSettings: () => SafeArray[PropertyValue],
    printPages: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPagePrintSettings: SeqEquiv[PropertyValue] => Unit
  ): XPagePrintable = {
    val __obj = js.Dynamic.literal(PagePrintSettings = PagePrintSettings, acquire = js.Any.fromFunction0(acquire), getPagePrintSettings = js.Any.fromFunction0(getPagePrintSettings), printPages = js.Any.fromFunction1(printPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPagePrintSettings = js.Any.fromFunction1(setPagePrintSettings))
  
    __obj.asInstanceOf[XPagePrintable]
  }
}

