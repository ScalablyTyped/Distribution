package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies if a password for opening or modifying a document is requested.
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @see com.sun.star.task.PasswordRequest
  * @see com.sun.star.task.DocumentPasswordRequest
  * @since OOo 3.3
  */
trait DocumentPasswordRequest2 extends DocumentPasswordRequest {
  /** specifies if the requested password is for opening a document or for modifying it. */
  var IsRequestPasswordToModify: scala.Boolean
}

object DocumentPasswordRequest2 {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    IsRequestPasswordToModify: scala.Boolean,
    Message: java.lang.String,
    Mode: PasswordRequestMode,
    Name: java.lang.String
  ): DocumentPasswordRequest2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("IsRequestPasswordToModify")(IsRequestPasswordToModify)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("Mode")(Mode)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DocumentPasswordRequest2]
  }
}

