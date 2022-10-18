package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewMessages extends StObject {
  
  var newMessages: Double
  
  var oldMessages: Double
}
object NewMessages {
  
  inline def apply(newMessages: Double, oldMessages: Double): NewMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessages]
  }
  
  extension [Self <: NewMessages](x: Self) {
    
    inline def setNewMessages(value: Double): Self = StObject.set(x, "newMessages", value.asInstanceOf[js.Any])
    
    inline def setOldMessages(value: Double): Self = StObject.set(x, "oldMessages", value.asInstanceOf[js.Any])
  }
}
