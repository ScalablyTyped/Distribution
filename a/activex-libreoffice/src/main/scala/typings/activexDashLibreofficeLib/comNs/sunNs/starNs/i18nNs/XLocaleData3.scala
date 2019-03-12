package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData2} this provides an additional method to return a sequence of all {@link com.sun.star.i18n.Calendar2}
  * elements available for that locale.
  * @since LibreOffice 3.5
  */
trait XLocaleData3 extends XLocaleData2 {
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars2(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[Calendar2]
}

object XLocaleData3 {
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
    getForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => ForbiddenCharacters,
    getLanguageCountryInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => LanguageCountryInfo,
    getLocaleItem: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => LocaleDataItem,
    getReservedWord: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getSearchOptions: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getTransliterations: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLocaleData3 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCalendars2 = js.Any.fromFunction1(getAllCalendars2), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocaleData3]
  }
}

