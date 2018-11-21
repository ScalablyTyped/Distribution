package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DMS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDmsMod.DMSNs.ClientConfiguration = js.native
  /**
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
     */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
     */
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
     */
  def addTagsToResource(params: awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
     */
  def addTagsToResource(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the provided settings.
     */
  def createEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the provided settings.
     */
  def createEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the provided settings.
     */
  def createEndpoint(params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the provided settings.
     */
  def createEndpoint(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see  Working with Events and Notifications  in the AWS Database MIgration Service User Guide.
     */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see  Working with Events and Notifications  in the AWS Database MIgration Service User Guide.
     */
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see  Working with Events and Notifications  in the AWS Database MIgration Service User Guide.
     */
  def createEventSubscription(params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see  Working with Events and Notifications  in the AWS Database MIgration Service User Guide.
     */
  def createEventSubscription(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates the replication instance using the specified parameters.
     */
  def createReplicationInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates the replication instance using the specified parameters.
     */
  def createReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates the replication instance using the specified parameters.
     */
  def createReplicationInstance(params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates the replication instance using the specified parameters.
     */
  def createReplicationInstance(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     */
  def createReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     */
  def createReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     */
  def createReplicationSubnetGroup(params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     */
  def createReplicationSubnetGroup(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication task using the specified parameters.
     */
  def createReplicationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication task using the specified parameters.
     */
  def createReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication task using the specified parameters.
     */
  def createReplicationTask(params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a replication task using the specified parameters.
     */
  def createReplicationTask(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.CreateReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified certificate. 
     */
  def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified certificate. 
     */
  def deleteCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified certificate. 
     */
  def deleteCertificate(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified certificate. 
     */
  def deleteCertificate(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
     */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
     */
  def deleteEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
     */
  def deleteEndpoint(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
     */
  def deleteEndpoint(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes an AWS DMS event subscription. 
     */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes an AWS DMS event subscription. 
     */
  def deleteEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes an AWS DMS event subscription. 
     */
  def deleteEventSubscription(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes an AWS DMS event subscription. 
     */
  def deleteEventSubscription(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
     */
  def deleteReplicationInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
     */
  def deleteReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
     */
  def deleteReplicationInstance(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
     */
  def deleteReplicationInstance(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subnet group.
     */
  def deleteReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subnet group.
     */
  def deleteReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subnet group.
     */
  def deleteReplicationSubnetGroup(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subnet group.
     */
  def deleteReplicationSubnetGroup(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication task.
     */
  def deleteReplicationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication task.
     */
  def deleteReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication task.
     */
  def deleteReplicationTask(params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified replication task.
     */
  def deleteReplicationTask(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DeleteReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
     */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
     */
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
     */
  def describeAccountAttributes(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
     */
  def describeAccountAttributes(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeAccountAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a description of the certificate.
     */
  def describeCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a description of the certificate.
     */
  def describeCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a description of the certificate.
     */
  def describeCertificates(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a description of the certificate.
     */
  def describeCertificates(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
     */
  def describeConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
     */
  def describeConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
     */
  def describeConnections(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
     */
  def describeConnections(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the type of endpoints available.
     */
  def describeEndpointTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the type of endpoints available.
     */
  def describeEndpointTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the type of endpoints available.
     */
  def describeEndpointTypes(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the type of endpoints available.
     */
  def describeEndpointTypes(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints for your account in the current region.
     */
  def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints for your account in the current region.
     */
  def describeEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints for your account in the current region.
     */
  def describeEndpoints(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints for your account in the current region.
     */
  def describeEndpoints(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Working with Events and Notifications  in the AWS Database Migration Service User Guide. 
     */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Working with Events and Notifications  in the AWS Database Migration Service User Guide. 
     */
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Working with Events and Notifications  in the AWS Database Migration Service User Guide. 
     */
  def describeEventCategories(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Working with Events and Notifications  in the AWS Database Migration Service User Guide. 
     */
  def describeEventCategories(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
     */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
     */
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
     */
  def describeEventSubscriptions(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
     */
  def describeEventSubscriptions(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see  Working with Events and Notifications . 
     */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see  Working with Events and Notifications . 
     */
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see  Working with Events and Notifications . 
     */
  def describeEvents(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see  Working with Events and Notifications . 
     */
  def describeEvents(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication instance types that can be created in the specified region.
     */
  def describeOrderableReplicationInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication instance types that can be created in the specified region.
     */
  def describeOrderableReplicationInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication instance types that can be created in the specified region.
     */
  def describeOrderableReplicationInstances(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication instance types that can be created in the specified region.
     */
  def describeOrderableReplicationInstances(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeOrderableReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of the RefreshSchemas operation.
     */
  def describeRefreshSchemasStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of the RefreshSchemas operation.
     */
  def describeRefreshSchemasStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of the RefreshSchemas operation.
     */
  def describeRefreshSchemasStatus(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of the RefreshSchemas operation.
     */
  def describeRefreshSchemasStatus(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeRefreshSchemasStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the task logs for the specified task.
     */
  def describeReplicationInstanceTaskLogs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the task logs for the specified task.
     */
  def describeReplicationInstanceTaskLogs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the task logs for the specified task.
     */
  def describeReplicationInstanceTaskLogs(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the task logs for the specified task.
     */
  def describeReplicationInstanceTaskLogs(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstanceTaskLogsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication instances for your account in the current region.
     */
  def describeReplicationInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication instances for your account in the current region.
     */
  def describeReplicationInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication instances for your account in the current region.
     */
  def describeReplicationInstances(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication instances for your account in the current region.
     */
  def describeReplicationInstances(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication subnet groups.
     */
  def describeReplicationSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication subnet groups.
     */
  def describeReplicationSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication subnet groups.
     */
  def describeReplicationSubnetGroups(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the replication subnet groups.
     */
  def describeReplicationSubnetGroups(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     */
  def describeReplicationTaskAssessmentResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     */
  def describeReplicationTaskAssessmentResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     */
  def describeReplicationTaskAssessmentResults(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     */
  def describeReplicationTaskAssessmentResults(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTaskAssessmentResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication tasks for your account in the current region.
     */
  def describeReplicationTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication tasks for your account in the current region.
     */
  def describeReplicationTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication tasks for your account in the current region.
     */
  def describeReplicationTasks(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about replication tasks for your account in the current region.
     */
  def describeReplicationTasks(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeReplicationTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the schema for the specified endpoint. 
     */
  def describeSchemas(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the schema for the specified endpoint. 
     */
  def describeSchemas(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the schema for the specified endpoint. 
     */
  def describeSchemas(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the schema for the specified endpoint. 
     */
  def describeSchemas(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
     */
  def describeTableStatistics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
     */
  def describeTableStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
     */
  def describeTableStatistics(params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
     */
  def describeTableStatistics(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.DescribeTableStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads the specified certificate.
     */
  def importCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads the specified certificate.
     */
  def importCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads the specified certificate.
     */
  def importCertificate(params: awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads the specified certificate.
     */
  def importCertificate(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ImportCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for an AWS DMS resource.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for an AWS DMS resource.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for an AWS DMS resource.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for an AWS DMS resource.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified endpoint.
     */
  def modifyEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified endpoint.
     */
  def modifyEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified endpoint.
     */
  def modifyEndpoint(params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified endpoint.
     */
  def modifyEndpoint(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing AWS DMS event notification subscription. 
     */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing AWS DMS event notification subscription. 
     */
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing AWS DMS event notification subscription. 
     */
  def modifyEventSubscription(params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing AWS DMS event notification subscription. 
     */
  def modifyEventSubscription(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyEventSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
     */
  def modifyReplicationInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
     */
  def modifyReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
     */
  def modifyReplicationInstance(params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
     */
  def modifyReplicationInstance(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for the specified replication subnet group.
     */
  def modifyReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for the specified replication subnet group.
     */
  def modifyReplicationSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for the specified replication subnet group.
     */
  def modifyReplicationSubnetGroup(params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for the specified replication subnet group.
     */
  def modifyReplicationSubnetGroup(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def modifyReplicationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def modifyReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def modifyReplicationTask(params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def modifyReplicationTask(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ModifyReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
     */
  def rebootReplicationInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
     */
  def rebootReplicationInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
     */
  def rebootReplicationInstance(params: awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
     */
  def rebootReplicationInstance(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RebootReplicationInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     */
  def refreshSchemas(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     */
  def refreshSchemas(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     */
  def refreshSchemas(params: awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     */
  def refreshSchemas(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RefreshSchemasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reloads the target database table with the source data. 
     */
  def reloadTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reloads the target database table with the source data. 
     */
  def reloadTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reloads the target database table with the source data. 
     */
  def reloadTables(params: awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reloads the target database table with the source data. 
     */
  def reloadTables(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.ReloadTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a DMS resource.
     */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a DMS resource.
     */
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a DMS resource.
     */
  def removeTagsFromResource(params: awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a DMS resource.
     */
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts the replication task. For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def startReplicationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts the replication task. For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def startReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts the replication task. For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def startReplicationTask(params: awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts the replication task. For more information about AWS DMS tasks, see the AWS DMS user guide at  Working with Migration Tasks  
     */
  def startReplicationTask(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts the replication task assessment for unsupported data types in the source database. 
     */
  def startReplicationTaskAssessment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts the replication task assessment for unsupported data types in the source database. 
     */
  def startReplicationTaskAssessment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts the replication task assessment for unsupported data types in the source database. 
     */
  def startReplicationTaskAssessment(params: awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts the replication task assessment for unsupported data types in the source database. 
     */
  def startReplicationTaskAssessment(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StartReplicationTaskAssessmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the replication task. 
     */
  def stopReplicationTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the replication task. 
     */
  def stopReplicationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the replication task. 
     */
  def stopReplicationTask(params: awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the replication task. 
     */
  def stopReplicationTask(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.StopReplicationTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the connection between the replication instance and the endpoint.
     */
  def testConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the connection between the replication instance and the endpoint.
     */
  def testConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the connection between the replication instance and the endpoint.
     */
  def testConnection(params: awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the connection between the replication instance and the endpoint.
     */
  def testConnection(
    params: awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDmsMod.DMSNs.TestConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

