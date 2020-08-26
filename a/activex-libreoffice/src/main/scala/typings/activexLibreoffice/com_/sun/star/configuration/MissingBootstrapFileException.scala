package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration is missing */
@js.native
trait MissingBootstrapFileException extends Exception {
  var BootstrapFileURL: String = js.native
}

object MissingBootstrapFileException {
  @scala.inline
  def apply(BootstrapFileURL: String, Context: XInterface, Message: String): MissingBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingBootstrapFileException]
  }
  @scala.inline
  implicit class MissingBootstrapFileExceptionOps[Self <: MissingBootstrapFileException] (val x: Self) extends AnyVal {
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
    def setBootstrapFileURL(value: String): Self = this.set("BootstrapFileURL", value.asInstanceOf[js.Any])
  }
  
}

