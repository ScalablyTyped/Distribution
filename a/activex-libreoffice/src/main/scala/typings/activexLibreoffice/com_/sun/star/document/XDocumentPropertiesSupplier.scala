package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the {@link XDocumentProperties} instance of a document.
  *
  * A {@link DocumentProperties} instance is available on loaded documents via this supplier interface.
  * @see XDocumentProperties
  * @see DocumentProperties
  * @since OOo 3.0
  */
@js.native
trait XDocumentPropertiesSupplier extends js.Object {
  
  /**
    * provides the document properties object.
    * @returns an object of type {@link XDocumentProperties}
    */
  val DocumentProperties: XDocumentProperties = js.native
  
  /**
    * provides the document properties object.
    * @returns an object of type {@link XDocumentProperties}
    */
  def getDocumentProperties(): XDocumentProperties = js.native
}
object XDocumentPropertiesSupplier {
  
  @scala.inline
  def apply(DocumentProperties: XDocumentProperties, getDocumentProperties: () => XDocumentProperties): XDocumentPropertiesSupplier = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties.asInstanceOf[js.Any], getDocumentProperties = js.Any.fromFunction0(getDocumentProperties))
    __obj.asInstanceOf[XDocumentPropertiesSupplier]
  }
  
  @scala.inline
  implicit class XDocumentPropertiesSupplierOps[Self <: XDocumentPropertiesSupplier] (val x: Self) extends AnyVal {
    
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
    def setDocumentProperties(value: XDocumentProperties): Self = this.set("DocumentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDocumentProperties(value: () => XDocumentProperties): Self = this.set("getDocumentProperties", js.Any.fromFunction0(value))
  }
}
