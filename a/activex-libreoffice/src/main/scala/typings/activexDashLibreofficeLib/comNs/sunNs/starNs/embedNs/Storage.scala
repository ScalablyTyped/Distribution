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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addTransactionListener: js.Function1[XTransactionListener, scala.Unit],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    cloneEncryptedStreamElement: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    cloneStreamElement: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    commit: js.Function0[scala.Unit],
    copyElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    copyLastCommitTo: js.Function1[XStorage, scala.Unit],
    copyStorageElementLastCommitTo: js.Function2[java.lang.String, XStorage, scala.Unit],
    copyToStorage: js.Function1[XStorage, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isStorageElement: js.Function1[java.lang.String, scala.Boolean],
    isStreamElement: js.Function1[java.lang.String, scala.Boolean],
    moveElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    openEncryptedStreamElement: js.Function3[
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    openStorageElement: js.Function2[java.lang.String, scala.Double, XStorage],
    openStreamElement: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeElement: js.Function1[java.lang.String, scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeTransactionListener: js.Function1[XTransactionListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    renameElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    revert: js.Function0[scala.Unit],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("HasEncryptedEntries")(HasEncryptedEntries)
    __obj.updateDynamic("HasNonEncryptedEntries")(HasNonEncryptedEntries)
    __obj.updateDynamic("IsRoot")(IsRoot)
    __obj.updateDynamic("MediaType")(MediaType)
    __obj.updateDynamic("MediaTypeFallbackIsUsed")(MediaTypeFallbackIsUsed)
    __obj.updateDynamic("OpenMode")(OpenMode)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RepairPackage")(RepairPackage)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("Version")(Version)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addTransactionListener")(addTransactionListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("cloneEncryptedStreamElement")(cloneEncryptedStreamElement)
    __obj.updateDynamic("cloneStreamElement")(cloneStreamElement)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("copyElementTo")(copyElementTo)
    __obj.updateDynamic("copyLastCommitTo")(copyLastCommitTo)
    __obj.updateDynamic("copyStorageElementLastCommitTo")(copyStorageElementLastCommitTo)
    __obj.updateDynamic("copyToStorage")(copyToStorage)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isStorageElement")(isStorageElement)
    __obj.updateDynamic("isStreamElement")(isStreamElement)
    __obj.updateDynamic("moveElementTo")(moveElementTo)
    __obj.updateDynamic("openEncryptedStreamElement")(openEncryptedStreamElement)
    __obj.updateDynamic("openStorageElement")(openStorageElement)
    __obj.updateDynamic("openStreamElement")(openStreamElement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeElement")(removeElement)
    __obj.updateDynamic("removeEncryption")(removeEncryption)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeTransactionListener")(removeTransactionListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("renameElement")(renameElement)
    __obj.updateDynamic("revert")(revert)
    __obj.updateDynamic("setEncryptionPassword")(setEncryptionPassword)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[Storage]
  }
}

