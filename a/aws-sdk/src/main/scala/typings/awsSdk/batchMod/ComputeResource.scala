package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeResource extends StObject {
  
  /**
    * The allocation strategy to use for the compute resource if not enough instances of the best fitting instance type can be allocated. This might be because of availability of the instance type in the Region or Amazon EC2 service limits. For more information, see Allocation strategies in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   BEST_FIT (default)  Batch selects an instance type that best fits the needs of the jobs with a preference for the lowest-cost instance type. If additional instances of the selected instance type aren't available, Batch waits for the additional instances to be available. If there aren't enough instances available, or if the user is reaching Amazon EC2 service limits then additional jobs aren't run until the currently running jobs have completed. This allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with BEST_FIT then the Spot Fleet IAM Role must be specified. Compute resources that use a BEST_FIT allocation strategy don't support infrastructure updates and can't update some parameters. For more information, see Updating compute environments in the Batch User Guide.  BEST_FIT_PROGRESSIVE  Batch will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types with a lower cost per unit vCPU. If additional instances of the previously selected instance types aren't available, Batch will select new instance types.  SPOT_CAPACITY_OPTIMIZED  Batch will select one or more instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types that are less likely to be interrupted. This allocation strategy is only available for Spot Instance compute resources.   With both BEST_FIT_PROGRESSIVE and SPOT_CAPACITY_OPTIMIZED strategies, Batch might need to go above maxvCpus to meet your capacity requirements. In this event, Batch never exceeds maxvCpus by more than a single instance.
    */
  var allocationStrategy: js.UndefOr[CRAllocationStrategy] = js.undefined
  
  /**
    * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be less than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. If you leave this field empty, the default value is 100% of the On-Demand price.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var bidPercentage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment. Batch modifies this value between the minimum and maximum values, based on job queue demand.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var desiredvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. One or two values can be provided.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var ec2Configuration: js.UndefOr[Ec2ConfigurationList] = js.undefined
  
  /**
    * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair to log in to your instances with SSH.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var ec2KeyPair: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is overridden by the imageIdOverride member of the Ec2Configuration structure.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   The AMI that you choose for a compute environment must match the architecture of the instance types that you intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see Amazon ECS-optimized Amazon Linux 2 AMI in the Amazon Elastic Container Service Developer Guide. 
    */
  var imageId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,  ecsInstanceRole  or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole . For more information, see Amazon ECS instance role in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var instanceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The instances types that can be launched. You can specify instance families to launch any instance type within those families (for example, c5 or p3), or you can specify specific sizes within a family (such as c5.8xlarge). You can also choose optimal to select instance types (from the C4, M4, and R4 instance families) that match the demand of your job queues.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   When you create a compute environment, the instance types that you select for the compute environment must share the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.   Currently, optimal uses instance types from the C4, M4, and R4 instance families. In Regions that don't have instance types from those instance families, instance types from the C5, M5. and R5 instance families are used. 
    */
  var instanceTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The launch template to use for your compute resources. Any other compute resource parameters that you specify in a CreateComputeEnvironment API operation override the same parameters in the launch template. You must specify either the launch template ID or launch template name in the request, but not both. For more information, see Launch template support in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The maximum number of Amazon EC2 vCPUs that a compute environment can reach.  With both BEST_FIT_PROGRESSIVE and SPOT_CAPACITY_OPTIMIZED allocation strategies, Batch might need to exceed maxvCpus to meet your capacity requirements. In this event, Batch never exceeds maxvCpus by more than a single instance. For example, no more than a single instance from among those specified in your compute environment is allocated. 
    */
  var maxvCpus: Integer
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED).  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var minvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement groups in the Amazon EC2 User Guide for Linux Instances.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var placementGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon EC2 security groups associated with instances launched in the compute environment. One or more security groups must be specified, either in securityGroupIds or using a launch template referenced in launchTemplate. This parameter is required for jobs that are running on Fargate resources and must contain at least one security group. Fargate doesn't support launch templates. If security groups are specified using both securityGroupIds and launchTemplate, the values in securityGroupIds are used.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This role is required if the allocation strategy set to BEST_FIT or if the allocation strategy isn't specified. For more information, see Amazon EC2 spot fleet role in the Batch User Guide.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.   To tag your Spot Instances on creation, the Spot Fleet IAM role specified here must use the newer AmazonEC2SpotFleetTaggingRole managed policy. The previously recommended AmazonEC2SpotFleetRole managed policy doesn't have the required permissions to tag Spot Instances. For more information, see Spot instances not tagged on creation in the Batch User Guide. 
    */
  var spotIamFleetRole: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC subnets where the compute resources are launched. These subnets must be within the same VPC. Fargate compute resources can contain up to 16 subnets. For more information, see VPCs and subnets in the Amazon VPC User Guide.
    */
  var subnets: StringList
  
  /**
    * Key-value pair tags to be applied to EC2 resources that are launched in the compute environment. For Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value−for example, { "Name": "Batch Instance - C4OnDemand" }. This is helpful for recognizing your Batch instances in the Amazon EC2 console. Updating these tags requires an infrastructure update to the compute environment. For more information, see Updating compute environments in the Batch User Guide. These tags aren't seen when using the Batch ListTagsForResource API operation.  This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified. 
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of compute environment: EC2, SPOT, FARGATE, or FARGATE_SPOT. For more information, see Compute environments in the Batch User Guide.  If you choose SPOT, you must also specify an Amazon EC2 Spot Fleet role with the spotIamFleetRole parameter. For more information, see Amazon EC2 spot fleet role in the Batch User Guide.
    */
  var `type`: CRType
}
object ComputeResource {
  
  inline def apply(maxvCpus: Integer, subnets: StringList, `type`: CRType): ComputeResource = {
    val __obj = js.Dynamic.literal(maxvCpus = maxvCpus.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResource]
  }
  
  extension [Self <: ComputeResource](x: Self) {
    
    inline def setAllocationStrategy(value: CRAllocationStrategy): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
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
    
    inline def setMinvCpus(value: Integer): Self = StObject.set(x, "minvCpus", value.asInstanceOf[js.Any])
    
    inline def setMinvCpusUndefined: Self = StObject.set(x, "minvCpus", js.undefined)
    
    inline def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSpotIamFleetRole(value: String): Self = StObject.set(x, "spotIamFleetRole", value.asInstanceOf[js.Any])
    
    inline def setSpotIamFleetRoleUndefined: Self = StObject.set(x, "spotIamFleetRole", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: CRType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
