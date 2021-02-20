package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NoMasterExceptionMutableBuilder[Self <: NoMasterException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: PasswordRequestMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
