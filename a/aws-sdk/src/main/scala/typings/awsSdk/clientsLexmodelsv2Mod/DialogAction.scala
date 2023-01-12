package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  /**
    * If the dialog action is ElicitSlot, defines the slot to elicit from the user.
    */
  var slotToElicit: js.UndefOr[Name] = js.undefined
  
  /**
    * When true the next message for the intent is not used.
    */
  var suppressNextMessage: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The action that the bot should execute. 
    */
  var `type`: DialogActionType
}
object DialogAction {
  
  inline def apply(`type`: DialogActionType): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    inline def setSlotToElicit(value: Name): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    inline def setSlotToElicitUndefined: Self = StObject.set(x, "slotToElicit", js.undefined)
    
    inline def setSuppressNextMessage(value: BoxedBoolean): Self = StObject.set(x, "suppressNextMessage", value.asInstanceOf[js.Any])
    
    inline def setSuppressNextMessageUndefined: Self = StObject.set(x, "suppressNextMessage", js.undefined)
    
    inline def setType(value: DialogActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
