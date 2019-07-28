package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies the mode in which the password for Microsoft Office file format encryption should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @since OOo 3.2
  */
trait DocumentMSPasswordRequest extends PasswordRequest {
  /** the name of the document (more properly, the URL of the document) */
  var Name: String
}

object DocumentMSPasswordRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentMSPasswordRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Mode = Mode, Name = Name)
  
    __obj.asInstanceOf[DocumentMSPasswordRequest]
  }
}

