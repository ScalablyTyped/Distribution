package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access locale specific data as it is defined in XML locale data files compiled into the binary data libraries liblocaledata*.so respectively
  * localedata*.dll.
  *
  * For XML locale data files definitions see [the DTD file]{@link
  * url="http://cgit.freedesktop.org/libreoffice/core/tree/i18npool/source/localedata/data/locale.dtd"} .
  */
@js.native
trait XLocaleData extends XInterface {
  
  /** returns all available locales. */
  val AllInstalledLocaleNames: SafeArray[Locale] = js.native
  
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars(aLocale: Locale): SafeArray[Calendar] = js.native
  
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies(aLocale: Locale): SafeArray[Currency] = js.native
  
  /** returns all LC_FORMAT format elements for a locale. */
  def getAllFormats(aLocale: Locale): SafeArray[FormatElement] = js.native
  
  /** returns all available locales. */
  def getAllInstalledLocaleNames(): SafeArray[Locale] = js.native
  
  /** returns all LC_COLLATION collation options for a locale. */
  def getCollationOptions(aLocale: Locale): SafeArray[String] = js.native
  
  /** returns all LC_COLLATION collators for a locale. */
  def getCollatorImplementations(aLocale: Locale): SafeArray[Implementation] = js.native
  
  /** returns all LC_MISC forbidden characters for a locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters = js.native
  
  /** returns the LC_INFO locale information. */
  def getLanguageCountryInfo(aLocale: Locale): LanguageCountryInfo = js.native
  
  /** returns LC_CTYPE separators and markers. */
  def getLocaleItem(aLocale: Locale): LocaleDataItem = js.native
  
  /**
    * returns all LC_MISC reserved words for a locale.
    * @see reservedWords
    */
  def getReservedWord(aLocale: Locale): SafeArray[String] = js.native
  
  /** returns all LC_SEARCH search options for a locale. */
  def getSearchOptions(aLocale: Locale): SafeArray[String] = js.native
  
  /** returns all LC_TRANSLITERATION transliterations for a locale. */
  def getTransliterations(aLocale: Locale): SafeArray[String] = js.native
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
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLocaleData]
  }
  
  @scala.inline
  implicit class XLocaleDataOps[Self <: XLocaleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllInstalledLocaleNames(value: SafeArray[Locale]): Self = this.set("AllInstalledLocaleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllCalendars(value: Locale => SafeArray[Calendar]): Self = this.set("getAllCalendars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllCurrencies(value: Locale => SafeArray[Currency]): Self = this.set("getAllCurrencies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllFormats(value: Locale => SafeArray[FormatElement]): Self = this.set("getAllFormats", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllInstalledLocaleNames(value: () => SafeArray[Locale]): Self = this.set("getAllInstalledLocaleNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCollationOptions(value: Locale => SafeArray[String]): Self = this.set("getCollationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCollatorImplementations(value: Locale => SafeArray[Implementation]): Self = this.set("getCollatorImplementations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetForbiddenCharacters(value: Locale => ForbiddenCharacters): Self = this.set("getForbiddenCharacters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLanguageCountryInfo(value: Locale => LanguageCountryInfo): Self = this.set("getLanguageCountryInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocaleItem(value: Locale => LocaleDataItem): Self = this.set("getLocaleItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetReservedWord(value: Locale => SafeArray[String]): Self = this.set("getReservedWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSearchOptions(value: Locale => SafeArray[String]): Self = this.set("getSearchOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTransliterations(value: Locale => SafeArray[String]): Self = this.set("getTransliterations", js.Any.fromFunction1(value))
  }
}
