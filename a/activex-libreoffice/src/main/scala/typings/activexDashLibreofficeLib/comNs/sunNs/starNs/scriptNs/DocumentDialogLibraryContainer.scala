package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a container of dialog libraries, which is to be made persistent in a sub storage of a document storage.
  * @since OOo 2.3
  */
trait DocumentDialogLibraryContainer extends XStorageBasedLibraryContainer {
  /**
    * creates an instance of the `DocumentDialogLibraryContainer` , belonging to a document
    *
    * The current storage of the document will be set as initial root storage (see XPersistentLibraryContainer::RootStorage) of the container.
    *
    * Usually, you will only create a `DocumentDialogLibraryContainer` within the implementation of the document to which the container should belong.
    * @param Document The document to which the container should belong to. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if `Document` does not denote a valid {@link com.sun.star.document.OfficeDocument} .
    */
  def create(Document: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument): scala.Unit
  def createWithURL(URL: java.lang.String): scala.Unit
}

object DocumentDialogLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: java.lang.String,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    create: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument => scala.Unit,
    createLibrary: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    createLibraryLink: (java.lang.String, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    createWithURL: java.lang.String => scala.Unit,
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
  ): DocumentDialogLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName, ElementNames = ElementNames, ElementType = ElementType, RootLocation = RootLocation, RootStorage = RootStorage, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), create = js.Any.fromFunction1(create), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), createWithURL = js.Any.fromFunction1(createWithURL), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries), storeLibrariesToStorage = js.Any.fromFunction1(storeLibrariesToStorage))
  
    __obj.asInstanceOf[DocumentDialogLibraryContainer]
  }
}

