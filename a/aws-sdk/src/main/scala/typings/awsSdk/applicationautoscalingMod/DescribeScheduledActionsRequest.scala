package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledActionsRequest extends js.Object {
  /**
    * The maximum number of scheduled action results. This value can be between 1 and 50. The default value is 50. If this parameter is used, the operation returns up to MaxResults results at a time, along with a NextToken value. To get the next set of results, include the NextToken value in a subsequent call. If this parameter is not used, the operation returns up to 50 results and a NextToken value, if applicable.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.applicationautoscalingMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * The identifier of the resource associated with the scheduled action. This string consists of the resource type and unique identifier. If you specify a scalable dimension, you must also specify a resource ID.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.   Amazon Keyspaces table - The resource type is table and the unique identifier is the table name. Example: keyspace/mykeyspace/table/mytable.  
    */
  var ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.native
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property. If you specify a scalable dimension, you must also specify a resource ID.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.    cassandra:table:ReadCapacityUnits - The provisioned read capacity for an Amazon Keyspaces table.    cassandra:table:WriteCapacityUnits - The provisioned write capacity for an Amazon Keyspaces table.  
    */
  var ScalableDimension: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalableDimension] = js.native
  /**
    * The names of the scheduled actions to describe.
    */
  var ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600] = js.native
  /**
    * The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use custom-resource instead.
    */
  var ServiceNamespace: typings.awsSdk.applicationautoscalingMod.ServiceNamespace = js.native
}

object DescribeScheduledActionsRequest {
  @scala.inline
  def apply(ServiceNamespace: ServiceNamespace): DescribeScheduledActionsRequest = {
    val __obj = js.Dynamic.literal(ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledActionsRequest]
  }
  @scala.inline
  implicit class DescribeScheduledActionsRequestOps[Self <: DescribeScheduledActionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServiceNamespace(value: ServiceNamespace): Self = this.set("ServiceNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceId(value: ResourceIdMaxLen1600): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setScalableDimension(value: ScalableDimension): Self = this.set("ScalableDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalableDimension: Self = this.set("ScalableDimension", js.undefined)
    @scala.inline
    def setScheduledActionNamesVarargs(value: ResourceIdMaxLen1600*): Self = this.set("ScheduledActionNames", js.Array(value :_*))
    @scala.inline
    def setScheduledActionNames(value: ResourceIdsMaxLen1600): Self = this.set("ScheduledActionNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledActionNames: Self = this.set("ScheduledActionNames", js.undefined)
  }
  
}

