package typings.activexLibreoffice.com_.sun.star.resource

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to access strings in a resource.
  *
  * The interface is derived from {@link com.sun.star.util.XModifyBroadcaster}
  *
  * All registered {@link com.sun.star.util.XModifyListener} interfaces will be notified if either the current locale changes or if a string is added,
  * changed or removed. This usually will only happen if the implementing object also supports the interface {@link
  * com.sun.star.resource.XStringResourceManager} and is used in the design mode of a Dialog or String table editor. But also changing the locale at
  * runtime can be supported in this way.
  */
trait XStringResourceResolver extends XModifyBroadcaster {
  /**
    * Returns the current locale specified in the accessed resource.
    *
    * If no locale is available, the returned Locale structure only contains empty strings.
    * @returns the used locale
    */
  val CurrentLocale: Locale
  /**
    * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
    * @returns the used locale
    */
  val DefaultLocale: Locale
  /**
    * Returns a sequence of all supported locales
    * @returns a sequence of all supported locales
    */
  val Locales: SafeArray[Locale]
  /**
    * Returns a sequence of all valid Resource IDs for the current locale
    * @returns a sequence of all valid Resource IDs
    */
  val ResourceIDs: SafeArray[String]
  /**
    * Returns the current locale specified in the accessed resource.
    *
    * If no locale is available, the returned Locale structure only contains empty strings.
    * @returns the used locale
    */
  def getCurrentLocale(): Locale
  /**
    * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
    * @returns the used locale
    */
  def getDefaultLocale(): Locale
  /**
    * Returns a sequence of all supported locales
    * @returns a sequence of all supported locales
    */
  def getLocales(): SafeArray[Locale]
  /**
    * Returns a sequence of all valid Resource IDs for the current locale
    * @returns a sequence of all valid Resource IDs
    */
  def getResourceIDs(): SafeArray[String]
  /**
    * Returns a sequence of all valid Resource IDs for a specific locale
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param locale The locale the ResourceIDs should be returned for. The locale has to match exactly with one of the locales provided by {@link getLocales()
    * @returns a sequence of all valid Resource IDs
    */
  def getResourceIDsForLocale(locale: Locale): SafeArray[String]
  /**
    * Checks if the resource contains an entry for the given ResourceID and current locale.
    * @param ResourceID ID to specify the string inside the resource.
    * @returns `TRUE` if an entry exists, otherwise `FALSE`
    */
  def hasEntryForId(ResourceID: String): Boolean
  /**
    * Checks if the resource contains an entry for the given ResourceID and locale.
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param ResourceID ID to specify the string inside the resource.
    * @param locale The locale the entry should be checked for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A c
    * @returns `TRUE` if an entry exists, otherwise `FALSE`
    */
  def hasEntryForIdAndLocale(ResourceID: String, locale: Locale): Boolean
  /**
    * Resolves the passed ResoureID for the current locale. This locale is set during initialization of the object implementing this interface or - in case
    * that also the interface {@link com.sun.star.resource.XStringResourceManager} is supported - by using the `XStringResourceManager::setLocale` method.
    * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
    * @returns the localized string for the specified ID
    * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID
    */
  def resolveString(ResourceID: String): String
  /**
    * Resolves the passed ResoureID for a specific locale.
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
    * @param locale The locale the string should be resolved for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A
    * @returns the localized string for the specified ID and Locale
    * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID or locale
    */
  def resolveStringForLocale(ResourceID: String, locale: Locale): String
}

object XStringResourceResolver {
  @scala.inline
  def apply(
    CurrentLocale: Locale,
    DefaultLocale: Locale,
    Locales: SafeArray[Locale],
    ResourceIDs: SafeArray[String],
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    getCurrentLocale: () => Locale,
    getDefaultLocale: () => Locale,
    getLocales: () => SafeArray[Locale],
    getResourceIDs: () => SafeArray[String],
    getResourceIDsForLocale: Locale => SafeArray[String],
    hasEntryForId: String => Boolean,
    hasEntryForIdAndLocale: (String, Locale) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    resolveString: String => String,
    resolveStringForLocale: (String, Locale) => String
  ): XStringResourceResolver = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale))
    __obj.asInstanceOf[XStringResourceResolver]
  }
}

