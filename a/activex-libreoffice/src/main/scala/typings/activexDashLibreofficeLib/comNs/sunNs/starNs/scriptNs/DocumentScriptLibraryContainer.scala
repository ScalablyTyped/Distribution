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

