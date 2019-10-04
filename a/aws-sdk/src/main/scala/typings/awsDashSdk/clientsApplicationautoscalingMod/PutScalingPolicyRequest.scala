package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScalingPolicyRequest extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typings.awsDashSdk.clientsApplicationautoscalingMod.PolicyName
  /**
    * The policy type. This parameter is required if you are creating a scaling policy. The following policy types are supported:   TargetTrackingScaling—Not supported for Amazon EMR or AppStream  StepScaling—Not supported for Amazon DynamoDB For more information, see Target Tracking Scaling Policies and Step Scaling Policies in the Application Auto Scaling User Guide.
    */
  var PolicyType: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.PolicyType] = js.undefined
  /**
    * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.  
    */
  var ResourceId: ResourceIdMaxLen1600
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
    */
  var ScalableDimension: typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableDimension
  /**
    * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: typings.awsDashSdk.clientsApplicationautoscalingMod.ServiceNamespace
  /**
    * A step scaling policy. This parameter is required if you are creating a policy and the policy type is StepScaling.
    */
  var StepScalingPolicyConfiguration: js.UndefOr[
    typings.awsDashSdk.clientsApplicationautoscalingMod.StepScalingPolicyConfiguration
  ] = js.undefined
  /**
    * A target tracking scaling policy. Includes support for predefined or customized metrics. This parameter is required if you are creating a policy and the policy type is TargetTrackingScaling.
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[
    typings.awsDashSdk.clientsApplicationautoscalingMod.TargetTrackingScalingPolicyConfiguration
  ] = js.undefined
}

object PutScalingPolicyRequest {
  @scala.inline
  def apply(
    PolicyName: PolicyName,
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace,
    PolicyType: PolicyType = null,
    StepScalingPolicyConfiguration: StepScalingPolicyConfiguration = null,
    TargetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfiguration = null
  ): PutScalingPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, ResourceId = ResourceId, ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (StepScalingPolicyConfiguration != null) __obj.updateDynamic("StepScalingPolicyConfiguration")(StepScalingPolicyConfiguration)
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration)
    __obj.asInstanceOf[PutScalingPolicyRequest]
  }
}

