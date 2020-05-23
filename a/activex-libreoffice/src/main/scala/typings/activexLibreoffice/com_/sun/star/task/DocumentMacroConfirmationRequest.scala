package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.security.DocumentSignatureInformation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the request to approve or deny the execution of macros contained in a document. */
trait DocumentMacroConfirmationRequest extends ClassifiedInteractionRequest {
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
}

