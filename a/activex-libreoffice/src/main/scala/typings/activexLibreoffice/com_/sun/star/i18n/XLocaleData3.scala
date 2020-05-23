package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
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
  def getAllCalendars2(aLocale: Locale): SafeArray[Calendar2]
}

object XLocaleData3 {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: SafeArray[Locale],
    acquire: () => Unit,
    getAllCalendars: Locale => SafeArray[Calendar],
    getAllCalendars2: Locale => SafeArray[Calendar2],
    getAllCurrencies: Locale => SafeArray[Currency],
    getAllCurrencies2: Locale => SafeArray[Currency2],
    getAllFormats: Locale => SafeArray[FormatElement],
    getAllInstalledLocaleNames: () => SafeArray[Locale],
    getCollationOptions: Locale => SafeArray[String],
    getCollatorImplementations: Locale => SafeArray[Implementation],
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    getLanguageCountryInfo: Locale => LanguageCountryInfo,
    getLocaleItem: Locale => LocaleDataItem,
    getReservedWord: Locale => SafeArray[String],
    getSearchOptions: Locale => SafeArray[String],
    getTransliterations: Locale => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLocaleData3 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCalendars2 = js.Any.fromFunction1(getAllCalendars2), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLocaleData3]
  }
}

