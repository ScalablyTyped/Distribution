package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstanceProtectionQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * One or more instance IDs. You can specify up to 50 instances.
    */
  var InstanceIds: typings.awsSdk.autoscalingMod.InstanceIds
  
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: typings.awsSdk.autoscalingMod.ProtectedFromScaleIn
}
object SetInstanceProtectionQuery {
  
  inline def apply(
    AutoScalingGroupName: ResourceName,
    InstanceIds: InstanceIds,
    ProtectedFromScaleIn: ProtectedFromScaleIn
  ): SetInstanceProtectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], InstanceIds = InstanceIds.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceProtectionQuery]
  }
  
  extension [Self <: SetInstanceProtectionQuery](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    inline def setProtectedFromScaleIn(value: ProtectedFromScaleIn): Self = StObject.set(x, "ProtectedFromScaleIn", value.asInstanceOf[js.Any])
  }
}
