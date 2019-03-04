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
  def getDateAcceptancePatterns(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
}

object XLocaleData4 {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    getAllCalendars: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Calendar]
    ],
    getAllCalendars2: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Calendar2]
    ],
    getAllCurrencies: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Currency]
    ],
    getAllCurrencies2: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Currency2]
    ],
    getAllFormats: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[FormatElement]
    ],
    getAllInstalledLocaleNames: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getCollationOptions: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getCollatorImplementations: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Implementation]
    ],
    getDateAcceptancePatterns: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getForbiddenCharacters: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, ForbiddenCharacters],
    getLanguageCountryInfo: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, LanguageCountryInfo],
    getLocaleItem: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, LocaleDataItem],
    getReservedWord: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getSearchOptions: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getTransliterations: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLocaleData4 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = acquire, getAllCalendars = getAllCalendars, getAllCalendars2 = getAllCalendars2, getAllCurrencies = getAllCurrencies, getAllCurrencies2 = getAllCurrencies2, getAllFormats = getAllFormats, getAllInstalledLocaleNames = getAllInstalledLocaleNames, getCollationOptions = getCollationOptions, getCollatorImplementations = getCollatorImplementations, getDateAcceptancePatterns = getDateAcceptancePatterns, getForbiddenCharacters = getForbiddenCharacters, getLanguageCountryInfo = getLanguageCountryInfo, getLocaleItem = getLocaleItem, getReservedWord = getReservedWord, getSearchOptions = getSearchOptions, getTransliterations = getTransliterations, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLocaleData4]
  }
}

