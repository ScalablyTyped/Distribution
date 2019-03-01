package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a container of StarBasic script libraries, which is to be made persistent in a sub storage of a document storage.
  * @since OOo 2.3
  */
trait DocumentScriptLibraryContainer extends XStorageBasedLibraryContainer {
  /**
    * creates an instance of the `DocumentScriptLibraryContainer` , belonging to a document
    *
    * The current storage of the document will be set as initial root storage (see XPersistentLibraryContainer::RootStorage) of the container.
    *
    * Usually, you will only create a `DocumentScriptLibraryContainer` within the implementation of the document to which the container should belong.
    * @param Document The document to which the container should belong to. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if `Document` does not denote a valid {@link com.sun.star.document.OfficeDocument} .
    */
  def create(Document: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument): scala.Unit
  def createWithURL(URL: java.lang.String): scala.Unit
}

object DocumentScriptLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    RootStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    create: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument, 
      scala.Unit
    ],
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
    createWithURL: js.Function1[java.lang.String, scala.Unit],
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
  ): DocumentScriptLibraryContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainerLocationName")(ContainerLocationName)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("RootLocation")(RootLocation)
    __obj.updateDynamic("RootStorage")(RootStorage)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createLibrary")(createLibrary)
    __obj.updateDynamic("createLibraryLink")(createLibraryLink)
    __obj.updateDynamic("createWithURL")(createWithURL)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getLibraryLinkURL")(getLibraryLinkURL)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isLibraryLink")(isLibraryLink)
    __obj.updateDynamic("isLibraryLoaded")(isLibraryLoaded)
    __obj.updateDynamic("isLibraryReadOnly")(isLibraryReadOnly)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("loadLibrary")(loadLibrary)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeLibrary")(removeLibrary)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("renameLibrary")(renameLibrary)
    __obj.updateDynamic("setLibraryReadOnly")(setLibraryReadOnly)
    __obj.updateDynamic("setModified")(setModified)
    __obj.updateDynamic("storeLibraries")(storeLibraries)
    __obj.updateDynamic("storeLibrariesToStorage")(storeLibrariesToStorage)
    __obj.asInstanceOf[DocumentScriptLibraryContainer]
  }
}

