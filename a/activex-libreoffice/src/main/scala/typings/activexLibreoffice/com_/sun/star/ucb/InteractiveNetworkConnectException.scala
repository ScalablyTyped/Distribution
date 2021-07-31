package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A network error specifying a connection failure. */
trait InteractiveNetworkConnectException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The name of the server to which connecting failed. */
  var Server: String
}
object InteractiveNetworkConnectException {
  
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkConnectException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkConnectException]
  }
  
  @scala.inline
  implicit class InteractiveNetworkConnectExceptionMutableBuilder[Self <: InteractiveNetworkConnectException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
