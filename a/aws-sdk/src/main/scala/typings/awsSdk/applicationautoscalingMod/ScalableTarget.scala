package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalableTarget extends StObject {
  
  /**
    * The Unix timestamp for when the scalable target was created.
    */
  var CreationTime: TimestampType
  
  /**
    * The maximum value to scale to in response to a scale-out activity.
    */
  var MaxCapacity: ResourceCapacity
  
  /**
    * The minimum value to scale to in response to a scale-in activity.
    */
  var MinCapacity: ResourceCapacity
  
  /**
    * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.   Amazon Keyspaces table - The resource type is table and the unique identifier is the table name. Example: keyspace/mykeyspace/table/mytable.   Amazon MSK cluster - The resource type and unique identifier are specified using the cluster ARN. Example: arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5.  
    */
  var ResourceId: ResourceIdMaxLen1600
  
  /**
    * The ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your behalf.
    */
  var RoleARN: ResourceIdMaxLen1600
  
  /**
    * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    comprehend:entity-recognizer-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend entity recognizer endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.    cassandra:table:ReadCapacityUnits - The provisioned read capacity for an Amazon Keyspaces table.    cassandra:table:WriteCapacityUnits - The provisioned write capacity for an Amazon Keyspaces table.    kafka:broker-storage:VolumeSize - The provisioned volume size (in GiB) for brokers in an Amazon MSK cluster.  
    */
  var ScalableDimension: typings.awsSdk.applicationautoscalingMod.ScalableDimension
  
  /**
    * The namespace of the AWS service that provides the resource, or a custom-resource.
    */
  var ServiceNamespace: typings.awsSdk.applicationautoscalingMod.ServiceNamespace
  
  var SuspendedState: js.UndefOr[typings.awsSdk.applicationautoscalingMod.SuspendedState] = js.undefined
}
object ScalableTarget {
  
  @scala.inline
  def apply(
    CreationTime: TimestampType,
    MaxCapacity: ResourceCapacity,
    MinCapacity: ResourceCapacity,
    ResourceId: ResourceIdMaxLen1600,
    RoleARN: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace
  ): ScalableTarget = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalableTarget]
  }
  
  @scala.inline
  implicit class ScalableTargetMutableBuilder[Self <: ScalableTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: TimestampType): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacity(value: ResourceCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacity(value: ResourceCapacity): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceIdMaxLen1600): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: ResourceIdMaxLen1600): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableDimension(value: ScalableDimension): Self = StObject.set(x, "ScalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: ServiceNamespace): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedState(value: SuspendedState): Self = StObject.set(x, "SuspendedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedStateUndefined: Self = StObject.set(x, "SuspendedState", js.undefined)
  }
}
