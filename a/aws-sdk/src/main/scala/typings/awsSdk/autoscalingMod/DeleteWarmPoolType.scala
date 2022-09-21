package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWarmPoolType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * Specifies that the warm pool is to be deleted along with all of its associated instances, without waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions associated with the warm pool instances.
    */
  var ForceDelete: js.UndefOr[typings.awsSdk.autoscalingMod.ForceDelete] = js.undefined
}
object DeleteWarmPoolType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DeleteWarmPoolType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWarmPoolType]
  }
  
  extension [Self <: DeleteWarmPoolType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: ForceDelete): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
  }
}
