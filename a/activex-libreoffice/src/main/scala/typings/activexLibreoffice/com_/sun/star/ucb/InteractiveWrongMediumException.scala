package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when the wrong medium is inserted into a removable drive during an operation. */
trait InteractiveWrongMediumException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** identifies the medium thats needed to continue with the pending operation. */
  var Medium: Any
}
object InteractiveWrongMediumException {
  
  inline def apply(Classification: InteractionClassification, Context: XInterface, Medium: Any, Message: String): InteractiveWrongMediumException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveWrongMediumException]
  }
  
  extension [Self <: InteractiveWrongMediumException](x: Self) {
    
    inline def setMedium(value: Any): Self = StObject.set(x, "Medium", value.asInstanceOf[js.Any])
  }
}
