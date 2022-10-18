package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRefreshLivePoolProgress extends StObject {
  
  /**
    * The number of instances remaining to update.
    */
  var InstancesToUpdate: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstancesToUpdate] = js.undefined
  
  /**
    * The percentage of instances in the Auto Scaling group that have been replaced. For each instance replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the percentage complete.
    */
  var PercentageComplete: js.UndefOr[IntPercent] = js.undefined
}
object InstanceRefreshLivePoolProgress {
  
  inline def apply(): InstanceRefreshLivePoolProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRefreshLivePoolProgress]
  }
  
  extension [Self <: InstanceRefreshLivePoolProgress](x: Self) {
    
    inline def setInstancesToUpdate(value: InstancesToUpdate): Self = StObject.set(x, "InstancesToUpdate", value.asInstanceOf[js.Any])
    
    inline def setInstancesToUpdateUndefined: Self = StObject.set(x, "InstancesToUpdate", js.undefined)
    
    inline def setPercentageComplete(value: IntPercent): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
  }
}
