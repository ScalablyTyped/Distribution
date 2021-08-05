package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a password. Continuations for using with the mentioned service
  * are Abort and Approve.
  */
trait PasswordRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /**
    * the mode in which password should be asked
    * @see com.sun.star.task.PasswordRequestMode
    */
  var Mode: PasswordRequestMode
}
object PasswordRequest {
  
  inline def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    Mode: PasswordRequestMode
  ): PasswordRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRequest]
  }
  
  extension [Self <: PasswordRequest](x: Self) {
    
    inline def setMode(value: PasswordRequestMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
