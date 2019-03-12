package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data as it is defined in XML locale data files compiled into the binary data libraries liblocaledata*.so respectively
  * localedata*.dll.
  *
  * For XML locale data files definitions see [the DTD file]{@link
  * url="http://cgit.freedesktop.org/libreoffice/core/tree/i18npool/source/localedata/data/locale.dtd"} .
  */
trait XLocaleData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all available locales. */
  val AllInstalledLocaleNames: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[Calendar]
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[Currency]
  /** returns all LC_FORMAT format elements for a locale. */
  def getAllFormats(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[FormatElement]
  /** returns all available locales. */
  def getAllInstalledLocaleNames(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns all LC_COLLATION collation options for a locale. */
  def getCollationOptions(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /** returns all LC_COLLATION collators for a locale. */
  def getCollatorImplementations(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[Implementation]
  /** returns all LC_MISC forbidden characters for a locale. */
  def getForbiddenCharacters(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): ForbiddenCharacters
  /** returns the LC_INFO locale information. */
  def getLanguageCountryInfo(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): LanguageCountryInfo
  /** returns LC_CTYPE separators and markers. */
  def getLocaleItem(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): LocaleDataItem
  /**
    * returns all LC_MISC reserved words for a locale.
    * @see reservedWords
    */
  def getReservedWord(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /** returns all LC_SEARCH search options for a locale. */
  def getSearchOptions(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /** returns all LC_TRANSLITERATION transliterations for a locale. */
  def getTransliterations(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
}

object XLocaleData {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: () => scala.Unit,
    getAllCalendars: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Calendar],
    getAllCurrencies: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[Currency],
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
  ): XLocaleData = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocaleData]
  }
}

