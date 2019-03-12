package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a service that allows to get access to a package using storage hierarchy.
  *
  * A root storage should be retrieved by using {@link StorageFactory} service. Substorages are created through {@link XStorage} interface of a parent
  * storage.
  */
trait Storage
  extends BaseStorage
     with XTransactedObject
     with XTransactionBroadcaster
     with XEncryptionProtectedSource {
  /**
    * allows to detect if the storage contains encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contain encrypted streams. Usually in case this property is supported the
    * implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasEncryptedEntries: scala.Boolean
  /**
    * allows to detect if the storage contains non-encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contains non-encrypted streams. Usually in case this property is supported
    * the implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasNonEncryptedEntries: scala.Boolean
  /** allows to detect whether the storage is a root one. */
  var IsRoot: scala.Boolean
  /** allows to get and set the media type of the storage. */
  var MediaType: java.lang.String
  /**
    * allows to detect whether mediatype is detected by using fallback approach.
    *
    * Can be set to true if the mediatype can not be detected in standard way, but there is a fallback solution allows to do it.
    *
    * Usually means that the document validity is questionable, although the package itself is not corrupted. The decision about document validity in this
    * case is in application hands. It is up to user of the storage to decide whether he accepts the fallback approach for an implementation of this
    * service, outputs a warning or an error.
    */
  var MediaTypeFallbackIsUsed: scala.Boolean
  /** allows to detect whether storage is open in "repair package" mode or not. */
  var RepairPackage: scala.Boolean
  /** allows to get and set the version of the format related to the MediaType. */
  var Version: java.lang.String
}

object Storage {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    HasEncryptedEntries: scala.Boolean,
    HasNonEncryptedEntries: scala.Boolean,
    IsRoot: scala.Boolean,
    MediaType: java.lang.String,
    MediaTypeFallbackIsUsed: scala.Boolean,
    OpenMode: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RepairPackage: scala.Boolean,
    URL: java.lang.String,
    Version: java.lang.String,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addTransactionListener: XTransactionListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    cloneEncryptedStreamElement: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    cloneStreamElement: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    commit: () => scala.Unit,
    copyElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    copyLastCommitTo: XStorage => scala.Unit,
    copyStorageElementLastCommitTo: (java.lang.String, XStorage) => scala.Unit,
    copyToStorage: XStorage => scala.Unit,
    dispose: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isStorageElement: java.lang.String => scala.Boolean,
    isStreamElement: java.lang.String => scala.Boolean,
    moveElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    openEncryptedStreamElement: (java.lang.String, scala.Double, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openStorageElement: (java.lang.String, scala.Double) => XStorage,
    openStreamElement: (java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeElement: java.lang.String => scala.Unit,
    removeEncryption: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeTransactionListener: XTransactionListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    renameElement: (java.lang.String, java.lang.String) => scala.Unit,
    revert: () => scala.Unit,
    setEncryptionPassword: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, HasEncryptedEntries = HasEncryptedEntries, HasNonEncryptedEntries = HasNonEncryptedEntries, IsRoot = IsRoot, MediaType = MediaType, MediaTypeFallbackIsUsed = MediaTypeFallbackIsUsed, OpenMode = OpenMode, PropertySetInfo = PropertySetInfo, RepairPackage = RepairPackage, URL = URL, Version = Version, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addTransactionListener = js.Any.fromFunction1(addTransactionListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), commit = js.Any.fromFunction0(commit), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), renameElement = js.Any.fromFunction2(renameElement), revert = js.Any.fromFunction0(revert), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Storage]
  }
}

