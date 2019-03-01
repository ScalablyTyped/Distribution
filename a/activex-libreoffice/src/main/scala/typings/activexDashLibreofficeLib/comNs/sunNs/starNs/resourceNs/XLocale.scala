package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers some operations on {@link com.sun.star.lang.Locale} structures.
  * @see XResourceBundle
  * @see Locale
  */
trait XLocale
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of all locales which are available in the system. */
  val AvailableLocales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /**
    * the common method of getting the current default locale.
    *
    * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
    * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
    *
    * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
    *
    * ;  Note that the initial setting will match the host system.
    */
  var Default: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns a sequence of all ISO country codes known to the component. */
  val ISOCountries: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns a sequence of all ISO language codes known to the component. */
  val ISOLanguages: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * creates a locale from language, country, and variant.
    *
    * NOTE: ISO 639 is not a stable standard; some of the language codes it defines (specifically iw, ji, and in) have changed. This constructor accepts
    * both the old codes (iw, ji, and in) and the new codes (he, yi, and id), but all other API on {@link XLocale} will return only the **NEW** codes.
    *
    * Note: The Java class `Locale` returns the **old** codes.
    */
  def create(aLanguage: java.lang.String, aCountry: java.lang.String, aVariant: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns `TRUE` if the {@link com.sun.star.lang.Locale}**l1** is equal to the other one.  A locale is deemed equal to another locale with identical langua */
  def equals(
    l1: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    l2: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Boolean
  /** @returns a sequence of all locales which are available in the system. */
  def getAvailableLocales(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /**
    * the common method of getting the current default locale.
    *
    * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
    * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
    *
    * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
    *
    * ;  Note that the initial setting will match the host system.
    */
  def getDefault(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user country.
    * @returns country code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayCountry(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    inLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** @returns country code for display of field to user. If the localized name is not found, returns the ISO code. The desired user country is from the default */
  def getDisplayCountry_Default(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user language.
    * @returns language code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayLanguage(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    inLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** @returns language code for display of field to user. If the localized name is not found, returns the ISO code. The desired user language is from the defau */
  def getDisplayLanguage_Default(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes.
    */
  def getDisplayName(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    inLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /**
    * @param locale the locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes. The default locale is used for the present
    */
  def getDisplayName_Default(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user variant.
    * @returns variant code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayVariant(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    inLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** @returns variant code for display of field to user. The desired user variant is from the default locale. */
  def getDisplayVariant_Default(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /** @returns the ISO country code for the specified locale. */
  def getISO3Country(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /** @returns the ISO language code for the specified locale. */
  def getISO3Language(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /** @returns a sequence of all ISO country codes known to the component. */
  def getISOCountries(): activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns a sequence of all ISO language codes known to the component. */
  def getISOLanguages(): activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns a sequence for language codes which are valid within the given country. */
  def getLanguagesForCountry(country: java.lang.String): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * sets the default locale for the whole environment.
    *
    * It is normally set once at the beginning of an application, then never reset. `setDefault` does not reset the host locale.
    */
  def setDefault(newLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

object XLocale {
  @scala.inline
  def apply(
    AvailableLocales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    Default: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    ISOCountries: activexDashInteropLib.SafeArray[java.lang.String],
    ISOLanguages: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    create: js.Function3[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
    ],
    equals: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean
    ],
    getAvailableLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getDefault: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getDisplayCountry: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    getDisplayCountry_Default: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getDisplayLanguage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    getDisplayLanguage_Default: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getDisplayName: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    getDisplayName_Default: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getDisplayVariant: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    getDisplayVariant_Default: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getISO3Country: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getISO3Language: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getISOCountries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getISOLanguages: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getLanguagesForCountry: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefault: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit]
  ): XLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AvailableLocales")(AvailableLocales)
    __obj.updateDynamic("Default")(Default)
    __obj.updateDynamic("ISOCountries")(ISOCountries)
    __obj.updateDynamic("ISOLanguages")(ISOLanguages)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("getAvailableLocales")(getAvailableLocales)
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.updateDynamic("getDisplayCountry")(getDisplayCountry)
    __obj.updateDynamic("getDisplayCountry_Default")(getDisplayCountry_Default)
    __obj.updateDynamic("getDisplayLanguage")(getDisplayLanguage)
    __obj.updateDynamic("getDisplayLanguage_Default")(getDisplayLanguage_Default)
    __obj.updateDynamic("getDisplayName")(getDisplayName)
    __obj.updateDynamic("getDisplayName_Default")(getDisplayName_Default)
    __obj.updateDynamic("getDisplayVariant")(getDisplayVariant)
    __obj.updateDynamic("getDisplayVariant_Default")(getDisplayVariant_Default)
    __obj.updateDynamic("getISO3Country")(getISO3Country)
    __obj.updateDynamic("getISO3Language")(getISO3Language)
    __obj.updateDynamic("getISOCountries")(getISOCountries)
    __obj.updateDynamic("getISOLanguages")(getISOLanguages)
    __obj.updateDynamic("getLanguagesForCountry")(getLanguagesForCountry)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDefault")(setDefault)
    __obj.asInstanceOf[XLocale]
  }
}

