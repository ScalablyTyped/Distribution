package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.security.DocumentSignatureInformation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the request to approve or deny the execution of macros contained in a document. */
trait DocumentMacroConfirmationRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** contains information about the signatures in the document */
  var DocumentSignatureInformation: SafeArray[typings.activexLibreoffice.com_.sun.star.security.DocumentSignatureInformation]
  
  /**
    * refers to the storage related to the last committed version of the document.
    *
    * This storage is necessary e.g. for displaying the existing signatures to the user, to allow them a decision whether or not to trust those signatures
    * and thus the signed macros.
    * @see com.sun.star.security.XDocumentDigitalSignatures.showScriptingContentSignatures
    */
  var DocumentStorage: XStorage
  
  /** specifies the URL of the document which contains macros whose execution should be approved or rejected. */
  var DocumentURL: String
  
  /** contains information about the ODF version of the document */
  var DocumentVersion: String
}
object DocumentMacroConfirmationRequest {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    DocumentSignatureInformation: SafeArray[DocumentSignatureInformation],
    DocumentStorage: XStorage,
    DocumentURL: String,
    DocumentVersion: String,
    Message: String
  ): DocumentMacroConfirmationRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], DocumentSignatureInformation = DocumentSignatureInformation.asInstanceOf[js.Any], DocumentStorage = DocumentStorage.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], DocumentVersion = DocumentVersion.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMacroConfirmationRequest]
  }
  
  @scala.inline
  implicit class DocumentMacroConfirmationRequestMutableBuilder[Self <: DocumentMacroConfirmationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSignatureInformation(value: SafeArray[DocumentSignatureInformation]): Self = StObject.set(x, "DocumentSignatureInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStorage(value: XStorage): Self = StObject.set(x, "DocumentStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersion(value: String): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
  }
}
