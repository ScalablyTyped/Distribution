package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodegroupRequest extends StObject {
  
  /**
    * The AMI type for your node group. GPU instance types should use the AL2_x86_64_GPU AMI type. Non-GPU instances should use the AL2_x86_64 AMI type. Arm instances should use the AL2_ARM_64 AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify amiType, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var amiType: js.UndefOr[AMITypes] = js.undefined
  
  /**
    * The capacity type for your node group.
    */
  var capacityType: js.UndefOr[CapacityTypes] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster to create the node group in.
    */
  var clusterName: String
  
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify launchTemplate, then don't specify diskSize, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify AL2_x86_64_GPU with the amiType parameter. If you specify launchTemplate, then you can specify zero or one instance type in your launch template or you can specify 0-20 instance types for instanceTypes. If however, you specify an instance type in your launch template and specify any instanceTypes, the node group deployment will fail. If you don't specify an instance type in a launch template or for instanceTypes, then t3.medium is used, by default. If you specify Spot for capacityType, then we recommend specifying multiple values for instanceTypes. For more information, see Managed node group capacity types and Launch template support in the Amazon EKS User Guide.
    */
  var instanceTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Kubernetes labels to be applied to the nodes in the node group when they are created.
    */
  var labels: js.UndefOr[labelsMap] = js.undefined
  
  /**
    * An object representing a node group's launch template specification. If specified, then do not specify instanceTypes, diskSize, or remoteAccess and make sure that the launch template meets the requirements in launchTemplateSpecification.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node kubelet daemon makes calls to Amazon Web Services APIs on your behalf. Nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch nodes and register them into a cluster, you must create an IAM role for those nodes to use when they are launched. For more information, see Amazon EKS node IAM role in the  Amazon EKS User Guide . If you specify launchTemplate, then don't specify  IamInstanceProfile  in your launch template, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var nodeRole: String
  
  /**
    * The unique name to give your node group.
    */
  var nodegroupName: String
  
  /**
    * The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest available AMI version for the node group's current Kubernetes version is used. For more information, see Amazon EKS optimized Amazon Linux 2 AMI versions in the Amazon EKS User Guide. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify releaseVersion, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The remote access (SSH) configuration to use with your node group. If you specify launchTemplate, then don't specify remoteAccess, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.undefined
  
  /**
    * The scaling configuration details for the Auto Scaling group that is created for your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined
  
  /**
    * The subnets to use for the Auto Scaling group that is created for your node group. If you specify launchTemplate, then don't specify  SubnetId  in your launch template, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var subnets: StringList
  
  /**
    * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a key and an optional value. You define both. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Kubernetes taints to be applied to the nodes in the node group. For more information, see Node taints on managed node groups.
    */
  var taints: js.UndefOr[taintsList] = js.undefined
  
  /**
    * The node group update configuration.
    */
  var updateConfig: js.UndefOr[NodegroupUpdateConfig] = js.undefined
  
  /**
    * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used, and this is the only accepted specified value. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify version, or the node group deployment will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var version: js.UndefOr[String] = js.undefined
}
object CreateNodegroupRequest {
  
  inline def apply(clusterName: String, nodeRole: String, nodegroupName: String, subnets: StringList): CreateNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRole = nodeRole.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodegroupRequest]
  }
  
  extension [Self <: CreateNodegroupRequest](x: Self) {
    
    inline def setAmiType(value: AMITypes): Self = StObject.set(x, "amiType", value.asInstanceOf[js.Any])
    
    inline def setAmiTypeUndefined: Self = StObject.set(x, "amiType", js.undefined)
    
    inline def setCapacityType(value: CapacityTypes): Self = StObject.set(x, "capacityType", value.asInstanceOf[js.Any])
    
    inline def setCapacityTypeUndefined: Self = StObject.set(x, "capacityType", js.undefined)
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setDiskSize(value: BoxedInteger): Self = StObject.set(x, "diskSize", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeUndefined: Self = StObject.set(x, "diskSize", js.undefined)
    
    inline def setInstanceTypes(value: StringList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value*))
    
    inline def setLabels(value: labelsMap): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    inline def setNodeRole(value: String): Self = StObject.set(x, "nodeRole", value.asInstanceOf[js.Any])
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setRemoteAccess(value: RemoteAccessConfig): Self = StObject.set(x, "remoteAccess", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessUndefined: Self = StObject.set(x, "remoteAccess", js.undefined)
    
    inline def setScalingConfig(value: NodegroupScalingConfig): Self = StObject.set(x, "scalingConfig", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigUndefined: Self = StObject.set(x, "scalingConfig", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTaints(value: taintsList): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setTaintsVarargs(value: Taint*): Self = StObject.set(x, "taints", js.Array(value*))
    
    inline def setUpdateConfig(value: NodegroupUpdateConfig): Self = StObject.set(x, "updateConfig", value.asInstanceOf[js.Any])
    
    inline def setUpdateConfigUndefined: Self = StObject.set(x, "updateConfig", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
