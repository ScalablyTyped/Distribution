package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies if a password for opening or modifying of an encrypted Microsoft Office document is requested.
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @see com.sun.star.task.PasswordRequest
  * @see com.sun.star.task.DocumentMSPasswordRequest
  * @since OOo 3.3
  */
trait DocumentMSPasswordRequest2 extends DocumentMSPasswordRequest {
  /** specifies if the requested password is for opening a document or for modifying it. */
  var IsRequestPasswordToModify: Boolean
}

object DocumentMSPasswordRequest2 {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    IsRequestPasswordToModify: Boolean,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentMSPasswordRequest2 = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, IsRequestPasswordToModify = IsRequestPasswordToModify, Message = Message, Mode = Mode, Name = Name)
  
    __obj.asInstanceOf[DocumentMSPasswordRequest2]
  }
}

