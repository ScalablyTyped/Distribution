package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A network error specifying a name resolution failure. */
trait InteractiveNetworkResolveNameException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The server name for which resolution failed. */
  var Server: String
}
object InteractiveNetworkResolveNameException {
  
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkResolveNameException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkResolveNameException]
  }
  
  @scala.inline
  implicit class InteractiveNetworkResolveNameExceptionMutableBuilder[Self <: InteractiveNetworkResolveNameException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
