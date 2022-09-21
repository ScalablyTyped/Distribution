package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a service that allows to get access to a package using storage hierarchy.
  *
  * A root storage should be retrieved by using {@link StorageFactory} service. Substorages are created through {@link XStorage} interface of a parent
  * storage.
  */
trait Storage
  extends StObject
     with BaseStorage
     with XTransactedObject
     with XTransactionBroadcaster
     with XEncryptionProtectedSource {
  
  /**
    * allows to detect if the storage contains encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contain encrypted streams. Usually in case this property is supported the
    * implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasEncryptedEntries: Boolean
  
  /**
    * allows to detect if the storage contains non-encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contains non-encrypted streams. Usually in case this property is supported
    * the implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasNonEncryptedEntries: Boolean
  
  /** allows to detect whether the storage is a root one. */
  var IsRoot: Boolean
  
  /** allows to get and set the media type of the storage. */
  var MediaType: String
  
  /**
    * allows to detect whether mediatype is detected by using fallback approach.
    *
    * Can be set to true if the mediatype can not be detected in standard way, but there is a fallback solution allows to do it.
    *
    * Usually means that the document validity is questionable, although the package itself is not corrupted. The decision about document validity in this
    * case is in application hands. It is up to user of the storage to decide whether they accept the fallback approach for an implementation of this
    * service, outputs a warning or an error.
    */
  var MediaTypeFallbackIsUsed: Boolean
  
  /** allows to detect whether storage is open in "repair package" mode or not. */
  var RepairPackage: Boolean
  
  /** allows to get and set the version of the format related to the MediaType. */
  var Version: String
}
object Storage {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    HasEncryptedEntries: Boolean,
    HasNonEncryptedEntries: Boolean,
    IsRoot: Boolean,
    MediaType: String,
    MediaTypeFallbackIsUsed: Boolean,
    OpenMode: Double,
    PropertySetInfo: XPropertySetInfo,
    RepairPackage: Boolean,
    URL: String,
    Version: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addTransactionListener: XTransactionListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cloneEncryptedStreamElement: (String, String) => XStream,
    cloneStreamElement: String => XStream,
    commit: () => Unit,
    copyElementTo: (String, XStorage, String) => Unit,
    copyLastCommitTo: XStorage => Unit,
    copyStorageElementLastCommitTo: (String, XStorage) => Unit,
    copyToStorage: XStorage => Unit,
    dispose: () => Unit,
    getByName: String => Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isStorageElement: String => Boolean,
    isStreamElement: String => Boolean,
    moveElementTo: (String, XStorage, String) => Unit,
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeElement: String => Unit,
    removeEncryption: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTransactionListener: XTransactionListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    renameElement: (String, String) => Unit,
    revert: () => Unit,
    setEncryptionPassword: String => Unit,
    setPropertyValue: (String, Any) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HasEncryptedEntries = HasEncryptedEntries.asInstanceOf[js.Any], HasNonEncryptedEntries = HasNonEncryptedEntries.asInstanceOf[js.Any], IsRoot = IsRoot.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], MediaTypeFallbackIsUsed = MediaTypeFallbackIsUsed.asInstanceOf[js.Any], OpenMode = OpenMode.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepairPackage = RepairPackage.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addTransactionListener = js.Any.fromFunction1(addTransactionListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), commit = js.Any.fromFunction0(commit), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), renameElement = js.Any.fromFunction2(renameElement), revert = js.Any.fromFunction0(revert), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Storage]
  }
  
  extension [Self <: Storage](x: Self) {
    
    inline def setHasEncryptedEntries(value: Boolean): Self = StObject.set(x, "HasEncryptedEntries", value.asInstanceOf[js.Any])
    
    inline def setHasNonEncryptedEntries(value: Boolean): Self = StObject.set(x, "HasNonEncryptedEntries", value.asInstanceOf[js.Any])
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "IsRoot", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeFallbackIsUsed(value: Boolean): Self = StObject.set(x, "MediaTypeFallbackIsUsed", value.asInstanceOf[js.Any])
    
    inline def setRepairPackage(value: Boolean): Self = StObject.set(x, "RepairPackage", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
