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
  val AllInstalledLocaleNames: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Calendar]
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Currency]
  /** returns all LC_FORMAT format elements for a locale. */
  def getAllFormats(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[FormatElement]
  /** returns all available locales. */
  def getAllInstalledLocaleNames(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns all LC_COLLATION collation options for a locale. */
  def getCollationOptions(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
  /** returns all LC_COLLATION collators for a locale. */
  def getCollatorImplementations(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Implementation]
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
  def getReservedWord(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
  /** returns all LC_SEARCH search options for a locale. */
  def getSearchOptions(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
  /** returns all LC_TRANSLITERATION transliterations for a locale. */
  def getTransliterations(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
}

