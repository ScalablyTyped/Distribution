package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/applicationautoscaling", "ApplicationAutoScaling")
@js.native
object ApplicationAutoScalingNs extends js.Object {
  
  trait Alarm extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the alarm.
         */
    var AlarmARN: ResourceId
    /**
         * The name of the alarm.
         */
    var AlarmName: ResourceId
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CustomizedMetricSpecification extends js.Object {
    /**
         * The dimensions of the metric.
         */
    var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
    /**
         * The name of the metric.
         */
    var MetricName: MetricName
    /**
         * The namespace of the metric.
         */
    var Namespace: MetricNamespace
    /**
         * The statistic of the metric.
         */
    var Statistic: MetricStatistic
    /**
         * The unit of the metric.
         */
    var Unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  
  trait DeleteScalingPolicyRequest extends js.Object {
    /**
         * The name of the scaling policy.
         */
    var PolicyName: ResourceIdMaxLen1600
    /**
         * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DeleteScalingPolicyResponse extends js.Object
  
  
  trait DeleteScheduledActionRequest extends js.Object {
    /**
         * The identifier of the resource associated with the scheduled action. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The name of the scheduled action.
         */
    var ScheduledActionName: ResourceIdMaxLen1600
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DeleteScheduledActionResponse extends js.Object
  
  
  trait DeregisterScalableTargetRequest extends js.Object {
    /**
         * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DeregisterScalableTargetResponse extends js.Object
  
  
  trait DescribeScalableTargetsRequest extends js.Object {
    /**
         * The maximum number of scalable targets. This value can be between 1 and 50. The default value is 50. If this parameter is used, the operation returns up to MaxResults results at a time, along with a NextToken value. To get the next set of results, include the NextToken value in a subsequent call. If this parameter is not used, the operation returns up to 50 results and a NextToken value, if applicable.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier. If you specify a scalable dimension, you must also specify a resource ID.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceIds: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined
    /**
         * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property. If you specify a scalable dimension, you must also specify a resource ID.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DescribeScalableTargetsResponse extends js.Object {
    /**
         * The token required to get the next set of results. This value is null if there are no more results to return.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The scalable targets that match the request parameters.
         */
    var ScalableTargets: js.UndefOr[ScalableTargets] = js.undefined
  }
  
  
  trait DescribeScalingActivitiesRequest extends js.Object {
    /**
         * The maximum number of scalable targets. This value can be between 1 and 50. The default value is 50. If this parameter is used, the operation returns up to MaxResults results at a time, along with a NextToken value. To get the next set of results, include the NextToken value in a subsequent call. If this parameter is not used, the operation returns up to 50 results and a NextToken value, if applicable.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The identifier of the resource associated with the scaling activity. This string consists of the resource type and unique identifier. If you specify a scalable dimension, you must also specify a resource ID.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property. If you specify a scalable dimension, you must also specify a resource ID.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DescribeScalingActivitiesResponse extends js.Object {
    /**
         * The token required to get the next set of results. This value is null if there are no more results to return.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * A list of scaling activity objects.
         */
    var ScalingActivities: js.UndefOr[ScalingActivities] = js.undefined
  }
  
  
  trait DescribeScalingPoliciesRequest extends js.Object {
    /**
         * The maximum number of scalable targets. This value can be between 1 and 50. The default value is 50. If this parameter is used, the operation returns up to MaxResults results at a time, along with a NextToken value. To get the next set of results, include the NextToken value in a subsequent call. If this parameter is not used, the operation returns up to 50 results and a NextToken value, if applicable.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The names of the scaling policies to describe.
         */
    var PolicyNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined
    /**
         * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier. If you specify a scalable dimension, you must also specify a resource ID.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property. If you specify a scalable dimension, you must also specify a resource ID.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DescribeScalingPoliciesResponse extends js.Object {
    /**
         * The token required to get the next set of results. This value is null if there are no more results to return.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * Information about the scaling policies.
         */
    var ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
  }
  
  
  trait DescribeScheduledActionsRequest extends js.Object {
    /**
         * The maximum number of scheduled action results. This value can be between 1 and 50. The default value is 50. If this parameter is used, the operation returns up to MaxResults results at a time, along with a NextToken value. To get the next set of results, include the NextToken value in a subsequent call. If this parameter is not used, the operation returns up to 50 results and a NextToken value, if applicable.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The identifier of the resource associated with the scheduled action. This string consists of the resource type and unique identifier. If you specify a scalable dimension, you must also specify a resource ID.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property. If you specify a scalable dimension, you must also specify a resource ID.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The names of the scheduled actions to describe.
         */
    var ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait DescribeScheduledActionsResponse extends js.Object {
    /**
         * The token required to get the next set of results. This value is null if there are no more results to return.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * Information about the scheduled actions.
         */
    var ScheduledActions: js.UndefOr[ScheduledActions] = js.undefined
  }
  
  
  trait MetricDimension extends js.Object {
    /**
         * The name of the dimension.
         */
    var Name: MetricDimensionName
    /**
         * The value of the dimension.
         */
    var Value: MetricDimensionValue
  }
  
  
  trait PredefinedMetricSpecification extends js.Object {
    /**
         * The metric type. The ALBRequestCountPerTarget metric type applies only to Spot fleet requests and ECS services.
         */
    var PredefinedMetricType: MetricType
    /**
         * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Spot fleet request or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
         */
    var ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
  }
  
  
  trait PutScalingPolicyRequest extends js.Object {
    /**
         * The name of the scaling policy.
         */
    var PolicyName: PolicyName
    /**
         * The policy type. This parameter is required if you are creating a policy. For DynamoDB, only TargetTrackingScaling is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both StepScaling and TargetTrackingScaling are supported. For any other service, only StepScaling is supported.
         */
    var PolicyType: js.UndefOr[PolicyType] = js.undefined
    /**
         * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
    /**
         * A step scaling policy. This parameter is required if you are creating a policy and the policy type is StepScaling.
         */
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined
    /**
         * A target tracking policy. This parameter is required if you are creating a policy and the policy type is TargetTrackingScaling.
         */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined
  }
  
  
  trait PutScalingPolicyResponse extends js.Object {
    /**
         * The CloudWatch alarms created for the target tracking policy.
         */
    var Alarms: js.UndefOr[Alarms] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resulting scaling policy.
         */
    var PolicyARN: ResourceIdMaxLen1600
  }
  
  
  trait PutScheduledActionRequest extends js.Object {
    /**
         * The date and time for the scheduled action to end.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The identifier of the resource associated with the scheduled action. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
         */
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined
    /**
         * The schedule for this action. The following formats are supported:   At expressions - at(yyyy-mm-ddThh:mm:ss)    Rate expressions - rate(value unit)    Cron expressions - cron(fields)    At expressions are useful for one-time schedules. Specify the time, in UTC. For rate expressions, value is a positive integer and unit is minute | minutes | hour | hours | day | days. For more information about cron expressions, see Cron Expressions in the Amazon CloudWatch Events User Guide.
         */
    var Schedule: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    /**
         * The name of the scheduled action.
         */
    var ScheduledActionName: ScheduledActionName
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
    /**
         * The date and time for the scheduled action to start.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait PutScheduledActionResponse extends js.Object
  
  
  trait RegisterScalableTargetRequest extends js.Object {
    /**
         * The maximum value to scale to in response to a scale out event. This parameter is required if you are registering a scalable target.
         */
    var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
    /**
         * The minimum value to scale to in response to a scale in event. This parameter is required if you are registering a scalable target.
         */
    var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
    /**
         * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * Application Auto Scaling creates a service-linked role that grants it permissions to modify the scalable target on your behalf. For more information, see Service-Linked Roles for Application Auto Scaling. For resources that are not supported using a service-linked role, this parameter is required and must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your behalf.
         */
    var RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    /**
         * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait RegisterScalableTargetResponse extends js.Object
  
  
  trait ScalableTarget extends js.Object {
    /**
         * The Unix timestamp for when the scalable target was created.
         */
    var CreationTime: TimestampType
    /**
         * The maximum value to scale to in response to a scale out event.
         */
    var MaxCapacity: ResourceCapacity
    /**
         * The minimum value to scale to in response to a scale in event.
         */
    var MinCapacity: ResourceCapacity
    /**
         * The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your behalf.
         */
    var RoleARN: ResourceIdMaxLen1600
    /**
         * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
  }
  
  
  trait ScalableTargetAction extends js.Object {
    /**
         * The maximum capacity.
         */
    var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
    /**
         * The minimum capacity.
         */
    var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  }
  
  
  trait ScalingActivity extends js.Object {
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
         * The identifier of the resource associated with the scaling activity. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
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
  
  
  trait ScalingPolicy extends js.Object {
    /**
         * The CloudWatch alarms associated with the scaling policy.
         */
    var Alarms: js.UndefOr[Alarms] = js.undefined
    /**
         * The Unix timestamp for when the scaling policy was created.
         */
    var CreationTime: TimestampType
    /**
         * The Amazon Resource Name (ARN) of the scaling policy.
         */
    var PolicyARN: ResourceIdMaxLen1600
    /**
         * The name of the scaling policy.
         */
    var PolicyName: PolicyName
    /**
         * The scaling policy type.
         */
    var PolicyType: PolicyType
    /**
         * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
    /**
         * A step scaling policy.
         */
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined
    /**
         * A target tracking policy.
         */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined
  }
  
  
  trait ScheduledAction extends js.Object {
    /**
         * The date and time that the scheduled action was created.
         */
    var CreationTime: TimestampType
    /**
         * The date and time that the action is scheduled to end.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
         */
    var ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    /**
         * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
         */
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined
    /**
         * The schedule for this action. The following formats are supported:   At expressions - at(yyyy-mm-ddThh:mm:ss)    Rate expressions - rate(value unit)    Cron expressions - cron(fields)    At expressions are useful for one-time schedules. Specify the time, in UTC. For rate expressions, value is a positive integer and unit is minute | minutes | hour | hours | day | days. For more information about cron expressions, see Cron Expressions in the Amazon CloudWatch Events User Guide.
         */
    var Schedule: ResourceIdMaxLen1600
    /**
         * The Amazon Resource Name (ARN) of the scheduled action.
         */
    var ScheduledActionARN: ResourceIdMaxLen1600
    /**
         * The name of the scheduled action.
         */
    var ScheduledActionName: ScheduledActionName
    /**
         * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
         */
    var ServiceNamespace: ServiceNamespace
    /**
         * The date and time that the action is scheduled to begin.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait StepAdjustment extends js.Object {
    /**
         * The lower bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the lower bound is inclusive (the metric must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold plus the lower bound). A null value indicates negative infinity.
         */
    var MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined
    /**
         * The upper bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the upper bound is exclusive (the metric must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the upper bound). A null value indicates positive infinity. The upper bound must be greater than the lower bound.
         */
    var MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
    /**
         * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current scalable dimension while a negative number removes from the current scalable dimension.
         */
    var ScalingAdjustment: ScalingAdjustment
  }
  
  
  trait StepScalingPolicyConfiguration extends js.Object {
    /**
         * The adjustment type, which specifies how the ScalingAdjustment parameter in a StepAdjustment is interpreted.
         */
    var AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined
    /**
         * The amount of time, in seconds, after a scaling activity completes where previous trigger-related scaling activities can influence future scaling events. For scale out policies, while the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out. For example, an alarm triggers a step scaling policy to scale out an Amazon ECS service by 2 tasks, the scaling activity completes successfully, and a cooldown period of 5 minutes starts. During the Cooldown period, if the alarm triggers the same policy again but at a more aggressive step adjustment to scale out the service by 3 tasks, the 2 tasks that were added in the previous scale out event are considered part of that capacity and only 1 additional task is added to the desired count. For scale in policies, the cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, Application Auto Scaling scales out your scalable target immediately.
         */
    var Cooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The aggregation type for the CloudWatch metrics. Valid values are Minimum, Maximum, and Average.
         */
    var MetricAggregationType: js.UndefOr[MetricAggregationType] = js.undefined
    /**
         * The minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
         */
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined
    /**
         * A set of adjustments that enable you to scale based on the size of the alarm breach.
         */
    var StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined
  }
  
  
  trait TargetTrackingScalingPolicyConfiguration extends js.Object {
    /**
         * A customized metric.
         */
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined
    /**
         * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
         */
    var DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined
    /**
         * A predefined metric.
         */
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined
    /**
         * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, Application Auto Scaling scales out your scalable target immediately.
         */
    var ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
         */
    var ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
         */
    var TargetValue: MetricScale
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def deleteScalingPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def deleteScalingPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScalingPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def deleteScalingPolicy(params: DeleteScalingPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def deleteScalingPolicy(
      params: DeleteScalingPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScalingPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scheduled action.
       */
    def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scheduled action.
       */
    def deleteScheduledAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScheduledActionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scheduled action.
       */
    def deleteScheduledAction(params: DeleteScheduledActionRequest): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Auto Scaling scheduled action.
       */
    def deleteScheduledAction(
      params: DeleteScheduledActionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScheduledActionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
       */
    def deregisterScalableTarget(): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
       */
    def deregisterScalableTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterScalableTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
       */
    def deregisterScalableTarget(params: DeregisterScalableTargetRequest): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
       */
    def deregisterScalableTarget(
      params: DeregisterScalableTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterScalableTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def describeScalableTargets(): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def describeScalableTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalableTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def describeScalableTargets(params: DescribeScalableTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def describeScalableTargets(
      params: DescribeScalableTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalableTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def describeScalingActivities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def describeScalingActivities(params: DescribeScalingActivitiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
       */
    def describeScalingActivities(
      params: DescribeScalingActivitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def describeScalingPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def describeScalingPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def describeScalingPolicies(params: DescribeScalingPoliciesRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def describeScalingPolicies(
      params: DescribeScalingPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def describeScheduledActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduledActionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def describeScheduledActions(params: DescribeScheduledActionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def describeScheduledActions(
      params: DescribeScheduledActionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduledActionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def putScalingPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScalingPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def putScalingPolicy(params: PutScalingPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
       */
    def putScalingPolicy(
      params: PutScalingPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScalingPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def putScheduledAction(): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def putScheduledAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScheduledActionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def putScheduledAction(params: PutScheduledActionRequest): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
       */
    def putScheduledAction(
      params: PutScheduledActionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScheduledActionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def registerScalableTarget(): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def registerScalableTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterScalableTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def registerScalableTarget(params: RegisterScalableTargetRequest): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
       */
    def registerScalableTarget(
      params: RegisterScalableTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterScalableTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AdjustmentType = awsDashSdkLib.awsDashSdkLibStrings.ChangeInCapacity | awsDashSdkLib.awsDashSdkLibStrings.PercentChangeInCapacity | awsDashSdkLib.awsDashSdkLibStrings.ExactCapacity | java.lang.String
  type Alarms = js.Array[Alarm]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  type MetricAggregationType = awsDashSdkLib.awsDashSdkLibStrings.Average | awsDashSdkLib.awsDashSdkLibStrings.Minimum | awsDashSdkLib.awsDashSdkLibStrings.Maximum | java.lang.String
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricStatistic = awsDashSdkLib.awsDashSdkLibStrings.Average | awsDashSdkLib.awsDashSdkLibStrings.Minimum | awsDashSdkLib.awsDashSdkLibStrings.Maximum | awsDashSdkLib.awsDashSdkLibStrings.SampleCount | awsDashSdkLib.awsDashSdkLibStrings.Sum | java.lang.String
  type MetricType = awsDashSdkLib.awsDashSdkLibStrings.DynamoDBReadCapacityUtilization | awsDashSdkLib.awsDashSdkLibStrings.DynamoDBWriteCapacityUtilization | awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget | awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageDatabaseConnections | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkIn | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkOut | awsDashSdkLib.awsDashSdkLibStrings.SageMakerVariantInvocationsPerInstance | awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageMemoryUtilization | java.lang.String
  type MetricUnit = java.lang.String
  type MinAdjustmentMagnitude = scala.Double
  type PolicyName = java.lang.String
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.StepScaling | awsDashSdkLib.awsDashSdkLibStrings.TargetTrackingScaling | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceId = java.lang.String
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel = java.lang.String
  type ScalableDimension = awsDashSdkLib.awsDashSdkLibStrings.`ecs:service:DesiredCount` | awsDashSdkLib.awsDashSdkLibStrings.`ec2:spot-fleet-request:TargetCapacity` | awsDashSdkLib.awsDashSdkLibStrings.`elasticmapreduce:instancegroup:InstanceCount` | awsDashSdkLib.awsDashSdkLibStrings.`appstream:fleet:DesiredCapacity` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:ReadCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:WriteCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:ReadCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:WriteCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`rds:cluster:ReadReplicaCount` | awsDashSdkLib.awsDashSdkLibStrings.`sagemaker:variant:DesiredInstanceCount` | awsDashSdkLib.awsDashSdkLibStrings.`custom-resource:ResourceType:Property` | java.lang.String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  type ScalingActivityStatusCode = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Successful | awsDashSdkLib.awsDashSdkLibStrings.Overridden | awsDashSdkLib.awsDashSdkLibStrings.Unfulfilled | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type ScalingAdjustment = scala.Double
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionName = java.lang.String
  type ScheduledActions = js.Array[ScheduledAction]
  type ServiceNamespace = awsDashSdkLib.awsDashSdkLibStrings.ecs | awsDashSdkLib.awsDashSdkLibStrings.elasticmapreduce | awsDashSdkLib.awsDashSdkLibStrings.ec2 | awsDashSdkLib.awsDashSdkLibStrings.appstream | awsDashSdkLib.awsDashSdkLibStrings.dynamodb | awsDashSdkLib.awsDashSdkLibStrings.rds | awsDashSdkLib.awsDashSdkLibStrings.sagemaker | awsDashSdkLib.awsDashSdkLibStrings.`custom-resource` | java.lang.String
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = stdLib.Date
  type XmlString = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-02-06` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

