package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionThreshold extends js.Object {
  
  var ActionThresholdType: ThresholdType = js.native
  
  var ActionThresholdValue: NotificationThreshold = js.native
}
object ActionThreshold {
  
  @scala.inline
  def apply(ActionThresholdType: ThresholdType, ActionThresholdValue: NotificationThreshold): ActionThreshold = {
    val __obj = js.Dynamic.literal(ActionThresholdType = ActionThresholdType.asInstanceOf[js.Any], ActionThresholdValue = ActionThresholdValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionThreshold]
  }
  
  @scala.inline
  implicit class ActionThresholdOps[Self <: ActionThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionThresholdType(value: ThresholdType): Self = this.set("ActionThresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThresholdValue(value: NotificationThreshold): Self = this.set("ActionThresholdValue", value.asInstanceOf[js.Any])
  }
}
