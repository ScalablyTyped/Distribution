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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    createLibrary: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    createLibraryLink: (java.lang.String, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLibraryLinkURL: java.lang.String => java.lang.String,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isLibraryLink: java.lang.String => scala.Boolean,
    isLibraryLoaded: java.lang.String => scala.Boolean,
    isLibraryReadOnly: java.lang.String => scala.Boolean,
    isModified: () => scala.Boolean,
    loadLibrary: java.lang.String => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeLibrary: java.lang.String => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    renameLibrary: (java.lang.String, java.lang.String) => scala.Unit,
    setLibraryReadOnly: (java.lang.String, scala.Boolean) => scala.Unit,
    setModified: scala.Boolean => scala.Unit,
    storeLibraries: () => scala.Unit,
    storeLibrariesToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XStorageBasedLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName, ElementNames = ElementNames, ElementType = ElementType, RootLocation = RootLocation, RootStorage = RootStorage, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries), storeLibrariesToStorage = js.Any.fromFunction1(storeLibrariesToStorage))
  
    __obj.asInstanceOf[XStorageBasedLibraryContainer]
  }
}

