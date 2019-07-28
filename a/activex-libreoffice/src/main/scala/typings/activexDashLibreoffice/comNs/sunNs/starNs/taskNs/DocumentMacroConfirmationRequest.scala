package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs.DocumentSignatureInformation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the request to approve or deny the execution of macros contained in a document. */
trait DocumentMacroConfirmationRequest extends ClassifiedInteractionRequest {
  /** contains information about the signatures in the document */
  var DocumentSignatureInformation: SafeArray[
    typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs.DocumentSignatureInformation
  ]
  /**
    * refers to the storage related to the last committed version of the document.
    *
    * This storage is necessary e.g. for displaying the existing signatures to the user, to allow him a decision whether or not to trust those signatures
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
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, DocumentSignatureInformation = DocumentSignatureInformation, DocumentStorage = DocumentStorage, DocumentURL = DocumentURL, DocumentVersion = DocumentVersion, Message = Message)
  
    __obj.asInstanceOf[DocumentMacroConfirmationRequest]
  }
}

