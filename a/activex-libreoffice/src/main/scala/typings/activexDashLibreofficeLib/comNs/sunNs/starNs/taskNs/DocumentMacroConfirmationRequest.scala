package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the request to approve or deny the execution of macros contained in a document. */
trait DocumentMacroConfirmationRequest extends ClassifiedInteractionRequest {
  /** contains information about the signatures in the document */
  var DocumentSignatureInformation: activexDashInteropLib.SafeArray[
    activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.DocumentSignatureInformation
  ]
  /**
    * refers to the storage related to the last committed version of the document.
    *
    * This storage is necessary e.g. for displaying the existing signatures to the user, to allow him a decision whether or not to trust those signatures
    * and thus the signed macros.
    * @see com.sun.star.security.XDocumentDigitalSignatures.showScriptingContentSignatures
    */
  var DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  /** specifies the URL of the document which contains macros whose execution should be approved or rejected. */
  var DocumentURL: java.lang.String
  /** contains information about the ODF version of the document */
  var DocumentVersion: java.lang.String
}

object DocumentMacroConfirmationRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DocumentSignatureInformation: activexDashInteropLib.SafeArray[
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.DocumentSignatureInformation
    ],
    DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    DocumentURL: java.lang.String,
    DocumentVersion: java.lang.String,
    Message: java.lang.String
  ): DocumentMacroConfirmationRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, DocumentSignatureInformation = DocumentSignatureInformation, DocumentStorage = DocumentStorage, DocumentURL = DocumentURL, DocumentVersion = DocumentVersion, Message = Message)
  
    __obj.asInstanceOf[DocumentMacroConfirmationRequest]
  }
}

