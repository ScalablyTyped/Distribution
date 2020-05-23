package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a master password is needed but not available/correct. */
trait NoMasterException extends Exception {
  /** specifies the mode in which password should be queried. */
  var Mode: PasswordRequestMode
}

object NoMasterException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Mode: PasswordRequestMode): NoMasterException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoMasterException]
  }
}

