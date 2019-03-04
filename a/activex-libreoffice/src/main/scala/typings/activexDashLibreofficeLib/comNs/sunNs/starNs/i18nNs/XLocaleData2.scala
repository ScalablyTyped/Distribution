package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData} and provides an additional method to return a sequence of all {@link com.sun.star.i18n.Currency2}
  * elements available for that locale.
  * @since OOo 2.0.3
  */
trait XLocaleData2 extends XLocaleData {
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies2(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Currency2]
}

object XLocaleData2 {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    getAllCalendars: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[Calendar]
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
  ): XLocaleData2 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames, acquire = acquire, getAllCalendars = getAllCalendars, getAllCurrencies = getAllCurrencies, getAllCurrencies2 = getAllCurrencies2, getAllFormats = getAllFormats, getAllInstalledLocaleNames = getAllInstalledLocaleNames, getCollationOptions = getCollationOptions, getCollatorImplementations = getCollatorImplementations, getForbiddenCharacters = getForbiddenCharacters, getLanguageCountryInfo = getLanguageCountryInfo, getLocaleItem = getLocaleItem, getReservedWord = getReservedWord, getSearchOptions = getSearchOptions, getTransliterations = getTransliterations, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLocaleData2]
  }
}

