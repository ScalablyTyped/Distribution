package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
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
  implicit class InvalidBootstrapFileExceptionMutableBuilder[Self <: InvalidBootstrapFileException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrapFileURL(value: String): Self = StObject.set(x, "BootstrapFileURL", value.asInstanceOf[js.Any])
  }
}
