package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodegroupResources extends StObject {
  
  /**
    * The Auto Scaling groups associated with the node group.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
  
  /**
    * The remote access security group associated with the node group. This security group controls SSH access to the nodes.
    */
  var remoteAccessSecurityGroup: js.UndefOr[String] = js.undefined
}
object NodegroupResources {
  
  inline def apply(): NodegroupResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupResources]
  }
  
  extension [Self <: NodegroupResources](x: Self) {
    
    inline def setAutoScalingGroups(value: AutoScalingGroupList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "autoScalingGroups", js.Array(value*))
    
    inline def setRemoteAccessSecurityGroup(value: String): Self = StObject.set(x, "remoteAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSecurityGroupUndefined: Self = StObject.set(x, "remoteAccessSecurityGroup", js.undefined)
  }
}
