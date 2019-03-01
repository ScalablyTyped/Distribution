package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

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
  val UniqueNumericId: scala.Double
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
  def getUniqueNumericId(): scala.Double
  /**
    * Returns the resource's read only state
    * @returns `TRUE` if the resource is read only, otherwise `FALSE`
    */
  def isReadOnly(): scala.Boolean
  /**
    * Creates a new locale.
    *
    * For each existing ResourceID an empty string will be created. The first locale created will automatically be the first default locale. Otherwise
    * strings for all already created IDs will be copied from the default locale.
    * @throws com::sun::star::container::ElementExistException if the Locale already has been created.
    * @throws com::sun::star::lang::IllegalArgumentException if the Locale is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def newLocale(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * Removes a Resource ID including the corresponding string for the current locale.
    * @param ResourceID The Resource ID to be removed for the current locale.
    * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeId(ResourceID: java.lang.String): scala.Unit
  /**
    * Removes a Resource ID including the corresponding string for s specific locale.
    * @param ResourceID The Resource ID to be removed.
    * @param locale The locale the Resource ID should be removed for. The locale has to match exactly with one of the locales provided by {@link getLocales()}
    * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeIdForLocale(ResourceID: java.lang.String, locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * Removes a locale completely including the corresponding strings for each locale.
    * @throws com::sun::star::lang::IllegalArgumentException if the Locale to be removed is not supported.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def removeLocale(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * Sets the locale to be used
    * @param Locale Specifies the current locale to be used.
    * @param FindClosestMatch  If true: If the exact locale that should be set is not available the method tries to find the closest match. E.g. if en_US is r
    */
  def setCurrentLocale(
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    FindClosestMatch: scala.Boolean
  ): scala.Unit
  /**
    * Sets the default locale to be used
    * @param Locale Specifies the default locale to be used. If this locale is not available a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def setDefaultLocale(Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * Associates a String to a Resource ID for the current locale. If an entry for the Resource ID already exists, the string associated with it will be
    * overwritten, otherwise a new entry will be created.
    * @param ResourceID ID to address the string inside the resource for the current locale.
    * @param Str String to be associated with the Resource ID.
    * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
    */
  def setString(ResourceID: java.lang.String, Str: java.lang.String): scala.Unit
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
  def setStringForLocale(
    ResourceID: java.lang.String,
    Str: java.lang.String,
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Unit
}

object XStringResourceManager {
  @scala.inline
  def apply(
    CurrentLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    ResourceIDs: activexDashInteropLib.SafeArray[java.lang.String],
    UniqueNumericId: scala.Double,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    getCurrentLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getDefaultLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getResourceIDs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getResourceIDsForLocale: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getUniqueNumericId: js.Function0[scala.Double],
    hasEntryForId: js.Function1[java.lang.String, scala.Boolean],
    hasEntryForIdAndLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean
    ],
    isReadOnly: js.Function0[scala.Boolean],
    newLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeId: js.Function1[java.lang.String, scala.Unit],
    removeIdForLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    removeLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    resolveString: js.Function1[java.lang.String, java.lang.String],
    resolveStringForLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    setCurrentLocale: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Unit
    ],
    setDefaultLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setString: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStringForLocale: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ]
  ): XStringResourceManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentLocale")(CurrentLocale)
    __obj.updateDynamic("DefaultLocale")(DefaultLocale)
    __obj.updateDynamic("Locales")(Locales)
    __obj.updateDynamic("ResourceIDs")(ResourceIDs)
    __obj.updateDynamic("UniqueNumericId")(UniqueNumericId)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("getCurrentLocale")(getCurrentLocale)
    __obj.updateDynamic("getDefaultLocale")(getDefaultLocale)
    __obj.updateDynamic("getLocales")(getLocales)
    __obj.updateDynamic("getResourceIDs")(getResourceIDs)
    __obj.updateDynamic("getResourceIDsForLocale")(getResourceIDsForLocale)
    __obj.updateDynamic("getUniqueNumericId")(getUniqueNumericId)
    __obj.updateDynamic("hasEntryForId")(hasEntryForId)
    __obj.updateDynamic("hasEntryForIdAndLocale")(hasEntryForIdAndLocale)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("newLocale")(newLocale)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeId")(removeId)
    __obj.updateDynamic("removeIdForLocale")(removeIdForLocale)
    __obj.updateDynamic("removeLocale")(removeLocale)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("resolveString")(resolveString)
    __obj.updateDynamic("resolveStringForLocale")(resolveStringForLocale)
    __obj.updateDynamic("setCurrentLocale")(setCurrentLocale)
    __obj.updateDynamic("setDefaultLocale")(setDefaultLocale)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setStringForLocale")(setStringForLocale)
    __obj.asInstanceOf[XStringResourceManager]
  }
}

