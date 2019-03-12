package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData3} this provides an additional method to return a sequence of date acceptance patterns for a locale.
  * @since LibreOffice 3.6
  */
trait XLocaleData4 extends XLocaleData3 {
  /**
    * returns a sequence of date acceptance patterns for a locale
    *
    * Patterns with input combinations that are accepted as incomplete date input, such as **M/D** or **D.M.**
    */
  def getDateAcceptancePatterns(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
}

object XLocaleData4 {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: () => scala.Unit,
    getAllCalendars: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Calendar],
    getAllCalendars2: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Calendar2],
    getAllCurrencies: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Currency],
    getAllCurrencies2: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Currency2],
    getAllFormats: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[FormatElement],
    getAllInstalledLocaleNames: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getCollationOptions: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getCollatorImplementations: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Implementation],
    getDateAcceptancePatterns: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => ForbiddenCharacters,
    getLanguageCountryInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => LanguageCountryInfo,
    getLocaleItem: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => LocaleDataItem,
    getReservedWord: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getSearchOptions: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getTransliterations: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLocaleData4 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCalendars2 = js.Any.fromFunction1(getAllCalendars2), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getDateAcceptancePatterns = js.Any.fromFunction1(getDateAcceptancePatterns), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocaleData4]
  }
}

