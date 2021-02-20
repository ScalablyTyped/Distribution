package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An application error.
  * @since OOo 1.1.2
  */
@js.native
trait InteractiveAppException extends ClassifiedInteractionRequest {
  
  /** The type of application error. */
  var Code: Double = js.native
}
object InteractiveAppException {
  
  @scala.inline
  def apply(Classification: InteractionClassification, Code: Double, Context: XInterface, Message: String): InteractiveAppException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveAppException]
  }
  
  @scala.inline
  implicit class InteractiveAppExceptionMutableBuilder[Self <: InteractiveAppException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}
