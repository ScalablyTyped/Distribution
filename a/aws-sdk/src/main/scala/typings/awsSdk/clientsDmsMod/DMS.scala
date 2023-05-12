package typings.awsSdk.clientsDmsMod

import typings.awsSdk.anon.DescribeConnectionsMessag
import typings.awsSdk.anon.DescribeEndpointsMessagew
import typings.awsSdk.anon.DescribeReplicationInstan
import typings.awsSdk.anon.DescribeReplicationTasksM
import typings.awsSdk.awsSdkStrings.endpointDeleted
import typings.awsSdk.awsSdkStrings.replicationInstanceAvailable
import typings.awsSdk.awsSdkStrings.replicationInstanceDeleted
import typings.awsSdk.awsSdkStrings.replicationTaskDeleted
import typings.awsSdk.awsSdkStrings.replicationTaskReady
import typings.awsSdk.awsSdkStrings.replicationTaskRunning
import typings.awsSdk.awsSdkStrings.replicationTaskStopped
import typings.awsSdk.awsSdkStrings.testConnectionSucceeds
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DMS extends Service {
  
  /**
    * Adds metadata tags to an DMS resource, including replication instance, endpoint, subnet group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS. For more information, see  Tag  data type description.
    */
  def addTagsToResource(): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]): Request[AddTagsToResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to an DMS resource, including replication instance, endpoint, subnet group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS. For more information, see  Tag  data type description.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]
  ): Request[AddTagsToResourceResponse, AWSError] = js.native
  
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  def applyPendingMaintenanceAction(callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResponse, Unit]): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  def applyPendingMaintenanceAction(
    params: ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResponse, Unit]
  ): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  
  /**
    * Starts the analysis of up to 20 source databases to recommend target engines for each source database. This is a batch version of StartRecommendations. The result of analysis of each source database is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.
    */
  def batchStartRecommendations(): Request[BatchStartRecommendationsResponse, AWSError] = js.native
  def batchStartRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ BatchStartRecommendationsResponse, Unit]): Request[BatchStartRecommendationsResponse, AWSError] = js.native
  /**
    * Starts the analysis of up to 20 source databases to recommend target engines for each source database. This is a batch version of StartRecommendations. The result of analysis of each source database is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.
    */
  def batchStartRecommendations(params: BatchStartRecommendationsRequest): Request[BatchStartRecommendationsResponse, AWSError] = js.native
  def batchStartRecommendations(
    params: BatchStartRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchStartRecommendationsResponse, Unit]
  ): Request[BatchStartRecommendationsResponse, AWSError] = js.native
  
  /**
    * Cancels a single premigration assessment run. This operation prevents any individual assessments from running if they haven't started running. It also attempts to cancel any individual assessments that are currently running.
    */
  def cancelReplicationTaskAssessmentRun(): Request[CancelReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def cancelReplicationTaskAssessmentRun(
    callback: js.Function2[/* err */ AWSError, /* data */ CancelReplicationTaskAssessmentRunResponse, Unit]
  ): Request[CancelReplicationTaskAssessmentRunResponse, AWSError] = js.native
  /**
    * Cancels a single premigration assessment run. This operation prevents any individual assessments from running if they haven't started running. It also attempts to cancel any individual assessments that are currently running.
    */
  def cancelReplicationTaskAssessmentRun(params: CancelReplicationTaskAssessmentRunMessage): Request[CancelReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def cancelReplicationTaskAssessmentRun(
    params: CancelReplicationTaskAssessmentRunMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelReplicationTaskAssessmentRunResponse, Unit]
  ): Request[CancelReplicationTaskAssessmentRunResponse, AWSError] = js.native
  
  @JSName("config")
  var config_DMS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an endpoint using the provided settings.  For a MySQL source or target endpoint, don't explicitly specify the database using the DatabaseName request parameter on the CreateEndpoint API call. Specifying DatabaseName when you create a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database only when you specify the schema in the table-mapping rules of the DMS task. 
    */
  def createEndpoint(): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates an endpoint using the provided settings.  For a MySQL source or target endpoint, don't explicitly specify the database using the DatabaseName request parameter on the CreateEndpoint API call. Specifying DatabaseName when you create a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database only when you specify the schema in the table-mapping rules of the DMS task. 
    */
  def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]
  ): Request[CreateEndpointResponse, AWSError] = js.native
  
  /**
    *  Creates an DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all DMS sources belonging to your customer account. For more information about DMS events, see Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def createEventSubscription(): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  def createEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResponse, Unit]): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  /**
    *  Creates an DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all DMS sources belonging to your customer account. For more information about DMS events, see Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResponse, Unit]
  ): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a Fleet Advisor collector using the specified parameters.
    */
  def createFleetAdvisorCollector(): Request[CreateFleetAdvisorCollectorResponse, AWSError] = js.native
  def createFleetAdvisorCollector(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetAdvisorCollectorResponse, Unit]): Request[CreateFleetAdvisorCollectorResponse, AWSError] = js.native
  /**
    * Creates a Fleet Advisor collector using the specified parameters.
    */
  def createFleetAdvisorCollector(params: CreateFleetAdvisorCollectorRequest): Request[CreateFleetAdvisorCollectorResponse, AWSError] = js.native
  def createFleetAdvisorCollector(
    params: CreateFleetAdvisorCollectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetAdvisorCollectorResponse, Unit]
  ): Request[CreateFleetAdvisorCollectorResponse, AWSError] = js.native
  
  /**
    * Creates the replication instance using the specified parameters. DMS requires that your account have certain roles with appropriate permissions before you can create a replication instance. For information on the required roles, see Creating the IAM Roles to Use With the CLI and DMS API. For information on the required permissions, see IAM Permissions Needed to Use DMS.
    */
  def createReplicationInstance(): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  def createReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationInstanceResponse, Unit]): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  /**
    * Creates the replication instance using the specified parameters. DMS requires that your account have certain roles with appropriate permissions before you can create a replication instance. For information on the required roles, see Creating the IAM Roles to Use With the CLI and DMS API. For information on the required permissions, see IAM Permissions Needed to Use DMS.
    */
  def createReplicationInstance(params: CreateReplicationInstanceMessage): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  def createReplicationInstance(
    params: CreateReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationInstanceResponse, Unit]
  ): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC. The VPC needs to have at least one subnet in at least two availability zones in the Amazon Web Services Region, otherwise the service will throw a ReplicationSubnetGroupDoesNotCoverEnoughAZs exception.
    */
  def createReplicationSubnetGroup(): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  def createReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSubnetGroupResponse, Unit]): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC. The VPC needs to have at least one subnet in at least two availability zones in the Amazon Web Services Region, otherwise the service will throw a ReplicationSubnetGroupDoesNotCoverEnoughAZs exception.
    */
  def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  def createReplicationSubnetGroup(
    params: CreateReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSubnetGroupResponse, Unit]
  ): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(): Request[CreateReplicationTaskResponse, AWSError] = js.native
  def createReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationTaskResponse, Unit]): Request[CreateReplicationTaskResponse, AWSError] = js.native
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse, AWSError] = js.native
  def createReplicationTask(
    params: CreateReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationTaskResponse, Unit]
  ): Request[CreateReplicationTaskResponse, AWSError] = js.native
  
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(): Request[DeleteCertificateResponse, AWSError] = js.native
  def deleteCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResponse, Unit]): Request[DeleteCertificateResponse, AWSError] = js.native
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse, AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResponse, Unit]
  ): Request[DeleteCertificateResponse, AWSError] = js.native
  
  /**
    * Deletes the connection between a replication instance and an endpoint.
    */
  def deleteConnection(): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes the connection between a replication instance and an endpoint.
    */
  def deleteConnection(params: DeleteConnectionMessage): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]
  ): Request[DeleteConnectionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]
  ): Request[DeleteEndpointResponse, AWSError] = js.native
  
  /**
    *  Deletes an DMS event subscription. 
    */
  def deleteEventSubscription(): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  def deleteEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResponse, Unit]): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  /**
    *  Deletes an DMS event subscription. 
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResponse, Unit]
  ): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified Fleet Advisor collector.
    */
  def deleteFleetAdvisorCollector(): Request[js.Object, AWSError] = js.native
  def deleteFleetAdvisorCollector(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Fleet Advisor collector.
    */
  def deleteFleetAdvisorCollector(params: DeleteCollectorRequest): Request[js.Object, AWSError] = js.native
  def deleteFleetAdvisorCollector(
    params: DeleteCollectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Fleet Advisor collector databases.
    */
  def deleteFleetAdvisorDatabases(): Request[DeleteFleetAdvisorDatabasesResponse, AWSError] = js.native
  def deleteFleetAdvisorDatabases(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetAdvisorDatabasesResponse, Unit]): Request[DeleteFleetAdvisorDatabasesResponse, AWSError] = js.native
  /**
    * Deletes the specified Fleet Advisor collector databases.
    */
  def deleteFleetAdvisorDatabases(params: DeleteFleetAdvisorDatabasesRequest): Request[DeleteFleetAdvisorDatabasesResponse, AWSError] = js.native
  def deleteFleetAdvisorDatabases(
    params: DeleteFleetAdvisorDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetAdvisorDatabasesResponse, Unit]
  ): Request[DeleteFleetAdvisorDatabasesResponse, AWSError] = js.native
  
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  def deleteReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationInstanceResponse, Unit]): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  def deleteReplicationInstance(
    params: DeleteReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationInstanceResponse, Unit]
  ): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  def deleteReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSubnetGroupResponse, Unit]): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  def deleteReplicationSubnetGroup(
    params: DeleteReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSubnetGroupResponse, Unit]
  ): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  def deleteReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskResponse, Unit]): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  def deleteReplicationTask(
    params: DeleteReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskResponse, Unit]
  ): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  
  /**
    * Deletes the record of a single premigration assessment run. This operation removes all metadata that DMS maintains about this assessment run. However, the operation leaves untouched all information about this assessment run that is stored in your Amazon S3 bucket.
    */
  def deleteReplicationTaskAssessmentRun(): Request[DeleteReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def deleteReplicationTaskAssessmentRun(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskAssessmentRunResponse, Unit]
  ): Request[DeleteReplicationTaskAssessmentRunResponse, AWSError] = js.native
  /**
    * Deletes the record of a single premigration assessment run. This operation removes all metadata that DMS maintains about this assessment run. However, the operation leaves untouched all information about this assessment run that is stored in your Amazon S3 bucket.
    */
  def deleteReplicationTaskAssessmentRun(params: DeleteReplicationTaskAssessmentRunMessage): Request[DeleteReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def deleteReplicationTaskAssessmentRun(
    params: DeleteReplicationTaskAssessmentRunMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskAssessmentRunResponse, Unit]
  ): Request[DeleteReplicationTaskAssessmentRunResponse, AWSError] = js.native
  
  /**
    * Lists all of the DMS attributes for a customer account. These attributes include DMS quotas for the account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by the account, such as the number of replication instances allowed. The description for each resource quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique account identifier to name each artifact used by DMS in the given region. This command does not take any parameters.
    */
  def describeAccountAttributes(): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResponse, Unit]): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  /**
    * Lists all of the DMS attributes for a customer account. These attributes include DMS quotas for the account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by the account, such as the number of replication instances allowed. The description for each resource quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique account identifier to name each artifact used by DMS in the given region. This command does not take any parameters.
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResponse, Unit]
  ): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  
  /**
    * Provides a list of individual assessments that you can specify for a new premigration assessment run, given one or more parameters. If you specify an existing migration task, this operation provides the default individual assessments you can specify for that task. Otherwise, the specified parameters model elements of a possible migration task on which to base a premigration assessment run. To use these migration task modeling parameters, you must specify an existing replication instance, a source database engine, a target database engine, and a migration type. This combination of parameters potentially limits the default individual assessments available for an assessment run created for a corresponding migration task. If you specify no parameters, this operation provides a list of all possible individual assessments that you can specify for an assessment run. If you specify any one of the task modeling parameters, you must specify all of them or the operation cannot provide a list of individual assessments. The only parameter that you can specify alone is for an existing migration task. The specified task definition then determines the default list of individual assessments that you can specify in an assessment run for the task.
    */
  def describeApplicableIndividualAssessments(): Request[DescribeApplicableIndividualAssessmentsResponse, AWSError] = js.native
  def describeApplicableIndividualAssessments(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicableIndividualAssessmentsResponse, Unit]
  ): Request[DescribeApplicableIndividualAssessmentsResponse, AWSError] = js.native
  /**
    * Provides a list of individual assessments that you can specify for a new premigration assessment run, given one or more parameters. If you specify an existing migration task, this operation provides the default individual assessments you can specify for that task. Otherwise, the specified parameters model elements of a possible migration task on which to base a premigration assessment run. To use these migration task modeling parameters, you must specify an existing replication instance, a source database engine, a target database engine, and a migration type. This combination of parameters potentially limits the default individual assessments available for an assessment run created for a corresponding migration task. If you specify no parameters, this operation provides a list of all possible individual assessments that you can specify for an assessment run. If you specify any one of the task modeling parameters, you must specify all of them or the operation cannot provide a list of individual assessments. The only parameter that you can specify alone is for an existing migration task. The specified task definition then determines the default list of individual assessments that you can specify in an assessment run for the task.
    */
  def describeApplicableIndividualAssessments(params: DescribeApplicableIndividualAssessmentsMessage): Request[DescribeApplicableIndividualAssessmentsResponse, AWSError] = js.native
  def describeApplicableIndividualAssessments(
    params: DescribeApplicableIndividualAssessmentsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicableIndividualAssessmentsResponse, Unit]
  ): Request[DescribeApplicableIndividualAssessmentsResponse, AWSError] = js.native
  
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(): Request[DescribeCertificatesResponse, AWSError] = js.native
  def describeCertificates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificatesResponse, Unit]): Request[DescribeCertificatesResponse, AWSError] = js.native
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse, AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificatesResponse, Unit]
  ): Request[DescribeCertificatesResponse, AWSError] = js.native
  
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(): Request[DescribeConnectionsResponse, AWSError] = js.native
  def describeConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]): Request[DescribeConnectionsResponse, AWSError] = js.native
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse, AWSError] = js.native
  def describeConnections(
    params: DescribeConnectionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
  
  /**
    * Returns information about the possible endpoint settings available when you create an endpoint for a specific database engine.
    */
  def describeEndpointSettings(): Request[DescribeEndpointSettingsResponse, AWSError] = js.native
  def describeEndpointSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointSettingsResponse, Unit]): Request[DescribeEndpointSettingsResponse, AWSError] = js.native
  /**
    * Returns information about the possible endpoint settings available when you create an endpoint for a specific database engine.
    */
  def describeEndpointSettings(params: DescribeEndpointSettingsMessage): Request[DescribeEndpointSettingsResponse, AWSError] = js.native
  def describeEndpointSettings(
    params: DescribeEndpointSettingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointSettingsResponse, Unit]
  ): Request[DescribeEndpointSettingsResponse, AWSError] = js.native
  
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  def describeEndpointTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointTypesResponse, Unit]): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  def describeEndpointTypes(
    params: DescribeEndpointTypesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointTypesResponse, Unit]
  ): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def describeEventCategories(): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  def describeEventCategories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventCategoriesResponse, Unit]): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventCategoriesResponse, Unit]
  ): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  def describeEventSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSubscriptionsResponse, Unit]): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSubscriptionsResponse, Unit]
  ): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on DMS events, see Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on DMS events, see Working with Events and Notifications in the Database Migration Service User Guide. 
    */
  def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the Fleet Advisor collectors in your account.
    */
  def describeFleetAdvisorCollectors(): Request[DescribeFleetAdvisorCollectorsResponse, AWSError] = js.native
  def describeFleetAdvisorCollectors(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorCollectorsResponse, Unit]
  ): Request[DescribeFleetAdvisorCollectorsResponse, AWSError] = js.native
  /**
    * Returns a list of the Fleet Advisor collectors in your account.
    */
  def describeFleetAdvisorCollectors(params: DescribeFleetAdvisorCollectorsRequest): Request[DescribeFleetAdvisorCollectorsResponse, AWSError] = js.native
  def describeFleetAdvisorCollectors(
    params: DescribeFleetAdvisorCollectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorCollectorsResponse, Unit]
  ): Request[DescribeFleetAdvisorCollectorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Fleet Advisor databases in your account.
    */
  def describeFleetAdvisorDatabases(): Request[DescribeFleetAdvisorDatabasesResponse, AWSError] = js.native
  def describeFleetAdvisorDatabases(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorDatabasesResponse, Unit]): Request[DescribeFleetAdvisorDatabasesResponse, AWSError] = js.native
  /**
    * Returns a list of Fleet Advisor databases in your account.
    */
  def describeFleetAdvisorDatabases(params: DescribeFleetAdvisorDatabasesRequest): Request[DescribeFleetAdvisorDatabasesResponse, AWSError] = js.native
  def describeFleetAdvisorDatabases(
    params: DescribeFleetAdvisorDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorDatabasesResponse, Unit]
  ): Request[DescribeFleetAdvisorDatabasesResponse, AWSError] = js.native
  
  /**
    * Provides descriptions of large-scale assessment (LSA) analyses produced by your Fleet Advisor collectors. 
    */
  def describeFleetAdvisorLsaAnalysis(): Request[DescribeFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  def describeFleetAdvisorLsaAnalysis(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorLsaAnalysisResponse, Unit]
  ): Request[DescribeFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  /**
    * Provides descriptions of large-scale assessment (LSA) analyses produced by your Fleet Advisor collectors. 
    */
  def describeFleetAdvisorLsaAnalysis(params: DescribeFleetAdvisorLsaAnalysisRequest): Request[DescribeFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  def describeFleetAdvisorLsaAnalysis(
    params: DescribeFleetAdvisorLsaAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorLsaAnalysisResponse, Unit]
  ): Request[DescribeFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  
  /**
    * Provides descriptions of the schemas discovered by your Fleet Advisor collectors.
    */
  def describeFleetAdvisorSchemaObjectSummary(): Request[DescribeFleetAdvisorSchemaObjectSummaryResponse, AWSError] = js.native
  def describeFleetAdvisorSchemaObjectSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorSchemaObjectSummaryResponse, Unit]
  ): Request[DescribeFleetAdvisorSchemaObjectSummaryResponse, AWSError] = js.native
  /**
    * Provides descriptions of the schemas discovered by your Fleet Advisor collectors.
    */
  def describeFleetAdvisorSchemaObjectSummary(params: DescribeFleetAdvisorSchemaObjectSummaryRequest): Request[DescribeFleetAdvisorSchemaObjectSummaryResponse, AWSError] = js.native
  def describeFleetAdvisorSchemaObjectSummary(
    params: DescribeFleetAdvisorSchemaObjectSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorSchemaObjectSummaryResponse, Unit]
  ): Request[DescribeFleetAdvisorSchemaObjectSummaryResponse, AWSError] = js.native
  
  /**
    * Returns a list of schemas detected by Fleet Advisor Collectors in your account.
    */
  def describeFleetAdvisorSchemas(): Request[DescribeFleetAdvisorSchemasResponse, AWSError] = js.native
  def describeFleetAdvisorSchemas(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorSchemasResponse, Unit]): Request[DescribeFleetAdvisorSchemasResponse, AWSError] = js.native
  /**
    * Returns a list of schemas detected by Fleet Advisor Collectors in your account.
    */
  def describeFleetAdvisorSchemas(params: DescribeFleetAdvisorSchemasRequest): Request[DescribeFleetAdvisorSchemasResponse, AWSError] = js.native
  def describeFleetAdvisorSchemas(
    params: DescribeFleetAdvisorSchemasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetAdvisorSchemasResponse, Unit]
  ): Request[DescribeFleetAdvisorSchemasResponse, AWSError] = js.native
  
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  def describeOrderableReplicationInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrderableReplicationInstancesResponse, Unit]
  ): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  def describeOrderableReplicationInstances(
    params: DescribeOrderableReplicationInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrderableReplicationInstancesResponse, Unit]
  ): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingMaintenanceActionsResponse, Unit]
  ): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingMaintenanceActionsResponse, Unit]
  ): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of limitations for recommendations of target Amazon Web Services engines.
    */
  def describeRecommendationLimitations(): Request[DescribeRecommendationLimitationsResponse, AWSError] = js.native
  def describeRecommendationLimitations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationLimitationsResponse, Unit]
  ): Request[DescribeRecommendationLimitationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of limitations for recommendations of target Amazon Web Services engines.
    */
  def describeRecommendationLimitations(params: DescribeRecommendationLimitationsRequest): Request[DescribeRecommendationLimitationsResponse, AWSError] = js.native
  def describeRecommendationLimitations(
    params: DescribeRecommendationLimitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationLimitationsResponse, Unit]
  ): Request[DescribeRecommendationLimitationsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of target engine recommendations for your source databases.
    */
  def describeRecommendations(): Request[DescribeRecommendationsResponse, AWSError] = js.native
  def describeRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationsResponse, Unit]): Request[DescribeRecommendationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of target engine recommendations for your source databases.
    */
  def describeRecommendations(params: DescribeRecommendationsRequest): Request[DescribeRecommendationsResponse, AWSError] = js.native
  def describeRecommendations(
    params: DescribeRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationsResponse, Unit]
  ): Request[DescribeRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  def describeRefreshSchemasStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshSchemasStatusResponse, Unit]): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  def describeRefreshSchemasStatus(
    params: DescribeRefreshSchemasStatusMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshSchemasStatusResponse, Unit]
  ): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstanceTaskLogsResponse, Unit]
  ): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    params: DescribeReplicationInstanceTaskLogsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstanceTaskLogsResponse, Unit]
  ): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  def describeReplicationInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(params: DescribeReplicationInstancesMessage): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  def describeReplicationInstances(
    params: DescribeReplicationInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  def describeReplicationSubnetGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationSubnetGroupsResponse, Unit]
  ): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  def describeReplicationSubnetGroups(
    params: DescribeReplicationSubnetGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationSubnetGroupsResponse, Unit]
  ): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  
  /**
    * Returns the task assessment results from the Amazon S3 bucket that DMS creates in your Amazon Web Services account. This action always returns the latest results. For more information about DMS task assessments, see Creating a task assessment report in the Database Migration Service User Guide.
    */
  def describeReplicationTaskAssessmentResults(): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentResults(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  /**
    * Returns the task assessment results from the Amazon S3 bucket that DMS creates in your Amazon Web Services account. This action always returns the latest results. For more information about DMS task assessments, see Creating a task assessment report in the Database Migration Service User Guide.
    */
  def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentResults(
    params: DescribeReplicationTaskAssessmentResultsMessage,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of premigration assessment runs based on filter settings. These filter settings can specify a combination of premigration assessment runs, migration tasks, replication instances, and assessment run status values.  This operation doesn't return information about individual assessments. For this information, see the DescribeReplicationTaskIndividualAssessments operation.  
    */
  def describeReplicationTaskAssessmentRuns(): Request[DescribeReplicationTaskAssessmentRunsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentRuns(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTaskAssessmentRunsResponse, Unit]
  ): Request[DescribeReplicationTaskAssessmentRunsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of premigration assessment runs based on filter settings. These filter settings can specify a combination of premigration assessment runs, migration tasks, replication instances, and assessment run status values.  This operation doesn't return information about individual assessments. For this information, see the DescribeReplicationTaskIndividualAssessments operation.  
    */
  def describeReplicationTaskAssessmentRuns(params: DescribeReplicationTaskAssessmentRunsMessage): Request[DescribeReplicationTaskAssessmentRunsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentRuns(
    params: DescribeReplicationTaskAssessmentRunsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTaskAssessmentRunsResponse, Unit]
  ): Request[DescribeReplicationTaskAssessmentRunsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of individual assessments based on filter settings. These filter settings can specify a combination of premigration assessment runs, migration tasks, and assessment status values.
    */
  def describeReplicationTaskIndividualAssessments(): Request[DescribeReplicationTaskIndividualAssessmentsResponse, AWSError] = js.native
  def describeReplicationTaskIndividualAssessments(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskIndividualAssessmentsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskIndividualAssessmentsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of individual assessments based on filter settings. These filter settings can specify a combination of premigration assessment runs, migration tasks, and assessment status values.
    */
  def describeReplicationTaskIndividualAssessments(params: DescribeReplicationTaskIndividualAssessmentsMessage): Request[DescribeReplicationTaskIndividualAssessmentsResponse, AWSError] = js.native
  def describeReplicationTaskIndividualAssessments(
    params: DescribeReplicationTaskIndividualAssessmentsMessage,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskIndividualAssessmentsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskIndividualAssessmentsResponse, AWSError] = js.native
  
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  def describeReplicationTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(params: DescribeReplicationTasksMessage): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  def describeReplicationTasks(
    params: DescribeReplicationTasksMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(): Request[DescribeSchemasResponse, AWSError] = js.native
  def describeSchemas(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemasResponse, Unit]): Request[DescribeSchemasResponse, AWSError] = js.native
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(params: DescribeSchemasMessage): Request[DescribeSchemasResponse, AWSError] = js.native
  def describeSchemas(
    params: DescribeSchemasMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemasResponse, Unit]
  ): Request[DescribeSchemasResponse, AWSError] = js.native
  
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  def describeTableStatistics(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableStatisticsResponse, Unit]): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(params: DescribeTableStatisticsMessage): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  def describeTableStatistics(
    params: DescribeTableStatisticsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableStatisticsResponse, Unit]
  ): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]): Request[ImportCertificateResponse, AWSError] = js.native
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(params: ImportCertificateMessage): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(
    params: ImportCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]
  ): Request[ImportCertificateResponse, AWSError] = js.native
  
  /**
    * Lists all metadata tags attached to an DMS resource, including replication instance, endpoint, subnet group, and migration task. For more information, see  Tag  data type description.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all metadata tags attached to an DMS resource, including replication instance, endpoint, subnet group, and migration task. For more information, see  Tag  data type description.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the specified endpoint.  For a MySQL source or target endpoint, don't explicitly specify the database using the DatabaseName request parameter on the ModifyEndpoint API call. Specifying DatabaseName when you modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database only when you specify the schema in the table-mapping rules of the DMS task. 
    */
  def modifyEndpoint(): Request[ModifyEndpointResponse, AWSError] = js.native
  def modifyEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEndpointResponse, Unit]): Request[ModifyEndpointResponse, AWSError] = js.native
  /**
    * Modifies the specified endpoint.  For a MySQL source or target endpoint, don't explicitly specify the database using the DatabaseName request parameter on the ModifyEndpoint API call. Specifying DatabaseName when you modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database only when you specify the schema in the table-mapping rules of the DMS task. 
    */
  def modifyEndpoint(params: ModifyEndpointMessage): Request[ModifyEndpointResponse, AWSError] = js.native
  def modifyEndpoint(
    params: ModifyEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEndpointResponse, Unit]
  ): Request[ModifyEndpointResponse, AWSError] = js.native
  
  /**
    * Modifies an existing DMS event notification subscription. 
    */
  def modifyEventSubscription(): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  def modifyEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResponse, Unit]): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  /**
    * Modifies an existing DMS event notification subscription. 
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResponse, Unit]
  ): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  def modifyReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationInstanceResponse, Unit]): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(params: ModifyReplicationInstanceMessage): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  def modifyReplicationInstance(
    params: ModifyReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationInstanceResponse, Unit]
  ): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  def modifyReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationSubnetGroupResponse, Unit]): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  def modifyReplicationSubnetGroup(
    params: ModifyReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationSubnetGroupResponse, Unit]
  ): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about DMS tasks, see Working with Migration Tasks in the Database Migration Service User Guide.
    */
  def modifyReplicationTask(): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  def modifyReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationTaskResponse, Unit]): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about DMS tasks, see Working with Migration Tasks in the Database Migration Service User Guide.
    */
  def modifyReplicationTask(params: ModifyReplicationTaskMessage): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  def modifyReplicationTask(
    params: ModifyReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationTaskResponse, Unit]
  ): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  
  /**
    * Moves a replication task from its current replication instance to a different target replication instance using the specified parameters. The target replication instance must be created with the same or later DMS version as the current replication instance.
    */
  def moveReplicationTask(): Request[MoveReplicationTaskResponse, AWSError] = js.native
  def moveReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ MoveReplicationTaskResponse, Unit]): Request[MoveReplicationTaskResponse, AWSError] = js.native
  /**
    * Moves a replication task from its current replication instance to a different target replication instance using the specified parameters. The target replication instance must be created with the same or later DMS version as the current replication instance.
    */
  def moveReplicationTask(params: MoveReplicationTaskMessage): Request[MoveReplicationTaskResponse, AWSError] = js.native
  def moveReplicationTask(
    params: MoveReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ MoveReplicationTaskResponse, Unit]
  ): Request[MoveReplicationTaskResponse, AWSError] = js.native
  
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  def rebootReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootReplicationInstanceResponse, Unit]): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(params: RebootReplicationInstanceMessage): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  def rebootReplicationInstance(
    params: RebootReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootReplicationInstanceResponse, Unit]
  ): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(): Request[RefreshSchemasResponse, AWSError] = js.native
  def refreshSchemas(callback: js.Function2[/* err */ AWSError, /* data */ RefreshSchemasResponse, Unit]): Request[RefreshSchemasResponse, AWSError] = js.native
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse, AWSError] = js.native
  def refreshSchemas(
    params: RefreshSchemasMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RefreshSchemasResponse, Unit]
  ): Request[RefreshSchemasResponse, AWSError] = js.native
  
  /**
    * Reloads the target database table with the source data.  You can only use this operation with a task in the RUNNING state, otherwise the service will throw an InvalidResourceStateFault exception.
    */
  def reloadTables(): Request[ReloadTablesResponse, AWSError] = js.native
  def reloadTables(callback: js.Function2[/* err */ AWSError, /* data */ ReloadTablesResponse, Unit]): Request[ReloadTablesResponse, AWSError] = js.native
  /**
    * Reloads the target database table with the source data.  You can only use this operation with a task in the RUNNING state, otherwise the service will throw an InvalidResourceStateFault exception.
    */
  def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse, AWSError] = js.native
  def reloadTables(
    params: ReloadTablesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReloadTablesResponse, Unit]
  ): Request[ReloadTablesResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags from an DMS resource, including replication instance, endpoint, subnet group, and migration task. For more information, see  Tag  data type description.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from an DMS resource, including replication instance, endpoint, subnet group, and migration task. For more information, see  Tag  data type description.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]
  ): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  
  /**
    * Runs large-scale assessment (LSA) analysis on every Fleet Advisor collector in your account.
    */
  def runFleetAdvisorLsaAnalysis(): Request[RunFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  def runFleetAdvisorLsaAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ RunFleetAdvisorLsaAnalysisResponse, Unit]): Request[RunFleetAdvisorLsaAnalysisResponse, AWSError] = js.native
  
  /**
    * Starts the analysis of your source database to provide recommendations of target engines. You can create recommendations for multiple source databases using BatchStartRecommendations.
    */
  def startRecommendations(): Request[js.Object, AWSError] = js.native
  def startRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts the analysis of your source database to provide recommendations of target engines. You can create recommendations for multiple source databases using BatchStartRecommendations.
    */
  def startRecommendations(params: StartRecommendationsRequest): Request[js.Object, AWSError] = js.native
  def startRecommendations(
    params: StartRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts the replication task. For more information about DMS tasks, see Working with Migration Tasks  in the Database Migration Service User Guide. 
    */
  def startReplicationTask(): Request[StartReplicationTaskResponse, AWSError] = js.native
  def startReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskResponse, Unit]): Request[StartReplicationTaskResponse, AWSError] = js.native
  /**
    * Starts the replication task. For more information about DMS tasks, see Working with Migration Tasks  in the Database Migration Service User Guide. 
    */
  def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse, AWSError] = js.native
  def startReplicationTask(
    params: StartReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskResponse, Unit]
  ): Request[StartReplicationTaskResponse, AWSError] = js.native
  
  /**
    *  Starts the replication task assessment for unsupported data types in the source database.  You can only use this operation for a task if the following conditions are true:   The task must be in the stopped state.   The task must have successful connections to the source and target.   If either of these conditions are not met, an InvalidResourceStateFault error will result.  For information about DMS task assessments, see Creating a task assessment report in the Database Migration Service User Guide.
    */
  def startReplicationTaskAssessment(): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  def startReplicationTaskAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentResponse, Unit]
  ): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  /**
    *  Starts the replication task assessment for unsupported data types in the source database.  You can only use this operation for a task if the following conditions are true:   The task must be in the stopped state.   The task must have successful connections to the source and target.   If either of these conditions are not met, an InvalidResourceStateFault error will result.  For information about DMS task assessments, see Creating a task assessment report in the Database Migration Service User Guide.
    */
  def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  def startReplicationTaskAssessment(
    params: StartReplicationTaskAssessmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentResponse, Unit]
  ): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  
  /**
    * Starts a new premigration assessment run for one or more individual assessments of a migration task. The assessments that you can specify depend on the source and target database engine and the migration type defined for the given task. To run this operation, your migration task must already be created. After you run this operation, you can review the status of each individual assessment. You can also run the migration task manually after the assessment run and its individual assessments complete.
    */
  def startReplicationTaskAssessmentRun(): Request[StartReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def startReplicationTaskAssessmentRun(
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentRunResponse, Unit]
  ): Request[StartReplicationTaskAssessmentRunResponse, AWSError] = js.native
  /**
    * Starts a new premigration assessment run for one or more individual assessments of a migration task. The assessments that you can specify depend on the source and target database engine and the migration type defined for the given task. To run this operation, your migration task must already be created. After you run this operation, you can review the status of each individual assessment. You can also run the migration task manually after the assessment run and its individual assessments complete.
    */
  def startReplicationTaskAssessmentRun(params: StartReplicationTaskAssessmentRunMessage): Request[StartReplicationTaskAssessmentRunResponse, AWSError] = js.native
  def startReplicationTaskAssessmentRun(
    params: StartReplicationTaskAssessmentRunMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentRunResponse, Unit]
  ): Request[StartReplicationTaskAssessmentRunResponse, AWSError] = js.native
  
  /**
    * Stops the replication task.
    */
  def stopReplicationTask(): Request[StopReplicationTaskResponse, AWSError] = js.native
  def stopReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ StopReplicationTaskResponse, Unit]): Request[StopReplicationTaskResponse, AWSError] = js.native
  /**
    * Stops the replication task.
    */
  def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse, AWSError] = js.native
  def stopReplicationTask(
    params: StopReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopReplicationTaskResponse, Unit]
  ): Request[StopReplicationTaskResponse, AWSError] = js.native
  
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(): Request[TestConnectionResponse, AWSError] = js.native
  def testConnection(callback: js.Function2[/* err */ AWSError, /* data */ TestConnectionResponse, Unit]): Request[TestConnectionResponse, AWSError] = js.native
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse, AWSError] = js.native
  def testConnection(
    params: TestConnectionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TestConnectionResponse, Unit]
  ): Request[TestConnectionResponse, AWSError] = js.native
  
  /**
    * Migrates 10 active and enabled Amazon SNS subscriptions at a time and converts them to corresponding Amazon EventBridge rules. By default, this operation migrates subscriptions only when all your replication instance versions are 3.4.6 or higher. If any replication instances are from versions earlier than 3.4.6, the operation raises an error and tells you to upgrade these instances to version 3.4.6 or higher. To enable migration regardless of version, set the Force option to true. However, if you don't upgrade instances earlier than version 3.4.6, some types of events might not be available when you use Amazon EventBridge. To call this operation, make sure that you have certain permissions added to your user account. For more information, see Migrating event subscriptions to Amazon EventBridge in the Amazon Web Services Database Migration Service User Guide.
    */
  def updateSubscriptionsToEventBridge(): Request[UpdateSubscriptionsToEventBridgeResponse, AWSError] = js.native
  def updateSubscriptionsToEventBridge(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionsToEventBridgeResponse, Unit]
  ): Request[UpdateSubscriptionsToEventBridgeResponse, AWSError] = js.native
  /**
    * Migrates 10 active and enabled Amazon SNS subscriptions at a time and converts them to corresponding Amazon EventBridge rules. By default, this operation migrates subscriptions only when all your replication instance versions are 3.4.6 or higher. If any replication instances are from versions earlier than 3.4.6, the operation raises an error and tells you to upgrade these instances to version 3.4.6 or higher. To enable migration regardless of version, set the Force option to true. However, if you don't upgrade instances earlier than version 3.4.6, some types of events might not be available when you use Amazon EventBridge. To call this operation, make sure that you have certain permissions added to your user account. For more information, see Migrating event subscriptions to Amazon EventBridge in the Amazon Web Services Database Migration Service User Guide.
    */
  def updateSubscriptionsToEventBridge(params: UpdateSubscriptionsToEventBridgeMessage): Request[UpdateSubscriptionsToEventBridgeResponse, AWSError] = js.native
  def updateSubscriptionsToEventBridge(
    params: UpdateSubscriptionsToEventBridgeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionsToEventBridgeResponse, Unit]
  ): Request[UpdateSubscriptionsToEventBridgeResponse, AWSError] = js.native
  
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted): Request[DescribeEndpointsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted, params: DescribeEndpointsMessagew): Request[DescribeEndpointsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    params: DescribeEndpointsMessagew,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(state: replicationInstanceAvailable): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: replicationInstanceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(state: replicationInstanceAvailable, params: DescribeReplicationInstan): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: replicationInstanceAvailable,
    params: DescribeReplicationInstan,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(state: replicationInstanceDeleted): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: replicationInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(state: replicationInstanceDeleted, params: DescribeReplicationInstan): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: replicationInstanceDeleted,
    params: DescribeReplicationInstan,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(state: replicationTaskDeleted): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: replicationTaskDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(state: replicationTaskDeleted, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: replicationTaskDeleted,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(state: replicationTaskReady): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: replicationTaskReady,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(state: replicationTaskReady, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: replicationTaskReady,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(state: replicationTaskRunning): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: replicationTaskRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(state: replicationTaskRunning, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: replicationTaskRunning,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(state: replicationTaskStopped): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: replicationTaskStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(state: replicationTaskStopped, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: replicationTaskStopped,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(state: testConnectionSucceeds): Request[DescribeConnectionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: testConnectionSucceeds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(state: testConnectionSucceeds, params: DescribeConnectionsMessag): Request[DescribeConnectionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: testConnectionSucceeds,
    params: DescribeConnectionsMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
}
