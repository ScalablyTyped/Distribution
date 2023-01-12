package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCondition extends StObject {
  
  /**
    * The dimensions for the event filter to use for the activity.
    */
  var Dimensions: js.UndefOr[EventDimensions] = js.undefined
  
  /**
    * The message identifier (message_id) for the message to use when determining whether message events meet the condition.
    */
  var MessageActivity: js.UndefOr[string] = js.undefined
}
object EventCondition {
  
  inline def apply(): EventCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventCondition] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: EventDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setMessageActivity(value: string): Self = StObject.set(x, "MessageActivity", value.asInstanceOf[js.Any])
    
    inline def setMessageActivityUndefined: Self = StObject.set(x, "MessageActivity", js.undefined)
  }
}
