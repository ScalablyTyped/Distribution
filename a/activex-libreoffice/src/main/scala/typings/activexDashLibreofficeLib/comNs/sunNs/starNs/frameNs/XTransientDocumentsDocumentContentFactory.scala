package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a factory for com::sun::star::ucb::TransientDocumentsDocumentContents.
  * @author Kai Sommerfeld
  * @see com.sun.star.document.OfficeDocument
  * @see com.sun.star.ucb.TransientDocumentsDocumentContent
  * @since OOo 2.0
  * @version 1.0
  */
trait XTransientDocumentsDocumentContentFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a {@link com.sun.star.ucb.TransientDocumentsDocumentContent} based on a given {@link com.sun.star.document.OfficeDocument} .
    * @param Model the document model for that a {@link com.sun.star.ucb.TransientDocumentsDocumentContent} is requested. The model must be an implementation
    * @returns a document content based on the given document model. The content must be an implementation of service {@link com.sun.star.ucb.TransientDocuments
    * @throws com::sun::star::lang::IllegalArgumentException if the document model cannot be associated with content for any reason.
    */
  def createDocumentContent(Model: XModel): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent
}

object XTransientDocumentsDocumentContentFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createDocumentContent: XModel => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTransientDocumentsDocumentContentFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDocumentContent = js.Any.fromFunction1(createDocumentContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransientDocumentsDocumentContentFactory]
  }
}

