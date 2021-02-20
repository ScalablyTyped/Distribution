package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData} and provides an additional method to return a sequence of all {@link com.sun.star.i18n.Currency2}
  * elements available for that locale.
  * @since OOo 2.0.3
  */
@js.native
trait XLocaleData2 extends XLocaleData {
  
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies2(aLocale: Locale): SafeArray[Currency2] = js.native
}
object XLocaleData2 {
  
  @scala.inline
  def apply(
    AllInstalledLocaleNames: SafeArray[Locale],
    acquire: () => Unit,
    getAllCalendars: Locale => SafeArray[Calendar],
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
  ): XLocaleData2 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLocaleData2]
  }
  
  @scala.inline
  implicit class XLocaleData2MutableBuilder[Self <: XLocaleData2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllCurrencies2(value: Locale => SafeArray[Currency2]): Self = StObject.set(x, "getAllCurrencies2", js.Any.fromFunction1(value))
  }
}
