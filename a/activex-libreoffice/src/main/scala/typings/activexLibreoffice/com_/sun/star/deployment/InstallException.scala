package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the fact that deployment unit is about to be installed.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.2
  */
@js.native
trait InstallException extends Exception {
  /** the display name of the extension, which is to be installed. */
  var displayName: String = js.native
}

object InstallException {
  @scala.inline
  def apply(Context: XInterface, Message: String, displayName: String): InstallException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallException]
  }
  @scala.inline
  implicit class InstallExceptionOps[Self <: InstallException] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
  
}

