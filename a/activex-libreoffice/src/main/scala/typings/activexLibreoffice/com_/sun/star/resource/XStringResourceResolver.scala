package typings.activexLibreoffice.com_.sun.star.resource

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XStringResourceResolver extends XModifyBroadcaster {
  
  /**
    * Returns the current locale specified in the accessed resource.
    *
    * If no locale is available, the returned Locale structure only contains empty strings.
    * @returns the used locale
    */
  val CurrentLocale: Locale = js.native
  
  /**
    * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
    * @returns the used locale
    */
  val DefaultLocale: Locale = js.native
  
  /**
    * Returns a sequence of all supported locales
    * @returns a sequence of all supported locales
    */
  val Locales: SafeArray[Locale] = js.native
  
  /**
    * Returns a sequence of all valid Resource IDs for the current locale
    * @returns a sequence of all valid Resource IDs
    */
  val ResourceIDs: SafeArray[String] = js.native
  
  /**
    * Returns the current locale specified in the accessed resource.
    *
    * If no locale is available, the returned Locale structure only contains empty strings.
    * @returns the used locale
    */
  def getCurrentLocale(): Locale = js.native
  
  /**
    * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
    * @returns the used locale
    */
  def getDefaultLocale(): Locale = js.native
  
  /**
    * Returns a sequence of all supported locales
    * @returns a sequence of all supported locales
    */
  def getLocales(): SafeArray[Locale] = js.native
  
  /**
    * Returns a sequence of all valid Resource IDs for the current locale
    * @returns a sequence of all valid Resource IDs
    */
  def getResourceIDs(): SafeArray[String] = js.native
  
  /**
    * Returns a sequence of all valid Resource IDs for a specific locale
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param locale The locale the ResourceIDs should be returned for. The locale has to match exactly with one of the locales provided by {@link getLocales()
    * @returns a sequence of all valid Resource IDs
    */
  def getResourceIDsForLocale(locale: Locale): SafeArray[String] = js.native
  
  /**
    * Checks if the resource contains an entry for the given ResourceID and current locale.
    * @param ResourceID ID to specify the string inside the resource.
    * @returns `TRUE` if an entry exists, otherwise `FALSE`
    */
  def hasEntryForId(ResourceID: String): Boolean = js.native
  
  /**
    * Checks if the resource contains an entry for the given ResourceID and locale.
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param ResourceID ID to specify the string inside the resource.
    * @param locale The locale the entry should be checked for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A c
    * @returns `TRUE` if an entry exists, otherwise `FALSE`
    */
  def hasEntryForIdAndLocale(ResourceID: String, locale: Locale): Boolean = js.native
  
  /**
    * Resolves the passed ResoureID for the current locale. This locale is set during initialization of the object implementing this interface or - in case
    * that also the interface {@link com.sun.star.resource.XStringResourceManager} is supported - by using the `XStringResourceManager::setLocale` method.
    * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
    * @returns the localized string for the specified ID
    * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID
    */
  def resolveString(ResourceID: String): String = js.native
  
  /**
    * Resolves the passed ResoureID for a specific locale.
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
    * @param locale The locale the string should be resolved for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A
    * @returns the localized string for the specified ID and Locale
    * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID or locale
    */
  def resolveStringForLocale(ResourceID: String, locale: Locale): String = js.native
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
  
  @scala.inline
  implicit class XStringResourceResolverOps[Self <: XStringResourceResolver] (val x: Self) extends AnyVal {
    
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
    def setCurrentLocale(value: Locale): Self = this.set("CurrentLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocale(value: Locale): Self = this.set("DefaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocales(value: SafeArray[Locale]): Self = this.set("Locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIDs(value: SafeArray[String]): Self = this.set("ResourceIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentLocale(value: () => Locale): Self = this.set("getCurrentLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultLocale(value: () => Locale): Self = this.set("getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocales(value: () => SafeArray[Locale]): Self = this.set("getLocales", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResourceIDs(value: () => SafeArray[String]): Self = this.set("getResourceIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResourceIDsForLocale(value: Locale => SafeArray[String]): Self = this.set("getResourceIDsForLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasEntryForId(value: String => Boolean): Self = this.set("hasEntryForId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasEntryForIdAndLocale(value: (String, Locale) => Boolean): Self = this.set("hasEntryForIdAndLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveString(value: String => String): Self = this.set("resolveString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveStringForLocale(value: (String, Locale) => String): Self = this.set("resolveStringForLocale", js.Any.fromFunction2(value))
  }
}
