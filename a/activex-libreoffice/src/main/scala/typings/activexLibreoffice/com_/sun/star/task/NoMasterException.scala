package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a master password is needed but not available/correct. */
@js.native
trait NoMasterException extends Exception {
  /** specifies the mode in which password should be queried. */
  var Mode: PasswordRequestMode = js.native
}

object NoMasterException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Mode: PasswordRequestMode): NoMasterException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoMasterException]
  }
  @scala.inline
  implicit class NoMasterExceptionOps[Self <: NoMasterException] (val x: Self) extends AnyVal {
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

