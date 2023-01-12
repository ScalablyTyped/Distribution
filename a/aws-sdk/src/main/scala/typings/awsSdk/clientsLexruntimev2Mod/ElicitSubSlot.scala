package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElicitSubSlot extends StObject {
  
  /**
    * The name of the slot that should be elicited from the user.
    */
  var name: NonEmptyString
  
  /**
    * The field is not supported.
    */
  var subSlotToElicit: js.UndefOr[ElicitSubSlot] = js.undefined
}
object ElicitSubSlot {
  
  inline def apply(name: NonEmptyString): ElicitSubSlot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElicitSubSlot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElicitSubSlot] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubSlotToElicit(value: ElicitSubSlot): Self = StObject.set(x, "subSlotToElicit", value.asInstanceOf[js.Any])
    
    inline def setSubSlotToElicitUndefined: Self = StObject.set(x, "subSlotToElicit", js.undefined)
  }
}
