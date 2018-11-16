package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/glue", "Glue")
@js.native
object GlueNs extends js.Object {
  
  trait Action extends js.Object {
    /**
         * Arguments to be passed to the job run. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var Arguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * The name of a job to be executed.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * Specifies configuration properties of a job run notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this action.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
  }
  
  
  trait BatchCreatePartitionRequest extends js.Object {
    /**
         * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the metadata database in which the partition is to be created.
         */
    var DatabaseName: NameString
    /**
         * A list of PartitionInput structures that define the partitions to be created.
         */
    var PartitionInputList: PartitionInputList
    /**
         * The name of the metadata table in which the partition is to be created.
         */
    var TableName: NameString
  }
  
  
  trait BatchCreatePartitionResponse extends js.Object {
    /**
         * Errors encountered when trying to create the requested partitions.
         */
    var Errors: js.UndefOr[PartitionErrors] = js.undefined
  }
  
  
  trait BatchDeleteConnectionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the connections reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A list of names of the connections to delete.
         */
    var ConnectionNameList: DeleteConnectionNameList
  }
  
  
  trait BatchDeleteConnectionResponse extends js.Object {
    /**
         * A map of the names of connections that were not successfully deleted to error details.
         */
    var Errors: js.UndefOr[ErrorByName] = js.undefined
    /**
         * A list of names of the connection definitions that were successfully deleted.
         */
    var Succeeded: js.UndefOr[NameStringList] = js.undefined
  }
  
  
  trait BatchDeletePartitionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which the table in question resides.
         */
    var DatabaseName: NameString
    /**
         * A list of PartitionInput structures that define the partitions to be deleted.
         */
    var PartitionsToDelete: BatchDeletePartitionValueList
    /**
         * The name of the table where the partitions to be deleted is located.
         */
    var TableName: NameString
  }
  
  
  trait BatchDeletePartitionResponse extends js.Object {
    /**
         * Errors encountered when trying to delete the requested partitions.
         */
    var Errors: js.UndefOr[PartitionErrors] = js.undefined
  }
  
  
  trait BatchDeleteTableRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * A list of the table to delete.
         */
    var TablesToDelete: BatchDeleteTableNameList
  }
  
  
  trait BatchDeleteTableResponse extends js.Object {
    /**
         * A list of errors encountered in attempting to delete the specified tables.
         */
    var Errors: js.UndefOr[TableErrors] = js.undefined
  }
  
  
  trait BatchDeleteTableVersionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The name of the table. For Hive compatibility, this name is entirely lowercase.
         */
    var TableName: NameString
    /**
         * A list of the IDs of versions to be deleted. A VersionId is a string representation of an integer. Each version is incremented by 1.
         */
    var VersionIds: BatchDeleteTableVersionList
  }
  
  
  trait BatchDeleteTableVersionResponse extends js.Object {
    /**
         * A list of errors encountered while trying to delete the specified table versions.
         */
    var Errors: js.UndefOr[TableVersionErrors] = js.undefined
  }
  
  
  trait BatchGetPartitionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the partitions reside.
         */
    var DatabaseName: NameString
    /**
         * A list of partition values identifying the partitions to retrieve.
         */
    var PartitionsToGet: BatchGetPartitionValueList
    /**
         * The name of the partitions' table.
         */
    var TableName: NameString
  }
  
  
  trait BatchGetPartitionResponse extends js.Object {
    /**
         * A list of the requested partitions.
         */
    var Partitions: js.UndefOr[PartitionList] = js.undefined
    /**
         * A list of the partition values in the request for which partions were not returned.
         */
    var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
  }
  
  
  trait BatchStopJobRunError extends js.Object {
    /**
         * Specifies details about the error that was encountered.
         */
    var ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined
    /**
         * The name of the job definition used in the job run in question.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * The JobRunId of the job run in question.
         */
    var JobRunId: js.UndefOr[IdString] = js.undefined
  }
  
  
  trait BatchStopJobRunRequest extends js.Object {
    /**
         * The name of the job definition for which to stop job runs.
         */
    var JobName: NameString
    /**
         * A list of the JobRunIds that should be stopped for that job definition.
         */
    var JobRunIds: BatchStopJobRunJobRunIdList
  }
  
  
  trait BatchStopJobRunResponse extends js.Object {
    /**
         * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error was encountered and details about the error.
         */
    var Errors: js.UndefOr[BatchStopJobRunErrorList] = js.undefined
    /**
         * A list of the JobRuns that were successfully submitted for stopping.
         */
    var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.undefined
  }
  
  
  trait BatchStopJobRunSuccessfulSubmission extends js.Object {
    /**
         * The name of the job definition used in the job run that was stopped.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * The JobRunId of the job run that was stopped.
         */
    var JobRunId: js.UndefOr[IdString] = js.undefined
  }
  
  
  trait CatalogEntry extends js.Object {
    /**
         * The database in which the table metadata resides.
         */
    var DatabaseName: NameString
    /**
         * The name of the table in question.
         */
    var TableName: NameString
  }
  
  
  trait CatalogImportStatus extends js.Object {
    /**
         * True if the migration has completed, or False otherwise.
         */
    var ImportCompleted: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The time that the migration was started.
         */
    var ImportTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the person who initiated the migration.
         */
    var ImportedBy: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait Classifier extends js.Object {
    /**
         * A GrokClassifier object.
         */
    var GrokClassifier: js.UndefOr[GrokClassifier] = js.undefined
    /**
         * A JsonClassifier object.
         */
    var JsonClassifier: js.UndefOr[JsonClassifier] = js.undefined
    /**
         * An XMLClassifier object.
         */
    var XMLClassifier: js.UndefOr[XMLClassifier] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloudWatchEncryption extends js.Object {
    /**
         * The encryption mode to use for CloudWatch data.
         */
    var CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode] = js.undefined
    /**
         * The AWS ARN of the KMS key to be used to encrypt the data.
         */
    var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  }
  
  
  trait CodeGenEdge extends js.Object {
    /**
         * The ID of the node at which the edge starts.
         */
    var Source: CodeGenIdentifier
    /**
         * The ID of the node at which the edge ends.
         */
    var Target: CodeGenIdentifier
    /**
         * The target of the edge.
         */
    var TargetParameter: js.UndefOr[CodeGenArgName] = js.undefined
  }
  
  
  trait CodeGenNode extends js.Object {
    /**
         * Properties of the node, in the form of name-value pairs.
         */
    var Args: CodeGenNodeArgs
    /**
         * A node identifier that is unique within the node's graph.
         */
    var Id: CodeGenIdentifier
    /**
         * The line number of the node.
         */
    var LineNumber: js.UndefOr[Integer] = js.undefined
    /**
         * The type of node this is.
         */
    var NodeType: CodeGenNodeType
  }
  
  
  trait CodeGenNodeArg extends js.Object {
    /**
         * The name of the argument or property.
         */
    var Name: CodeGenArgName
    /**
         * True if the value is used as a parameter.
         */
    var Param: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The value of the argument or property.
         */
    var Value: CodeGenArgValue
  }
  
  
  trait Column extends js.Object {
    /**
         * Free-form text comment.
         */
    var Comment: js.UndefOr[CommentString] = js.undefined
    /**
         * The name of the Column.
         */
    var Name: NameString
    /**
         * The datatype of data in the Column.
         */
    var Type: js.UndefOr[ColumnTypeString] = js.undefined
  }
  
  
  trait Condition extends js.Object {
    /**
         * The name of the Job to whose JobRuns this condition applies and on which this trigger waits.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * A logical operator.
         */
    var LogicalOperator: js.UndefOr[LogicalOperator] = js.undefined
    /**
         * The condition state. Currently, the values supported are SUCCEEDED, STOPPED, TIMEOUT and FAILED.
         */
    var State: js.UndefOr[JobRunState] = js.undefined
  }
  
  
  trait Connection extends js.Object {
    /**
         * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    JDBC_DRIVER_JAR_URI - The S3 path of the a jar file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use).    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for the JDBC connection.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether SSL with hostname matching will be enforced for the JDBC connection on the client. The default is false.  
         */
    var ConnectionProperties: js.UndefOr[ConnectionProperties] = js.undefined
    /**
         * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * The time this connection definition was created.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Description of the connection.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The user, group or role that last updated this connection definition.
         */
    var LastUpdatedBy: js.UndefOr[NameString] = js.undefined
    /**
         * The last time this connection definition was updated.
         */
    var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A list of criteria that can be used in selecting this connection.
         */
    var MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
    /**
         * The name of the connection definition.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * A map of physical connection requirements, such as VPC and SecurityGroup, needed for making this connection successfully.
         */
    var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
  }
  
  
  trait ConnectionInput extends js.Object {
    /**
         * These key-value pairs define parameters for the connection.
         */
    var ConnectionProperties: ConnectionProperties
    /**
         * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
         */
    var ConnectionType: ConnectionType
    /**
         * Description of the connection.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * A list of criteria that can be used in selecting this connection.
         */
    var MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
    /**
         * The name of the connection.
         */
    var Name: NameString
    /**
         * A map of physical connection requirements, such as VPC and SecurityGroup, needed for making this connection successfully.
         */
    var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
  }
  
  
  trait ConnectionProperties
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ValueString]
  
  
  trait ConnectionsList extends js.Object {
    /**
         * A list of connections used by the job.
         */
    var Connections: js.UndefOr[StringList] = js.undefined
  }
  
  
  trait Crawler extends js.Object {
    /**
         * A list of custom classifiers associated with the crawler.
         */
    var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
    /**
         * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
         */
    var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
    /**
         * If the crawler is running, contains the total time elapsed since the last crawl began.
         */
    var CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used by this Crawler.
         */
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined
    /**
         * The time when the crawler was created.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The database where metadata is written by this crawler.
         */
    var DatabaseName: js.UndefOr[DatabaseName] = js.undefined
    /**
         * A description of the crawler.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The status of the last crawl, and potentially error information if an error occurred.
         */
    var LastCrawl: js.UndefOr[LastCrawlInfo] = js.undefined
    /**
         * The time the crawler was last updated.
         */
    var LastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The crawler name.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * The IAM role (or ARN of an IAM role) used to access customer resources, such as data in Amazon S3.
         */
    var Role: js.UndefOr[Role] = js.undefined
    /**
         * For scheduled crawlers, the schedule when the crawler runs.
         */
    var Schedule: js.UndefOr[Schedule] = js.undefined
    /**
         * Sets the behavior when the crawler finds a changed or deleted object.
         */
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined
    /**
         * Indicates whether the crawler is running, or whether a run is pending.
         */
    var State: js.UndefOr[CrawlerState] = js.undefined
    /**
         * The prefix added to the names of tables that are created.
         */
    var TablePrefix: js.UndefOr[TablePrefix] = js.undefined
    /**
         * A collection of targets to crawl.
         */
    var Targets: js.UndefOr[CrawlerTargets] = js.undefined
    /**
         * The version of the crawler.
         */
    var Version: js.UndefOr[VersionId] = js.undefined
  }
  
  
  trait CrawlerMetrics extends js.Object {
    /**
         * The name of the crawler.
         */
    var CrawlerName: js.UndefOr[NameString] = js.undefined
    /**
         * The duration of the crawler's most recent run, in seconds.
         */
    var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
    /**
         * The median duration of this crawler's runs, in seconds.
         */
    var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
    /**
         * True if the crawler is still estimating how long it will take to complete this run.
         */
    var StillEstimating: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The number of tables created by this crawler.
         */
    var TablesCreated: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * The number of tables deleted by this crawler.
         */
    var TablesDeleted: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * The number of tables updated by this crawler.
         */
    var TablesUpdated: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * The estimated time left to complete a running crawl.
         */
    var TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  }
  
  
  trait CrawlerTargets extends js.Object {
    /**
         * Specifies DynamoDB targets.
         */
    var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.undefined
    /**
         * Specifies JDBC targets.
         */
    var JdbcTargets: js.UndefOr[JdbcTargetList] = js.undefined
    /**
         * Specifies Amazon S3 targets.
         */
    var S3Targets: js.UndefOr[S3TargetList] = js.undefined
  }
  
  
  trait CreateClassifierRequest extends js.Object {
    /**
         * A GrokClassifier object specifying the classifier to create.
         */
    var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined
    /**
         * A JsonClassifier object specifying the classifier to create.
         */
    var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined
    /**
         * An XMLClassifier object specifying the classifier to create.
         */
    var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
  }
  
  
  trait CreateClassifierResponse extends js.Object
  
  
  trait CreateConnectionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A ConnectionInput object defining the connection to create.
         */
    var ConnectionInput: ConnectionInput
  }
  
  
  trait CreateConnectionResponse extends js.Object
  
  
  trait CreateCrawlerRequest extends js.Object {
    /**
         * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
         */
    var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
    /**
         * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
         */
    var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used by this Crawler.
         */
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined
    /**
         * The AWS Glue database where results are written, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
         */
    var DatabaseName: DatabaseName
    /**
         * A description of the new crawler.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * Name of the new crawler.
         */
    var Name: NameString
    /**
         * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
         */
    var Role: Role
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var Schedule: js.UndefOr[CronExpression] = js.undefined
    /**
         * Policy for the crawler's update and deletion behavior.
         */
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined
    /**
         * The table prefix used for catalog tables that are created.
         */
    var TablePrefix: js.UndefOr[TablePrefix] = js.undefined
    /**
         * A list of collection of targets to crawl.
         */
    var Targets: CrawlerTargets
  }
  
  
  trait CreateCrawlerResponse extends js.Object
  
  
  trait CreateDatabaseRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which to create the database. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A DatabaseInput object defining the metadata database to create in the catalog.
         */
    var DatabaseInput: DatabaseInput
  }
  
  
  trait CreateDatabaseResponse extends js.Object
  
  
  trait CreateDevEndpointRequest extends js.Object {
    /**
         * The name to be assigned to the new DevEndpoint.
         */
    var EndpointName: GenericString
    /**
         * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
         */
    var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
         */
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
         */
    var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility, as the recommended attribute to use is public keys.
         */
    var PublicKey: js.UndefOr[GenericString] = js.undefined
    /**
         * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys: call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
         */
    var PublicKeys: js.UndefOr[PublicKeysList] = js.undefined
    /**
         * The IAM role for the DevEndpoint.
         */
    var RoleArn: RoleArn
    /**
         * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * Security group IDs for the security groups to be used by the new DevEndpoint.
         */
    var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
         * The subnet ID for the new DevEndpoint to use.
         */
    var SubnetId: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait CreateDevEndpointResponse extends js.Object {
    /**
         * The AWS availability zone where this DevEndpoint is located.
         */
    var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
    /**
         * The point in time at which this DevEndpoint was created.
         */
    var CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The name assigned to the new DevEndpoint.
         */
    var EndpointName: js.UndefOr[GenericString] = js.undefined
    /**
         * Path to one or more Java Jars in an S3 bucket that will be loaded in your DevEndpoint.
         */
    var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * Path(s) to one or more Python libraries in an S3 bucket that will be loaded in your DevEndpoint.
         */
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * The reason for a current failure in this DevEndpoint.
         */
    var FailureReason: js.UndefOr[GenericString] = js.undefined
    /**
         * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
         */
    var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The AWS ARN of the role assigned to the new DevEndpoint.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The name of the SecurityConfiguration structure being used with this DevEndpoint.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The security groups assigned to the new DevEndpoint.
         */
    var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
         * The current status of the new DevEndpoint.
         */
    var Status: js.UndefOr[GenericString] = js.undefined
    /**
         * The subnet ID assigned to the new DevEndpoint.
         */
    var SubnetId: js.UndefOr[GenericString] = js.undefined
    /**
         * The ID of the VPC used by this DevEndpoint.
         */
    var VpcId: js.UndefOr[GenericString] = js.undefined
    /**
         * The address of the YARN endpoint used by this DevEndpoint.
         */
    var YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined
    /**
         * The Apache Zeppelin port for the remote Apache Spark interpreter.
         */
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
  }
  
  
  trait CreateGrokClassifierRequest extends js.Object {
    /**
         * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
         */
    var Classification: Classification
    /**
         * Optional custom grok patterns used by this classifier.
         */
    var CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined
    /**
         * The grok pattern used by this classifier.
         */
    var GrokPattern: GrokPattern
    /**
         * The name of the new classifier.
         */
    var Name: NameString
  }
  
  
  trait CreateJobRequest extends js.Object {
    /**
         * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
         */
    var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The JobCommand that executes this job.
         */
    var Command: JobCommand
    /**
         * The connections used for this job.
         */
    var Connections: js.UndefOr[ConnectionsList] = js.undefined
    /**
         * The default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var DefaultArguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * Description of the job being defined.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
         */
    var ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined
    /**
         * This field is reserved for future use.
         */
    var LogUri: js.UndefOr[UriString] = js.undefined
    /**
         * The maximum number of times to retry this job if it fails.
         */
    var MaxRetries: js.UndefOr[MaxRetries] = js.undefined
    /**
         * The name you assign to this job definition. It must be unique in your account.
         */
    var Name: NameString
    /**
         * Specifies configuration properties of a job notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * The name or ARN of the IAM role associated with this job.
         */
    var Role: RoleString
    /**
         * The name of the SecurityConfiguration structure to be used with this job.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
  }
  
  
  trait CreateJobResponse extends js.Object {
    /**
         * The unique name that was provided for this job definition.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait CreateJsonClassifierRequest extends js.Object {
    /**
         * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
         */
    var JsonPath: JsonPath
    /**
         * The name of the classifier.
         */
    var Name: NameString
  }
  
  
  trait CreatePartitionRequest extends js.Object {
    /**
         * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the metadata database in which the partition is to be created.
         */
    var DatabaseName: NameString
    /**
         * A PartitionInput structure defining the partition to be created.
         */
    var PartitionInput: PartitionInput
    /**
         * The name of the metadata table in which the partition is to be created.
         */
    var TableName: NameString
  }
  
  
  trait CreatePartitionResponse extends js.Object
  
  
  trait CreateScriptRequest extends js.Object {
    /**
         * A list of the edges in the DAG.
         */
    var DagEdges: js.UndefOr[DagEdges] = js.undefined
    /**
         * A list of the nodes in the DAG.
         */
    var DagNodes: js.UndefOr[DagNodes] = js.undefined
    /**
         * The programming language of the resulting code from the DAG.
         */
    var Language: js.UndefOr[Language] = js.undefined
  }
  
  
  trait CreateScriptResponse extends js.Object {
    /**
         * The Python script generated from the DAG.
         */
    var PythonScript: js.UndefOr[PythonScript] = js.undefined
    /**
         * The Scala code generated from the DAG.
         */
    var ScalaCode: js.UndefOr[ScalaCode] = js.undefined
  }
  
  
  trait CreateSecurityConfigurationRequest extends js.Object {
    /**
         * The encryption configuration for the new security configuration.
         */
    var EncryptionConfiguration: EncryptionConfiguration
    /**
         * The name for the new security configuration.
         */
    var Name: NameString
  }
  
  
  trait CreateSecurityConfigurationResponse extends js.Object {
    /**
         * The time at which the new security configuration was created.
         */
    var CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The name assigned to the new security configuration.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait CreateTableRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which to create the Table. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The TableInput object that defines the metadata table to create in the catalog.
         */
    var TableInput: TableInput
  }
  
  
  trait CreateTableResponse extends js.Object
  
  
  trait CreateTriggerRequest extends js.Object {
    /**
         * The actions initiated by this trigger when it fires.
         */
    var Actions: ActionList
    /**
         * A description of the new trigger.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The name of the trigger.
         */
    var Name: NameString
    /**
         * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
         */
    var Predicate: js.UndefOr[Predicate] = js.undefined
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
         */
    var Schedule: js.UndefOr[GenericString] = js.undefined
    /**
         * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
         */
    var StartOnCreation: js.UndefOr[BooleanValue] = js.undefined
    /**
         * The type of the new trigger.
         */
    var Type: TriggerType
  }
  
  
  trait CreateTriggerResponse extends js.Object {
    /**
         * The name of the trigger.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait CreateUserDefinedFunctionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which to create the function. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which to create the function.
         */
    var DatabaseName: NameString
    /**
         * A FunctionInput object that defines the function to create in the Data Catalog.
         */
    var FunctionInput: UserDefinedFunctionInput
  }
  
  
  trait CreateUserDefinedFunctionResponse extends js.Object
  
  
  trait CreateXMLClassifierRequest extends js.Object {
    /**
         * An identifier of the data format that the classifier matches.
         */
    var Classification: Classification
    /**
         * The name of the classifier.
         */
    var Name: NameString
    /**
         * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
         */
    var RowTag: js.UndefOr[RowTag] = js.undefined
  }
  
  
  trait DataCatalogEncryptionSettings extends js.Object {
    /**
         * Specifies encryption-at-rest configuration for the Data Catalog.
         */
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
  }
  
  
  trait Database extends js.Object {
    /**
         * The time at which the metadata database was created in the catalog.
         */
    var CreateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Description of the database.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The location of the database (for example, an HDFS path).
         */
    var LocationUri: js.UndefOr[URI] = js.undefined
    /**
         * Name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
         */
    var Name: NameString
    /**
         * These key-value pairs define parameters and properties of the database.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
  }
  
  
  trait DatabaseInput extends js.Object {
    /**
         * Description of the database
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The location of the database (for example, an HDFS path).
         */
    var LocationUri: js.UndefOr[URI] = js.undefined
    /**
         * Name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
         */
    var Name: NameString
    /**
         * Thes key-value pairs define parameters and properties of the database.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
  }
  
  
  trait DeleteClassifierRequest extends js.Object {
    /**
         * Name of the classifier to remove.
         */
    var Name: NameString
  }
  
  
  trait DeleteClassifierResponse extends js.Object
  
  
  trait DeleteConnectionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the connection resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the connection to delete.
         */
    var ConnectionName: NameString
  }
  
  
  trait DeleteConnectionResponse extends js.Object
  
  
  trait DeleteCrawlerRequest extends js.Object {
    /**
         * Name of the crawler to remove.
         */
    var Name: NameString
  }
  
  
  trait DeleteCrawlerResponse extends js.Object
  
  
  trait DeleteDatabaseRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
         */
    var Name: NameString
  }
  
  
  trait DeleteDatabaseResponse extends js.Object
  
  
  trait DeleteDevEndpointRequest extends js.Object {
    /**
         * The name of the DevEndpoint.
         */
    var EndpointName: GenericString
  }
  
  
  trait DeleteDevEndpointResponse extends js.Object
  
  
  trait DeleteJobRequest extends js.Object {
    /**
         * The name of the job definition to delete.
         */
    var JobName: NameString
  }
  
  
  trait DeleteJobResponse extends js.Object {
    /**
         * The name of the job definition that was deleted.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait DeletePartitionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which the table in question resides.
         */
    var DatabaseName: NameString
    /**
         * The values that define the partition.
         */
    var PartitionValues: ValueStringList
    /**
         * The name of the table where the partition to be deleted is located.
         */
    var TableName: NameString
  }
  
  
  trait DeletePartitionResponse extends js.Object
  
  
  trait DeleteResourcePolicyRequest extends js.Object {
    /**
         * The hash value returned when this policy was set.
         */
    var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
  }
  
  
  trait DeleteResourcePolicyResponse extends js.Object
  
  
  trait DeleteSecurityConfigurationRequest extends js.Object {
    /**
         * The name of the security configuration to delete.
         */
    var Name: NameString
  }
  
  
  trait DeleteSecurityConfigurationResponse extends js.Object
  
  
  trait DeleteTableRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The name of the table to be deleted. For Hive compatibility, this name is entirely lowercase.
         */
    var Name: NameString
  }
  
  
  trait DeleteTableResponse extends js.Object
  
  
  trait DeleteTableVersionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The name of the table. For Hive compatibility, this name is entirely lowercase.
         */
    var TableName: NameString
    /**
         * The ID of the table version to be deleted. A VersionID is a string representation of an integer. Each version is incremented by 1.
         */
    var VersionId: VersionString
  }
  
  
  trait DeleteTableVersionResponse extends js.Object
  
  
  trait DeleteTriggerRequest extends js.Object {
    /**
         * The name of the trigger to delete.
         */
    var Name: NameString
  }
  
  
  trait DeleteTriggerResponse extends js.Object {
    /**
         * The name of the trigger that was deleted.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait DeleteUserDefinedFunctionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the function is located.
         */
    var DatabaseName: NameString
    /**
         * The name of the function definition to be deleted.
         */
    var FunctionName: NameString
  }
  
  
  trait DeleteUserDefinedFunctionResponse extends js.Object
  
  
  trait DevEndpoint extends js.Object {
    /**
         * The AWS availability zone where this DevEndpoint is located.
         */
    var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
    /**
         * The point in time at which this DevEndpoint was created.
         */
    var CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The name of the DevEndpoint.
         */
    var EndpointName: js.UndefOr[GenericString] = js.undefined
    /**
         * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint. Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
         */
    var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
         */
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * The reason for a current failure in this DevEndpoint.
         */
    var FailureReason: js.UndefOr[GenericString] = js.undefined
    /**
         * The point in time at which this DevEndpoint was last modified.
         */
    var LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The status of the last update.
         */
    var LastUpdateStatus: js.UndefOr[GenericString] = js.undefined
    /**
         * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
         */
    var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
    /**
         * A private IP address to access the DevEndpoint within a VPC, if the DevEndpoint is created within one. The PrivateAddress field is present only when you create the DevEndpoint within your virtual private cloud (VPC).
         */
    var PrivateAddress: js.UndefOr[GenericString] = js.undefined
    /**
         * The public IP address used by this DevEndpoint. The PublicAddress field is present only when you create a non-VPC (virtual private cloud) DevEndpoint.
         */
    var PublicAddress: js.UndefOr[GenericString] = js.undefined
    /**
         * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility, as the recommended attribute to use is public keys.
         */
    var PublicKey: js.UndefOr[GenericString] = js.undefined
    /**
         * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys: call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
         */
    var PublicKeys: js.UndefOr[PublicKeysList] = js.undefined
    /**
         * The AWS ARN of the IAM role used in this DevEndpoint.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * A list of security group identifiers used in this DevEndpoint.
         */
    var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
         * The current status of this DevEndpoint.
         */
    var Status: js.UndefOr[GenericString] = js.undefined
    /**
         * The subnet ID for this DevEndpoint.
         */
    var SubnetId: js.UndefOr[GenericString] = js.undefined
    /**
         * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
         */
    var VpcId: js.UndefOr[GenericString] = js.undefined
    /**
         * The YARN endpoint address used by this DevEndpoint.
         */
    var YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined
    /**
         * The Apache Zeppelin port for the remote Apache Spark interpreter.
         */
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
  }
  
  
  trait DevEndpointCustomLibraries extends js.Object {
    /**
         * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint. Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
         */
    var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
    /**
         * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
         */
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait DynamoDBTarget extends js.Object {
    /**
         * The name of the DynamoDB table to crawl.
         */
    var Path: js.UndefOr[Path] = js.undefined
  }
  
  
  trait EncryptionAtRest extends js.Object {
    /**
         * The encryption-at-rest mode for encrypting Data Catalog data.
         */
    var CatalogEncryptionMode: CatalogEncryptionMode
    /**
         * The ID of the AWS KMS key to use for encryption at rest.
         */
    var SseAwsKmsKeyId: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait EncryptionConfiguration extends js.Object {
    /**
         * The encryption configuration for CloudWatch.
         */
    var CloudWatchEncryption: js.UndefOr[CloudWatchEncryption] = js.undefined
    /**
         * The encryption configuration for Job Bookmarks.
         */
    var JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption] = js.undefined
    /**
         * The encryption configuration for S3 data.
         */
    var S3Encryption: js.UndefOr[S3EncryptionList] = js.undefined
  }
  
  
  trait ErrorByName
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ErrorDetail]
  
  
  trait ErrorDetail extends js.Object {
    /**
         * The code associated with this error.
         */
    var ErrorCode: js.UndefOr[NameString] = js.undefined
    /**
         * A message describing the error.
         */
    var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  }
  
  
  trait ExecutionProperty extends js.Object {
    /**
         * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
         */
    var MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns] = js.undefined
  }
  
  
  trait GenericMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[GenericString]
  
  
  trait GetCatalogImportStatusRequest extends js.Object {
    /**
         * The ID of the catalog to migrate. Currently, this should be the AWS account ID.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  }
  
  
  trait GetCatalogImportStatusResponse extends js.Object {
    /**
         * The status of the specified catalog migration.
         */
    var ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
  }
  
  
  trait GetClassifierRequest extends js.Object {
    /**
         * Name of the classifier to retrieve.
         */
    var Name: NameString
  }
  
  
  trait GetClassifierResponse extends js.Object {
    /**
         * The requested classifier.
         */
    var Classifier: js.UndefOr[Classifier] = js.undefined
  }
  
  
  trait GetClassifiersRequest extends js.Object {
    /**
         * Size of the list to return (optional).
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * An optional continuation token.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetClassifiersResponse extends js.Object {
    /**
         * The requested list of classifier objects.
         */
    var Classifiers: js.UndefOr[ClassifierList] = js.undefined
    /**
         * A continuation token.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetConnectionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the connection resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the connection definition to retrieve.
         */
    var Name: NameString
  }
  
  
  trait GetConnectionResponse extends js.Object {
    /**
         * The requested connection definition.
         */
    var Connection: js.UndefOr[Connection] = js.undefined
  }
  
  
  trait GetConnectionsFilter extends js.Object {
    /**
         * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
         */
    var MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
  }
  
  
  trait GetConnectionsRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the connections reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A filter that controls which connections will be returned.
         */
    var Filter: js.UndefOr[GetConnectionsFilter] = js.undefined
    /**
         * The maximum number of connections to return in one response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetConnectionsResponse extends js.Object {
    /**
         * A list of requested connection definitions.
         */
    var ConnectionList: js.UndefOr[ConnectionList] = js.undefined
    /**
         * A continuation token, if the list of connections returned does not include the last of the filtered connections.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetCrawlerMetricsRequest extends js.Object {
    /**
         * A list of the names of crawlers about which to retrieve metrics.
         */
    var CrawlerNameList: js.UndefOr[CrawlerNameList] = js.undefined
    /**
         * The maximum size of a list to return.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetCrawlerMetricsResponse extends js.Object {
    /**
         * A list of metrics for the specified crawler.
         */
    var CrawlerMetricsList: js.UndefOr[CrawlerMetricsList] = js.undefined
    /**
         * A continuation token, if the returned list does not contain the last metric available.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetCrawlerRequest extends js.Object {
    /**
         * Name of the crawler to retrieve metadata for.
         */
    var Name: NameString
  }
  
  
  trait GetCrawlerResponse extends js.Object {
    /**
         * The metadata for the specified crawler.
         */
    var Crawler: js.UndefOr[Crawler] = js.undefined
  }
  
  
  trait GetCrawlersRequest extends js.Object {
    /**
         * The number of crawlers to return on each call.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation request.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetCrawlersResponse extends js.Object {
    /**
         * A list of crawler metadata.
         */
    var Crawlers: js.UndefOr[CrawlerList] = js.undefined
    /**
         * A continuation token, if the returned list has not reached the end of those defined in this customer account.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
    /**
         * The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  }
  
  
  trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
    /**
         * The requested security configuration.
         */
    var DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings] = js.undefined
  }
  
  
  trait GetDatabaseRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the database to retrieve. For Hive compatibility, this should be all lowercase.
         */
    var Name: NameString
  }
  
  
  trait GetDatabaseResponse extends js.Object {
    /**
         * The definition of the specified database in the catalog.
         */
    var Database: js.UndefOr[Database] = js.undefined
  }
  
  
  trait GetDatabasesRequest extends js.Object {
    /**
         * The ID of the Data Catalog from which to retrieve Databases. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The maximum number of databases to return in one response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetDatabasesResponse extends js.Object {
    /**
         * A list of Database objects from the specified catalog.
         */
    var DatabaseList: DatabaseList
    /**
         * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetDataflowGraphRequest extends js.Object {
    /**
         * The Python script to transform.
         */
    var PythonScript: js.UndefOr[PythonScript] = js.undefined
  }
  
  
  trait GetDataflowGraphResponse extends js.Object {
    /**
         * A list of the edges in the resulting DAG.
         */
    var DagEdges: js.UndefOr[DagEdges] = js.undefined
    /**
         * A list of the nodes in the resulting DAG.
         */
    var DagNodes: js.UndefOr[DagNodes] = js.undefined
  }
  
  
  trait GetDevEndpointRequest extends js.Object {
    /**
         * Name of the DevEndpoint for which to retrieve information.
         */
    var EndpointName: GenericString
  }
  
  
  trait GetDevEndpointResponse extends js.Object {
    /**
         * A DevEndpoint definition.
         */
    var DevEndpoint: js.UndefOr[DevEndpoint] = js.undefined
  }
  
  
  trait GetDevEndpointsRequest extends js.Object {
    /**
         * The maximum size of information to return.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetDevEndpointsResponse extends js.Object {
    /**
         * A list of DevEndpoint definitions.
         */
    var DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined
    /**
         * A continuation token, if not all DevEndpoint definitions have yet been returned.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetJobRequest extends js.Object {
    /**
         * The name of the job definition to retrieve.
         */
    var JobName: NameString
  }
  
  
  trait GetJobResponse extends js.Object {
    /**
         * The requested job definition.
         */
    var Job: js.UndefOr[Job] = js.undefined
  }
  
  
  trait GetJobRunRequest extends js.Object {
    /**
         * Name of the job definition being run.
         */
    var JobName: NameString
    /**
         * True if a list of predecessor runs should be returned.
         */
    var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
    /**
         * The ID of the job run.
         */
    var RunId: IdString
  }
  
  
  trait GetJobRunResponse extends js.Object {
    /**
         * The requested job-run metadata.
         */
    var JobRun: js.UndefOr[JobRun] = js.undefined
  }
  
  
  trait GetJobRunsRequest extends js.Object {
    /**
         * The name of the job definition for which to retrieve all job runs.
         */
    var JobName: NameString
    /**
         * The maximum size of the response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetJobRunsResponse extends js.Object {
    /**
         * A list of job-run metatdata objects.
         */
    var JobRuns: js.UndefOr[JobRunList] = js.undefined
    /**
         * A continuation token, if not all reequested job runs have been returned.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetJobsRequest extends js.Object {
    /**
         * The maximum size of the response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetJobsResponse extends js.Object {
    /**
         * A list of job definitions.
         */
    var Jobs: js.UndefOr[JobList] = js.undefined
    /**
         * A continuation token, if not all job definitions have yet been returned.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetMappingRequest extends js.Object {
    /**
         * Parameters for the mapping.
         */
    var Location: js.UndefOr[Location] = js.undefined
    /**
         * A list of target tables.
         */
    var Sinks: js.UndefOr[CatalogEntries] = js.undefined
    /**
         * Specifies the source table.
         */
    var Source: CatalogEntry
  }
  
  
  trait GetMappingResponse extends js.Object {
    /**
         * A list of mappings to the specified targets.
         */
    var Mapping: MappingList
  }
  
  
  trait GetPartitionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partition in question resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the partition resides.
         */
    var DatabaseName: NameString
    /**
         * The values that define the partition.
         */
    var PartitionValues: ValueStringList
    /**
         * The name of the partition's table.
         */
    var TableName: NameString
  }
  
  
  trait GetPartitionResponse extends js.Object {
    /**
         * The requested information, in the form of a Partition object.
         */
    var Partition: js.UndefOr[Partition] = js.undefined
  }
  
  
  trait GetPartitionsRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the partitions reside.
         */
    var DatabaseName: NameString
    /**
         * An expression filtering the partitions to be returned. The expression uses SQL syntax similar to the SQL WHERE filter clause. The SQL statement parser JSQLParser parses the expression.   Operators: The following are the operators that you can use in the Expression API call:  =  Checks if the values of the two operands are equal or not; if yes, then the condition becomes true. Example: Assume 'variable a' holds 10 and 'variable b' holds 20.  (a = b) is not true.  &lt; &gt;  Checks if the values of two operands are equal or not; if the values are not equal, then the condition becomes true. Example: (a &lt; &gt; b) is true.  &gt;  Checks if the value of the left operand is greater than the value of the right operand; if yes, then the condition becomes true. Example: (a &gt; b) is not true.  &lt;  Checks if the value of the left operand is less than the value of the right operand; if yes, then the condition becomes true. Example: (a &lt; b) is true.  &gt;=  Checks if the value of the left operand is greater than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &gt;= b) is not true.  &lt;=  Checks if the value of the left operand is less than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &lt;= b) is true.  AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL  Logical operators.    Supported Partition Key Types: The following are the the supported partition keys.    string     date     timestamp     int     bigint     long     tinyint     smallint     decimal    If an invalid type is encountered, an exception is thrown.  The following list shows the valid operators on each type. When you define a crawler, the partitionKey type is created as a STRING, to be compatible with the catalog partitions.   Sample API Call: 
         */
    var Expression: js.UndefOr[PredicateString] = js.undefined
    /**
         * The maximum number of partitions to return in a single response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is not the first call to retrieve these partitions.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The segment of the table's partitions to scan in this request.
         */
    var Segment: js.UndefOr[Segment] = js.undefined
    /**
         * The name of the partitions' table.
         */
    var TableName: NameString
  }
  
  
  trait GetPartitionsResponse extends js.Object {
    /**
         * A continuation token, if the returned list of partitions does not does not include the last one.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * A list of requested partitions.
         */
    var Partitions: js.UndefOr[PartitionList] = js.undefined
  }
  
  
  trait GetPlanRequest extends js.Object {
    /**
         * The programming language of the code to perform the mapping.
         */
    var Language: js.UndefOr[Language] = js.undefined
    /**
         * Parameters for the mapping.
         */
    var Location: js.UndefOr[Location] = js.undefined
    /**
         * The list of mappings from a source table to target tables.
         */
    var Mapping: MappingList
    /**
         * The target tables.
         */
    var Sinks: js.UndefOr[CatalogEntries] = js.undefined
    /**
         * The source table.
         */
    var Source: CatalogEntry
  }
  
  
  trait GetPlanResponse extends js.Object {
    /**
         * A Python script to perform the mapping.
         */
    var PythonScript: js.UndefOr[PythonScript] = js.undefined
    /**
         * Scala code to perform the mapping.
         */
    var ScalaCode: js.UndefOr[ScalaCode] = js.undefined
  }
  
  
  trait GetResourcePolicyRequest extends js.Object
  
  
  trait GetResourcePolicyResponse extends js.Object {
    /**
         * The date and time at which the policy was created.
         */
    var CreateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Contains the hash value associated with this policy.
         */
    var PolicyHash: js.UndefOr[HashString] = js.undefined
    /**
         * Contains the requested policy document, in JSON format.
         */
    var PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined
    /**
         * The date and time at which the policy was last updated.
         */
    var UpdateTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait GetSecurityConfigurationRequest extends js.Object {
    /**
         * The name of the security configuration to retrieve.
         */
    var Name: NameString
  }
  
  
  trait GetSecurityConfigurationResponse extends js.Object {
    /**
         * The requested security configuration
         */
    var SecurityConfiguration: js.UndefOr[SecurityConfiguration] = js.undefined
  }
  
  
  trait GetSecurityConfigurationsRequest extends js.Object {
    /**
         * The maximum number of results to return.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetSecurityConfigurationsResponse extends js.Object {
    /**
         * A continuation token, if there are more security configurations to return.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
    /**
         * A list of security configurations.
         */
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
  }
  
  
  trait GetTableRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The name of the table for which to retrieve the definition. For Hive compatibility, this name is entirely lowercase.
         */
    var Name: NameString
  }
  
  
  trait GetTableResponse extends js.Object {
    /**
         * The Table object that defines the specified table.
         */
    var Table: js.UndefOr[Table] = js.undefined
  }
  
  
  trait GetTableVersionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The name of the table. For Hive compatibility, this name is entirely lowercase.
         */
    var TableName: NameString
    /**
         * The ID value of the table version to be retrieved. A VersionID is a string representation of an integer. Each version is incremented by 1. 
         */
    var VersionId: js.UndefOr[VersionString] = js.undefined
  }
  
  
  trait GetTableVersionResponse extends js.Object {
    /**
         * The requested table version.
         */
    var TableVersion: js.UndefOr[TableVersion] = js.undefined
  }
  
  
  trait GetTableVersionsRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * The maximum number of table versions to return in one response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is not the first call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The name of the table. For Hive compatibility, this name is entirely lowercase.
         */
    var TableName: NameString
  }
  
  
  trait GetTableVersionsResponse extends js.Object {
    /**
         * A continuation token, if the list of available versions does not include the last one.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * A list of strings identifying available versions of the specified table.
         */
    var TableVersions: js.UndefOr[GetTableVersionsList] = js.undefined
  }
  
  
  trait GetTablesRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
         */
    var Expression: js.UndefOr[FilterString] = js.undefined
    /**
         * The maximum number of tables to return in a single response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, included if this is a continuation call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait GetTablesResponse extends js.Object {
    /**
         * A continuation token, present if the current list segment is not the last.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * A list of the requested Table objects.
         */
    var TableList: js.UndefOr[TableList] = js.undefined
  }
  
  
  trait GetTriggerRequest extends js.Object {
    /**
         * The name of the trigger to retrieve.
         */
    var Name: NameString
  }
  
  
  trait GetTriggerResponse extends js.Object {
    /**
         * The requested trigger definition.
         */
    var Trigger: js.UndefOr[Trigger] = js.undefined
  }
  
  
  trait GetTriggersRequest extends js.Object {
    /**
         * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if there is no such trigger, all triggers will be returned.
         */
    var DependentJobName: js.UndefOr[NameString] = js.undefined
    /**
         * The maximum size of the response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait GetTriggersResponse extends js.Object {
    /**
         * A continuation token, if not all the requested triggers have yet been returned.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
    /**
         * A list of triggers for the specified job.
         */
    var Triggers: js.UndefOr[TriggerList] = js.undefined
  }
  
  
  trait GetUserDefinedFunctionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the function to be retrieved is located. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the function is located.
         */
    var DatabaseName: NameString
    /**
         * The name of the function.
         */
    var FunctionName: NameString
  }
  
  
  trait GetUserDefinedFunctionResponse extends js.Object {
    /**
         * The requested function definition.
         */
    var UserDefinedFunction: js.UndefOr[UserDefinedFunction] = js.undefined
  }
  
  
  trait GetUserDefinedFunctionsRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the functions are located.
         */
    var DatabaseName: NameString
    /**
         * The maximum number of functions to return in one response.
         */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * A continuation token, if this is a continuation call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * An optional function-name pattern string that filters the function definitions returned.
         */
    var Pattern: NameString
  }
  
  
  trait GetUserDefinedFunctionsResponse extends js.Object {
    /**
         * A continuation token, if the list of functions returned does not include the last requested function.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * A list of requested function definitions.
         */
    var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.undefined
  }
  
  
  trait GrokClassifier extends js.Object {
    /**
         * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
         */
    var Classification: Classification
    /**
         * The time this classifier was registered.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in Writing Custom Classifers.
         */
    var CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined
    /**
         * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in Writing Custom Classifers.
         */
    var GrokPattern: GrokPattern
    /**
         * The time this classifier was last updated.
         */
    var LastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the classifier.
         */
    var Name: NameString
    /**
         * The version of this classifier.
         */
    var Version: js.UndefOr[VersionId] = js.undefined
  }
  
  
  trait ImportCatalogToGlueRequest extends js.Object {
    /**
         * The ID of the catalog to import. Currently, this should be the AWS account ID.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  }
  
  
  trait ImportCatalogToGlueResponse extends js.Object
  
  
  trait JdbcTarget extends js.Object {
    /**
         * The name of the connection to use to connect to the JDBC target.
         */
    var ConnectionName: js.UndefOr[ConnectionName] = js.undefined
    /**
         * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
         */
    var Exclusions: js.UndefOr[PathList] = js.undefined
    /**
         * The path of the JDBC target.
         */
    var Path: js.UndefOr[Path] = js.undefined
  }
  
  
  trait Job extends js.Object {
    /**
         * The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
         */
    var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The JobCommand that executes this job.
         */
    var Command: js.UndefOr[JobCommand] = js.undefined
    /**
         * The connections used for this job.
         */
    var Connections: js.UndefOr[ConnectionsList] = js.undefined
    /**
         * The time and date that this job definition was created.
         */
    var CreatedOn: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The default arguments for this job, specified as name-value pairs. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var DefaultArguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * Description of the job being defined.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
         */
    var ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined
    /**
         * The last point in time when this job definition was modified.
         */
    var LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined
    /**
         * This field is reserved for future use.
         */
    var LogUri: js.UndefOr[UriString] = js.undefined
    /**
         * The maximum number of times to retry this job after a JobRun fails.
         */
    var MaxRetries: js.UndefOr[MaxRetries] = js.undefined
    /**
         * The name you assign to this job definition.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * Specifies configuration properties of a job notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * The name or ARN of the IAM role associated with this job.
         */
    var Role: js.UndefOr[RoleString] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this job.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
  }
  
  
  trait JobBookmarkEntry extends js.Object {
    /**
         * The attempt ID number.
         */
    var Attempt: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The bookmark itself.
         */
    var JobBookmark: js.UndefOr[JsonValue] = js.undefined
    /**
         * Name of the job in question.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The run ID number.
         */
    var Run: js.UndefOr[IntegerValue] = js.undefined
    /**
         * Version of the job.
         */
    var Version: js.UndefOr[IntegerValue] = js.undefined
  }
  
  
  trait JobBookmarksEncryption extends js.Object {
    /**
         * The encryption mode to use for Job bookmarks data.
         */
    var JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode] = js.undefined
    /**
         * The AWS ARN of the KMS key to be used to encrypt the data.
         */
    var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  }
  
  
  trait JobCommand extends js.Object {
    /**
         * The name of the job command: this must be glueetl.
         */
    var Name: js.UndefOr[GenericString] = js.undefined
    /**
         * Specifies the S3 path to a script that executes a job (required).
         */
    var ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
  }
  
  
  trait JobRun extends js.Object {
    /**
         * The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
         */
    var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The job arguments associated with this run. These override equivalent default arguments set for the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var Arguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * The number of the attempt to run this job.
         */
    var Attempt: js.UndefOr[AttemptCount] = js.undefined
    /**
         * The date and time this job run completed.
         */
    var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
    /**
         * An error message associated with this job run.
         */
    var ErrorMessage: js.UndefOr[ErrorString] = js.undefined
    /**
         * The amount of time (in seconds) that the job run consumed resources.
         */
    var ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined
    /**
         * The ID of this job run.
         */
    var Id: js.UndefOr[IdString] = js.undefined
    /**
         * The name of the job definition being used in this run.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * The current state of the job run.
         */
    var JobRunState: js.UndefOr[JobRunState] = js.undefined
    /**
         * The last time this job run was modified.
         */
    var LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS. This name can be /aws-glue/jobs/, in which case the default encryption is NONE. If you add a role name and SecurityConfiguration name (in other words, /aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/), then that security configuration will be used to encrypt the log group.
         */
    var LogGroupName: js.UndefOr[GenericString] = js.undefined
    /**
         * Specifies configuration properties of a job run notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * A list of predecessors to this job run.
         */
    var PredecessorRuns: js.UndefOr[PredecessorList] = js.undefined
    /**
         * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
         */
    var PreviousRunId: js.UndefOr[IdString] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this job run.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The date and time at which this job run was started.
         */
    var StartedOn: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
         * The name of the trigger that started this job run.
         */
    var TriggerName: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait JobUpdate extends js.Object {
    /**
         * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
         */
    var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The JobCommand that executes this job (required).
         */
    var Command: js.UndefOr[JobCommand] = js.undefined
    /**
         * The connections used for this job.
         */
    var Connections: js.UndefOr[ConnectionsList] = js.undefined
    /**
         * The default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var DefaultArguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * Description of the job being defined.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
         */
    var ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined
    /**
         * This field is reserved for future use.
         */
    var LogUri: js.UndefOr[UriString] = js.undefined
    /**
         * The maximum number of times to retry this job if it fails.
         */
    var MaxRetries: js.UndefOr[MaxRetries] = js.undefined
    /**
         * Specifies configuration properties of a job notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * The name or ARN of the IAM role associated with this job (required).
         */
    var Role: js.UndefOr[RoleString] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this job.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
  }
  
  
  trait JsonClassifier extends js.Object {
    /**
         * The time this classifier was registered.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
         */
    var JsonPath: JsonPath
    /**
         * The time this classifier was last updated.
         */
    var LastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the classifier.
         */
    var Name: NameString
    /**
         * The version of this classifier.
         */
    var Version: js.UndefOr[VersionId] = js.undefined
  }
  
  
  trait LastCrawlInfo extends js.Object {
    /**
         * If an error occurred, the error information about the last crawl.
         */
    var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The log group for the last crawl.
         */
    var LogGroup: js.UndefOr[LogGroup] = js.undefined
    /**
         * The log stream for the last crawl.
         */
    var LogStream: js.UndefOr[LogStream] = js.undefined
    /**
         * The prefix for a message about this crawl.
         */
    var MessagePrefix: js.UndefOr[MessagePrefix] = js.undefined
    /**
         * The time at which the crawl started.
         */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Status of the last crawl.
         */
    var Status: js.UndefOr[LastCrawlStatus] = js.undefined
  }
  
  
  trait Location extends js.Object {
    /**
         * A DynamoDB Table location.
         */
    var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.undefined
    /**
         * A JDBC location.
         */
    var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.undefined
    /**
         * An Amazon S3 location.
         */
    var S3: js.UndefOr[CodeGenNodeArgs] = js.undefined
  }
  
  
  trait LocationMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ColumnValuesString]
  
  
  trait MappingEntry extends js.Object {
    /**
         * The source path.
         */
    var SourcePath: js.UndefOr[SchemaPathString] = js.undefined
    /**
         * The name of the source table.
         */
    var SourceTable: js.UndefOr[TableName] = js.undefined
    /**
         * The source type.
         */
    var SourceType: js.UndefOr[FieldType] = js.undefined
    /**
         * The target path.
         */
    var TargetPath: js.UndefOr[SchemaPathString] = js.undefined
    /**
         * The target table.
         */
    var TargetTable: js.UndefOr[TableName] = js.undefined
    /**
         * The target type.
         */
    var TargetType: js.UndefOr[FieldType] = js.undefined
  }
  
  
  trait NotificationProperty extends js.Object {
    /**
         * After a job run starts, the number of minutes to wait before sending a job run delay notification.
         */
    var NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined
  }
  
  
  trait Order extends js.Object {
    /**
         * The name of the column.
         */
    var Column: NameString
    /**
         * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
         */
    var SortOrder: IntegerFlag
  }
  
  
  trait ParametersMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ParametersMapValue]
  
  
  trait Partition extends js.Object {
    /**
         * The time at which the partition was created.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the catalog database where the table in question is located.
         */
    var DatabaseName: js.UndefOr[NameString] = js.undefined
    /**
         * The last time at which the partition was accessed.
         */
    var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The last time at which column statistics were computed for this partition.
         */
    var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * These key-value pairs define partition parameters.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * Provides information about the physical location where the partition is stored.
         */
    var StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined
    /**
         * The name of the table in question.
         */
    var TableName: js.UndefOr[NameString] = js.undefined
    /**
         * The values of the partition.
         */
    var Values: js.UndefOr[ValueStringList] = js.undefined
  }
  
  
  trait PartitionError extends js.Object {
    /**
         * Details about the partition error.
         */
    var ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined
    /**
         * The values that define the partition.
         */
    var PartitionValues: js.UndefOr[ValueStringList] = js.undefined
  }
  
  
  trait PartitionInput extends js.Object {
    /**
         * The last time at which the partition was accessed.
         */
    var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The last time at which column statistics were computed for this partition.
         */
    var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * These key-value pairs define partition parameters.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * Provides information about the physical location where the partition is stored.
         */
    var StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined
    /**
         * The values of the partition.
         */
    var Values: js.UndefOr[ValueStringList] = js.undefined
  }
  
  
  trait PartitionValueList extends js.Object {
    /**
         * The list of values.
         */
    var Values: ValueStringList
  }
  
  
  trait PhysicalConnectionRequirements extends js.Object {
    /**
         * The connection's availability zone. This field is redundant, since the specified subnet implies the availability zone to be used. The field must be populated now, but will be deprecated in the future.
         */
    var AvailabilityZone: js.UndefOr[NameString] = js.undefined
    /**
         * The security group ID list used by the connection.
         */
    var SecurityGroupIdList: js.UndefOr[SecurityGroupIdList] = js.undefined
    /**
         * The subnet ID used by the connection.
         */
    var SubnetId: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait Predecessor extends js.Object {
    /**
         * The name of the job definition used by the predecessor job run.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
    /**
         * The job-run ID of the predecessor job run.
         */
    var RunId: js.UndefOr[IdString] = js.undefined
  }
  
  
  trait Predicate extends js.Object {
    /**
         * A list of the conditions that determine when the trigger will fire.
         */
    var Conditions: js.UndefOr[ConditionList] = js.undefined
    /**
         * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
         */
    var Logical: js.UndefOr[Logical] = js.undefined
  }
  
  
  trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
    /**
         * The ID of the Data Catalog for which to set the security configuration. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The security configuration to set.
         */
    var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings
  }
  
  
  trait PutDataCatalogEncryptionSettingsResponse extends js.Object
  
  
  trait PutResourcePolicyRequest extends js.Object {
    /**
         * A value of MUST_EXIST is used to update a policy. A value of NOT_EXIST is used to create a new policy. If a value of NONE or a null value is used, the call will not depend on the existence of a policy.
         */
    var PolicyExistsCondition: js.UndefOr[ExistCondition] = js.undefined
    /**
         * This is the hash value returned when the previous policy was set using PutResourcePolicy. Its purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
         */
    var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
    /**
         * Contains the policy document to set, in JSON format.
         */
    var PolicyInJson: PolicyJsonString
  }
  
  
  trait PutResourcePolicyResponse extends js.Object {
    /**
         * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or updates this policy.
         */
    var PolicyHash: js.UndefOr[HashString] = js.undefined
  }
  
  
  trait ResetJobBookmarkRequest extends js.Object {
    /**
         * The name of the job in question.
         */
    var JobName: JobName
  }
  
  
  trait ResetJobBookmarkResponse extends js.Object {
    /**
         * The reset bookmark entry.
         */
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry] = js.undefined
  }
  
  
  trait ResourceUri extends js.Object {
    /**
         * The type of the resource.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
         * The URI for accessing the resource.
         */
    var Uri: js.UndefOr[URI] = js.undefined
  }
  
  
  trait S3Encryption extends js.Object {
    /**
         * The AWS ARN of the KMS key to be used to encrypt the data.
         */
    var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    /**
         * The encryption mode to use for S3 data.
         */
    var S3EncryptionMode: js.UndefOr[S3EncryptionMode] = js.undefined
  }
  
  
  trait S3Target extends js.Object {
    /**
         * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
         */
    var Exclusions: js.UndefOr[PathList] = js.undefined
    /**
         * The path to the Amazon S3 target.
         */
    var Path: js.UndefOr[Path] = js.undefined
  }
  
  
  trait Schedule extends js.Object {
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
    /**
         * The state of the schedule.
         */
    var State: js.UndefOr[ScheduleState] = js.undefined
  }
  
  
  trait SchemaChangePolicy extends js.Object {
    /**
         * The deletion behavior when the crawler finds a deleted object.
         */
    var DeleteBehavior: js.UndefOr[DeleteBehavior] = js.undefined
    /**
         * The update behavior when the crawler finds a changed schema.
         */
    var UpdateBehavior: js.UndefOr[UpdateBehavior] = js.undefined
  }
  
  
  trait SecurityConfiguration extends js.Object {
    /**
         * The time at which this security configuration was created.
         */
    var CreatedTimeStamp: js.UndefOr[TimestampValue] = js.undefined
    /**
         * The encryption configuration associated with this security configuration.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * The name of the security configuration.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait Segment extends js.Object {
    /**
         * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber values will range from zero through three.
         */
    var SegmentNumber: NonNegativeInteger
    /**
         * The total numer of segments.
         */
    var TotalSegments: TotalSegmentsInteger
  }
  
  
  trait SerDeInfo extends js.Object {
    /**
         * Name of the SerDe.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * These key-value pairs define initialization parameters for the SerDe.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
         */
    var SerializationLibrary: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait SkewedInfo extends js.Object {
    /**
         * A list of names of columns that contain skewed values.
         */
    var SkewedColumnNames: js.UndefOr[NameStringList] = js.undefined
    /**
         * A mapping of skewed values to the columns that contain them.
         */
    var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.undefined
    /**
         * A list of values that appear so frequently as to be considered skewed.
         */
    var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.undefined
  }
  
  
  trait StartCrawlerRequest extends js.Object {
    /**
         * Name of the crawler to start.
         */
    var Name: NameString
  }
  
  
  trait StartCrawlerResponse extends js.Object
  
  
  trait StartCrawlerScheduleRequest extends js.Object {
    /**
         * Name of the crawler to schedule.
         */
    var CrawlerName: NameString
  }
  
  
  trait StartCrawlerScheduleResponse extends js.Object
  
  
  trait StartJobRunRequest extends js.Object {
    /**
         * The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
         */
    var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
    /**
         * The job arguments specifically for this run. They override the equivalent default arguments set for in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
         */
    var Arguments: js.UndefOr[GenericMap] = js.undefined
    /**
         * The name of the job definition to use.
         */
    var JobName: NameString
    /**
         * The ID of a previous JobRun to retry.
         */
    var JobRunId: js.UndefOr[IdString] = js.undefined
    /**
         * Specifies configuration properties of a job run notification.
         */
    var NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used with this job run.
         */
    var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
    /**
         * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
  }
  
  
  trait StartJobRunResponse extends js.Object {
    /**
         * The ID assigned to this job run.
         */
    var JobRunId: js.UndefOr[IdString] = js.undefined
  }
  
  
  trait StartTriggerRequest extends js.Object {
    /**
         * The name of the trigger to start.
         */
    var Name: NameString
  }
  
  
  trait StartTriggerResponse extends js.Object {
    /**
         * The name of the trigger that was started.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait StopCrawlerRequest extends js.Object {
    /**
         * Name of the crawler to stop.
         */
    var Name: NameString
  }
  
  
  trait StopCrawlerResponse extends js.Object
  
  
  trait StopCrawlerScheduleRequest extends js.Object {
    /**
         * Name of the crawler whose schedule state to set.
         */
    var CrawlerName: NameString
  }
  
  
  trait StopCrawlerScheduleResponse extends js.Object
  
  
  trait StopTriggerRequest extends js.Object {
    /**
         * The name of the trigger to stop.
         */
    var Name: NameString
  }
  
  
  trait StopTriggerResponse extends js.Object {
    /**
         * The name of the trigger that was stopped.
         */
    var Name: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait StorageDescriptor extends js.Object {
    /**
         * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
         */
    var BucketColumns: js.UndefOr[NameStringList] = js.undefined
    /**
         * A list of the Columns in the table.
         */
    var Columns: js.UndefOr[ColumnList] = js.undefined
    /**
         * True if the data in the table is compressed, or False if not.
         */
    var Compressed: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
         */
    var InputFormat: js.UndefOr[FormatString] = js.undefined
    /**
         * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
         */
    var Location: js.UndefOr[LocationString] = js.undefined
    /**
         * Must be specified if the table contains any dimension columns.
         */
    var NumberOfBuckets: js.UndefOr[Integer] = js.undefined
    /**
         * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
         */
    var OutputFormat: js.UndefOr[FormatString] = js.undefined
    /**
         * User-supplied properties in key-value form.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * Serialization/deserialization (SerDe) information.
         */
    var SerdeInfo: js.UndefOr[SerDeInfo] = js.undefined
    /**
         * Information about values that appear very frequently in a column (skewed values).
         */
    var SkewedInfo: js.UndefOr[SkewedInfo] = js.undefined
    /**
         * A list specifying the sort order of each bucket in the table.
         */
    var SortColumns: js.UndefOr[OrderList] = js.undefined
    /**
         * True if the table data is stored in subdirectories, or False if not.
         */
    var StoredAsSubDirectories: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait Table extends js.Object {
    /**
         * Time when the table definition was created in the Data Catalog.
         */
    var CreateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Person or entity who created the table.
         */
    var CreatedBy: js.UndefOr[NameString] = js.undefined
    /**
         * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
         */
    var DatabaseName: js.UndefOr[NameString] = js.undefined
    /**
         * Description of the table.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * Last time the table was accessed. This is usually taken from HDFS, and may not be reliable.
         */
    var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Last time column statistics were computed for this table.
         */
    var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Name of the table. For Hive compatibility, this must be entirely lowercase.
         */
    var Name: NameString
    /**
         * Owner of the table.
         */
    var Owner: js.UndefOr[NameString] = js.undefined
    /**
         * These key-value pairs define properties associated with the table.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
         */
    var PartitionKeys: js.UndefOr[ColumnList] = js.undefined
    /**
         * Retention time for this table.
         */
    var Retention: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * A storage descriptor containing information about the physical storage of this table.
         */
    var StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined
    /**
         * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
         */
    var TableType: js.UndefOr[TableTypeString] = js.undefined
    /**
         * Last time the table was updated.
         */
    var UpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * If the table is a view, the expanded text of the view; otherwise null.
         */
    var ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined
    /**
         * If the table is a view, the original text of the view; otherwise null.
         */
    var ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
  }
  
  
  trait TableError extends js.Object {
    /**
         * Detail about the error.
         */
    var ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined
    /**
         * Name of the table. For Hive compatibility, this must be entirely lowercase.
         */
    var TableName: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait TableInput extends js.Object {
    /**
         * Description of the table.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * Last time the table was accessed.
         */
    var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Last time column statistics were computed for this table.
         */
    var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
         */
    var Name: NameString
    /**
         * Owner of the table.
         */
    var Owner: js.UndefOr[NameString] = js.undefined
    /**
         * These key-value pairs define properties associated with the table.
         */
    var Parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
         * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
         */
    var PartitionKeys: js.UndefOr[ColumnList] = js.undefined
    /**
         * Retention time for this table.
         */
    var Retention: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * A storage descriptor containing information about the physical storage of this table.
         */
    var StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined
    /**
         * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
         */
    var TableType: js.UndefOr[TableTypeString] = js.undefined
    /**
         * If the table is a view, the expanded text of the view; otherwise null.
         */
    var ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined
    /**
         * If the table is a view, the original text of the view; otherwise null.
         */
    var ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
  }
  
  
  trait TableVersion extends js.Object {
    /**
         * The table in question
         */
    var Table: js.UndefOr[Table] = js.undefined
    /**
         * The ID value that identifies this table version. A VersionId is a string representation of an integer. Each version is incremented by 1.
         */
    var VersionId: js.UndefOr[VersionString] = js.undefined
  }
  
  
  trait TableVersionError extends js.Object {
    /**
         * Detail about the error.
         */
    var ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined
    /**
         * The name of the table in question.
         */
    var TableName: js.UndefOr[NameString] = js.undefined
    /**
         * The ID value of the version in question. A VersionID is a string representation of an integer. Each version is incremented by 1.
         */
    var VersionId: js.UndefOr[VersionString] = js.undefined
  }
  
  
  trait Trigger extends js.Object {
    /**
         * The actions initiated by this trigger.
         */
    var Actions: js.UndefOr[ActionList] = js.undefined
    /**
         * A description of this trigger.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * Reserved for future use.
         */
    var Id: js.UndefOr[IdString] = js.undefined
    /**
         * Name of the trigger.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * The predicate of this trigger, which defines when it will fire.
         */
    var Predicate: js.UndefOr[Predicate] = js.undefined
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var Schedule: js.UndefOr[GenericString] = js.undefined
    /**
         * The current state of the trigger.
         */
    var State: js.UndefOr[TriggerState] = js.undefined
    /**
         * The type of trigger that this is.
         */
    var Type: js.UndefOr[TriggerType] = js.undefined
  }
  
  
  trait TriggerUpdate extends js.Object {
    /**
         * The actions initiated by this trigger.
         */
    var Actions: js.UndefOr[ActionList] = js.undefined
    /**
         * A description of this trigger.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * Reserved for future use.
         */
    var Name: js.UndefOr[NameString] = js.undefined
    /**
         * The predicate of this trigger, which defines when it will fire.
         */
    var Predicate: js.UndefOr[Predicate] = js.undefined
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var Schedule: js.UndefOr[GenericString] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates one or more partitions in a batch operation.
       */
    def batchCreatePartition(): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates one or more partitions in a batch operation.
       */
    def batchCreatePartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchCreatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates one or more partitions in a batch operation.
       */
    def batchCreatePartition(params: BatchCreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates one or more partitions in a batch operation.
       */
    def batchCreatePartition(
      params: BatchCreatePartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchCreatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a list of connection definitions from the Data Catalog.
       */
    def batchDeleteConnection(): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a list of connection definitions from the Data Catalog.
       */
    def batchDeleteConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a list of connection definitions from the Data Catalog.
       */
    def batchDeleteConnection(params: BatchDeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a list of connection definitions from the Data Catalog.
       */
    def batchDeleteConnection(
      params: BatchDeleteConnectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more partitions in a batch operation.
       */
    def batchDeletePartition(): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more partitions in a batch operation.
       */
    def batchDeletePartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeletePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more partitions in a batch operation.
       */
    def batchDeletePartition(params: BatchDeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more partitions in a batch operation.
       */
    def batchDeletePartition(
      params: BatchDeletePartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeletePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def batchDeleteTable(): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def batchDeleteTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def batchDeleteTable(params: BatchDeleteTableRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def batchDeleteTable(
      params: BatchDeleteTableRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified batch of versions of a table.
       */
    def batchDeleteTableVersion(): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified batch of versions of a table.
       */
    def batchDeleteTableVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified batch of versions of a table.
       */
    def batchDeleteTableVersion(params: BatchDeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified batch of versions of a table.
       */
    def batchDeleteTableVersion(
      params: BatchDeleteTableVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves partitions in a batch request.
       */
    def batchGetPartition(): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves partitions in a batch request.
       */
    def batchGetPartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetPartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves partitions in a batch request.
       */
    def batchGetPartition(params: BatchGetPartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves partitions in a batch request.
       */
    def batchGetPartition(
      params: BatchGetPartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetPartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops one or more job runs for a specified job definition.
       */
    def batchStopJobRun(): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops one or more job runs for a specified job definition.
       */
    def batchStopJobRun(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchStopJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops one or more job runs for a specified job definition.
       */
    def batchStopJobRun(params: BatchStopJobRunRequest): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops one or more job runs for a specified job definition.
       */
    def batchStopJobRun(
      params: BatchStopJobRunRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchStopJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, or abbrev JsonClassifier, depending on which field of the request is present.
       */
    def createClassifier(): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, or abbrev JsonClassifier, depending on which field of the request is present.
       */
    def createClassifier(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, or abbrev JsonClassifier, depending on which field of the request is present.
       */
    def createClassifier(params: CreateClassifierRequest): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, or abbrev JsonClassifier, depending on which field of the request is present.
       */
    def createClassifier(
      params: CreateClassifierRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection definition in the Data Catalog.
       */
    def createConnection(): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection definition in the Data Catalog.
       */
    def createConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection definition in the Data Catalog.
       */
    def createConnection(params: CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a connection definition in the Data Catalog.
       */
    def createConnection(
      params: CreateConnectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
       */
    def createCrawler(): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
       */
    def createCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
       */
    def createCrawler(params: CreateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
       */
    def createCrawler(
      params: CreateCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new database in a Data Catalog.
       */
    def createDatabase(): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new database in a Data Catalog.
       */
    def createDatabase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new database in a Data Catalog.
       */
    def createDatabase(params: CreateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new database in a Data Catalog.
       */
    def createDatabase(
      params: CreateDatabaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DevEndpoint.
       */
    def createDevEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DevEndpoint.
       */
    def createDevEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DevEndpoint.
       */
    def createDevEndpoint(params: CreateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DevEndpoint.
       */
    def createDevEndpoint(
      params: CreateDevEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new job definition.
       */
    def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new job definition.
       */
    def createJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new job definition.
       */
    def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new job definition.
       */
    def createJob(
      params: CreateJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new partition.
       */
    def createPartition(): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new partition.
       */
    def createPartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new partition.
       */
    def createPartition(params: CreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new partition.
       */
    def createPartition(
      params: CreatePartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a directed acyclic graph (DAG) into code.
       */
    def createScript(): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a directed acyclic graph (DAG) into code.
       */
    def createScript(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScriptResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a directed acyclic graph (DAG) into code.
       */
    def createScript(params: CreateScriptRequest): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a directed acyclic graph (DAG) into code.
       */
    def createScript(
      params: CreateScriptRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScriptResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new security configuration.
       */
    def createSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new security configuration.
       */
    def createSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new security configuration.
       */
    def createSecurityConfiguration(params: CreateSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new security configuration.
       */
    def createSecurityConfiguration(
      params: CreateSecurityConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new table definition in the Data Catalog.
       */
    def createTable(): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new table definition in the Data Catalog.
       */
    def createTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new table definition in the Data Catalog.
       */
    def createTable(params: CreateTableRequest): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new table definition in the Data Catalog.
       */
    def createTable(
      params: CreateTableRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new trigger.
       */
    def createTrigger(): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new trigger.
       */
    def createTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new trigger.
       */
    def createTrigger(params: CreateTriggerRequest): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new trigger.
       */
    def createTrigger(
      params: CreateTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new function definition in the Data Catalog.
       */
    def createUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new function definition in the Data Catalog.
       */
    def createUserDefinedFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new function definition in the Data Catalog.
       */
    def createUserDefinedFunction(params: CreateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new function definition in the Data Catalog.
       */
    def createUserDefinedFunction(
      params: CreateUserDefinedFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a classifier from the Data Catalog.
       */
    def deleteClassifier(): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a classifier from the Data Catalog.
       */
    def deleteClassifier(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a classifier from the Data Catalog.
       */
    def deleteClassifier(params: DeleteClassifierRequest): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a classifier from the Data Catalog.
       */
    def deleteClassifier(
      params: DeleteClassifierRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a connection from the Data Catalog.
       */
    def deleteConnection(): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a connection from the Data Catalog.
       */
    def deleteConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a connection from the Data Catalog.
       */
    def deleteConnection(params: DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a connection from the Data Catalog.
       */
    def deleteConnection(
      params: DeleteConnectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
       */
    def deleteCrawler(): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
       */
    def deleteCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
       */
    def deleteCrawler(params: DeleteCrawlerRequest): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
       */
    def deleteCrawler(
      params: DeleteCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
       */
    def deleteDatabase(): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
       */
    def deleteDatabase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
       */
    def deleteDatabase(params: DeleteDatabaseRequest): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
       */
    def deleteDatabase(
      params: DeleteDatabaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DevEndpoint.
       */
    def deleteDevEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DevEndpoint.
       */
    def deleteDevEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DevEndpoint.
       */
    def deleteDevEndpoint(params: DeleteDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DevEndpoint.
       */
    def deleteDevEndpoint(
      params: DeleteDevEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
       */
    def deleteJob(): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
       */
    def deleteJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
       */
    def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
       */
    def deleteJob(
      params: DeleteJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified partition.
       */
    def deletePartition(): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified partition.
       */
    def deletePartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified partition.
       */
    def deletePartition(params: DeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified partition.
       */
    def deletePartition(
      params: DeletePartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified policy.
       */
    def deleteResourcePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified policy.
       */
    def deleteResourcePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified policy.
       */
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified policy.
       */
    def deleteResourcePolicy(
      params: DeleteResourcePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified security configuration.
       */
    def deleteSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified security configuration.
       */
    def deleteSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified security configuration.
       */
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified security configuration.
       */
    def deleteSecurityConfiguration(
      params: DeleteSecurityConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def deleteTable(): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def deleteTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def deleteTable(params: DeleteTableRequest): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
       */
    def deleteTable(
      params: DeleteTableRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified version of a table.
       */
    def deleteTableVersion(): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified version of a table.
       */
    def deleteTableVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified version of a table.
       */
    def deleteTableVersion(params: DeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified version of a table.
       */
    def deleteTableVersion(
      params: DeleteTableVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
       */
    def deleteTrigger(): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
       */
    def deleteTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
       */
    def deleteTrigger(params: DeleteTriggerRequest): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
       */
    def deleteTrigger(
      params: DeleteTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing function definition from the Data Catalog.
       */
    def deleteUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing function definition from the Data Catalog.
       */
    def deleteUserDefinedFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing function definition from the Data Catalog.
       */
    def deleteUserDefinedFunction(params: DeleteUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing function definition from the Data Catalog.
       */
    def deleteUserDefinedFunction(
      params: DeleteUserDefinedFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the status of a migration operation.
       */
    def getCatalogImportStatus(): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the status of a migration operation.
       */
    def getCatalogImportStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCatalogImportStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the status of a migration operation.
       */
    def getCatalogImportStatus(params: GetCatalogImportStatusRequest): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the status of a migration operation.
       */
    def getCatalogImportStatus(
      params: GetCatalogImportStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCatalogImportStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a classifier by name.
       */
    def getClassifier(): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a classifier by name.
       */
    def getClassifier(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a classifier by name.
       */
    def getClassifier(params: GetClassifierRequest): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a classifier by name.
       */
    def getClassifier(
      params: GetClassifierRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all classifier objects in the Data Catalog.
       */
    def getClassifiers(): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all classifier objects in the Data Catalog.
       */
    def getClassifiers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetClassifiersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all classifier objects in the Data Catalog.
       */
    def getClassifiers(params: GetClassifiersRequest): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all classifier objects in the Data Catalog.
       */
    def getClassifiers(
      params: GetClassifiersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetClassifiersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a connection definition from the Data Catalog.
       */
    def getConnection(): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a connection definition from the Data Catalog.
       */
    def getConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a connection definition from the Data Catalog.
       */
    def getConnection(params: GetConnectionRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a connection definition from the Data Catalog.
       */
    def getConnection(
      params: GetConnectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of connection definitions from the Data Catalog.
       */
    def getConnections(): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of connection definitions from the Data Catalog.
       */
    def getConnections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of connection definitions from the Data Catalog.
       */
    def getConnections(params: GetConnectionsRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of connection definitions from the Data Catalog.
       */
    def getConnections(
      params: GetConnectionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for a specified crawler.
       */
    def getCrawler(): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for a specified crawler.
       */
    def getCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for a specified crawler.
       */
    def getCrawler(params: GetCrawlerRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for a specified crawler.
       */
    def getCrawler(
      params: GetCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metrics about specified crawlers.
       */
    def getCrawlerMetrics(): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metrics about specified crawlers.
       */
    def getCrawlerMetrics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlerMetricsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metrics about specified crawlers.
       */
    def getCrawlerMetrics(params: GetCrawlerMetricsRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metrics about specified crawlers.
       */
    def getCrawlerMetrics(
      params: GetCrawlerMetricsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlerMetricsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all crawlers defined in the customer account.
       */
    def getCrawlers(): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all crawlers defined in the customer account.
       */
    def getCrawlers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all crawlers defined in the customer account.
       */
    def getCrawlers(params: GetCrawlersRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all crawlers defined in the customer account.
       */
    def getCrawlers(
      params: GetCrawlersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCrawlersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the security configuration for a specified catalog.
       */
    def getDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the security configuration for a specified catalog.
       */
    def getDataCatalogEncryptionSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataCatalogEncryptionSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the security configuration for a specified catalog.
       */
    def getDataCatalogEncryptionSettings(params: GetDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the security configuration for a specified catalog.
       */
    def getDataCatalogEncryptionSettings(
      params: GetDataCatalogEncryptionSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataCatalogEncryptionSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a specified database.
       */
    def getDatabase(): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a specified database.
       */
    def getDatabase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a specified database.
       */
    def getDatabase(params: GetDatabaseRequest): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a specified database.
       */
    def getDatabase(
      params: GetDatabaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all Databases defined in a given Data Catalog.
       */
    def getDatabases(): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all Databases defined in a given Data Catalog.
       */
    def getDatabases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatabasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all Databases defined in a given Data Catalog.
       */
    def getDatabases(params: GetDatabasesRequest): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all Databases defined in a given Data Catalog.
       */
    def getDatabases(
      params: GetDatabasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatabasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a Python script into a directed acyclic graph (DAG). 
       */
    def getDataflowGraph(): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a Python script into a directed acyclic graph (DAG). 
       */
    def getDataflowGraph(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataflowGraphResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a Python script into a directed acyclic graph (DAG). 
       */
    def getDataflowGraph(params: GetDataflowGraphRequest): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Transforms a Python script into a directed acyclic graph (DAG). 
       */
    def getDataflowGraph(
      params: GetDataflowGraphRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataflowGraphResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoint(): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoint(params: GetDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoint(
      params: GetDevEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoints(): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDevEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoints(params: GetDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
       */
    def getDevEndpoints(
      params: GetDevEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDevEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves an existing job definition.
       */
    def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves an existing job definition.
       */
    def getJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves an existing job definition.
       */
    def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves an existing job definition.
       */
    def getJob(
      params: GetJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the metadata for a given job run.
       */
    def getJobRun(): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the metadata for a given job run.
       */
    def getJobRun(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the metadata for a given job run.
       */
    def getJobRun(params: GetJobRunRequest): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the metadata for a given job run.
       */
    def getJobRun(
      params: GetJobRunRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all runs of a given job definition.
       */
    def getJobRuns(): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all runs of a given job definition.
       */
    def getJobRuns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all runs of a given job definition.
       */
    def getJobRuns(params: GetJobRunsRequest): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata for all runs of a given job definition.
       */
    def getJobRuns(
      params: GetJobRunsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all current job definitions.
       */
    def getJobs(): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all current job definitions.
       */
    def getJobs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all current job definitions.
       */
    def getJobs(params: GetJobsRequest): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all current job definitions.
       */
    def getJobs(
      params: GetJobsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates mappings.
       */
    def getMapping(): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates mappings.
       */
    def getMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMappingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates mappings.
       */
    def getMapping(params: GetMappingRequest): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates mappings.
       */
    def getMapping(
      params: GetMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMappingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified partition.
       */
    def getPartition(): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified partition.
       */
    def getPartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified partition.
       */
    def getPartition(params: GetPartitionRequest): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about a specified partition.
       */
    def getPartition(
      params: GetPartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about the partitions in a table.
       */
    def getPartitions(): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about the partitions in a table.
       */
    def getPartitions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPartitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about the partitions in a table.
       */
    def getPartitions(params: GetPartitionsRequest): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about the partitions in a table.
       */
    def getPartitions(
      params: GetPartitionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPartitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets code to perform a specified mapping.
       */
    def getPlan(): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets code to perform a specified mapping.
       */
    def getPlan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetPlanResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets code to perform a specified mapping.
       */
    def getPlan(params: GetPlanRequest): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets code to perform a specified mapping.
       */
    def getPlan(
      params: GetPlanRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetPlanResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified resource policy.
       */
    def getResourcePolicy(): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified resource policy.
       */
    def getResourcePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified resource policy.
       */
    def getResourcePolicy(params: GetResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified resource policy.
       */
    def getResourcePolicy(
      params: GetResourcePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified security configuration.
       */
    def getSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified security configuration.
       */
    def getSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified security configuration.
       */
    def getSecurityConfiguration(params: GetSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified security configuration.
       */
    def getSecurityConfiguration(
      params: GetSecurityConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSecurityConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of all security configurations.
       */
    def getSecurityConfigurations(): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of all security configurations.
       */
    def getSecurityConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSecurityConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of all security configurations.
       */
    def getSecurityConfigurations(params: GetSecurityConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of all security configurations.
       */
    def getSecurityConfigurations(
      params: GetSecurityConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSecurityConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the Table definition in a Data Catalog for a specified table.
       */
    def getTable(): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the Table definition in a Data Catalog for a specified table.
       */
    def getTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the Table definition in a Data Catalog for a specified table.
       */
    def getTable(params: GetTableRequest): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the Table definition in a Data Catalog for a specified table.
       */
    def getTable(
      params: GetTableRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified version of a table.
       */
    def getTableVersion(): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified version of a table.
       */
    def getTableVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified version of a table.
       */
    def getTableVersion(params: GetTableVersionRequest): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified version of a table.
       */
    def getTableVersion(
      params: GetTableVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of strings that identify available versions of a specified table.
       */
    def getTableVersions(): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of strings that identify available versions of a specified table.
       */
    def getTableVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of strings that identify available versions of a specified table.
       */
    def getTableVersions(params: GetTableVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of strings that identify available versions of a specified table.
       */
    def getTableVersions(
      params: GetTableVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTableVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definitions of some or all of the tables in a given Database.
       */
    def getTables(): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definitions of some or all of the tables in a given Database.
       */
    def getTables(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTablesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definitions of some or all of the tables in a given Database.
       */
    def getTables(params: GetTablesRequest): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definitions of some or all of the tables in a given Database.
       */
    def getTables(
      params: GetTablesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTablesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a trigger.
       */
    def getTrigger(): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a trigger.
       */
    def getTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a trigger.
       */
    def getTrigger(params: GetTriggerRequest): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the definition of a trigger.
       */
    def getTrigger(
      params: GetTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the triggers associated with a job.
       */
    def getTriggers(): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the triggers associated with a job.
       */
    def getTriggers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTriggersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the triggers associated with a job.
       */
    def getTriggers(params: GetTriggersRequest): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the triggers associated with a job.
       */
    def getTriggers(
      params: GetTriggersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTriggersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified function definition from the Data Catalog.
       */
    def getUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified function definition from the Data Catalog.
       */
    def getUserDefinedFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified function definition from the Data Catalog.
       */
    def getUserDefinedFunction(params: GetUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specified function definition from the Data Catalog.
       */
    def getUserDefinedFunction(
      params: GetUserDefinedFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a multiple function definitions from the Data Catalog.
       */
    def getUserDefinedFunctions(): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a multiple function definitions from the Data Catalog.
       */
    def getUserDefinedFunctions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserDefinedFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a multiple function definitions from the Data Catalog.
       */
    def getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a multiple function definitions from the Data Catalog.
       */
    def getUserDefinedFunctions(
      params: GetUserDefinedFunctionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserDefinedFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports an existing Athena Data Catalog to AWS Glue
       */
    def importCatalogToGlue(): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports an existing Athena Data Catalog to AWS Glue
       */
    def importCatalogToGlue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCatalogToGlueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports an existing Athena Data Catalog to AWS Glue
       */
    def importCatalogToGlue(params: ImportCatalogToGlueRequest): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports an existing Athena Data Catalog to AWS Glue
       */
    def importCatalogToGlue(
      params: ImportCatalogToGlueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCatalogToGlueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the security configuration for a specified catalog. Once the configuration has been set, the specified encryption is applied to every catalog write thereafter.
       */
    def putDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the security configuration for a specified catalog. Once the configuration has been set, the specified encryption is applied to every catalog write thereafter.
       */
    def putDataCatalogEncryptionSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDataCatalogEncryptionSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the security configuration for a specified catalog. Once the configuration has been set, the specified encryption is applied to every catalog write thereafter.
       */
    def putDataCatalogEncryptionSettings(params: PutDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the security configuration for a specified catalog. Once the configuration has been set, the specified encryption is applied to every catalog write thereafter.
       */
    def putDataCatalogEncryptionSettings(
      params: PutDataCatalogEncryptionSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDataCatalogEncryptionSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the Data Catalog resource policy for access control.
       */
    def putResourcePolicy(): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the Data Catalog resource policy for access control.
       */
    def putResourcePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the Data Catalog resource policy for access control.
       */
    def putResourcePolicy(params: PutResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the Data Catalog resource policy for access control.
       */
    def putResourcePolicy(
      params: PutResourcePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets a bookmark entry.
       */
    def resetJobBookmark(): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets a bookmark entry.
       */
    def resetJobBookmark(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetJobBookmarkResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets a bookmark entry.
       */
    def resetJobBookmark(params: ResetJobBookmarkRequest): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets a bookmark entry.
       */
    def resetJobBookmark(
      params: ResetJobBookmarkRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetJobBookmarkResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
       */
    def startCrawler(): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
       */
    def startCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
       */
    def startCrawler(params: StartCrawlerRequest): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
       */
    def startCrawler(
      params: StartCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
       */
    def startCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
       */
    def startCrawlerSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
       */
    def startCrawlerSchedule(params: StartCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
       */
    def startCrawlerSchedule(
      params: StartCrawlerScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a job run using a job definition.
       */
    def startJobRun(): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a job run using a job definition.
       */
    def startJobRun(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a job run using a job definition.
       */
    def startJobRun(params: StartJobRunRequest): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a job run using a job definition.
       */
    def startJobRun(
      params: StartJobRunRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartJobRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
       */
    def startTrigger(): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
       */
    def startTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
       */
    def startTrigger(params: StartTriggerRequest): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
       */
    def startTrigger(
      params: StartTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * If the specified crawler is running, stops the crawl.
       */
    def stopCrawler(): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * If the specified crawler is running, stops the crawl.
       */
    def stopCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * If the specified crawler is running, stops the crawl.
       */
    def stopCrawler(params: StopCrawlerRequest): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * If the specified crawler is running, stops the crawl.
       */
    def stopCrawler(
      params: StopCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
       */
    def stopCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
       */
    def stopCrawlerSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
       */
    def stopCrawlerSchedule(params: StopCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
       */
    def stopCrawlerSchedule(
      params: StopCrawlerScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a specified trigger.
       */
    def stopTrigger(): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a specified trigger.
       */
    def stopTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a specified trigger.
       */
    def stopTrigger(params: StopTriggerRequest): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a specified trigger.
       */
    def stopTrigger(
      params: StopTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing classifier (a GrokClassifier, XMLClassifier, or JsonClassifier, depending on which field is present).
       */
    def updateClassifier(): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing classifier (a GrokClassifier, XMLClassifier, or JsonClassifier, depending on which field is present).
       */
    def updateClassifier(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing classifier (a GrokClassifier, XMLClassifier, or JsonClassifier, depending on which field is present).
       */
    def updateClassifier(params: UpdateClassifierRequest): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing classifier (a GrokClassifier, XMLClassifier, or JsonClassifier, depending on which field is present).
       */
    def updateClassifier(
      params: UpdateClassifierRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClassifierResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a connection definition in the Data Catalog.
       */
    def updateConnection(): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a connection definition in the Data Catalog.
       */
    def updateConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a connection definition in the Data Catalog.
       */
    def updateConnection(params: UpdateConnectionRequest): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a connection definition in the Data Catalog.
       */
    def updateConnection(
      params: UpdateConnectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
       */
    def updateCrawler(): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
       */
    def updateCrawler(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
       */
    def updateCrawler(params: UpdateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
       */
    def updateCrawler(
      params: UpdateCrawlerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCrawlerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schedule of a crawler using a cron expression. 
       */
    def updateCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schedule of a crawler using a cron expression. 
       */
    def updateCrawlerSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schedule of a crawler using a cron expression. 
       */
    def updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schedule of a crawler using a cron expression. 
       */
    def updateCrawlerSchedule(
      params: UpdateCrawlerScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCrawlerScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing database definition in a Data Catalog.
       */
    def updateDatabase(): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing database definition in a Data Catalog.
       */
    def updateDatabase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing database definition in a Data Catalog.
       */
    def updateDatabase(params: UpdateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing database definition in a Data Catalog.
       */
    def updateDatabase(
      params: UpdateDatabaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDatabaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a specified DevEndpoint.
       */
    def updateDevEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a specified DevEndpoint.
       */
    def updateDevEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a specified DevEndpoint.
       */
    def updateDevEndpoint(params: UpdateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a specified DevEndpoint.
       */
    def updateDevEndpoint(
      params: UpdateDevEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDevEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing job definition.
       */
    def updateJob(): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing job definition.
       */
    def updateJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing job definition.
       */
    def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing job definition.
       */
    def updateJob(
      params: UpdateJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a partition.
       */
    def updatePartition(): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a partition.
       */
    def updatePartition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a partition.
       */
    def updatePartition(params: UpdatePartitionRequest): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a partition.
       */
    def updatePartition(
      params: UpdatePartitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePartitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a metadata table in the Data Catalog.
       */
    def updateTable(): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a metadata table in the Data Catalog.
       */
    def updateTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a metadata table in the Data Catalog.
       */
    def updateTable(params: UpdateTableRequest): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a metadata table in the Data Catalog.
       */
    def updateTable(
      params: UpdateTableRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTableResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a trigger definition.
       */
    def updateTrigger(): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a trigger definition.
       */
    def updateTrigger(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a trigger definition.
       */
    def updateTrigger(params: UpdateTriggerRequest): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a trigger definition.
       */
    def updateTrigger(
      params: UpdateTriggerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTriggerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing function definition in the Data Catalog.
       */
    def updateUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing function definition in the Data Catalog.
       */
    def updateUserDefinedFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing function definition in the Data Catalog.
       */
    def updateUserDefinedFunction(params: UpdateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing function definition in the Data Catalog.
       */
    def updateUserDefinedFunction(
      params: UpdateUserDefinedFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserDefinedFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateClassifierRequest extends js.Object {
    /**
         * A GrokClassifier object with updated fields.
         */
    var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.undefined
    /**
         * A JsonClassifier object with updated fields.
         */
    var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.undefined
    /**
         * An XMLClassifier object with updated fields.
         */
    var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.undefined
  }
  
  
  trait UpdateClassifierResponse extends js.Object
  
  
  trait UpdateConnectionRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the connection resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A ConnectionInput object that redefines the connection in question.
         */
    var ConnectionInput: ConnectionInput
    /**
         * The name of the connection definition to update.
         */
    var Name: NameString
  }
  
  
  trait UpdateConnectionResponse extends js.Object
  
  
  trait UpdateCrawlerRequest extends js.Object {
    /**
         * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
         */
    var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
    /**
         * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
         */
    var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
    /**
         * The name of the SecurityConfiguration structure to be used by this Crawler.
         */
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined
    /**
         * The AWS Glue database where results are stored, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
         */
    var DatabaseName: js.UndefOr[DatabaseName] = js.undefined
    /**
         * A description of the new crawler.
         */
    var Description: js.UndefOr[DescriptionStringRemovable] = js.undefined
    /**
         * Name of the new crawler.
         */
    var Name: NameString
    /**
         * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
         */
    var Role: js.UndefOr[Role] = js.undefined
    /**
         * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var Schedule: js.UndefOr[CronExpression] = js.undefined
    /**
         * Policy for the crawler's update and deletion behavior.
         */
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined
    /**
         * The table prefix used for catalog tables that are created.
         */
    var TablePrefix: js.UndefOr[TablePrefix] = js.undefined
    /**
         * A list of targets to crawl.
         */
    var Targets: js.UndefOr[CrawlerTargets] = js.undefined
  }
  
  
  trait UpdateCrawlerResponse extends js.Object
  
  
  trait UpdateCrawlerScheduleRequest extends js.Object {
    /**
         * Name of the crawler whose schedule to update.
         */
    var CrawlerName: NameString
    /**
         * The updated cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
         */
    var Schedule: js.UndefOr[CronExpression] = js.undefined
  }
  
  
  trait UpdateCrawlerScheduleResponse extends js.Object
  
  
  trait UpdateDatabaseRequest extends js.Object {
    /**
         * The ID of the Data Catalog in which the metadata database resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * A DatabaseInput object specifying the new definition of the metadata database in the catalog.
         */
    var DatabaseInput: DatabaseInput
    /**
         * The name of the database to update in the catalog. For Hive compatibility, this is folded to lowercase.
         */
    var Name: NameString
  }
  
  
  trait UpdateDatabaseResponse extends js.Object
  
  
  trait UpdateDevEndpointRequest extends js.Object {
    /**
         * The list of public keys for the DevEndpoint to use.
         */
    var AddPublicKeys: js.UndefOr[PublicKeysList] = js.undefined
    /**
         * Custom Python or Java libraries to be loaded in the DevEndpoint.
         */
    var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.undefined
    /**
         * The list of public keys to be deleted from the DevEndpoint.
         */
    var DeletePublicKeys: js.UndefOr[PublicKeysList] = js.undefined
    /**
         * The name of the DevEndpoint to be updated.
         */
    var EndpointName: GenericString
    /**
         * The public key for the DevEndpoint to use.
         */
    var PublicKey: js.UndefOr[GenericString] = js.undefined
    /**
         * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False otherwise.
         */
    var UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.undefined
  }
  
  
  trait UpdateDevEndpointResponse extends js.Object
  
  
  trait UpdateGrokClassifierRequest extends js.Object {
    /**
         * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
         */
    var Classification: js.UndefOr[Classification] = js.undefined
    /**
         * Optional custom grok patterns used by this classifier.
         */
    var CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined
    /**
         * The grok pattern used by this classifier.
         */
    var GrokPattern: js.UndefOr[GrokPattern] = js.undefined
    /**
         * The name of the GrokClassifier.
         */
    var Name: NameString
  }
  
  
  trait UpdateJobRequest extends js.Object {
    /**
         * Name of the job definition to update.
         */
    var JobName: NameString
    /**
         * Specifies the values with which to update the job definition.
         */
    var JobUpdate: JobUpdate
  }
  
  
  trait UpdateJobResponse extends js.Object {
    /**
         * Returns the name of the updated job definition.
         */
    var JobName: js.UndefOr[NameString] = js.undefined
  }
  
  
  trait UpdateJsonClassifierRequest extends js.Object {
    /**
         * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
         */
    var JsonPath: js.UndefOr[JsonPath] = js.undefined
    /**
         * The name of the classifier.
         */
    var Name: NameString
  }
  
  
  trait UpdatePartitionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the partition to be updated resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which the table in question resides.
         */
    var DatabaseName: NameString
    /**
         * The new partition object to which to update the partition.
         */
    var PartitionInput: PartitionInput
    /**
         * A list of the values defining the partition.
         */
    var PartitionValueList: BoundedPartitionValueList
    /**
         * The name of the table where the partition to be updated is located.
         */
    var TableName: NameString
  }
  
  
  trait UpdatePartitionResponse extends js.Object
  
  
  trait UpdateTableRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
         */
    var DatabaseName: NameString
    /**
         * By default, UpdateTable always creates an archived version of the table before updating it. If skipArchive is set to true, however, UpdateTable does not create the archived version.
         */
    var SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
    /**
         * An updated TableInput object to define the metadata table in the catalog.
         */
    var TableInput: TableInput
  }
  
  
  trait UpdateTableResponse extends js.Object
  
  
  trait UpdateTriggerRequest extends js.Object {
    /**
         * The name of the trigger to update.
         */
    var Name: NameString
    /**
         * The new values with which to update the trigger.
         */
    var TriggerUpdate: TriggerUpdate
  }
  
  
  trait UpdateTriggerResponse extends js.Object {
    /**
         * The resulting trigger definition.
         */
    var Trigger: js.UndefOr[Trigger] = js.undefined
  }
  
  
  trait UpdateUserDefinedFunctionRequest extends js.Object {
    /**
         * The ID of the Data Catalog where the function to be updated is located. If none is supplied, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    /**
         * The name of the catalog database where the function to be updated is located.
         */
    var DatabaseName: NameString
    /**
         * A FunctionInput object that re-defines the function in the Data Catalog.
         */
    var FunctionInput: UserDefinedFunctionInput
    /**
         * The name of the function.
         */
    var FunctionName: NameString
  }
  
  
  trait UpdateUserDefinedFunctionResponse extends js.Object
  
  
  trait UpdateXMLClassifierRequest extends js.Object {
    /**
         * An identifier of the data format that the classifier matches.
         */
    var Classification: js.UndefOr[Classification] = js.undefined
    /**
         * The name of the classifier.
         */
    var Name: NameString
    /**
         * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
         */
    var RowTag: js.UndefOr[RowTag] = js.undefined
  }
  
  
  trait UserDefinedFunction extends js.Object {
    /**
         * The Java class that contains the function code.
         */
    var ClassName: js.UndefOr[NameString] = js.undefined
    /**
         * The time at which the function was created.
         */
    var CreateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the function.
         */
    var FunctionName: js.UndefOr[NameString] = js.undefined
    /**
         * The owner of the function.
         */
    var OwnerName: js.UndefOr[NameString] = js.undefined
    /**
         * The owner type.
         */
    var OwnerType: js.UndefOr[PrincipalType] = js.undefined
    /**
         * The resource URIs for the function.
         */
    var ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
  }
  
  
  trait UserDefinedFunctionInput extends js.Object {
    /**
         * The Java class that contains the function code.
         */
    var ClassName: js.UndefOr[NameString] = js.undefined
    /**
         * The name of the function.
         */
    var FunctionName: js.UndefOr[NameString] = js.undefined
    /**
         * The owner of the function.
         */
    var OwnerName: js.UndefOr[NameString] = js.undefined
    /**
         * The owner type.
         */
    var OwnerType: js.UndefOr[PrincipalType] = js.undefined
    /**
         * The resource URIs for the function.
         */
    var ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
  }
  
  
  trait XMLClassifier extends js.Object {
    /**
         * An identifier of the data format that the classifier matches.
         */
    var Classification: Classification
    /**
         * The time this classifier was registered.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The time this classifier was last updated.
         */
    var LastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the classifier.
         */
    var Name: NameString
    /**
         * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
         */
    var RowTag: js.UndefOr[RowTag] = js.undefined
    /**
         * The version of this classifier.
         */
    var Version: js.UndefOr[VersionId] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ActionList = js.Array[Action]
  type AttemptCount = scala.Double
  type BatchDeletePartitionValueList = js.Array[PartitionValueList]
  type BatchDeleteTableNameList = js.Array[NameString]
  type BatchDeleteTableVersionList = js.Array[VersionString]
  type BatchGetPartitionValueList = js.Array[PartitionValueList]
  type BatchStopJobRunErrorList = js.Array[BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList = js.Array[IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]
  type Boolean = scala.Boolean
  type BooleanNullable = scala.Boolean
  type BooleanValue = scala.Boolean
  type BoundedPartitionValueList = js.Array[ValueString]
  type CatalogEncryptionMode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS` | java.lang.String
  type CatalogEntries = js.Array[CatalogEntry]
  type CatalogIdString = java.lang.String
  type Classification = java.lang.String
  type ClassifierList = js.Array[Classifier]
  type ClassifierNameList = js.Array[NameString]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchEncryptionMode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS` | java.lang.String
  type CodeGenArgName = java.lang.String
  type CodeGenArgValue = java.lang.String
  type CodeGenIdentifier = java.lang.String
  type CodeGenNodeArgs = js.Array[CodeGenNodeArg]
  type CodeGenNodeType = java.lang.String
  type ColumnList = js.Array[Column]
  type ColumnTypeString = java.lang.String
  type ColumnValueStringList = js.Array[ColumnValuesString]
  type ColumnValuesString = java.lang.String
  type CommentString = java.lang.String
  type ConditionList = js.Array[Condition]
  type ConnectionList = js.Array[Connection]
  type ConnectionName = java.lang.String
  type ConnectionPropertyKey = awsDashSdkLib.awsDashSdkLibStrings.HOST | awsDashSdkLib.awsDashSdkLibStrings.PORT | awsDashSdkLib.awsDashSdkLibStrings.USERNAME | awsDashSdkLib.awsDashSdkLibStrings.PASSWORD | awsDashSdkLib.awsDashSdkLibStrings.JDBC_DRIVER_JAR_URI | awsDashSdkLib.awsDashSdkLibStrings.JDBC_DRIVER_CLASS_NAME | awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENGINE | awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENGINE_VERSION | awsDashSdkLib.awsDashSdkLibStrings.CONFIG_FILES | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ID | awsDashSdkLib.awsDashSdkLibStrings.JDBC_CONNECTION_URL | awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENFORCE_SSL | java.lang.String
  type ConnectionType = awsDashSdkLib.awsDashSdkLibStrings.JDBC | awsDashSdkLib.awsDashSdkLibStrings.SFTP | java.lang.String
  type CrawlerConfiguration = java.lang.String
  type CrawlerList = js.Array[Crawler]
  type CrawlerMetricsList = js.Array[CrawlerMetrics]
  type CrawlerNameList = js.Array[NameString]
  type CrawlerSecurityConfiguration = java.lang.String
  type CrawlerState = awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | java.lang.String
  type CronExpression = java.lang.String
  type CustomPatterns = java.lang.String
  type DagEdges = js.Array[CodeGenEdge]
  type DagNodes = js.Array[CodeGenNode]
  type DatabaseList = js.Array[Database]
  type DatabaseName = java.lang.String
  type DeleteBehavior = awsDashSdkLib.awsDashSdkLibStrings.LOG | awsDashSdkLib.awsDashSdkLibStrings.DELETE_FROM_DATABASE | awsDashSdkLib.awsDashSdkLibStrings.DEPRECATE_IN_DATABASE | java.lang.String
  type DeleteConnectionNameList = js.Array[NameString]
  type DescriptionString = java.lang.String
  type DescriptionStringRemovable = java.lang.String
  type DevEndpointList = js.Array[DevEndpoint]
  type DynamoDBTargetList = js.Array[DynamoDBTarget]
  type ErrorString = java.lang.String
  type ExecutionTime = scala.Double
  type ExistCondition = awsDashSdkLib.awsDashSdkLibStrings.MUST_EXIST | awsDashSdkLib.awsDashSdkLibStrings.NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type FieldType = java.lang.String
  type FilterString = java.lang.String
  type FormatString = java.lang.String
  type GenericString = java.lang.String
  type GetTableVersionsList = js.Array[TableVersion]
  type GrokPattern = java.lang.String
  type HashString = java.lang.String
  type IdString = java.lang.String
  type Integer = scala.Double
  type IntegerFlag = scala.Double
  type IntegerValue = scala.Double
  type JdbcTargetList = js.Array[JdbcTarget]
  type JobBookmarksEncryptionMode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.`CSE-KMS` | java.lang.String
  type JobList = js.Array[Job]
  type JobName = java.lang.String
  type JobRunList = js.Array[JobRun]
  type JobRunState = awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.TIMEOUT | java.lang.String
  type JsonPath = java.lang.String
  type JsonValue = java.lang.String
  type KeyString = java.lang.String
  type KmsKeyArn = java.lang.String
  type Language = awsDashSdkLib.awsDashSdkLibStrings.PYTHON | awsDashSdkLib.awsDashSdkLibStrings.SCALA | java.lang.String
  type LastCrawlStatus = awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.CANCELLED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type LocationString = java.lang.String
  type LogGroup = java.lang.String
  type LogStream = java.lang.String
  type Logical = awsDashSdkLib.awsDashSdkLibStrings.AND | awsDashSdkLib.awsDashSdkLibStrings.ANY | java.lang.String
  type LogicalOperator = awsDashSdkLib.awsDashSdkLibStrings.EQUALS | java.lang.String
  type MappingList = js.Array[MappingEntry]
  type MatchCriteria = js.Array[NameString]
  type MaxConcurrentRuns = scala.Double
  type MaxRetries = scala.Double
  type MessagePrefix = java.lang.String
  type MillisecondsCount = scala.Double
  type NameString = java.lang.String
  type NameStringList = js.Array[NameString]
  type NonNegativeDouble = scala.Double
  type NonNegativeInteger = scala.Double
  type NotifyDelayAfter = scala.Double
  type OrderList = js.Array[Order]
  type PageSize = scala.Double
  type ParametersMapValue = java.lang.String
  type PartitionErrors = js.Array[PartitionError]
  type PartitionInputList = js.Array[PartitionInput]
  type PartitionList = js.Array[Partition]
  type Path = java.lang.String
  type PathList = js.Array[Path]
  type PolicyJsonString = java.lang.String
  type PredecessorList = js.Array[Predecessor]
  type PredicateString = java.lang.String
  type PrincipalType = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.ROLE | awsDashSdkLib.awsDashSdkLibStrings.GROUP | java.lang.String
  type PublicKeysList = js.Array[GenericString]
  type PythonScript = java.lang.String
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.JAR | awsDashSdkLib.awsDashSdkLibStrings.FILE | awsDashSdkLib.awsDashSdkLibStrings.ARCHIVE | java.lang.String
  type ResourceUriList = js.Array[ResourceUri]
  type Role = java.lang.String
  type RoleArn = java.lang.String
  type RoleString = java.lang.String
  type RowTag = java.lang.String
  type S3EncryptionList = js.Array[S3Encryption]
  type S3EncryptionMode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS` | awsDashSdkLib.awsDashSdkLibStrings.`SSE-S3` | java.lang.String
  type S3TargetList = js.Array[S3Target]
  type ScalaCode = java.lang.String
  type ScheduleState = awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED | awsDashSdkLib.awsDashSdkLibStrings.NOT_SCHEDULED | awsDashSdkLib.awsDashSdkLibStrings.TRANSITIONING | java.lang.String
  type SchemaPathString = java.lang.String
  type ScriptLocationString = java.lang.String
  type SecurityConfigurationList = js.Array[SecurityConfiguration]
  type SecurityGroupIdList = js.Array[NameString]
  type StringList = js.Array[GenericString]
  type TableErrors = js.Array[TableError]
  type TableList = js.Array[Table]
  type TableName = java.lang.String
  type TablePrefix = java.lang.String
  type TableTypeString = java.lang.String
  type TableVersionErrors = js.Array[TableVersionError]
  type Timeout = scala.Double
  type Timestamp = stdLib.Date
  type TimestampValue = stdLib.Date
  type Token = java.lang.String
  type TotalSegmentsInteger = scala.Double
  type TriggerList = js.Array[Trigger]
  type TriggerState = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.CREATED | awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVATED | awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATING | awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATED | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
  type TriggerType = awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED | awsDashSdkLib.awsDashSdkLibStrings.CONDITIONAL | awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND | java.lang.String
  type URI = java.lang.String
  type UpdateBehavior = awsDashSdkLib.awsDashSdkLibStrings.LOG | awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_DATABASE | java.lang.String
  type UriString = java.lang.String
  type UserDefinedFunctionList = js.Array[UserDefinedFunction]
  type ValueString = java.lang.String
  type ValueStringList = js.Array[ValueString]
  type VersionId = scala.Double
  type VersionString = java.lang.String
  type ViewTextString = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-03-31` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

