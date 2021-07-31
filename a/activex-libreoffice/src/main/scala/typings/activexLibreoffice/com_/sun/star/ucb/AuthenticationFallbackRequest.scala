package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back some authentication data
  * @since LibreOffice 4.4
  */
trait AuthenticationFallbackRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** Instructions to be followed by the user */
  var instructions: String
  
  /** url to be opened in browser */
  var url: String
}
object AuthenticationFallbackRequest {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    instructions: String,
    url: String
  ): AuthenticationFallbackRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationFallbackRequest]
  }
  
  @scala.inline
  implicit class AuthenticationFallbackRequestMutableBuilder[Self <: AuthenticationFallbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
