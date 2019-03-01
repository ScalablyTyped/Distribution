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
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    ResourceIDs: activexDashInteropLib.SafeArray[java.lang.String],
    UniqueNumericId: scala.Double,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    exportBinary: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
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
    importBinary: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    isModified: js.Function0[scala.Boolean],
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
    setComment: js.Function1[java.lang.String, scala.Unit],
    setCurrentLocale: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Unit
    ],
    setDefaultLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    setString: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStringForLocale: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    store: js.Function0[scala.Unit],
    storeAsStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    storeToStorage: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    storeToURL: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ]
  ): XStringResourceWithStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentLocale")(CurrentLocale)
    __obj.updateDynamic("DefaultLocale")(DefaultLocale)
    __obj.updateDynamic("Locales")(Locales)
    __obj.updateDynamic("ResourceIDs")(ResourceIDs)
    __obj.updateDynamic("UniqueNumericId")(UniqueNumericId)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("exportBinary")(exportBinary)
    __obj.updateDynamic("getCurrentLocale")(getCurrentLocale)
    __obj.updateDynamic("getDefaultLocale")(getDefaultLocale)
    __obj.updateDynamic("getLocales")(getLocales)
    __obj.updateDynamic("getResourceIDs")(getResourceIDs)
    __obj.updateDynamic("getResourceIDsForLocale")(getResourceIDsForLocale)
    __obj.updateDynamic("getUniqueNumericId")(getUniqueNumericId)
    __obj.updateDynamic("hasEntryForId")(hasEntryForId)
    __obj.updateDynamic("hasEntryForIdAndLocale")(hasEntryForIdAndLocale)
    __obj.updateDynamic("importBinary")(importBinary)
    __obj.updateDynamic("isModified")(isModified)
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
    __obj.updateDynamic("setComment")(setComment)
    __obj.updateDynamic("setCurrentLocale")(setCurrentLocale)
    __obj.updateDynamic("setDefaultLocale")(setDefaultLocale)
    __obj.updateDynamic("setStorage")(setStorage)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setStringForLocale")(setStringForLocale)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeAsStorage")(storeAsStorage)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.updateDynamic("storeToURL")(storeToURL)
    __obj.asInstanceOf[XStringResourceWithStorage]
  }
}

