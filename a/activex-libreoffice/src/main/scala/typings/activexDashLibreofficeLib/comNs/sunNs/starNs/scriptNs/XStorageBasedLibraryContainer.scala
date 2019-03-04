package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface for an {@link XLibraryContainer} which can be made persistent in an {@link com.sun.star.embed.XStorage} .
  *
  * A persistent library container is associated with a root storage. The container is responsible for a particular sub storage of the root storage, the
  * container storage.
  * @since OOo 2.3
  */
trait XStorageBasedLibraryContainer extends XPersistentLibraryContainer {
  /**
    * denotes the root storage associated with the container.
    *
    * Effectively, this attribute is a typed version of {@link XPersistentLibraryContainer.RootLocation} , it's guaranteed that at every time,
    * `XPersistentLibraryContainer::RootLocation` and `RootStorage` have the same value.
    *
    * You should only **set** this attribute to a new value if you previously called storeLibrariesToStorage with the same storage. Setting this attribute
    * to a storage into which the container has not been stored previously might result in unexpected behavior.
    */
  var RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  /**
    * stores the libraries to a storage other than the current container storage
    *
    * Note that the library container is not automatically associated with the new root storage. Instead, you need to manually set the RootStorage attribute
    * afterwards. This separation allows for Save-To as well Save-As operations.
    * @param RootStorage denotes the root storage into which the libraries should be written, which must not be `NULL` . ;  Note that the actual libraries are
    * @throws com::sun::star::lang::IllegalArgumentException if the `RootStorage` parameter is `NULL` , or equals {@link RootStorage} .
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibrariesToStorage(RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XStorageBasedLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    createLibrary: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
    ],
    createLibraryLink: js.Function3[
      java.lang.String, 
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
    ],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLibraryLinkURL: js.Function1[java.lang.String, java.lang.String],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isLibraryLink: js.Function1[java.lang.String, scala.Boolean],
    isLibraryLoaded: js.Function1[java.lang.String, scala.Boolean],
    isLibraryReadOnly: js.Function1[java.lang.String, scala.Boolean],
    isModified: js.Function0[scala.Boolean],
    loadLibrary: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLibrary: js.Function1[java.lang.String, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    renameLibrary: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setLibraryReadOnly: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    setModified: js.Function1[scala.Boolean, scala.Unit],
    storeLibraries: js.Function0[scala.Unit],
    storeLibrariesToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XStorageBasedLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName, ElementNames = ElementNames, ElementType = ElementType, RootLocation = RootLocation, RootStorage = RootStorage, acquire = acquire, addModifyListener = addModifyListener, createLibrary = createLibrary, createLibraryLink = createLibraryLink, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getLibraryLinkURL = getLibraryLinkURL, hasByName = hasByName, hasElements = hasElements, isLibraryLink = isLibraryLink, isLibraryLoaded = isLibraryLoaded, isLibraryReadOnly = isLibraryReadOnly, isModified = isModified, loadLibrary = loadLibrary, queryInterface = queryInterface, release = release, removeLibrary = removeLibrary, removeModifyListener = removeModifyListener, renameLibrary = renameLibrary, setLibraryReadOnly = setLibraryReadOnly, setModified = setModified, storeLibraries = storeLibraries, storeLibrariesToStorage = storeLibrariesToStorage)
  
    __obj.asInstanceOf[XStorageBasedLibraryContainer]
  }
}

