package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingActivity extends StObject {
  
  /**
    * The unique identifier of the scaling activity.
    */
  var ActivityId: ResourceId
  
  /**
    * A simple description of what caused the scaling activity to happen.
    */
  var Cause: XmlString
  
  /**
    * A simple description of what action the scaling activity intends to accomplish.
    */
  var Description: XmlString
  
  /**
    * The details about the scaling activity.
    */
  var Details: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The Unix timestamp for when the scaling activity ended.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The identifier of the resource associated with the scaling activity. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.   Amazon Keyspaces table - The resource type is table and the unique identifier is the table name. Example: keyspace/mykeyspace/table/mytable.   Amazon MSK cluster - The resource type and unique identifier are specified using the cluster ARN. Example: arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5.  
    */
  var ResourceId: ResourceIdMaxLen1600
  
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    comprehend:entity-recognizer-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend entity recognizer endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.    cassandra:table:ReadCapacityUnits - The provisioned read capacity for an Amazon Keyspaces table.    cassandra:table:WriteCapacityUnits - The provisioned write capacity for an Amazon Keyspaces table.    kafka:broker-storage:VolumeSize - The provisioned volume size (in GiB) for brokers in an Amazon MSK cluster.  
    */
  var ScalableDimension: typings.awsSdk.applicationautoscalingMod.ScalableDimension
  
  /**
    * The namespace of the AWS service that provides the resource, or a custom-resource.
    */
  var ServiceNamespace: typings.awsSdk.applicationautoscalingMod.ServiceNamespace
  
  /**
    * The Unix timestamp for when the scaling activity began.
    */
  var StartTime: TimestampType
  
  /**
    * Indicates the status of the scaling activity.
    */
  var StatusCode: ScalingActivityStatusCode
  
  /**
    * A simple message about the current status of the scaling activity.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.undefined
}
object ScalingActivity {
  
  @scala.inline
  def apply(
    ActivityId: ResourceId,
    Cause: XmlString,
    Description: XmlString,
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace,
    StartTime: TimestampType,
    StatusCode: ScalingActivityStatusCode
  ): ScalingActivity = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], Cause = Cause.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingActivity]
  }
  
  @scala.inline
  implicit class ScalingActivityMutableBuilder[Self <: ScalingActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ResourceId): Self = StObject.set(x, "ActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCause(value: XmlString): Self = StObject.set(x, "Cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: XmlString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: XmlString): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceIdMaxLen1600): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableDimension(value: ScalableDimension): Self = StObject.set(x, "ScalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: ServiceNamespace): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: ScalingActivityStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: XmlString): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
