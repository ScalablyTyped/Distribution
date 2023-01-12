package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRequired extends StObject {
  
  /**
    * The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state. You can find instructions by choosing the link for your code from the list of action required codes in Amazon MQ action required codes. Each code references a topic with detailed information, instructions, and recommendations for how to resolve the issue and prevent future occurrences.
    */
  var ActionRequiredCode: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the action required to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
    */
  var ActionRequiredInfo: js.UndefOr[string] = js.undefined
}
object ActionRequired {
  
  inline def apply(): ActionRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionRequired] (val x: Self) extends AnyVal {
    
    inline def setActionRequiredCode(value: string): Self = StObject.set(x, "ActionRequiredCode", value.asInstanceOf[js.Any])
    
    inline def setActionRequiredCodeUndefined: Self = StObject.set(x, "ActionRequiredCode", js.undefined)
    
    inline def setActionRequiredInfo(value: string): Self = StObject.set(x, "ActionRequiredInfo", value.asInstanceOf[js.Any])
    
    inline def setActionRequiredInfoUndefined: Self = StObject.set(x, "ActionRequiredInfo", js.undefined)
  }
}
