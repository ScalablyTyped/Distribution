package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the {@link XDocumentProperties} instance of a document.
  *
  * A {@link DocumentProperties} instance is available on loaded documents via this supplier interface.
  * @see XDocumentProperties
  * @see DocumentProperties
  * @since OOo 3.0
  */
trait XDocumentPropertiesSupplier extends js.Object {
  /**
    * provides the document properties object.
    * @returns an object of type {@link XDocumentProperties}
    */
  val DocumentProperties: XDocumentProperties
  /**
    * provides the document properties object.
    * @returns an object of type {@link XDocumentProperties}
    */
  def getDocumentProperties(): XDocumentProperties
}

object XDocumentPropertiesSupplier {
  @scala.inline
  def apply(DocumentProperties: XDocumentProperties, getDocumentProperties: () => XDocumentProperties): XDocumentPropertiesSupplier = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties, getDocumentProperties = js.Any.fromFunction0(getDocumentProperties))
  
    __obj.asInstanceOf[XDocumentPropertiesSupplier]
  }
}

