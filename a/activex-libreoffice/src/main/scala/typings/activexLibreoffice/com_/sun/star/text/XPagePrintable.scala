package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print several pages on one printer page. */
trait XPagePrintable
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    PagePrintSettings: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPagePrintSettings: () => SafeArray[PropertyValue],
    printPages: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setPagePrintSettings: SeqEquiv[PropertyValue] => Unit
  ): XPagePrintable = {
    val __obj = js.Dynamic.literal(PagePrintSettings = PagePrintSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPagePrintSettings = js.Any.fromFunction0(getPagePrintSettings), printPages = js.Any.fromFunction1(printPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPagePrintSettings = js.Any.fromFunction1(setPagePrintSettings))
    __obj.asInstanceOf[XPagePrintable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPagePrintable] (val x: Self) extends AnyVal {
    
    inline def setGetPagePrintSettings(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPagePrintSettings", js.Any.fromFunction0(value))
    
    inline def setPagePrintSettings(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PagePrintSettings", value.asInstanceOf[js.Any])
    
    inline def setPrintPages(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "printPages", js.Any.fromFunction1(value))
    
    inline def setSetPagePrintSettings(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setPagePrintSettings", js.Any.fromFunction1(value))
  }
}
