package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @since OOo 1.1.2
  */
trait DocumentPasswordRequest extends PasswordRequest {
  /** the name of the document (more properly, the URL of the document) */
  var Name: java.lang.String
}

object DocumentPasswordRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Mode: PasswordRequestMode,
    Name: java.lang.String
  ): DocumentPasswordRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Mode = Mode, Name = Name)
  
    __obj.asInstanceOf[DocumentPasswordRequest]
  }
}

