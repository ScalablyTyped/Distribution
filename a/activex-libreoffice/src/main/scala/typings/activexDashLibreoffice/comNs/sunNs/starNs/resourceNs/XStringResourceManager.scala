package typings.activexDashLibreoffice.comNs.sunNs.starNs.resourceNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to manage a resource string table containing a set of strings for different locales.
  *
  * The interface is derived from {@link com.sun.star.resource.XStringResourceResolver} that allows to access the string table but not to modify it. This
  * interface also allows to modify the string table.
  *
  * It's designed to be used in the context of creating a string table, e.g. from a string table editor or from a Dialog Editor designing localized
  * dialogs.
  */
trait XStringResourceManager extends XStringResourceResolver {
  /**
    * Provides a numeric id that is unique within all Resource IDs used in the string table.
    *
    * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
    * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
    *
    * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
    * numeric id
    *
    * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
    * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
    * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
    *
    * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
    * implementation to load all locale data that may not have been loaded so far.
    * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
    */
  val UniqueNumericId: Double
  /**
    * Provides a numeric id that is unique within all Resource IDs used in the string table.
    *
    * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
    * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
    *
    * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
    * numeric id
    *
    * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
    * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
    * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
    *
    * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
    * implementation to load all locale data that may not have been loaded so far.
    * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
    */
  def getUniqueNumericId(): Double
  /**
    * Returns the resource's read only state
    * @returns `TRUE` if the resource is read only, otherwise `FALSE`
    */
  def isReadOnly(): Boolean
  /**
    * Creates a new locale.
    *
    * For each existing ResourceID an empty string will be created. The first locale created will automatically be the first default locale. Otherwise
    * strings for all already created IDs will be copied from the default locale.
    * @throws com::sun::star::container::ElementExistException if the Locale already has been created.
    * @throws com::sun::star::lang::IllegalArgumentException if the Locale is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def newLocale(locale: Locale): Unit
  /**
    * Removes a Resource ID including the corresponding string for the current locale.
    * @param ResourceID The Resource ID to be removed for the current locale.
    * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeId(ResourceID: String): Unit
  /**
    * Removes a Resource ID including the corresponding string for s specific locale.
    * @param ResourceID The Resource ID to be removed.
    * @param locale The locale the Resource ID should be removed for. The locale has to match exactly with one of the locales provided by {@link getLocales()}
    * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeIdForLocale(ResourceID: String, locale: Locale): Unit
  /**
    * Removes a locale completely including the corresponding strings for each locale.
    * @throws com::sun::star::lang::IllegalArgumentException if the Locale to be removed is not supported.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeLocale(locale: Locale): Unit
  /**
    * Sets the locale to be used
    * @param Locale Specifies the current locale to be used.
    * @param FindClosestMatch  If true: If the exact locale that should be set is not available the method tries to find the closest match. E.g. if en_US is r
    */
  def setCurrentLocale(Locale: Locale, FindClosestMatch: Boolean): Unit
  /**
    * Sets the default locale to be used
    * @param Locale Specifies the default locale to be used. If this locale is not available a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def setDefaultLocale(Locale: Locale): Unit
  /**
    * Associates a String to a Resource ID for the current locale. If an entry for the Resource ID already exists, the string associated with it will be
    * overwritten, otherwise a new entry will be created.
    * @param ResourceID ID to address the string inside the resource for the current locale.
    * @param Str String to be associated with the Resource ID.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def setString(ResourceID: String, Str: String): Unit
  /**
    * Associates a String to a Resource ID for a specific locale. If an entry for the Resource ID already exists, the string associated with it will be
    * overwritten, otherwise a new entry will be created.
    *
    * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
    * @param ResourceID ID to address the string inside the resource.
    * @param Str String to be associated with the Resource ID.
    * @param locale The locale the string should be set for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A clos
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def setStringForLocale(ResourceID: String, Str: String, locale: Locale): Unit
}

object XStringResourceManager {
  @scala.inline
  def apply(
    CurrentLocale: Locale,
    DefaultLocale: Locale,
    Locales: SafeArray[Locale],
    ResourceIDs: SafeArray[String],
    UniqueNumericId: Double,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    getCurrentLocale: () => Locale,
    getDefaultLocale: () => Locale,
    getLocales: () => SafeArray[Locale],
    getResourceIDs: () => SafeArray[String],
    getResourceIDsForLocale: Locale => SafeArray[String],
    getUniqueNumericId: () => Double,
    hasEntryForId: String => Boolean,
    hasEntryForIdAndLocale: (String, Locale) => Boolean,
    isReadOnly: () => Boolean,
    newLocale: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeId: String => Unit,
    removeIdForLocale: (String, Locale) => Unit,
    removeLocale: Locale => Unit,
    removeModifyListener: XModifyListener => Unit,
    resolveString: String => String,
    resolveStringForLocale: (String, Locale) => String,
    setCurrentLocale: (Locale, Boolean) => Unit,
    setDefaultLocale: Locale => Unit,
    setString: (String, String) => Unit,
    setStringForLocale: (String, String, Locale) => Unit
  ): XStringResourceManager = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale))
  
    __obj.asInstanceOf[XStringResourceManager]
  }
}

