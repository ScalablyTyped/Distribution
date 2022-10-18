package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeResourceUpdate extends StObject {
  
  /**
    * The allocation strategy to use for the compute resource if not enough instances of the best fitting instance type can be allocated. This might be because of availability of the instance type in the Region or Amazon EC2 service limits. For more information, see Allocation strategies in the Batch User Guide. When updating a compute environment, changing the allocation strategy requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide. BEST_FIT isn't supported when updating a compute environment.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   BEST_FIT_PROGRESSIVE  Batch will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types with a lower cost per unit vCPU. If additional instances of the previously selected instance types aren't available, Batch will select new instance types.  SPOT_CAPACITY_OPTIMIZED  Batch will select one or more instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types that are less likely to be interrupted. This allocation strategy is only available for Spot Instance compute resources.   With both BEST_FIT_PROGRESSIVE and SPOT_CAPACITY_OPTIMIZED strategies, Batch might need to go above maxvCpus to meet your capacity requirements. In this event, Batch never exceeds maxvCpus by more than a single instance.
    */
  var allocationStrategy: js.UndefOr[CRUpdateAllocationStrategy] = js.undefined
  
  /**
    * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be less than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. When updating a compute environment, changing the bid percentage requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var bidPercentage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment. Batch modifies this value between the minimum and maximum values based on job queue demand.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var desiredvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. When updating a compute environment, changing this setting requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide. To remove the EC2 configuration and any custom AMI ID specified in imageIdOverride, set this value to an empty string. One or two values can be provided.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var ec2Configuration: js.UndefOr[Ec2ConfigurationList] = js.undefined
  
  /**
    * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an empty string. When updating a compute environment, changing the EC2 key pair requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var ec2KeyPair: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is overridden by the imageIdOverride member of the Ec2Configuration structure. To remove the custom AMI ID and use the default AMI ID, set this value to an empty string. When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   The AMI that you choose for a compute environment must match the architecture of the instance types that you intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see Amazon ECS-optimized Amazon Linux 2 AMI in the Amazon Elastic Container Service Developer Guide. 
    */
  var imageId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,  ecsInstanceRole  or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole . For more information, see Amazon ECS instance role in the Batch User Guide. When updating a compute environment, changing this setting requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var instanceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The instances types that can be launched. You can specify instance families to launch any instance type within those families (for example, c5 or p3), or you can specify specific sizes within a family (such as c5.8xlarge). You can also choose optimal to select instance types (from the C4, M4, and R4 instance families) that match the demand of your job queues. When updating a compute environment, changing this setting requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   When you create a compute environment, the instance types that you select for the compute environment must share the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.   Currently, optimal uses instance types from the C4, M4, and R4 instance families. In Regions that don't have instance types from those instance families, instance types from the C5, M5. and R5 instance families are used. 
    */
  var instanceTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The updated launch template to use for your compute resources. You must specify either the launch template ID or launch template name in the request, but not both. For more information, see Launch template support in the Batch User Guide. To remove the custom launch template and use the default launch template, set launchTemplateId or launchTemplateName member of the launch template specification to an empty string. Removing the launch template from a compute environment will not remove the AMI specified in the launch template. In order to update the AMI specified in a launch template, the updateToLatestImageVersion parameter must be set to true. When updating a compute environment, changing the launch template requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.  With both BEST_FIT_PROGRESSIVE and SPOT_CAPACITY_OPTIMIZED allocation strategies, Batch might need to exceed maxvCpus to meet your capacity requirements. In this event, Batch never exceeds maxvCpus by more than a single instance. That is, no more than a single instance from among those specified in your compute environment. 
    */
  var maxvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED).  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var minvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement groups in the Amazon EC2 User Guide for Linux Instances. When updating a compute environment, changing the placement group requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var placementGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is made. For EC2 compute resources, providing an empty list removes the security groups from the compute resource. When updating a compute environment, changing the EC2 security groups requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets. For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and no change is made. For EC2 compute resources, providing an empty list removes the VPC subnets from the compute resource. For more information, see VPCs and subnets in the Amazon VPC User Guide. When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.
    */
  var subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * Key-value pair tags to be applied to EC2 resources that are launched in the compute environment. For Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value−for example, { "Name": "Batch Instance - C4OnDemand" }. This is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags aren't seen when using the Batch ListTagsForResource API operation. When updating a compute environment, changing this setting requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of compute environment: EC2, SPOT, FARGATE, or FARGATE_SPOT. For more information, see Compute environments in the Batch User Guide.  If you choose SPOT, you must also specify an Amazon EC2 Spot Fleet role with the spotIamFleetRole parameter. For more information, see Amazon EC2 spot fleet role in the Batch User Guide. When updating a compute environment, changing the type of a compute environment requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.
    */
  var `type`: js.UndefOr[CRType] = js.undefined
  
  /**
    * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment has an infrastructure update. The default value is false.  If an AMI ID is specified in the imageId or imageIdOverride parameters or by the launch template specified in the launchTemplate parameter, this parameter is ignored. For more information on updating AMI IDs during an infrastructure update, see Updating the AMI ID in the Batch User Guide.  When updating a compute environment, changing this setting requires an infrastructure update of the compute environment. For more information, see Updating compute environments in the Batch User Guide.
    */
  var updateToLatestImageVersion: js.UndefOr[Boolean] = js.undefined
}
object ComputeResourceUpdate {
  
  inline def apply(): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
  
  extension [Self <: ComputeResourceUpdate](x: Self) {
    
    inline def setAllocationStrategy(value: CRUpdateAllocationStrategy): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
    
    inline def setBidPercentage(value: Integer): Self = StObject.set(x, "bidPercentage", value.asInstanceOf[js.Any])
    
    inline def setBidPercentageUndefined: Self = StObject.set(x, "bidPercentage", js.undefined)
    
    inline def setDesiredvCpus(value: Integer): Self = StObject.set(x, "desiredvCpus", value.asInstanceOf[js.Any])
    
    inline def setDesiredvCpusUndefined: Self = StObject.set(x, "desiredvCpus", js.undefined)
    
    inline def setEc2Configuration(value: Ec2ConfigurationList): Self = StObject.set(x, "ec2Configuration", value.asInstanceOf[js.Any])
    
    inline def setEc2ConfigurationUndefined: Self = StObject.set(x, "ec2Configuration", js.undefined)
    
    inline def setEc2ConfigurationVarargs(value: Ec2Configuration*): Self = StObject.set(x, "ec2Configuration", js.Array(value*))
    
    inline def setEc2KeyPair(value: String): Self = StObject.set(x, "ec2KeyPair", value.asInstanceOf[js.Any])
    
    inline def setEc2KeyPairUndefined: Self = StObject.set(x, "ec2KeyPair", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setInstanceRole(value: String): Self = StObject.set(x, "instanceRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceRoleUndefined: Self = StObject.set(x, "instanceRole", js.undefined)
    
    inline def setInstanceTypes(value: StringList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value*))
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    inline def setMaxvCpus(value: Integer): Self = StObject.set(x, "maxvCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxvCpusUndefined: Self = StObject.set(x, "maxvCpus", js.undefined)
    
    inline def setMinvCpus(value: Integer): Self = StObject.set(x, "minvCpus", value.asInstanceOf[js.Any])
    
    inline def setMinvCpusUndefined: Self = StObject.set(x, "minvCpus", js.undefined)
    
    inline def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: CRType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateToLatestImageVersion(value: Boolean): Self = StObject.set(x, "updateToLatestImageVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateToLatestImageVersionUndefined: Self = StObject.set(x, "updateToLatestImageVersion", js.undefined)
  }
}
