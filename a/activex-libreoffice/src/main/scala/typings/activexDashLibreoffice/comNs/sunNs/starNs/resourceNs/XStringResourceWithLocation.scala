package typings.activexDashLibreoffice.comNs.sunNs.starNs.resourceNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends {@link XStringResourcePersistence} by methods to handle an associated location.
  * @see XStringResourcePersistence.
  */
trait XStringResourceWithLocation extends XStringResourcePersistence {
  /**
    * Associates a location to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
    * @param URL the location to be associated to the StringResourceManager  This call has to be used carefully as it removes the location previously connecte
    * @throws com::sun::star::lang::IllegalArgumentException if an empty string is passed as URL
    * @throws com::sun::star::lang::NoSupportException if the location is readonly
    */
  def setURL(URL: String): Unit
  /**
    * Stores all string table data to a location and associates this location to this instance as if setLocation() was called with this location. The
    * modified state will be unmodified after the call.
    * @param URL the location the string table data should be stored to.
    */
  def storeAsURL(URL: String): Unit
}

object XStringResourceWithLocation {
  @scala.inline
  def apply(
    CurrentLocale: Locale,
    DefaultLocale: Locale,
    Locales: SafeArray[Locale],
    ResourceIDs: SafeArray[String],
    UniqueNumericId: Double,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    exportBinary: () => SafeArray[Double],
    getCurrentLocale: () => Locale,
    getDefaultLocale: () => Locale,
    getLocales: () => SafeArray[Locale],
    getResourceIDs: () => SafeArray[String],
    getResourceIDsForLocale: Locale => SafeArray[String],
    getUniqueNumericId: () => Double,
    hasEntryForId: String => Boolean,
    hasEntryForIdAndLocale: (String, Locale) => Boolean,
    importBinary: SeqEquiv[Double] => Unit,
    isModified: () => Boolean,
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
    setComment: String => Unit,
    setCurrentLocale: (Locale, Boolean) => Unit,
    setDefaultLocale: Locale => Unit,
    setString: (String, String) => Unit,
    setStringForLocale: (String, String, Locale) => Unit,
    setURL: String => Unit,
    store: () => Unit,
    storeAsURL: String => Unit,
    storeToStorage: (XStorage, String, String) => Unit,
    storeToURL: (String, String, String, XInteractionHandler) => Unit
  ): XStringResourceWithLocation = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), setURL = js.Any.fromFunction1(setURL), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction1(storeAsURL), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
  
    __obj.asInstanceOf[XStringResourceWithLocation]
  }
}

