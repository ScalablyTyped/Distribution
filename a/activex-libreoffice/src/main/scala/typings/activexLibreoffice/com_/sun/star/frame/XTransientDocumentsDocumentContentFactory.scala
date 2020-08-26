package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.ucb.XContent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XTransientDocumentsDocumentContentFactory extends XInterface {
  /**
    * creates a {@link com.sun.star.ucb.TransientDocumentsDocumentContent} based on a given {@link com.sun.star.document.OfficeDocument} .
    * @param Model the document model for that a {@link com.sun.star.ucb.TransientDocumentsDocumentContent} is requested. The model must be an implementation
    * @returns a document content based on the given document model. The content must be an implementation of service {@link com.sun.star.ucb.TransientDocuments
    * @throws com::sun::star::lang::IllegalArgumentException if the document model cannot be associated with content for any reason.
    */
  def createDocumentContent(Model: XModel): XContent = js.native
}

object XTransientDocumentsDocumentContentFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDocumentContent: XModel => XContent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransientDocumentsDocumentContentFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDocumentContent = js.Any.fromFunction1(createDocumentContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransientDocumentsDocumentContentFactory]
  }
  @scala.inline
  implicit class XTransientDocumentsDocumentContentFactoryOps[Self <: XTransientDocumentsDocumentContentFactory] (val x: Self) extends AnyVal {
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
    def setCreateDocumentContent(value: XModel => XContent): Self = this.set("createDocumentContent", js.Any.fromFunction1(value))
  }
  
}

