package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodegroupConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon EKS cluster that the managed node group resides in.
    */
  var clusterName: String
  
  /**
    * The Kubernetes labels to be applied to the nodes in the node group after the update.
    */
  var labels: js.UndefOr[UpdateLabelsPayload] = js.undefined
  
  /**
    * The name of the managed node group to update.
    */
  var nodegroupName: String
  
  /**
    * The scaling configuration details for the Auto Scaling group after the update.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined
  
  /**
    * The Kubernetes taints to be applied to the nodes in the node group after the update. For more information, see Node taints on managed node groups.
    */
  var taints: js.UndefOr[UpdateTaintsPayload] = js.undefined
  
  /**
    * The node group update configuration.
    */
  var updateConfig: js.UndefOr[NodegroupUpdateConfig] = js.undefined
}
object UpdateNodegroupConfigRequest {
  
  inline def apply(clusterName: String, nodegroupName: String): UpdateNodegroupConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNodegroupConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: UpdateLabelsPayload): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    inline def setScalingConfig(value: NodegroupScalingConfig): Self = StObject.set(x, "scalingConfig", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigUndefined: Self = StObject.set(x, "scalingConfig", js.undefined)
    
    inline def setTaints(value: UpdateTaintsPayload): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setUpdateConfig(value: NodegroupUpdateConfig): Self = StObject.set(x, "updateConfig", value.asInstanceOf[js.Any])
    
    inline def setUpdateConfigUndefined: Self = StObject.set(x, "updateConfig", js.undefined)
  }
}
