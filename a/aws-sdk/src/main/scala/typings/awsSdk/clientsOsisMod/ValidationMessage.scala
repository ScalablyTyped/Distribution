package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessage extends StObject {
  
  /**
    * The validation message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ValidationMessage {
  
  inline def apply(): ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationMessage] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
