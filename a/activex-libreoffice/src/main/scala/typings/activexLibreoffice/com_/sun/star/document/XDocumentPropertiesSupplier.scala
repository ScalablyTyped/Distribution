package typings.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the {@link XDocumentProperties} instance of a document.
  *
  * A {@link DocumentProperties} instance is available on loaded documents via this supplier interface.
  * @see XDocumentProperties
  * @see DocumentProperties
  * @since OOo 3.0
  */
trait XDocumentPropertiesSupplier extends StObject {
  
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
  
  inline def apply(DocumentProperties: XDocumentProperties, getDocumentProperties: () => XDocumentProperties): XDocumentPropertiesSupplier = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties.asInstanceOf[js.Any], getDocumentProperties = js.Any.fromFunction0(getDocumentProperties))
    __obj.asInstanceOf[XDocumentPropertiesSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDocumentPropertiesSupplier] (val x: Self) extends AnyVal {
    
    inline def setDocumentProperties(value: XDocumentProperties): Self = StObject.set(x, "DocumentProperties", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentProperties(value: () => XDocumentProperties): Self = StObject.set(x, "getDocumentProperties", js.Any.fromFunction0(value))
  }
}
