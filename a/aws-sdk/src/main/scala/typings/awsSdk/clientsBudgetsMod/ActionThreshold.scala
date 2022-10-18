package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionThreshold extends StObject {
  
  var ActionThresholdType: ThresholdType
  
  var ActionThresholdValue: NotificationThreshold
}
object ActionThreshold {
  
  inline def apply(ActionThresholdType: ThresholdType, ActionThresholdValue: NotificationThreshold): ActionThreshold = {
    val __obj = js.Dynamic.literal(ActionThresholdType = ActionThresholdType.asInstanceOf[js.Any], ActionThresholdValue = ActionThresholdValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionThreshold]
  }
  
  extension [Self <: ActionThreshold](x: Self) {
    
    inline def setActionThresholdType(value: ThresholdType): Self = StObject.set(x, "ActionThresholdType", value.asInstanceOf[js.Any])
    
    inline def setActionThresholdValue(value: NotificationThreshold): Self = StObject.set(x, "ActionThresholdValue", value.asInstanceOf[js.Any])
  }
}
