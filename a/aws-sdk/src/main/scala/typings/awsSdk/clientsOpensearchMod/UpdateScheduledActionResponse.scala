package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduledActionResponse extends StObject {
  
  /**
    * Information about the rescheduled action.
    */
  var ScheduledAction: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ScheduledAction] = js.undefined
}
object UpdateScheduledActionResponse {
  
  inline def apply(): UpdateScheduledActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateScheduledActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScheduledActionResponse] (val x: Self) extends AnyVal {
    
    inline def setScheduledAction(value: ScheduledAction): Self = StObject.set(x, "ScheduledAction", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionUndefined: Self = StObject.set(x, "ScheduledAction", js.undefined)
  }
}
