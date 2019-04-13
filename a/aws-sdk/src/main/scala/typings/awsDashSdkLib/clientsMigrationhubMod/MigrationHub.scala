package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationHub
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MigrationHub: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration task performed by a migration tool. This API has the following traits:   Migration tools can call the AssociateCreatedArtifact operation to indicate which AWS artifact is associated with a migration task.   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.  
    */
  def associateCreatedArtifact(): awsDashSdkLib.libRequestMod.Request[AssociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateCreatedArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateCreatedArtifactResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration task performed by a migration tool. This API has the following traits:   Migration tools can call the AssociateCreatedArtifact operation to indicate which AWS artifact is associated with a migration task.   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.  
    */
  def associateCreatedArtifact(params: AssociateCreatedArtifactRequest): awsDashSdkLib.libRequestMod.Request[AssociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateCreatedArtifact(
    params: AssociateCreatedArtifactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateCreatedArtifactResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
    */
  def associateDiscoveredResource(): awsDashSdkLib.libRequestMod.Request[AssociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDiscoveredResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDiscoveredResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
    */
  def associateDiscoveredResource(params: AssociateDiscoveredResourceRequest): awsDashSdkLib.libRequestMod.Request[AssociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDiscoveredResource(
    params: AssociateDiscoveredResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDiscoveredResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account because it is scoped to the AWS account.
    */
  def createProgressUpdateStream(): awsDashSdkLib.libRequestMod.Request[CreateProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProgressUpdateStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProgressUpdateStreamResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account because it is scoped to the AWS account.
    */
  def createProgressUpdateStream(params: CreateProgressUpdateStreamRequest): awsDashSdkLib.libRequestMod.Request[CreateProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProgressUpdateStream(
    params: CreateProgressUpdateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProgressUpdateStreamResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a progress update stream, including all of its tasks, which was previously created as an AWS resource used for access control. This API has the following traits:   The only parameter needed for DeleteProgressUpdateStream is the stream name (same as a CreateProgressUpdateStream call).   The call will return, and a background process will asynchronously delete the stream and all of its resources (tasks, associated resources, resource attributes, created artifacts).   If the stream takes time to be deleted, it might still show up on a ListProgressUpdateStreams call.    CreateProgressUpdateStream, ImportMigrationTask, NotifyMigrationTaskState, and all Associate[*] APIs realted to the tasks belonging to the stream will throw "InvalidInputException" if the stream of the same name is in the process of being deleted.   Once the stream and all of its resources are deleted, CreateProgressUpdateStream for a stream of the same name will succeed, and that stream will be an entirely new logical resource (without any resources associated with the old stream).  
    */
  def deleteProgressUpdateStream(): awsDashSdkLib.libRequestMod.Request[DeleteProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProgressUpdateStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProgressUpdateStreamResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a progress update stream, including all of its tasks, which was previously created as an AWS resource used for access control. This API has the following traits:   The only parameter needed for DeleteProgressUpdateStream is the stream name (same as a CreateProgressUpdateStream call).   The call will return, and a background process will asynchronously delete the stream and all of its resources (tasks, associated resources, resource attributes, created artifacts).   If the stream takes time to be deleted, it might still show up on a ListProgressUpdateStreams call.    CreateProgressUpdateStream, ImportMigrationTask, NotifyMigrationTaskState, and all Associate[*] APIs realted to the tasks belonging to the stream will throw "InvalidInputException" if the stream of the same name is in the process of being deleted.   Once the stream and all of its resources are deleted, CreateProgressUpdateStream for a stream of the same name will succeed, and that stream will be an entirely new logical resource (without any resources associated with the old stream).  
    */
  def deleteProgressUpdateStream(params: DeleteProgressUpdateStreamRequest): awsDashSdkLib.libRequestMod.Request[DeleteProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProgressUpdateStream(
    params: DeleteProgressUpdateStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProgressUpdateStreamResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProgressUpdateStreamResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the migration status of an application.
    */
  def describeApplicationState(): awsDashSdkLib.libRequestMod.Request[DescribeApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeApplicationState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeApplicationStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the migration status of an application.
    */
  def describeApplicationState(params: DescribeApplicationStateRequest): awsDashSdkLib.libRequestMod.Request[DescribeApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeApplicationState(
    params: DescribeApplicationStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeApplicationStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all attributes associated with a specific migration task.
    */
  def describeMigrationTask(): awsDashSdkLib.libRequestMod.Request[DescribeMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMigrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMigrationTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all attributes associated with a specific migration task.
    */
  def describeMigrationTask(params: DescribeMigrationTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMigrationTask(
    params: DescribeMigrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMigrationTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was previously associated. This API has the following traits:   A migration user can call the DisassociateCreatedArtifacts operation to disassociate a created AWS Artifact from a migration task.   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.  
    */
  def disassociateCreatedArtifact(): awsDashSdkLib.libRequestMod.Request[DisassociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateCreatedArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateCreatedArtifactResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was previously associated. This API has the following traits:   A migration user can call the DisassociateCreatedArtifacts operation to disassociate a created AWS Artifact from a migration task.   The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information about type and region; for example: arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.   Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.  
    */
  def disassociateCreatedArtifact(params: DisassociateCreatedArtifactRequest): awsDashSdkLib.libRequestMod.Request[DisassociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateCreatedArtifact(
    params: DisassociateCreatedArtifactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateCreatedArtifactResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateCreatedArtifactResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
    */
  def disassociateDiscoveredResource(): awsDashSdkLib.libRequestMod.Request[DisassociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDiscoveredResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDiscoveredResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
    */
  def disassociateDiscoveredResource(params: DisassociateDiscoveredResourceRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDiscoveredResource(
    params: DisassociateDiscoveredResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDiscoveredResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDiscoveredResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration tool. This API is a prerequisite to calling the NotifyMigrationTaskState API as the migration tool must first register the migration task with Migration Hub.
    */
  def importMigrationTask(): awsDashSdkLib.libRequestMod.Request[ImportMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importMigrationTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportMigrationTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration tool. This API is a prerequisite to calling the NotifyMigrationTaskState API as the migration tool must first register the migration task with Migration Hub.
    */
  def importMigrationTask(params: ImportMigrationTaskRequest): awsDashSdkLib.libRequestMod.Request[ImportMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importMigrationTask(
    params: ImportMigrationTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportMigrationTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportMigrationTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the created artifacts attached to a given migration task in an update stream. This API has the following traits:   Gets the list of the created artifacts while migration is taking place.   Shows the artifacts created by the migration tool that was associated by the AssociateCreatedArtifact API.    Lists created artifacts in a paginated interface.   
    */
  def listCreatedArtifacts(): awsDashSdkLib.libRequestMod.Request[ListCreatedArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCreatedArtifacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCreatedArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCreatedArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the created artifacts attached to a given migration task in an update stream. This API has the following traits:   Gets the list of the created artifacts while migration is taking place.   Shows the artifacts created by the migration tool that was associated by the AssociateCreatedArtifact API.    Lists created artifacts in a paginated interface.   
    */
  def listCreatedArtifacts(params: ListCreatedArtifactsRequest): awsDashSdkLib.libRequestMod.Request[ListCreatedArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCreatedArtifacts(
    params: ListCreatedArtifactsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCreatedArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCreatedArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists discovered resources associated with the given MigrationTask.
    */
  def listDiscoveredResources(): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDiscoveredResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDiscoveredResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists discovered resources associated with the given MigrationTask.
    */
  def listDiscoveredResources(params: ListDiscoveredResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDiscoveredResources(
    params: ListDiscoveredResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDiscoveredResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This API has the following traits:   Can show a summary list of the most recent migration tasks.   Can show a summary list of migration tasks associated with a given discovered resource.   Lists migration tasks in a paginated interface.  
    */
  def listMigrationTasks(): awsDashSdkLib.libRequestMod.Request[ListMigrationTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMigrationTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMigrationTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMigrationTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This API has the following traits:   Can show a summary list of the most recent migration tasks.   Can show a summary list of migration tasks associated with a given discovered resource.   Lists migration tasks in a paginated interface.  
    */
  def listMigrationTasks(params: ListMigrationTasksRequest): awsDashSdkLib.libRequestMod.Request[ListMigrationTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMigrationTasks(
    params: ListMigrationTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMigrationTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMigrationTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists progress update streams associated with the user account making this call.
    */
  def listProgressUpdateStreams(): awsDashSdkLib.libRequestMod.Request[ListProgressUpdateStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProgressUpdateStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProgressUpdateStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProgressUpdateStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists progress update streams associated with the user account making this call.
    */
  def listProgressUpdateStreams(params: ListProgressUpdateStreamsRequest): awsDashSdkLib.libRequestMod.Request[ListProgressUpdateStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProgressUpdateStreams(
    params: ListProgressUpdateStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProgressUpdateStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProgressUpdateStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the migration state of an application. For a given application identified by the value passed to ApplicationId, its status is set or updated by passing one of three values to Status: NOT_STARTED | IN_PROGRESS | COMPLETED.
    */
  def notifyApplicationState(): awsDashSdkLib.libRequestMod.Request[NotifyApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def notifyApplicationState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotifyApplicationStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotifyApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the migration state of an application. For a given application identified by the value passed to ApplicationId, its status is set or updated by passing one of three values to Status: NOT_STARTED | IN_PROGRESS | COMPLETED.
    */
  def notifyApplicationState(params: NotifyApplicationStateRequest): awsDashSdkLib.libRequestMod.Request[NotifyApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def notifyApplicationState(
    params: NotifyApplicationStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotifyApplicationStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotifyApplicationStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has the following traits:   Migration tools will call the NotifyMigrationTaskState API to share the latest progress and status.    MigrationTaskName is used for addressing updates to the correct target.    ProgressUpdateStream is used for access control and to provide a namespace for each migration tool.  
    */
  def notifyMigrationTaskState(): awsDashSdkLib.libRequestMod.Request[NotifyMigrationTaskStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def notifyMigrationTaskState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotifyMigrationTaskStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotifyMigrationTaskStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has the following traits:   Migration tools will call the NotifyMigrationTaskState API to share the latest progress and status.    MigrationTaskName is used for addressing updates to the correct target.    ProgressUpdateStream is used for access control and to provide a namespace for each migration tool.  
    */
  def notifyMigrationTaskState(params: NotifyMigrationTaskStateRequest): awsDashSdkLib.libRequestMod.Request[NotifyMigrationTaskStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def notifyMigrationTaskState(
    params: NotifyMigrationTaskStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotifyMigrationTaskStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotifyMigrationTaskStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides identifying details of the resource being migrated so that it can be associated in the Application Discovery Service (ADS)'s repository. This association occurs asynchronously after PutResourceAttributes returns.    Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For example, if it is first called with a MAC address, but later, it is desired to add an IP address, it will then be required to call it with both the IP and MAC addresses to prevent overiding the MAC address.   Note the instructions regarding the special use case of the  ResourceAttributeList  parameter when specifying any "VM" related value.      Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm if an association was found based on the provided details, call ListDiscoveredResources. 
    */
  def putResourceAttributes(): awsDashSdkLib.libRequestMod.Request[PutResourceAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putResourceAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutResourceAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutResourceAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides identifying details of the resource being migrated so that it can be associated in the Application Discovery Service (ADS)'s repository. This association occurs asynchronously after PutResourceAttributes returns.    Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For example, if it is first called with a MAC address, but later, it is desired to add an IP address, it will then be required to call it with both the IP and MAC addresses to prevent overiding the MAC address.   Note the instructions regarding the special use case of the  ResourceAttributeList  parameter when specifying any "VM" related value.      Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm if an association was found based on the provided details, call ListDiscoveredResources. 
    */
  def putResourceAttributes(params: PutResourceAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutResourceAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putResourceAttributes(
    params: PutResourceAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutResourceAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutResourceAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

