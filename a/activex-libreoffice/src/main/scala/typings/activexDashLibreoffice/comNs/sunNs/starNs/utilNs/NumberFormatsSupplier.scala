package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides an supplier of number formats
  * @see NumberFormats
  * @see NumberFormatter
  * @since OOo 1.1.2
  */
trait NumberFormatsSupplier extends XNumberFormatsSupplier {
  /** Create using default locale. */
  def createWithDefaultLocale(): Unit
  /**
    * Create using specific locale.
    * @param Locale the locale of the number formats supplier
    */
  def createWithLocale(Locale: Locale): Unit
}

object NumberFormatsSupplier {
  @scala.inline
  def apply(
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: () => Unit,
    createWithDefaultLocale: () => Unit,
    createWithLocale: Locale => Unit,
    getNumberFormatSettings: () => XPropertySet,
    getNumberFormats: () => XNumberFormats,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): NumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings, NumberFormats = NumberFormats, acquire = js.Any.fromFunction0(acquire), createWithDefaultLocale = js.Any.fromFunction0(createWithDefaultLocale), createWithLocale = js.Any.fromFunction1(createWithLocale), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[NumberFormatsSupplier]
  }
}

