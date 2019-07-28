package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XLocaleData extends XInterface {
  /** returns all available locales. */
  val AllInstalledLocaleNames: SafeArray[Locale]
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars(aLocale: Locale): SafeArray[Calendar]
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies(aLocale: Locale): SafeArray[Currency]
  /** returns all LC_FORMAT format elements for a locale. */
  def getAllFormats(aLocale: Locale): SafeArray[FormatElement]
  /** returns all available locales. */
  def getAllInstalledLocaleNames(): SafeArray[Locale]
  /** returns all LC_COLLATION collation options for a locale. */
  def getCollationOptions(aLocale: Locale): SafeArray[String]
  /** returns all LC_COLLATION collators for a locale. */
  def getCollatorImplementations(aLocale: Locale): SafeArray[Implementation]
  /** returns all LC_MISC forbidden characters for a locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters
  /** returns the LC_INFO locale information. */
  def getLanguageCountryInfo(aLocale: Locale): LanguageCountryInfo
  /** returns LC_CTYPE separators and markers. */
  def getLocaleItem(aLocale: Locale): LocaleDataItem
  /**
    * returns all LC_MISC reserved words for a locale.
    * @see reservedWords
    */
  def getReservedWord(aLocale: Locale): SafeArray[String]
  /** returns all LC_SEARCH search options for a locale. */
  def getSearchOptions(aLocale: Locale): SafeArray[String]
  /** returns all LC_TRANSLITERATION transliterations for a locale. */
  def getTransliterations(aLocale: Locale): SafeArray[String]
}

object XLocaleData {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: SafeArray[Locale],
    acquire: () => Unit,
    getAllCalendars: Locale => SafeArray[Calendar],
    getAllCurrencies: Locale => SafeArray[Currency],
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
  ): XLocaleData = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocaleData]
  }
}

