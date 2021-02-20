package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input/output error. */
@js.native
trait InteractiveIOException extends ClassifiedInteractionRequest {
  
  /** The type of input/output error. */
  var Code: IOErrorCode = js.native
}
object InteractiveIOException {
  
  @scala.inline
  def apply(Classification: InteractionClassification, Code: IOErrorCode, Context: XInterface, Message: String): InteractiveIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveIOException]
  }
  
  @scala.inline
  implicit class InteractiveIOExceptionMutableBuilder[Self <: InteractiveIOException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: IOErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}
