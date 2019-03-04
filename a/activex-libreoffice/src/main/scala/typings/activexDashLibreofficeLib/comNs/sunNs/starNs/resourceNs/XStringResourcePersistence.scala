package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface derived from {@link XStringResourceManager} containing basic persistence functionality limited to operations that are independent from a
  * associated location or storage.
  * @see XStringResourceManager.
  */
trait XStringResourcePersistence extends XStringResourceManager {
  /**
    * Returns a sequence of byte representing the complete string resource in a binary format.
    *
    * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
    * interfaces.
    *
    * See {@link importBinary()} ).
    * @returns a sequence of byte representing the string resource.
    */
  def exportBinary(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Initializes the string resource with binary data. This method expects the data format returned by {@link exportBinary()} .
    *
    * All locales and strings previously added to the string resource will be deleted. So after calling this method the string resource only contains the
    * locales and strings specified in the binary data.
    *
    * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
    * interfaces.
    *
    * See {@link importBinary()} ).
    * @throws com::sun::star::lang::IllegalArgumentException if Data is empty or does not meet the binary format returned by the current or earlier version of
    */
  def importBinary(Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * provides the current modify state of the StringResourceManager instance.
    * @returns `TRUE` if the string table has changed since the last call to {@link store()} or, if supported `XStringResourceWithStorage::storeAsStorage` . `FA
    */
  def isModified(): scala.Boolean
  /**
    * Sets the comment stored first in each locale data file.
    *
    * This interface method can be used to overwrite the comment used during initialization of the services {@link StringResourceWithLocation} or {@link
    * StringResourceWithStorage}
    * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
    */
  def setComment(Comment: java.lang.String): scala.Unit
  /**
    * Stores all string table data respectively all data modified since the last call to {@link store()} to the location or storage associated with the
    * StringResourceManager. Each locale is stored in a single file following the format of Java properties files.
    *
    * This interface is supported by the services {@link StringResourceWithLocation} and {@link StringResourceWithStorage}
    *
    * The {@link StringResourceWithLocation} is initialized with an URL specifying a location used to load data from and store data to, see {@link
    * StringResourceWithLocation} .
    *
    * The {@link StringResourceWithStorage} is initialized with an instance of {@link com.sun.star.embed.XStorage} used to load data from and store data to,
    * see {@link StringResourceWithStorage} .
    *
    * If the string table isn't modified (see {@link isModified()} ) this method does nothing.
    *
    * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage} respectively a {@link
    * com.sun.star.ucb.CommandAbortedException} in case of a {@link StringResourceWithLocation} for all exceptions that are not handled by a previously
    * specified {@link com.sun.star.task.XInteractionHandler} . The handler to be used for the store operation can be specified during initialization of
    * {@link StringResourceWithLocation} .
    * @throws com::sun::star::lang::NoSupportException if no URL or no valid storage are provided.
    */
  def store(): scala.Unit
  /**
    * Stores all string table data to the provided storage.
    *
    * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
    * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
    *
    * This method can be used to make a copy of the current string table data to a storage. This method can throw all exceptions thrown by the methods of
    * {@link com.sun.star.embed.XStorage}
    * @param Storage all string table data will be stored to this storage.
    * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
    * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} . This method can throw all exceptions
    */
  def storeToStorage(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    BaseName: java.lang.String,
    Comment: java.lang.String
  ): scala.Unit
  /**
    * Stores all string table data to the location specified by the passed URL string.
    *
    * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
    * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
    *
    * This method can be used to make a copy of the current string table data to a location.
    * @param URL the location the string table data should be stored to.
    * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
    * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} .
    * @param Handler a {@link com.sun.star.task.XInteractionHandler} . It will be passed to ucb handle exceptions. Exceptions not processed by this handler wi
    * @see com.sun.star.task.InteractionHandler
    */
  def storeToURL(
    URL: java.lang.String,
    BaseName: java.lang.String,
    Comment: java.lang.String,
    Handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
}

object XStringResourcePersistence {
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
    setString: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStringForLocale: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    store: js.Function0[scala.Unit],
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
  ): XStringResourcePersistence = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = acquire, addModifyListener = addModifyListener, exportBinary = exportBinary, getCurrentLocale = getCurrentLocale, getDefaultLocale = getDefaultLocale, getLocales = getLocales, getResourceIDs = getResourceIDs, getResourceIDsForLocale = getResourceIDsForLocale, getUniqueNumericId = getUniqueNumericId, hasEntryForId = hasEntryForId, hasEntryForIdAndLocale = hasEntryForIdAndLocale, importBinary = importBinary, isModified = isModified, isReadOnly = isReadOnly, newLocale = newLocale, queryInterface = queryInterface, release = release, removeId = removeId, removeIdForLocale = removeIdForLocale, removeLocale = removeLocale, removeModifyListener = removeModifyListener, resolveString = resolveString, resolveStringForLocale = resolveStringForLocale, setComment = setComment, setCurrentLocale = setCurrentLocale, setDefaultLocale = setDefaultLocale, setString = setString, setStringForLocale = setStringForLocale, store = store, storeToStorage = storeToStorage, storeToURL = storeToURL)
  
    __obj.asInstanceOf[XStringResourcePersistence]
  }
}

