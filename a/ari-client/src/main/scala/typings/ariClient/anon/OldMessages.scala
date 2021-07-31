package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldMessages extends StObject {
  
  var newMessages: Double
  
  var oldMessages: Double
}
object OldMessages {
  
  @scala.inline
  def apply(newMessages: Double, oldMessages: Double): OldMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldMessages]
  }
  
  @scala.inline
  implicit class OldMessagesMutableBuilder[Self <: OldMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewMessages(value: Double): Self = StObject.set(x, "newMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMessages(value: Double): Self = StObject.set(x, "oldMessages", value.asInstanceOf[js.Any])
  }
}
