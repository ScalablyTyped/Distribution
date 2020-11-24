package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration contains invalid data */
@js.native
trait InvalidBootstrapFileException extends Exception {
  
  var BootstrapFileURL: String = js.native
}
object InvalidBootstrapFileException {
  
  @scala.inline
  def apply(BootstrapFileURL: String, Context: XInterface, Message: String): InvalidBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBootstrapFileException]
  }
  
  @scala.inline
  implicit class InvalidBootstrapFileExceptionOps[Self <: InvalidBootstrapFileException] (val x: Self) extends AnyVal {
    
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
