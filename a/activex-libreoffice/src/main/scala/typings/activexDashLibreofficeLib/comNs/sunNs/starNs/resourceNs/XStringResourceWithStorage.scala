package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends {@link XStringResourcePersistence} by methods to handle an associated {@link com.sun.star.embed.XStorage} instance.
  * @see XStringResourcePersistence.
  */
trait XStringResourceWithStorage extends XStringResourcePersistence {
  /**
    * Associates a storage to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
    * @param Storage the storage to be associated to the StringResourceManager  This call has to be used carefully as it removes the storage previously connec
    * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
    */
  def setStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
  /**
    * Stores all string table data to a storage and associates this storage to this instance as if {@link setStorage()} was called with this storage. The
    * modified state will be unmodified after the call.
    *
    * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage}
    */
  def storeAsStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XStringResourceWithStorage {
  @scala.inline
  def apply(
    CurrentLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Locales: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    ResourceIDs: stdLib.SafeArray[java.lang.String],
    UniqueNumericId: scala.Double,
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    exportBinary: () => stdLib.SafeArray[scala.Double],
    getCurrentLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getDefaultLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocales: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getResourceIDs: () => stdLib.SafeArray[java.lang.String],
    getResourceIDsForLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getUniqueNumericId: () => scala.Double,
    hasEntryForId: java.lang.String => scala.Boolean,
    hasEntryForIdAndLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Boolean,
    importBinary: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    newLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeId: java.lang.String => scala.Unit,
    removeIdForLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    removeLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    resolveString: java.lang.String => java.lang.String,
    resolveStringForLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    setComment: java.lang.String => scala.Unit,
    setCurrentLocale: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => scala.Unit,
    setDefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    setString: (java.lang.String, java.lang.String) => scala.Unit,
    setStringForLocale: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    store: () => scala.Unit,
    storeAsStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    storeToStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, java.lang.String, java.lang.String) => scala.Unit,
    storeToURL: (java.lang.String, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit
  ): XStringResourceWithStorage = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setStorage = js.Any.fromFunction1(setStorage), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeAsStorage = js.Any.fromFunction1(storeAsStorage), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
  
    __obj.asInstanceOf[XStringResourceWithStorage]
  }
}

