package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeFlow extends StObject {
  
  /**
    * The value must be TRUE or FALSE. If TRUE, you receive a notification when the alarm state changes. You must choose to acknowledge the notification before the alarm state can return to NORMAL. If FALSE, you won't receive notifications. The alarm automatically changes to the NORMAL state when the input property value returns to the specified range.
    */
  var enabled: AcknowledgeFlowEnabled
}
object AcknowledgeFlow {
  
  inline def apply(enabled: AcknowledgeFlowEnabled): AcknowledgeFlow = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcknowledgeFlow] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: AcknowledgeFlowEnabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
