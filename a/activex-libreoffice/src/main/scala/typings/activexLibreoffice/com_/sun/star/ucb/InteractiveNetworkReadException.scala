package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A network error specifying a read failure. */
trait InteractiveNetworkReadException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** Any diagnostic message about the failure (which will typically be an English phrase or sentence). */
  var Diagnostic: String
}
object InteractiveNetworkReadException {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Diagnostic: String,
    Message: String
  ): InteractiveNetworkReadException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkReadException]
  }
  
  @scala.inline
  implicit class InteractiveNetworkReadExceptionMutableBuilder[Self <: InteractiveNetworkReadException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostic(value: String): Self = StObject.set(x, "Diagnostic", value.asInstanceOf[js.Any])
  }
}
