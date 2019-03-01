package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/migrationhub", "MigrationHub")
@js.native
object MigrationHubNs extends js.Object {
  trait AssociateCreatedArtifactRequest extends js.Object {
    /**
      * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.) 
      */
    var CreatedArtifact: CreatedArtifact
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait AssociateCreatedArtifactResult extends js.Object
  
  trait AssociateDiscoveredResourceRequest extends js.Object {
    /**
      * Object representing a Resource.
      */
    var DiscoveredResource: DiscoveredResource
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * The identifier given to the MigrationTask.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream.
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait AssociateDiscoveredResourceResult extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateProgressUpdateStreamRequest extends js.Object {
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStreamName: ProgressUpdateStream
  }
  
  trait CreateProgressUpdateStreamResult extends js.Object
  
  trait CreatedArtifact extends js.Object {
    /**
      * A description that can be free-form text to record additional detail about the artifact for clarity or for later reference.
      */
    var Description: js.UndefOr[CreatedArtifactDescription] = js.undefined
    /**
      * An ARN that uniquely identifies the result of a migration task.
      */
    var Name: CreatedArtifactName
  }
  
  trait DeleteProgressUpdateStreamRequest extends js.Object {
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStreamName: ProgressUpdateStream
  }
  
  trait DeleteProgressUpdateStreamResult extends js.Object
  
  trait DescribeApplicationStateRequest extends js.Object {
    /**
      * The configurationId in ADS that uniquely identifies the grouped application.
      */
    var ApplicationId: ApplicationId
  }
  
  trait DescribeApplicationStateResult extends js.Object {
    /**
      * Status of the application - Not Started, In-Progress, Complete.
      */
    var ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined
    /**
      * The timestamp when the application status was last updated.
      */
    var LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.undefined
  }
  
  trait DescribeMigrationTaskRequest extends js.Object {
    /**
      * The identifier given to the MigrationTask.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait DescribeMigrationTaskResult extends js.Object {
    /**
      * Object encapsulating information about the migration task.
      */
    var MigrationTask: js.UndefOr[MigrationTask] = js.undefined
  }
  
  trait DisassociateCreatedArtifactRequest extends js.Object {
    /**
      * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
      */
    var CreatedArtifactName: CreatedArtifactName
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Unique identifier that references the migration task to be disassociated with the artifact.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait DisassociateCreatedArtifactResult extends js.Object
  
  trait DisassociateDiscoveredResourceRequest extends js.Object {
    /**
      * ConfigurationId of the ADS resource to be disassociated.
      */
    var ConfigurationId: ConfigurationId
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * The identifier given to the MigrationTask.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream.
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait DisassociateDiscoveredResourceResult extends js.Object
  
  trait DiscoveredResource extends js.Object {
    /**
      * The configurationId in ADS that uniquely identifies the on-premise resource.
      */
    var ConfigurationId: ConfigurationId
    /**
      * A description that can be free-form text to record additional detail about the discovered resource for clarity or later reference.
      */
    var Description: js.UndefOr[DiscoveredResourceDescription] = js.undefined
  }
  
  trait ImportMigrationTaskRequest extends js.Object {
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait ImportMigrationTaskResult extends js.Object
  
  trait ListCreatedArtifactsRequest extends js.Object {
    /**
      * Maximum number of results to be returned per page.
      */
    var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts] = js.undefined
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait ListCreatedArtifactsResult extends js.Object {
    /**
      * List of created artifacts up to the maximum number of results specified in the request.
      */
    var CreatedArtifactList: js.UndefOr[CreatedArtifactList] = js.undefined
    /**
      * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListDiscoveredResourcesRequest extends js.Object {
    /**
      * The maximum number of results returned per page.
      */
    var MaxResults: js.UndefOr[MaxResultsResources] = js.undefined
    /**
      * The name of the MigrationTask.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * The name of the ProgressUpdateStream.
      */
    var ProgressUpdateStream: ProgressUpdateStream
  }
  
  trait ListDiscoveredResourcesResult extends js.Object {
    /**
      * Returned list of discovered resources associated with the given MigrationTask.
      */
    var DiscoveredResourceList: js.UndefOr[DiscoveredResourceList] = js.undefined
    /**
      * If there are more discovered resources than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListMigrationTasksRequest extends js.Object {
    /**
      * Value to specify how many results are returned per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * Filter migration tasks by discovered resource name.
      */
    var ResourceName: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait ListMigrationTasksResult extends js.Object {
    /**
      * Lists the migration task's summary which includes: MigrationTaskName, ProgressPercent, ProgressUpdateStream, Status, and the UpdateDateTime for each task.
      */
    var MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList] = js.undefined
    /**
      * If there are more migration tasks than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListProgressUpdateStreamsRequest extends js.Object {
    /**
      * Filter to limit the maximum number of results to list per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListProgressUpdateStreamsResult extends js.Object {
    /**
      * If there are more streams created than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * List of progress update streams up to the max number of results passed in the input.
      */
    var ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList] = js.undefined
  }
  
