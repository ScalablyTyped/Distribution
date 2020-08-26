package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
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
@js.native
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
  var RootStorage: XStorage = js.native
  /**
    * stores the libraries to a storage other than the current container storage
    *
    * Note that the library container is not automatically associated with the new root storage. Instead, you need to manually set the RootStorage attribute
    * afterwards. This separation allows for Save-To as well Save-As operations.
    * @param RootStorage denotes the root storage into which the libraries should be written, which must not be `NULL` . ;  Note that the actual libraries are
    * @throws com::sun::star::lang::IllegalArgumentException if the `RootStorage` parameter is `NULL` , or equals {@link RootStorage} .
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibrariesToStorage(RootStorage: XStorage): Unit = js.native
}

object XStorageBasedLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: js.Any,
    RootStorage: XStorage,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLibraryLinkURL: String => String,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isLibraryLink: String => Boolean,
    isLibraryLoaded: String => Boolean,
    isLibraryReadOnly: String => Boolean,
    isModified: () => Boolean,
    loadLibrary: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLibrary: String => Unit,
    removeModifyListener: XModifyListener => Unit,
    renameLibrary: (String, String) => Unit,
    setLibraryReadOnly: (String, Boolean) => Unit,
    setModified: Boolean => Unit,
    storeLibraries: () => Unit,
    storeLibrariesToStorage: XStorage => Unit
  ): XStorageBasedLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], RootStorage = RootStorage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries), storeLibrariesToStorage = js.Any.fromFunction1(storeLibrariesToStorage))
    __obj.asInstanceOf[XStorageBasedLibraryContainer]
  }
  @scala.inline
  implicit class XStorageBasedLibraryContainerOps[Self <: XStorageBasedLibraryContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRootStorage(value: XStorage): Self = this.set("RootStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreLibrariesToStorage(value: XStorage => Unit): Self = this.set("storeLibrariesToStorage", js.Any.fromFunction1(value))
  }
  
}

