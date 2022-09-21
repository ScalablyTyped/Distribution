package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.document.XStorageBasedDocument
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a container of StarBasic script libraries, which is to be made persistent in a sub storage of a document storage.
  * @since OOo 2.3
  */
trait DocumentScriptLibraryContainer
  extends StObject
     with XStorageBasedLibraryContainer {
  
  /**
    * creates an instance of the `DocumentScriptLibraryContainer` , belonging to a document
    *
    * The current storage of the document will be set as initial root storage (see XPersistentLibraryContainer::RootStorage) of the container.
    *
    * Usually, you will only create a `DocumentScriptLibraryContainer` within the implementation of the document to which the container should belong.
    * @param Document The document to which the container should belong to. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if `Document` does not denote a valid {@link com.sun.star.document.OfficeDocument} .
    */
  def create(Document: XStorageBasedDocument): Unit
  
  def createWithURL(URL: String): Unit
}
object DocumentScriptLibraryContainer {
  
  inline def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: Any,
    RootStorage: XStorage,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    create: XStorageBasedDocument => Unit,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    createWithURL: String => Unit,
    getByName: String => Any,
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
    queryInterface: `type` => Any,
    release: () => Unit,
    removeLibrary: String => Unit,
    removeModifyListener: XModifyListener => Unit,
    renameLibrary: (String, String) => Unit,
    setLibraryReadOnly: (String, Boolean) => Unit,
    setModified: Boolean => Unit,
    storeLibraries: () => Unit,
    storeLibrariesToStorage: XStorage => Unit
  ): DocumentScriptLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], RootStorage = RootStorage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), create = js.Any.fromFunction1(create), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), createWithURL = js.Any.fromFunction1(createWithURL), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries), storeLibrariesToStorage = js.Any.fromFunction1(storeLibrariesToStorage))
    __obj.asInstanceOf[DocumentScriptLibraryContainer]
  }
  
  extension [Self <: DocumentScriptLibraryContainer](x: Self) {
    
    inline def setCreate(value: XStorageBasedDocument => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateWithURL(value: String => Unit): Self = StObject.set(x, "createWithURL", js.Any.fromFunction1(value))
  }
}
