package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitStandbyQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.undefined
}
object ExitStandbyQuery {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): ExitStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitStandbyQuery]
  }
  
  @scala.inline
  implicit class ExitStandbyQueryMutableBuilder[Self <: ExitStandbyQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
  }
}
