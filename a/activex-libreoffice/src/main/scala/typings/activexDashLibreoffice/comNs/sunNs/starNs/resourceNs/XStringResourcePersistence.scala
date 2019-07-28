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
  def exportBinary(): SafeArray[Double]
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
  def importBinary(Data: SeqEquiv[Double]): Unit
  /**
    * provides the current modify state of the StringResourceManager instance.
    * @returns `TRUE` if the string table has changed since the last call to {@link store()} or, if supported `XStringResourceWithStorage::storeAsStorage` . `FA
    */
  def isModified(): Boolean
  /**
    * Sets the comment stored first in each locale data file.
    *
    * This interface method can be used to overwrite the comment used during initialization of the services {@link StringResourceWithLocation} or {@link
    * StringResourceWithStorage}
    * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
    */
  def setComment(Comment: String): Unit
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
  def store(): Unit
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
  def storeToStorage(Storage: XStorage, BaseName: String, Comment: String): Unit
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
  def storeToURL(URL: String, BaseName: String, Comment: String, Handler: XInteractionHandler): Unit
}

object XStringResourcePersistence {
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
    store: () => Unit,
    storeToStorage: (XStorage, String, String) => Unit,
    storeToURL: (String, String, String, XInteractionHandler) => Unit
  ): XStringResourcePersistence = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
  
    __obj.asInstanceOf[XStringResourcePersistence]
  }
}

