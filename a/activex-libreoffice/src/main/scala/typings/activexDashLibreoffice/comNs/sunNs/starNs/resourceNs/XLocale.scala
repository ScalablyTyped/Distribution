package typings.activexDashLibreoffice.comNs.sunNs.starNs.resourceNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers some operations on {@link com.sun.star.lang.Locale} structures.
  * @see XResourceBundle
  * @see Locale
  */
trait XLocale extends XInterface {
  /** @returns a sequence of all locales which are available in the system. */
  val AvailableLocales: SafeArray[Locale]
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
  var Default: Locale
  /** @returns a sequence of all ISO country codes known to the component. */
  val ISOCountries: SafeArray[String]
  /** @returns a sequence of all ISO language codes known to the component. */
  val ISOLanguages: SafeArray[String]
  /**
    * creates a locale from language, country, and variant.
    *
    * NOTE: ISO 639 is not a stable standard; some of the language codes it defines (specifically iw, ji, and in) have changed. This constructor accepts
    * both the old codes (iw, ji, and in) and the new codes (he, yi, and id), but all other API on {@link XLocale} will return only the **NEW** codes.
    *
    * Note: The Java class `Locale` returns the **old** codes.
    */
  def create(aLanguage: String, aCountry: String, aVariant: String): Locale
  /** @returns `TRUE` if the {@link com.sun.star.lang.Locale}**l1** is equal to the other one.  A locale is deemed equal to another locale with identical langua */
  def equals(l1: Locale, l2: Locale): Boolean
  /** @returns a sequence of all locales which are available in the system. */
  def getAvailableLocales(): SafeArray[Locale]
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
  def getDefault(): Locale
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user country.
    * @returns country code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayCountry(locale: Locale, inLocale: Locale): String
  /** @returns country code for display of field to user. If the localized name is not found, returns the ISO code. The desired user country is from the default */
  def getDisplayCountry_Default(locale: Locale): String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user language.
    * @returns language code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayLanguage(locale: Locale, inLocale: Locale): String
  /** @returns language code for display of field to user. If the localized name is not found, returns the ISO code. The desired user language is from the defau */
  def getDisplayLanguage_Default(locale: Locale): String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes.
    */
  def getDisplayName(locale: Locale, inLocale: Locale): String
  /**
    * @param locale the locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes. The default locale is used for the present
    */
  def getDisplayName_Default(locale: Locale): String
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user variant.
    * @returns variant code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayVariant(locale: Locale, inLocale: Locale): String
  /** @returns variant code for display of field to user. The desired user variant is from the default locale. */
  def getDisplayVariant_Default(locale: Locale): String
  /** @returns the ISO country code for the specified locale. */
  def getISO3Country(locale: Locale): String
  /** @returns the ISO language code for the specified locale. */
  def getISO3Language(locale: Locale): String
  /** @returns a sequence of all ISO country codes known to the component. */
  def getISOCountries(): SafeArray[String]
  /** @returns a sequence of all ISO language codes known to the component. */
  def getISOLanguages(): SafeArray[String]
  /** @returns a sequence for language codes which are valid within the given country. */
  def getLanguagesForCountry(country: String): SafeArray[String]
  /**
    * sets the default locale for the whole environment.
    *
    * It is normally set once at the beginning of an application, then never reset. `setDefault` does not reset the host locale.
    */
  def setDefault(newLocale: Locale): Unit
}

object XLocale {
  @scala.inline
  def apply(
    AvailableLocales: SafeArray[Locale],
    Default: Locale,
    ISOCountries: SafeArray[String],
    ISOLanguages: SafeArray[String],
    acquire: () => Unit,
    create: (String, String, String) => Locale,
    equals: (Locale, Locale) => Boolean,
    getAvailableLocales: () => SafeArray[Locale],
    getDefault: () => Locale,
    getDisplayCountry: (Locale, Locale) => String,
    getDisplayCountry_Default: Locale => String,
    getDisplayLanguage: (Locale, Locale) => String,
    getDisplayLanguage_Default: Locale => String,
    getDisplayName: (Locale, Locale) => String,
    getDisplayName_Default: Locale => String,
    getDisplayVariant: (Locale, Locale) => String,
    getDisplayVariant_Default: Locale => String,
    getISO3Country: Locale => String,
    getISO3Language: Locale => String,
    getISOCountries: () => SafeArray[String],
    getISOLanguages: () => SafeArray[String],
    getLanguagesForCountry: String => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefault: Locale => Unit
  ): XLocale = {
    val __obj = js.Dynamic.literal(AvailableLocales = AvailableLocales, Default = Default, ISOCountries = ISOCountries, ISOLanguages = ISOLanguages, acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), equals = js.Any.fromFunction2(equals), getAvailableLocales = js.Any.fromFunction0(getAvailableLocales), getDefault = js.Any.fromFunction0(getDefault), getDisplayCountry = js.Any.fromFunction2(getDisplayCountry), getDisplayCountry_Default = js.Any.fromFunction1(getDisplayCountry_Default), getDisplayLanguage = js.Any.fromFunction2(getDisplayLanguage), getDisplayLanguage_Default = js.Any.fromFunction1(getDisplayLanguage_Default), getDisplayName = js.Any.fromFunction2(getDisplayName), getDisplayName_Default = js.Any.fromFunction1(getDisplayName_Default), getDisplayVariant = js.Any.fromFunction2(getDisplayVariant), getDisplayVariant_Default = js.Any.fromFunction1(getDisplayVariant_Default), getISO3Country = js.Any.fromFunction1(getISO3Country), getISO3Language = js.Any.fromFunction1(getISO3Language), getISOCountries = js.Any.fromFunction0(getISOCountries), getISOLanguages = js.Any.fromFunction0(getISOLanguages), getLanguagesForCountry = js.Any.fromFunction1(getLanguagesForCountry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefault = js.Any.fromFunction1(setDefault))
  
    __obj.asInstanceOf[XLocale]
  }
}