  trait MigrationTask extends js.Object {
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined
    /**
      * A name that identifies the vendor of the migration tool being used.
      */
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined
    /**
      * 
      */
    var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.undefined
    /**
      * Task object encapsulating task information.
      */
    var Task: js.UndefOr[Task] = js.undefined
    /**
      * The timestamp when the task was gathered.
      */
    var UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
  }
  
  trait MigrationTaskSummary extends js.Object {
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined
    /**
      * 
      */
    var ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined
    /**
      * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
      */
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined
    /**
      * Status of the task.
      */
    var Status: js.UndefOr[Status] = js.undefined
    /**
      * Detail information of what is being done within the overall status state.
      */
    var StatusDetail: js.UndefOr[StatusDetail] = js.undefined
    /**
      * The timestamp when the task was gathered.
      */
    var UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
  }
  
  trait NotifyApplicationStateRequest extends js.Object {
    /**
      * The configurationId in ADS that uniquely identifies the grouped application.
      */
    var ApplicationId: ApplicationId
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Status of the application - Not Started, In-Progress, Complete.
      */
    var Status: ApplicationStatus
  }
  
  trait NotifyApplicationStateResult extends js.Object
  
  trait NotifyMigrationTaskStateRequest extends js.Object {
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
      */
    var NextUpdateSeconds: NextUpdateSeconds
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
    /**
      * Information about the task's progress and status.
      */
    var Task: Task
    /**
      * The timestamp when the task was gathered.
      */
    var UpdateDateTime: UpdateDateTime
  }
  
  trait NotifyMigrationTaskStateResult extends js.Object
  
  trait ProgressUpdateStreamSummary extends js.Object {
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined
  }
  
  trait PutResourceAttributesRequest extends js.Object {
    /**
      * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Unique identifier that references the migration task.
      */
    var MigrationTaskName: MigrationTaskName
    /**
      * The name of the ProgressUpdateStream. 
      */
    var ProgressUpdateStream: ProgressUpdateStream
    /**
      * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service (ADS)'s repository.  Takes the object array of ResourceAttribute where the Type field is reserved for the following values: IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER where the identifying value can be a string up to 256 characters.     If any "VM" related value is set for a ResourceAttribute object, it is required that VM_MANAGER_ID, as a minimum, is always set. If VM_MANAGER_ID is not set, then all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a server in Application Discovery Service (ADS)'s repository. See the Example section below for a use case of specifying "VM" related values.    If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in separate type/value pairs passed to the ResourceAttributeList parameter to maximize the chances of matching.   
      */
    var ResourceAttributeList: ResourceAttributeList
  }
  
  trait PutResourceAttributesResult extends js.Object
  
  trait ResourceAttribute extends js.Object {
    /**
      * Type of resource.
      */
    var Type: ResourceAttributeType
    /**
      * Value of the resource type.
      */
    var Value: ResourceAttributeValue
  }
  
  trait Task extends js.Object {
    /**
      * Indication of the percentage completion of the task.
      */
    var ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined
    /**
      * Status of the task - Not Started, In-Progress, Complete.
      */
    var Status: Status
    /**
      * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
      */
    var StatusDetail: js.UndefOr[StatusDetail] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait _ApplicationStatus extends js.Object
  
  trait _ResourceAttributeType extends js.Object
  
  trait _Status extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ApplicationId = java.lang.String
  type ApplicationStatus = _ApplicationStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationId = java.lang.String
  type CreatedArtifactDescription = java.lang.String
  type CreatedArtifactList = js.Array[CreatedArtifact]
  type CreatedArtifactName = java.lang.String
  type DiscoveredResourceDescription = java.lang.String
  type DiscoveredResourceList = js.Array[DiscoveredResource]
  type DryRun = scala.Boolean
  type LatestResourceAttributeList = js.Array[ResourceAttribute]
  type MaxResults = scala.Double
  type MaxResultsCreatedArtifacts = scala.Double
  type MaxResultsResources = scala.Double
  type MigrationTaskName = java.lang.String
  type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]
  type NextUpdateSeconds = scala.Double
  type ProgressPercent = scala.Double
  type ProgressUpdateStream = java.lang.String
  type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[ResourceAttribute]
  type ResourceAttributeType = _ResourceAttributeType | java.lang.String
  type ResourceAttributeValue = java.lang.String
  type ResourceName = java.lang.String
  type Status = _Status | java.lang.String
  type StatusDetail = java.lang.String
  type Token = java.lang.String
  type UpdateDateTime = stdLib.Date
  type apiVersion = _apiVersion | java.lang.String
}

