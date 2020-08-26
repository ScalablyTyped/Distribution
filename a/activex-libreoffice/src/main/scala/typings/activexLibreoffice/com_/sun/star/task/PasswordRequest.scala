package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a password. Continuations for using with the mentioned service
  * are Abort and Approve.
  */
@js.native
trait PasswordRequest extends ClassifiedInteractionRequest {
  /**
    * the mode in which password should be asked
    * @see com.sun.star.task.PasswordRequestMode
    */
  var Mode: PasswordRequestMode = js.native
}

object PasswordRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    Mode: PasswordRequestMode
  ): PasswordRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRequest]
  }
  @scala.inline
  implicit class PasswordRequestOps[Self <: PasswordRequest] (val x: Self) extends AnyVal {
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
    def setMode(value: PasswordRequestMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
  }
  
}

