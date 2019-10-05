package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeResource extends js.Object {
  /**
    * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. If you leave this field empty, the default value is 100% of the On-Demand price.
    */
  var bidPercentage: js.UndefOr[Integer] = js.undefined
  /**
    * The desired number of EC2 vCPUS in the compute environment. 
    */
  var desiredvCpus: js.UndefOr[Integer] = js.undefined
  /**
    * The EC2 key pair that is used for instances launched in the compute environment.
    */
  var ec2KeyPair: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
    */
  var imageId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,  ecsInstanceRole  or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole . For more information, see Amazon ECS Instance Role in the AWS Batch User Guide.
    */
  var instanceRole: String
  /**
    * The instances types that may be launched. You can specify instance families to launch any instance type within those families (for example, c4 or p3), or you can specify specific sizes within a family (such as c4.8xlarge). You can also choose optimal to pick instance types (from the C, M, and R instance families) on the fly that match the demand of your job queues.
    */
  var instanceTypes: StringList
  /**
    * The launch template to use for your compute resources. Any other compute resource parameters that you specify in a CreateComputeEnvironment API operation override the same parameters in the launch template. You must specify either the launch template ID or launch template name in the request, but not both. For more information, see Launch Template Support in the AWS Batch User Guide.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  /**
    * The maximum number of EC2 vCPUs that an environment can reach. 
    */
  var maxvCpus: Integer
  /**
    * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED). 
    */
  var minvCpus: Integer
  /**
    * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var placementGroup: js.UndefOr[String] = js.undefined
  /**
    * The EC2 security group that is associated with instances launched in the compute environment. 
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. For more information, see Amazon EC2 Spot Fleet Role in the AWS Batch User Guide.
    */
  var spotIamFleetRole: js.UndefOr[String] = js.undefined
  /**
    * The VPC subnets into which the compute resources are launched. For more information, see VPCs and Subnets in the Amazon VPC User Guide.
    */
  var subnets: StringList
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * The type of compute environment: EC2 or SPOT.
    */
  var `type`: CRType
}

object ComputeResource {
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: StringList,
    maxvCpus: Integer,
    minvCpus: Integer,
    subnets: StringList,
    `type`: CRType,
    bidPercentage: Int | Double = null,
    desiredvCpus: Int | Double = null,
    ec2KeyPair: String = null,
    imageId: String = null,
    launchTemplate: LaunchTemplateSpecification = null,
    placementGroup: String = null,
    securityGroupIds: StringList = null,
    spotIamFleetRole: String = null,
    tags: TagsMap = null
  ): ComputeResource = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole, instanceTypes = instanceTypes, maxvCpus = maxvCpus, minvCpus = minvCpus, subnets = subnets)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredvCpus != null) __obj.updateDynamic("desiredvCpus")(desiredvCpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate)
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ComputeResource]
  }
}

