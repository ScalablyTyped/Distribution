package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInputRequest extends StObject {
  
  /**
    * Unique ID of the input
    */
  var InputId: string
}
object DeleteInputRequest {
  
  inline def apply(InputId: string): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInputRequest] (val x: Self) extends AnyVal {
    
    inline def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
  }
}
