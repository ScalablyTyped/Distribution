package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeResource extends StObject {
  
  /**
    * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. This could be due to availability of the instance type in the region or Amazon EC2 service limits. If this is not specified, the default is BEST_FIT, which will use only the best fitting instance type, waiting for additional capacity if it's not available. This allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with BEST_FIT then the Spot Fleet IAM Role must be specified. BEST_FIT_PROGRESSIVE will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types with a lower cost per vCPU. SPOT_CAPACITY_OPTIMIZED is only available for Spot Instance compute resources and will select additional instance types that are large enough to meet the requirements of the jobs in the queue, with a preference for instance types that are less likely to be interrupted. For more information, see Allocation Strategies in the AWS Batch User Guide.
    */
  var allocationStrategy: js.UndefOr[CRAllocationStrategy] = js.native
  
  /**
    * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be below 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. If you leave this field empty, the default value is 100% of the On-Demand price.
    */
  var bidPercentage: js.UndefOr[Integer] = js.native
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon EC2 key pair that is used for instances launched in the compute environment.
    */
  var ec2KeyPair: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
    */
  var imageId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,  ecsInstanceRole  or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole . For more information, see Amazon ECS Instance Role in the AWS Batch User Guide.
    */
  var instanceRole: String = js.native
  
  /**
    * The instances types that may be launched. You can specify instance families to launch any instance type within those families (for example, c5 or p3), or you can specify specific sizes within a family (such as c5.8xlarge). You can also choose optimal to pick instance types (from the C, M, and R instance families) on the fly that match the demand of your job queues.
    */
  var instanceTypes: StringList = js.native
  
  /**
    * The launch template to use for your compute resources. Any other compute resource parameters that you specify in a CreateComputeEnvironment API operation override the same parameters in the launch template. You must specify either the launch template ID or launch template name in the request, but not both. For more information, see Launch Template Support in the AWS Batch User Guide.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: Integer = js.native
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED).
    */
  var minvCpus: Integer = js.native
  
  /**
    * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var placementGroup: js.UndefOr[String] = js.native
  
  /**
    * The Amazon EC2 security groups associated with instances launched in the compute environment. One or more security groups must be specified, either in securityGroupIds or using a launch template referenced in launchTemplate. If security groups are specified using both securityGroupIds and launchTemplate, the values in securityGroupIds will be used.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This role is required if the allocation strategy set to BEST_FIT or if the allocation strategy is not specified. For more information, see Amazon EC2 Spot Fleet Role in the AWS Batch User Guide.
    */
  var spotIamFleetRole: js.UndefOr[String] = js.native
  
  /**
    * The VPC subnets into which the compute resources are launched. For more information, see VPCs and Subnets in the Amazon VPC User Guide.
    */
  var subnets: StringList = js.native
  
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }. These tags can not be updated or removed after the compute environment has been created; any changes require creating a new compute environment and removing the old compute environment. These tags are not seen when using the AWS Batch ListTagsForResource API operation.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * The type of compute environment: EC2 or SPOT.
    */
  var `type`: CRType = js.native
}
object ComputeResource {
  
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: StringList,
    maxvCpus: Integer,
    minvCpus: Integer,
    subnets: StringList,
    `type`: CRType
  ): ComputeResource = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxvCpus = maxvCpus.asInstanceOf[js.Any], minvCpus = minvCpus.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResource]
  }
  
  @scala.inline
  implicit class ComputeResourceMutableBuilder[Self <: ComputeResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: CRAllocationStrategy): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
    
    @scala.inline
    def setBidPercentage(value: Integer): Self = StObject.set(x, "bidPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPercentageUndefined: Self = StObject.set(x, "bidPercentage", js.undefined)
    
    @scala.inline
    def setDesiredvCpus(value: Integer): Self = StObject.set(x, "desiredvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredvCpusUndefined: Self = StObject.set(x, "desiredvCpus", js.undefined)
    
    @scala.inline
    def setEc2KeyPair(value: String): Self = StObject.set(x, "ec2KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2KeyPairUndefined: Self = StObject.set(x, "ec2KeyPair", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    @scala.inline
    def setInstanceRole(value: String): Self = StObject.set(x, "instanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypes(value: StringList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    @scala.inline
    def setMaxvCpus(value: Integer): Self = StObject.set(x, "maxvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinvCpus(value: Integer): Self = StObject.set(x, "minvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSpotIamFleetRole(value: String): Self = StObject.set(x, "spotIamFleetRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotIamFleetRoleUndefined: Self = StObject.set(x, "spotIamFleetRole", js.undefined)
    
    @scala.inline
    def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: CRType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
