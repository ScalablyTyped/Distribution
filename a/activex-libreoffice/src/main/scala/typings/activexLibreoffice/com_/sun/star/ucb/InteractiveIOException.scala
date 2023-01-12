package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input/output error. */
trait InteractiveIOException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The type of input/output error. */
  var Code: IOErrorCode
}
object InteractiveIOException {
  
  inline def apply(Classification: InteractionClassification, Code: IOErrorCode, Context: XInterface, Message: String): InteractiveIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveIOException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractiveIOException] (val x: Self) extends AnyVal {
    
    inline def setCode(value: IOErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}
