package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DMS: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applyPendingMaintenanceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplyPendingMaintenanceActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applyPendingMaintenanceAction(
    params: ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplyPendingMaintenanceActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint using the provided settings.
    */
  def createEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint using the provided settings.
    */
  def createEndpoint(params: CreateEndpointMessage): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the replication instance using the specified parameters.
    */
  def createReplicationInstance(): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the replication instance using the specified parameters.
    */
  def createReplicationInstance(params: CreateReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationInstance(
    params: CreateReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC.
    */
  def createReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC.
    */
  def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationSubnetGroup(
    params: CreateReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(params: CreateReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationTask(
    params: CreateReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(params: DeleteCertificateMessage): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(params: DeleteEndpointMessage): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes an AWS DMS event subscription. 
    */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes an AWS DMS event subscription. 
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationInstance(
    params: DeleteReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationSubnetGroup(
    params: DeleteReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(params: DeleteReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationTask(
    params: DeleteReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
    */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(params: DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(params: DescribeConnectionsMessage): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConnections(
    params: DescribeConnectionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(params: DescribeEndpointTypesMessage): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointTypes(
    params: DescribeEndpointTypesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(params: DescribeEndpointsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
    */
  def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrderableReplicationInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrderableReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrderableReplicationInstances(
    params: DescribeOrderableReplicationInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrderableReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[DescribePendingMaintenanceActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePendingMaintenanceActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePendingMaintenanceActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[DescribePendingMaintenanceActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePendingMaintenanceActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePendingMaintenanceActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRefreshSchemasStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRefreshSchemasStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRefreshSchemasStatus(
    params: DescribeRefreshSchemasStatusMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRefreshSchemasStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstanceTaskLogsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    params: DescribeReplicationInstanceTaskLogsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstanceTaskLogsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(params: DescribeReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationInstances(
    params: DescribeReplicationInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationSubnetGroups(
    params: DescribeReplicationSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the task assessment results from Amazon S3. This action always returns the latest results.
    */
  def describeReplicationTaskAssessmentResults(): awsDashSdkLib.libRequestMod.Request[
    DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReplicationTaskAssessmentResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the task assessment results from Amazon S3. This action always returns the latest results.
    */
  def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): awsDashSdkLib.libRequestMod.Request[
    DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReplicationTaskAssessmentResults(
    params: DescribeReplicationTaskAssessmentResultsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(params: DescribeReplicationTasksMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReplicationTasks(
    params: DescribeReplicationTasksMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchemas(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(params: DescribeSchemasMessage): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchemas(
    params: DescribeSchemasMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTableStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTableStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(params: DescribeTableStatisticsMessage): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTableStatistics(
    params: DescribeTableStatisticsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTableStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(params: ImportCertificateMessage): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importCertificate(
    params: ImportCertificateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags for an AWS DMS resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags for an AWS DMS resource.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified endpoint.
    */
  def modifyEndpoint(): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified endpoint.
    */
  def modifyEndpoint(params: ModifyEndpointMessage): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEndpoint(
    params: ModifyEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing AWS DMS event notification subscription. 
    */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing AWS DMS event notification subscription. 
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(params: ModifyReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationInstance(
    params: ModifyReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationSubnetGroup(
    params: ModifyReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
    */
  def modifyReplicationTask(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
    */
  def modifyReplicationTask(params: ModifyReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyReplicationTask(
    params: ModifyReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(params: RebootReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootReplicationInstance(
    params: RebootReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def refreshSchemas(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RefreshSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(params: RefreshSchemasMessage): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def refreshSchemas(
    params: RefreshSchemasMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RefreshSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reloads the target database table with the source data. 
    */
  def reloadTables(): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reloadTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReloadTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reloads the target database table with the source data. 
    */
  def reloadTables(params: ReloadTablesMessage): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reloadTables(
    params: ReloadTablesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReloadTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from a DMS resource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from a DMS resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
    */
  def startReplicationTask(): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
    */
  def startReplicationTask(params: StartReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReplicationTask(
    params: StartReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts the replication task assessment for unsupported data types in the source database. 
    */
  def startReplicationTaskAssessment(): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReplicationTaskAssessment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReplicationTaskAssessmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts the replication task assessment for unsupported data types in the source database. 
    */
  def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReplicationTaskAssessment(
    params: StartReplicationTaskAssessmentMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReplicationTaskAssessmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the replication task. 
    */
  def stopReplicationTask(): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the replication task. 
    */
  def stopReplicationTask(params: StopReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopReplicationTask(
    params: StopReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(params: TestConnectionMessage): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testConnection(
    params: TestConnectionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: DescribeEndpointsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: DescribeEndpointsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
    params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
    params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
    params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
    params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
    params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
    params: DescribeConnectionsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
    params: DescribeConnectionsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

