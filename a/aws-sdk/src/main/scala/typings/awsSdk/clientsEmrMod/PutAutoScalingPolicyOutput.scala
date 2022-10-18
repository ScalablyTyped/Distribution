package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAutoScalingPolicyOutput extends StObject {
  
  /**
    * The automatic scaling policy definition.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsEmrMod.ClusterId] = js.undefined
  
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceGroupId] = js.undefined
}
object PutAutoScalingPolicyOutput {
  
  inline def apply(): PutAutoScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAutoScalingPolicyOutput]
  }
  
  extension [Self <: PutAutoScalingPolicyOutput](x: Self) {
    
    inline def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    inline def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
  }
}
