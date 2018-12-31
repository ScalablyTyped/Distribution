package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesisanalyticsv2", "KinesisAnalyticsV2")
@js.native
object KinesisAnalyticsV2Ns extends js.Object {
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    /**
      * The Kinesis Data Analytics application name.
      */
    var ApplicationName: ApplicationName
    /**
      * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN). 
      */
    var CloudWatchLoggingOption: CloudWatchLoggingOption
    /**
      * The version ID of the Kinesis Data Analytics application. You can retrieve the application version ID using DescribeApplication.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
  }
  
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {
    /**
      * The application's ARN.
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options. 
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
      */
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
  }
  
  trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
    /**
      * The name of the application to which you want to add the input processing configuration.
      */
    var ApplicationName: ApplicationName
    /**
      * The version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the input configuration to add the input processing configuration to. You can get a list of the input IDs for an application using the DescribeApplication operation.
      */
    var InputId: Id
    /**
      * The InputProcessingConfiguration to add to the application.
      */
    var InputProcessingConfiguration: InputProcessingConfiguration
  }
  
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * Provides the current application version.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics assigns to each input configuration that you add to your application.
      */
    var InputId: js.UndefOr[Id] = js.undefined
    /**
      * The description of the preprocessor that executes on records in this input before the application's code is run.
      */
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined
  }
  
  trait AddApplicationInputRequest extends js.Object {
    /**
      * The name of your existing application to which you want to add the streaming source.
      */
    var ApplicationName: ApplicationName
    /**
      * The current version of your application. You can use the DescribeApplication operation to find the current application version.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The Input to add.
      */
    var Input: Input
  }
  
  trait AddApplicationInputResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * Provides the current application version.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * Describes the application input configuration. 
      */
    var InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
  }
  
  trait AddApplicationOutputRequest extends js.Object {
    /**
      * The name of the application to which you want to add the output configuration.
      */
    var ApplicationName: ApplicationName
    /**
      * The version of the application to which you want to add the output configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * An array of objects, each describing one output configuration. In the output configuration, you specify the name of an in-application stream, a destination (that is, a Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
      */
    var Output: Output
  }
  
  trait AddApplicationOutputResponse extends js.Object {
    /**
      * The application Amazon Resource Name (ARN).
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * Describes the application output configuration. For more information, see Configuring Application Output. 
      */
    var OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
  }
  
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    /**
      * The name of an existing application.
      */
    var ApplicationName: ApplicationName
    /**
      * The version of the application for which you are adding the reference data source. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The reference data source can be an object in your Amazon S3 bucket. Kinesis Data Analytics reads the object and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and the resulting in-application table that is created. 
      */
    var ReferenceDataSource: ReferenceDataSource
  }
  
  trait AddApplicationReferenceDataSourceResponse extends js.Object {
    /**
      * The application Amazon Resource Name (ARN).
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is updated.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * Describes reference data sources configured for the application. 
      */
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
  }
  
  trait ApplicationCodeConfiguration extends js.Object {
    /**
      * The location and type of the application code.
      */
    var CodeContent: js.UndefOr[CodeContent] = js.undefined
    /**
      * Specifies whether the code content is in text or zip format.
      */
    var CodeContentType: CodeContentType
  }
  
  trait ApplicationCodeConfigurationDescription extends js.Object {
    /**
      * Describes details about the location and format of the application code.
      */
    var CodeContentDescription: js.UndefOr[CodeContentDescription] = js.undefined
    /**
      * Specifies whether the code content is in text or zip format.
      */
    var CodeContentType: CodeContentType
  }
  
  trait ApplicationCodeConfigurationUpdate extends js.Object {
    /**
      * Describes updates to the code content type.
      */
    var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.undefined
    /**
      * Describes updates to the code content of an application.
      */
    var CodeContentUpdate: js.UndefOr[CodeContentUpdate] = js.undefined
  }
  
  trait ApplicationConfiguration extends js.Object {
    /**
      * The code location and type parameters for a Java-based Kinesis Data Analytics application.
      */
    var ApplicationCodeConfiguration: ApplicationCodeConfiguration
    /**
      * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration] = js.undefined
    /**
      * Describes execution properties for a Java-based Kinesis Data Analytics application.
      */
    var EnvironmentProperties: js.UndefOr[EnvironmentProperties] = js.undefined
    /**
      * The creation and update parameters for a Java-based Kinesis Data Analytics application.
      */
    var FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration] = js.undefined
    /**
      * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
      */
    var SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration] = js.undefined
  }
  
  trait ApplicationConfigurationDescription extends js.Object {
    /**
      * The details about the application code for a Java-based Kinesis Data Analytics application.
      */
    var ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription] = js.undefined
    /**
      * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription] = js.undefined
    /**
      * Describes execution properties for a Java-based Kinesis Data Analytics application.
      */
    var EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions] = js.undefined
    /**
      * The details about a Java-based Kinesis Data Analytics application.
      */
    var FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription] = js.undefined
    /**
      * The details about the starting properties for a Kinesis Data Analytics application.
      */
    var RunConfigurationDescription: js.UndefOr[RunConfigurationDescription] = js.undefined
    /**
      * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
      */
    var SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription] = js.undefined
  }
  
  trait ApplicationConfigurationUpdate extends js.Object {
    /**
      * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
      */
    var ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate] = js.undefined
    /**
      * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate] = js.undefined
    /**
      * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
      */
    var EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates] = js.undefined
    /**
      * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
      */
    var FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate] = js.undefined
    /**
      * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
      */
    var SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate] = js.undefined
  }
  
  trait ApplicationDetail extends js.Object {
    /**
      * The ARN of the application.
      */
    var ApplicationARN: ResourceARN
    /**
      * Provides details about the application's SQL or Java code and starting parameters.
      */
    var ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription] = js.undefined
    /**
      * The description of the application.
      */
    var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
    /**
      * The name of the application.
      */
    var ApplicationName: ApplicationName
    /**
      * The status of the application.
      */
    var ApplicationStatus: ApplicationStatus
    /**
      * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
      */
    var ApplicationVersionId: ApplicationVersionId
    /**
      * Describes the application Amazon CloudWatch logging options.
      */
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
    /**
      * The current timestamp when the application was created.
      */
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The current timestamp when the application was last updated.
      */
    var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The runtime environment for the application (SQL-1.0 or JAVA-8-FLINK-1.5).
      */
    var RuntimeEnvironment: RuntimeEnvironment
    /**
      * Specifies the IAM role that the application uses to access external resources.
      */
    var ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait ApplicationRestoreConfiguration extends js.Object {
    /**
      * Specifies how the application should be restored.
      */
    var ApplicationRestoreType: ApplicationRestoreType
    /**
      * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
      */
    var SnapshotName: js.UndefOr[SnapshotName] = js.undefined
  }
  
  trait ApplicationSnapshotConfiguration extends js.Object {
    /**
      * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var SnapshotsEnabled: BooleanObject
  }
  
  trait ApplicationSnapshotConfigurationDescription extends js.Object {
    /**
      * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var SnapshotsEnabled: BooleanObject
  }
  
  trait ApplicationSnapshotConfigurationUpdate extends js.Object {
    /**
      * Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
      */
    var SnapshotsEnabledUpdate: BooleanObject
  }
  
  trait ApplicationSummary extends js.Object {
    /**
      * The ARN of the application.
      */
    var ApplicationARN: ResourceARN
    /**
      * The name of the application.
      */
    var ApplicationName: ApplicationName
    /**
      * The status of the application.
      */
    var ApplicationStatus: ApplicationStatus
    /**
      * Provides the current application version.
      */
    var ApplicationVersionId: ApplicationVersionId
    /**
      * The runtime environment for the application (SQL-1.0 or JAVA-8-FLINK-1.5).
      */
    var RuntimeEnvironment: RuntimeEnvironment
  }
  
  trait CSVMappingParameters extends js.Object {
    /**
      * The column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
      */
    var RecordColumnDelimiter: RecordColumnDelimiter
    /**
      * The row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
      */
    var RecordRowDelimiter: RecordRowDelimiter
  }
  
  trait CheckpointConfiguration extends js.Object {
    /**
      * Describes the interval in milliseconds between checkpoint operations. 
      */
    var CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined
    /**
      * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
      */
    var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes whether the application uses Amazon Kinesis Data Analytics' default checkpointing behavior. 
      */
    var ConfigurationType: ConfigurationType
    /**
      * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start. If a checkpoint operation takes longer than the CheckpointInterval, the application otherwise performs continual checkpoint operations. For more information, see  Tuning Checkpointing in the Apache Flink Documentation.
      */
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
  }
  
  trait CheckpointConfigurationDescription extends js.Object {
    /**
      * Describes the interval in milliseconds between checkpoint operations.
      */
    var CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined
    /**
      * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
      */
    var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
      */
    var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
      */
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
  }
  
  trait CheckpointConfigurationUpdate extends js.Object {
    /**
      * Describes updates to the interval in milliseconds between checkpoint operations.
      */
    var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined
    /**
      * Describes updates to whether checkpointing is enabled for an application.
      */
    var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
      */
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
      */
    var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchLoggingOption extends js.Object {
    /**
      * The ARN of the CloudWatch log to receive application messages.
      */
    var LogStreamARN: LogStreamARN
  }
  
  trait CloudWatchLoggingOptionDescription extends js.Object {
    /**
      * The ID of the CloudWatch logging option description.
      */
    var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
      */
    var LogStreamARN: LogStreamARN
    /**
      * The IAM ARN of the role to use to send application messages.   Provided for backward compatibility. Applications created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    /**
      * The ID of the CloudWatch logging option to update
      */
    var CloudWatchLoggingOptionId: Id
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
      */
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
  }
  
  trait CodeContent extends js.Object {
    /**
      * Information about the Amazon S3 bucket containing the application code.
      */
    var S3ContentLocation: js.UndefOr[S3ContentLocation] = js.undefined
    /**
      * The text-format code for a Java-based Kinesis Data Analytics application.
      */
    var TextContent: js.UndefOr[TextContent] = js.undefined
    /**
      * The zip-format code for a Java-based Kinesis Data Analytics application.
      */
    var ZipFileContent: js.UndefOr[ZipFileContent] = js.undefined
  }
  
  trait CodeContentDescription extends js.Object {
    /**
      * The checksum that can be used to validate zip-format code.
      */
    var CodeMD5: js.UndefOr[CodeMD5] = js.undefined
    /**
      * The size in bytes of the application code. Can be used to validate zip-format code.
      */
    var CodeSize: js.UndefOr[CodeSize] = js.undefined
    /**
      * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
      */
    var S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription] = js.undefined
    /**
      * The text-format code
      */
    var TextContent: js.UndefOr[TextContent] = js.undefined
  }
  
  trait CodeContentUpdate extends js.Object {
    /**
      * Describes an update to the location of code for an application.
      */
    var S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate] = js.undefined
    /**
      * Describes an update to the text code for an application.
      */
    var TextContentUpdate: js.UndefOr[TextContent] = js.undefined
    /**
      * Describes an update to the zipped code for an application.
      */
    var ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.undefined
  }
  
  trait CreateApplicationRequest extends js.Object {
    /**
      * Use this parameter to configure the application.
      */
    var ApplicationConfiguration: js.UndefOr[ApplicationConfiguration] = js.undefined
    /**
      * A summary description of the application.
      */
    var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
    /**
      * The name of your application (for example, sample-app).
      */
    var ApplicationName: ApplicationName
    /**
      * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
      */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
      * The runtime environment for the application (SQL-1.0 or JAVA-8-FLINK-1.5).
      */
    var RuntimeEnvironment: RuntimeEnvironment
    /**
      * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
      */
    var ServiceExecutionRole: RoleARN
  }
  
  trait CreateApplicationResponse extends js.Object {
    /**
      * In response to your CreateApplication request, Kinesis Data Analytics returns a response with details of the application it created.
      */
    var ApplicationDetail: ApplicationDetail
  }
  
  trait CreateApplicationSnapshotRequest extends js.Object {
    /**
      * The name of an existing application
      */
    var ApplicationName: ApplicationName
    /**
      * An identifier for the application snapshot.
      */
    var SnapshotName: SnapshotName
  }
  
  trait CreateApplicationSnapshotResponse extends js.Object
  
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    /**
      * The application name.
      */
    var ApplicationName: ApplicationName
    /**
      * The CloudWatchLoggingOptionId of the Amazon CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
      */
    var CloudWatchLoggingOptionId: Id
    /**
      * The version ID of the application. You can retrieve the application version ID using DescribeApplication.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
  }
  
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {
    /**
      * The application's Amazon Resource Name (ARN).
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The version ID of the application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    /**
      * The descriptions of the remaining CloudWatch logging options for the application.
      */
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
  }
  
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    /**
      * The name of the application.
      */
    var ApplicationName: ApplicationName
    /**
      * The application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the input configuration from which to delete the input processing configuration. You can get a list of the input IDs for an application by using the DescribeApplication operation.
      */
    var InputId: Id
  }
  
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The current application version ID.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  }
  
  trait DeleteApplicationOutputRequest extends js.Object {
    /**
      * The application name.
      */
    var ApplicationName: ApplicationName
    /**
      * The application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the configuration to delete. Each output configuration that is added to the application (either when the application is created or later) using the AddApplicationOutput operation has a unique ID. You need to provide the ID to uniquely identify the output configuration that you want to delete from the application configuration. You can use the DescribeApplication operation to get the specific OutputId. 
      */
    var OutputId: Id
  }
  
  trait DeleteApplicationOutputResponse extends js.Object {
    /**
      * The application Amazon Resource Name (ARN).
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The current application version ID.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  }
  
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    /**
      * The name of an existing application.
      */
    var ApplicationName: ApplicationName
    /**
      * The current application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the reference data source. When you add a reference data source to your application using the AddApplicationReferenceDataSource, Kinesis Data Analytics assigns an ID. You can use the DescribeApplication operation to get the reference ID. 
      */
    var ReferenceId: Id
  }
  
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object {
    /**
      * The application Amazon Resource Name (ARN).
      */
    var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The updated version ID of the application.
      */
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  }
  
  trait DeleteApplicationRequest extends js.Object {
    /**
      * The name of the application to delete.
      */
    var ApplicationName: ApplicationName
    /**
      * Use the DescribeApplication operation to get this value.
      */
    var CreateTimestamp: Timestamp
  }
  
  trait DeleteApplicationResponse extends js.Object
  
  trait DeleteApplicationSnapshotRequest extends js.Object {
    /**
      * The name of an existing application.
      */
    var ApplicationName: ApplicationName
    /**
      * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
      */
    var SnapshotCreationTimestamp: Timestamp
    /**
      * The identifier for the snapshot delete.
      */
    var SnapshotName: SnapshotName
  }
  
  trait DeleteApplicationSnapshotResponse extends js.Object
  
  trait DescribeApplicationRequest extends js.Object {
    /**
      * The name of the application.
      */
    var ApplicationName: ApplicationName
    /**
      * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
      */
    var IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.undefined
  }
  
  trait DescribeApplicationResponse extends js.Object {
    /**
      * Provides a description of the application, such as the application's Amazon Resource Name (ARN), status, and latest version.
      */
    var ApplicationDetail: ApplicationDetail
  }
  
  trait DescribeApplicationSnapshotRequest extends js.Object {
    /**
      * The name of an existing application.
      */
    var ApplicationName: ApplicationName
    /**
      * The identifier of an application snapshot. You can retrieve this value using .
      */
    var SnapshotName: SnapshotName
  }
  
  trait DescribeApplicationSnapshotResponse extends js.Object {
    /**
      * An object containing information about the application snapshot.
      */
    var SnapshotDetails: SnapshotDetails
  }
  
  trait DestinationSchema extends js.Object {
    /**
      * Specifies the format of the records on the output stream.
      */
    var RecordFormatType: RecordFormatType
  }
  
  trait DiscoverInputSchemaRequest extends js.Object {
    /**
      * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
      */
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined
    /**
      * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
      */
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the streaming source.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * Specify this parameter to discover a schema from data in an Amazon S3 object.
      */
    var S3Configuration: js.UndefOr[S3Configuration] = js.undefined
    /**
      * The ARN of the role that is used to access the streaming source.
      */
    var ServiceExecutionRole: RoleARN
  }
  
  trait DiscoverInputSchemaResponse extends js.Object {
    /**
      * The schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
      */
    var InputSchema: js.UndefOr[SourceSchema] = js.undefined
    /**
      * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
      */
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords] = js.undefined
    /**
      * The stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
      */
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords] = js.undefined
    /**
      * The raw stream data that was sampled to infer the schema.
      */
    var RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined
  }
  
  trait EnvironmentProperties extends js.Object {
    /**
      * Describes the execution property groups.
      */
    var PropertyGroups: PropertyGroups
  }
  
  trait EnvironmentPropertyDescriptions extends js.Object {
    /**
      * Describes the execution property groups.
      */
    var PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined
  }
  
  trait EnvironmentPropertyUpdates extends js.Object {
    /**
      * Describes updates to the execution property groups.
      */
    var PropertyGroups: PropertyGroups
  }
  
  trait FlinkApplicationConfiguration extends js.Object {
    /**
      * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see  Checkpoints for Fault Tolerance in the Apache Flink Documentation. 
      */
    var CheckpointConfiguration: js.UndefOr[CheckpointConfiguration] = js.undefined
    /**
      * Describes configuration parameters for Amazon CloudWatch logging for an application.
      */
    var MonitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined
    /**
      * Describes parameters for how an application executes multiple tasks simultaneously.
      */
    var ParallelismConfiguration: js.UndefOr[ParallelismConfiguration] = js.undefined
  }
  
  trait FlinkApplicationConfigurationDescription extends js.Object {
    /**
      * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
      */
    var CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription] = js.undefined
    /**
      * The job plan for an application. For more information about the job plan, see Jobs and Scheduling in the Apache Flink Documentation. To retrieve the job plan for the application, use the DescribeApplicationRequest$IncludeAdditionalDetails parameter of the DescribeApplication operation.
      */
    var JobPlanDescription: js.UndefOr[JobPlanDescription] = js.undefined
    /**
      * Describes configuration parameters for Amazon CloudWatch logging for an application.
      */
    var MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription] = js.undefined
    /**
      * Describes parameters for how an application executes multiple tasks simultaneously.
      */
    var ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription] = js.undefined
  }
  
  trait FlinkApplicationConfigurationUpdate extends js.Object {
    /**
      * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
      */
    var CheckpointConfigurationUpdate: js.UndefOr[CheckpointConfigurationUpdate] = js.undefined
    /**
      * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
      */
    var MonitoringConfigurationUpdate: js.UndefOr[MonitoringConfigurationUpdate] = js.undefined
    /**
      * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
      */
    var ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate] = js.undefined
  }
  
  trait Input extends js.Object {
    /**
      * Describes the number of in-application streams to create. 
      */
    var InputParallelism: js.UndefOr[InputParallelism] = js.undefined
    /**
      * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor. 
      */
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
      */
    var InputSchema: SourceSchema
    /**
      * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
      */
    var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined
    /**
      * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon Resource Name (ARN). 
      */
    var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
    /**
      * The name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Kinesis Data Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with the names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
      */
    var NamePrefix: InAppStreamName
  }
  
  trait InputDescription extends js.Object {
    /**
      * Returns the in-application stream names that are mapped to the stream source. 
      */
    var InAppStreamNames: js.UndefOr[InAppStreamNames] = js.undefined
    /**
      * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to each input configuration that you add to your application. 
      */
    var InputId: js.UndefOr[Id] = js.undefined
    /**
      * Describes the configured parallelism (number of in-application streams mapped to the streaming source). 
      */
    var InputParallelism: js.UndefOr[InputParallelism] = js.undefined
    /**
      * The description of the preprocessor that executes on records in this input before the application's code is run. 
      */
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
      */
    var InputSchema: js.UndefOr[SourceSchema] = js.undefined
    /**
      * The point at which the application is configured to read from the input stream.
      */
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined
    /**
      * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN. 
      */
    var KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription] = js.undefined
    /**
      * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource Name (ARN). 
      */
    var KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription] = js.undefined
    /**
      * The in-application name prefix.
      */
    var NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
  }
  
  trait InputLambdaProcessor extends js.Object {
    /**
      * The ARN of the AWS Lambda function that operates on records in the stream.
      */
    var ResourceARN: ResourceARN
  }
  
  trait InputLambdaProcessorDescription extends js.Object {
    /**
      * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that is used to access the AWS Lambda function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait InputLambdaProcessorUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait InputParallelism extends js.Object {
    /**
      * The number of in-application streams to create.
      */
    var Count: js.UndefOr[InputParallelismCount] = js.undefined
  }
  
  trait InputParallelismUpdate extends js.Object {
    /**
      * The number of in-application streams to create for the specified streaming source.
      */
    var CountUpdate: InputParallelismCount
  }
  
  trait InputProcessingConfiguration extends js.Object {
    /**
      * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
      */
    var InputLambdaProcessor: InputLambdaProcessor
  }
  
  trait InputProcessingConfigurationDescription extends js.Object {
    /**
      * Provides configuration information about the associated InputLambdaProcessorDescription 
      */
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined
  }
  
  trait InputProcessingConfigurationUpdate extends js.Object {
    /**
      * Provides update information for an InputLambdaProcessor.
      */
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }
  
  trait InputSchemaUpdate extends js.Object {
    /**
      * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream.
      */
    var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined
    /**
      * Specifies the encoding of the records in the streaming source; for example, UTF-8.
      */
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined
    /**
      * Specifies the format of the records on the streaming source.
      */
    var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
  }
  
  trait InputStartingPositionConfiguration extends js.Object {
    /**
      * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, and start at the request timestamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Data Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
      */
    var InputStartingPosition: js.UndefOr[InputStartingPosition] = js.undefined
  }
  
  trait InputUpdate extends js.Object {
    /**
      * The input ID of the application input to be updated.
      */
    var InputId: Id
    /**
      * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the specific streaming source).
      */
    var InputParallelismUpdate: js.UndefOr[InputParallelismUpdate] = js.undefined
    /**
      * Describes updates to an InputProcessingConfiguration.
      */
    var InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate] = js.undefined
    /**
      * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
      */
    var InputSchemaUpdate: js.UndefOr[InputSchemaUpdate] = js.undefined
    /**
      * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
      */
    var KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate] = js.undefined
    /**
      * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN).
      */
    var KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate] = js.undefined
    /**
      * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
      */
    var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
  }
  
  trait JSONMappingParameters extends js.Object {
    /**
      * The path to the top-level parent that contains the records.
      */
    var RecordRowPath: RecordRowPath
  }
  
  trait KinesisFirehoseInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the delivery stream.
      */
    var ResourceARN: ResourceARN
  }
  
  trait KinesisFirehoseInputDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the delivery stream.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that Kinesis Data Analytics assumes to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisFirehoseInputUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the input delivery stream to read.
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait KinesisFirehoseOutput extends js.Object {
    /**
      * The ARN of the destination delivery stream to write to.
      */
    var ResourceARN: ResourceARN
  }
  
  trait KinesisFirehoseOutputDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the delivery stream.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisFirehoseOutputUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the delivery stream to write to. 
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait KinesisStreamsInput extends js.Object {
    /**
      * The ARN of the input Kinesis data stream to read.
      */
    var ResourceARN: ResourceARN
  }
  
  trait KinesisStreamsInputDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Kinesis data stream.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsInputUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the input Kinesis data stream to read.
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait KinesisStreamsOutput extends js.Object {
    /**
      * The ARN of the destination Kinesis data stream to write to.
      */
    var ResourceARN: ResourceARN
  }
  
  trait KinesisStreamsOutputDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Kinesis data stream.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsOutputUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait LambdaOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the destination Lambda function to write to.
      */
    var ResourceARN: ResourceARN
  }
  
  trait LambdaOutputDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the destination Lambda function.
      */
    var ResourceARN: ResourceARN
    /**
      * The ARN of the IAM role that Kinesis Data Analytics can assume to write to the destination function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait LambdaOutputUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the destination AWS Lambda function.
      */
    var ResourceARNUpdate: ResourceARN
  }
  
  trait ListApplicationSnapshotsRequest extends js.Object {
    /**
      * The name of an existing application.
      */
    var ApplicationName: ApplicationName
    /**
      * The maximum number of application snapshots to list.
      */
    var Limit: js.UndefOr[ListSnapshotsInputLimit] = js.undefined
    /**
      * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListApplicationSnapshotsResponse extends js.Object {
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A collection of objects containing information about the application snapshots.
      */
    var SnapshotSummaries: js.UndefOr[SnapshotSummaries] = js.undefined
  }
  
  trait ListApplicationsRequest extends js.Object {
    /**
      * The maximum number of applications to list.
      */
    var Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
    /**
      * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results. For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
      */
    var NextToken: js.UndefOr[ApplicationName] = js.undefined
  }
  
  trait ListApplicationsResponse extends js.Object {
    /**
      * A list of ApplicationSummary objects.
      */
    var ApplicationSummaries: ApplicationSummaries
    /**
      * The pagination token for the next set of results, or null if there are no additional results. Pass this token into a subsequent command to retrieve the next set of items For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
      */
    var NextToken: js.UndefOr[ApplicationName] = js.undefined
  }
  
  trait MappingParameters extends js.Object {
    /**
      * Provides additional mapping information when the record format uses delimiters (for example, CSV).
      */
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters] = js.undefined
    /**
      * Provides additional mapping information when JSON is the record format on the streaming source.
      */
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters] = js.undefined
  }
  
  trait MonitoringConfiguration extends js.Object {
    /**
      * Describes whether to use the default CloudWatch logging configuration for an application.
      */
    var ConfigurationType: ConfigurationType
    /**
      * Describes the verbosity of the CloudWatch Logs for an application.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * Describes the granularity of the CloudWatch Logs for an application.
      */
    var MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined
  }
  
  trait MonitoringConfigurationDescription extends js.Object {
    /**
      * Describes whether to use the default CloudWatch logging configuration for an application.
      */
    var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes the verbosity of the CloudWatch Logs for an application.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * Describes the granularity of the CloudWatch Logs for an application.
      */
    var MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined
  }
  
  trait MonitoringConfigurationUpdate extends js.Object {
    /**
      * Describes updates to whether to use the default CloudWatch logging configuration for an application.
      */
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes updates to the verbosity of the CloudWatch Logs for an application.
      */
    var LogLevelUpdate: js.UndefOr[LogLevel] = js.undefined
    /**
      * Describes updates to the granularity of the CloudWatch Logs for an application.
      */
    var MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.undefined
  }
  
  trait Output extends js.Object {
    /**
      * Describes the data format when records are written to the destination. 
      */
    var DestinationSchema: DestinationSchema
    /**
      * Identifies an Amazon Kinesis Data Firehose delivery stream as the destination.
      */
    var KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput] = js.undefined
    /**
      * Identifies an Amazon Kinesis data stream as the destination.
      */
    var KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput] = js.undefined
    /**
      * Identifies an AWS Lambda function as the destination.
      */
    var LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined
    /**
      * The name of the in-application stream.
      */
    var Name: InAppStreamName
  }
  
  trait OutputDescription extends js.Object {
    /**
      * The data format used for writing data to the destination.
      */
    var DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined
    /**
      * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is written.
      */
    var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined
    /**
      * Describes the Kinesis data stream that is configured as the destination where output is written.
      */
    var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined
    /**
      * Describes the Lambda function that is configured as the destination where output is written.
      */
    var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined
    /**
      * The name of the in-application stream that is configured as output.
      */
    var Name: js.UndefOr[InAppStreamName] = js.undefined
    /**
      * A unique identifier for the output configuration.
      */
    var OutputId: js.UndefOr[Id] = js.undefined
  }
  
  trait OutputUpdate extends js.Object {
    /**
      * Describes the data format when records are written to the destination. 
      */
    var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined
    /**
      * Describes a Kinesis Data Firehose delivery stream as the destination for the output.
      */
    var KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate] = js.undefined
    /**
      * Describes a Kinesis data stream as the destination for the output.
      */
    var KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate] = js.undefined
    /**
      * Describes an AWS Lambda function as the destination for the output.
      */
    var LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate] = js.undefined
    /**
      * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
      */
    var NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
    /**
      * Identifies the specific output configuration that you want to update.
      */
    var OutputId: Id
  }
  
  trait ParallelismConfiguration extends js.Object {
    /**
      * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
      */
    var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
      */
    var ConfigurationType: ConfigurationType
    /**
      * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. The Kinesis Data Analytics service can increase this number automatically if ParallelismConfiguration$AutoScalingEnabled is set to true.
      */
    var Parallelism: js.UndefOr[Parallelism] = js.undefined
    /**
      * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see Amazon Kinesis Data Analytics Pricing.
      */
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
  }
  
  trait ParallelismConfigurationDescription extends js.Object {
    /**
      * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
      */
    var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. 
      */
    var ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
      */
    var CurrentParallelism: js.UndefOr[Parallelism] = js.undefined
    /**
      * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. 
      */
    var Parallelism: js.UndefOr[Parallelism] = js.undefined
    /**
      * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
      */
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
  }
  
  trait ParallelismConfigurationUpdate extends js.Object {
    /**
      * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
      */
    var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service, or if a custom parallelism is used.
      */
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
    /**
      * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU) used by the application.
      */
    var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.undefined
    /**
      * Describes updates to the initial number of parallel tasks an application can perform.
      */
    var ParallelismUpdate: js.UndefOr[Parallelism] = js.undefined
  }
  
  trait PropertyGroup extends js.Object {
    /**
      * Describes the key of an application execution property key-value pair.
      */
    var PropertyGroupId: Id
    /**
      * Describes the value of an application execution property key-value pair.
      */
    var PropertyMap: PropertyMap
  }
  
  trait PropertyMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PropertyValue]
  
  trait RecordColumn extends js.Object {
    /**
      * A reference to the data element in the streaming input of the reference data source.
      */
    var Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
    /**
      * The name of the column that is created in the in-application input stream or reference table.
      */
    var Name: RecordColumnName
    /**
      * The type of column created in the in-application input stream or reference table.
      */
    var SqlType: RecordColumnSqlType
  }
  
  trait RecordFormat extends js.Object {
    /**
      * When you configure application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
      */
    var MappingParameters: js.UndefOr[MappingParameters] = js.undefined
    /**
      * The type of record format.
      */
    var RecordFormatType: RecordFormatType
  }
  
  trait ReferenceDataSource extends js.Object {
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
      */
    var ReferenceSchema: SourceSchema
    /**
      * Identifies the S3 bucket and object that contains the reference data. A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
      */
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined
    /**
      * The name of the in-application table to create.
      */
    var TableName: InAppTableName
  }
  
  trait ReferenceDataSourceDescription extends js.Object {
    /**
      * The ID of the reference data source. This is the ID that Kinesis Data Analytics assigns when you add the reference data source to your application using the CreateApplication or UpdateApplication operation.
      */
    var ReferenceId: Id
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
      */
    var ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
    /**
      * Provides the Amazon S3 bucket name, the object key name that contains the reference data. 
      */
    var S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription
    /**
      * The in-application table name created by the specific reference data source configuration.
      */
    var TableName: InAppTableName
  }
  
  trait ReferenceDataSourceUpdate extends js.Object {
    /**
      * The ID of the reference data source that is being updated. You can use the DescribeApplication operation to get this value.
      */
    var ReferenceId: Id
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
      */
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined
    /**
      * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
      */
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate] = js.undefined
    /**
      * The in-application table name that is created by this update.
      */
    var TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined
  }
  
  trait RunConfiguration extends js.Object {
    /**
      * Describes the restore behavior of a restarting application.
      */
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
    /**
      * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
      */
    var SqlRunConfigurations: js.UndefOr[SqlRunConfigurations] = js.undefined
  }
  
  trait RunConfigurationDescription extends js.Object {
    /**
      * Describes the restore behavior of a restarting application.
      */
    var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
  }
  
  trait RunConfigurationUpdate extends js.Object {
    /**
      * Describes updates to the restore behavior of a restarting application.
      */
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
  }
  
  trait S3ApplicationCodeLocationDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
      */
    var BucketARN: BucketARN
    /**
      * The file key for the object containing the application code.
      */
    var FileKey: FileKey
    /**
      * The version of the object containing the application code.
      */
    var ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined
  }
  
  trait S3Configuration extends js.Object {
    /**
      * The ARN of the S3 bucket that contains the data.
      */
    var BucketARN: BucketARN
    /**
      * The name of the object that contains the data.
      */
    var FileKey: FileKey
  }
  
  trait S3ContentLocation extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
      */
    var BucketARN: BucketARN
    /**
      * The file key for the object containing the application code.
      */
    var FileKey: FileKey
    /**
      * The version of the object containing the application code.
      */
    var ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined
  }
  
  trait S3ContentLocationUpdate extends js.Object {
    /**
      * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
      */
    var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
    /**
      * The new file key for the object containing the application code.
      */
    var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
    /**
      * The new version of the object containing the application code.
      */
    var ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.undefined
  }
  
  trait S3ReferenceDataSource extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARN: js.UndefOr[BucketARN] = js.undefined
    /**
      * The object key name containing the reference data.
      */
    var FileKey: js.UndefOr[FileKey] = js.undefined
  }
  
  trait S3ReferenceDataSourceDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARN: BucketARN
    /**
      * Amazon S3 object key name.
      */
    var FileKey: FileKey
    /**
      * The ARN of the IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.   Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
      */
    var ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait S3ReferenceDataSourceUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
    /**
      * The object key name.
      */
    var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
  }
  
  trait SnapshotDetails extends js.Object {
    /**
      * The current application version ID when the snapshot was created.
      */
    var ApplicationVersionId: ApplicationVersionId
    /**
      * The timestamp of the application snapshot.
      */
    var SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The identifier for the application snapshot.
      */
    var SnapshotName: SnapshotName
    /**
      * The status of the application snapshot.
      */
    var SnapshotStatus: SnapshotStatus
  }
  
  trait SourceSchema extends js.Object {
    /**
      * A list of RecordColumn objects. 
      */
    var RecordColumns: RecordColumns
    /**
      * Specifies the encoding of the records in the streaming source. For example, UTF-8.
      */
    var RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined
    /**
      * Specifies the format of the records on the streaming source.
      */
    var RecordFormat: RecordFormat
  }
  
  trait SqlApplicationConfiguration extends js.Object {
    /**
      * The array of Input objects describing the input streams used by the application.
      */
    var Inputs: js.UndefOr[Inputs] = js.undefined
    /**
      * The array of Output objects describing the destination streams used by the application.
      */
    var Outputs: js.UndefOr[Outputs] = js.undefined
    /**
      * The array of ReferenceDataSource objects describing the reference data sources used by the application.
      */
    var ReferenceDataSources: js.UndefOr[ReferenceDataSources] = js.undefined
  }
  
  trait SqlApplicationConfigurationDescription extends js.Object {
    /**
      * The array of InputDescription objects describing the input streams used by the application.
      */
    var InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
    /**
      * The array of OutputDescription objects describing the destination streams used by the application.
      */
    var OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
    /**
      * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
      */
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
  }
  
  trait SqlApplicationConfigurationUpdate extends js.Object {
    /**
      * The array of InputUpdate objects describing the new input streams used by the application.
      */
    var InputUpdates: js.UndefOr[InputUpdates] = js.undefined
    /**
      * The array of OutputUpdate objects describing the new destination streams used by the application.
      */
    var OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined
    /**
      * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
      */
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined
  }
  
  trait SqlRunConfiguration extends js.Object {
    /**
      * The input source ID. You can get this ID by calling the DescribeApplication operation. 
      */
    var InputId: Id
    /**
      * The point at which you want the application to start processing records from the streaming source. 
      */
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }
  
  trait StartApplicationRequest extends js.Object {
    /**
      * The name of the application.
      */
    var ApplicationName: ApplicationName
    /**
      * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
      */
    var RunConfiguration: RunConfiguration
  }
  
  trait StartApplicationResponse extends js.Object
  
  trait StopApplicationRequest extends js.Object {
    /**
      * The name of the running application to stop.
      */
    var ApplicationName: ApplicationName
  }
  
  trait StopApplicationResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
      */
    def addApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[AddApplicationCloudWatchLoggingOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationCloudWatchLoggingOption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationCloudWatchLoggingOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationCloudWatchLoggingOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
      */
    def addApplicationCloudWatchLoggingOption(params: AddApplicationCloudWatchLoggingOptionRequest): awsDashSdkLib.libRequestMod.Request[AddApplicationCloudWatchLoggingOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationCloudWatchLoggingOption(
      params: AddApplicationCloudWatchLoggingOptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationCloudWatchLoggingOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationCloudWatchLoggingOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
      */
    def addApplicationInput(): awsDashSdkLib.libRequestMod.Request[AddApplicationInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationInput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
      */
    def addApplicationInput(params: AddApplicationInputRequest): awsDashSdkLib.libRequestMod.Request[AddApplicationInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationInput(
      params: AddApplicationInputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
      */
    def addApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
        AddApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def addApplicationInputProcessingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationInputProcessingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AddApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
      */
    def addApplicationInputProcessingConfiguration(params: AddApplicationInputProcessingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
        AddApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def addApplicationInputProcessingConfiguration(
      params: AddApplicationInputProcessingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationInputProcessingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AddApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
      */
    def addApplicationOutput(): awsDashSdkLib.libRequestMod.Request[AddApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationOutput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationOutputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
      */
    def addApplicationOutput(params: AddApplicationOutputRequest): awsDashSdkLib.libRequestMod.Request[AddApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationOutput(
      params: AddApplicationOutputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationOutputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
      */
    def addApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[AddApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationReferenceDataSource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationReferenceDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
      */
    def addApplicationReferenceDataSource(params: AddApplicationReferenceDataSourceRequest): awsDashSdkLib.libRequestMod.Request[AddApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addApplicationReferenceDataSource(
      params: AddApplicationReferenceDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddApplicationReferenceDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.   SQL is not enabled for this private beta release. Using SQL parameters (such as SqlApplicationConfiguration) will result in an error. 
      */
    def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.   SQL is not enabled for this private beta release. Using SQL parameters (such as SqlApplicationConfiguration) will result in an error. 
      */
    def createApplication(params: CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      params: CreateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of the application's state data.
      */
    def createApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplicationSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of the application's state data.
      */
    def createApplicationSnapshot(params: CreateApplicationSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplicationSnapshot(
      params: CreateApplicationSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
      */
    def deleteApplication(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
      */
    def deleteApplication(params: DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      params: DeleteApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application. 
      */
    def deleteApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationCloudWatchLoggingOptionResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def deleteApplicationCloudWatchLoggingOption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationCloudWatchLoggingOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationCloudWatchLoggingOptionResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application. 
      */
    def deleteApplicationCloudWatchLoggingOption(params: DeleteApplicationCloudWatchLoggingOptionRequest): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationCloudWatchLoggingOptionResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def deleteApplicationCloudWatchLoggingOption(
      params: DeleteApplicationCloudWatchLoggingOptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationCloudWatchLoggingOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationCloudWatchLoggingOptionResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deletes an InputProcessingConfiguration from an input.
      */
    def deleteApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def deleteApplicationInputProcessingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationInputProcessingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deletes an InputProcessingConfiguration from an input.
      */
    def deleteApplicationInputProcessingConfiguration(params: DeleteApplicationInputProcessingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def deleteApplicationInputProcessingConfiguration(
      params: DeleteApplicationInputProcessingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationInputProcessingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DeleteApplicationInputProcessingConfigurationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
      */
    def deleteApplicationOutput(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationOutput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationOutputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
      */
    def deleteApplicationOutput(params: DeleteApplicationOutputRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationOutput(
      params: DeleteApplicationOutputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationOutputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
      */
    def deleteApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationReferenceDataSource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationReferenceDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
      */
    def deleteApplicationReferenceDataSource(params: DeleteApplicationReferenceDataSourceRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationReferenceDataSource(
      params: DeleteApplicationReferenceDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationReferenceDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationReferenceDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot of application state.
      */
    def deleteApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot of application state.
      */
    def deleteApplicationSnapshot(params: DeleteApplicationSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationSnapshot(
      params: DeleteApplicationSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific Amazon Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
      */
    def describeApplication(): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific Amazon Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
      */
    def describeApplication(params: DescribeApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplication(
      params: DescribeApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a snapshot of application state data.
      */
    def describeApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[DescribeApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplicationSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a snapshot of application state data.
      */
    def describeApplicationSnapshot(params: DescribeApplicationSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DescribeApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplicationSnapshot(
      params: DescribeApplicationSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeApplicationSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
      */
    def discoverInputSchema(): awsDashSdkLib.libRequestMod.Request[DiscoverInputSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def discoverInputSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DiscoverInputSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DiscoverInputSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
      */
    def discoverInputSchema(params: DiscoverInputSchemaRequest): awsDashSdkLib.libRequestMod.Request[DiscoverInputSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def discoverInputSchema(
      params: DiscoverInputSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DiscoverInputSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DiscoverInputSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the current application snapshots.
      */
    def listApplicationSnapshots(): awsDashSdkLib.libRequestMod.Request[ListApplicationSnapshotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplicationSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationSnapshotsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationSnapshotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the current application snapshots.
      */
    def listApplicationSnapshots(params: ListApplicationSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationSnapshotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplicationSnapshots(
      params: ListApplicationSnapshotsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationSnapshotsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationSnapshotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
      */
    def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
      */
    def listApplications(params: ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplications(
      params: ListApplicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.  SQL is not enabled for this private beta. Using SQL parameters (such as RunConfiguration$SqlRunConfigurations) will result in an error. 
      */
    def startApplication(): awsDashSdkLib.libRequestMod.Request[StartApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.  SQL is not enabled for this private beta. Using SQL parameters (such as RunConfiguration$SqlRunConfigurations) will result in an error. 
      */
    def startApplication(params: StartApplicationRequest): awsDashSdkLib.libRequestMod.Request[StartApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startApplication(
      params: StartApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the application from processing data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. 
      */
    def stopApplication(): awsDashSdkLib.libRequestMod.Request[StopApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the application from processing data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. 
      */
    def stopApplication(params: StopApplicationRequest): awsDashSdkLib.libRequestMod.Request[StopApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopApplication(
      params: StopApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   SQL is not enabled for this private beta. Using SQL parameters (such as SqlApplicationConfigurationUpdate) will result in an error. 
      */
    def updateApplication(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   SQL is not enabled for this private beta. Using SQL parameters (such as SqlApplicationConfigurationUpdate) will result in an error. 
      */
    def updateApplication(params: UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      params: UpdateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateApplicationRequest extends js.Object {
    /**
      * Describes application configuration updates.
      */
    var ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate] = js.undefined
    /**
      * The name of the application to update.
      */
    var ApplicationName: ApplicationName
    /**
      * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
      */
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined
    /**
      * The current application version ID. You can retrieve the application version ID using DescribeApplication.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * Describes updates to the application's starting parameters.
      */
    var RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate] = js.undefined
    /**
      * Describes updates to the service execution role.
      */
    var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait UpdateApplicationResponse extends js.Object {
    /**
      * Describes application updates.
      */
    var ApplicationDetail: ApplicationDetail
  }
  
  val TypesNs: this.type = js.native
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  type ApplicationRestoreType = awsDashSdkLib.awsDashSdkLibStrings.SKIP_RESTORE_FROM_SNAPSHOT | awsDashSdkLib.awsDashSdkLibStrings.RESTORE_FROM_LATEST_SNAPSHOT | awsDashSdkLib.awsDashSdkLibStrings.RESTORE_FROM_CUSTOM_SNAPSHOT | java.lang.String
  type ApplicationStatus = awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type CheckpointInterval = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type CodeContentType = awsDashSdkLib.awsDashSdkLibStrings.PLAINTEXT | awsDashSdkLib.awsDashSdkLibStrings.ZIPFILE | java.lang.String
  type CodeMD5 = java.lang.String
  type CodeSize = scala.Double
  type ConfigurationType = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.CUSTOM | java.lang.String
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = java.lang.String
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = scala.Double
  type InputStartingPosition = awsDashSdkLib.awsDashSdkLibStrings.NOW | awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON | awsDashSdkLib.awsDashSdkLibStrings.LAST_STOPPED_POINT | java.lang.String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type JobPlanDescription = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type ListSnapshotsInputLimit = scala.Double
  type LogLevel = awsDashSdkLib.awsDashSdkLibStrings.INFO | awsDashSdkLib.awsDashSdkLibStrings.WARN | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.DEBUG | java.lang.String
  type LogStreamARN = java.lang.String
  type MetricsLevel = awsDashSdkLib.awsDashSdkLibStrings.APPLICATION | awsDashSdkLib.awsDashSdkLibStrings.TASK | awsDashSdkLib.awsDashSdkLibStrings.OPERATOR | awsDashSdkLib.awsDashSdkLibStrings.PARALLELISM | java.lang.String
  type MinPauseBetweenCheckpoints = scala.Double
  type NextToken = java.lang.String
  type ObjectVersion = java.lang.String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type Parallelism = scala.Double
  type ParallelismPerKPU = scala.Double
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type PropertyGroups = js.Array[PropertyGroup]
  type PropertyKey = java.lang.String
  type PropertyValue = java.lang.String
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[RecordColumn]
  type RecordEncoding = java.lang.String
  type RecordFormatType = awsDashSdkLib.awsDashSdkLibStrings.JSON | awsDashSdkLib.awsDashSdkLibStrings.CSV | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ReferenceDataSources = js.Array[ReferenceDataSource]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type RuntimeEnvironment = awsDashSdkLib.awsDashSdkLibStrings.`SQL-1_0` | awsDashSdkLib.awsDashSdkLibStrings.`FLINK-1_6` | java.lang.String
  type SnapshotName = java.lang.String
  type SnapshotStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type SnapshotSummaries = js.Array[SnapshotDetails]
  type SqlRunConfigurations = js.Array[SqlRunConfiguration]
  type TextContent = java.lang.String
  type Timestamp = stdLib.Date
  type ZipFileContent = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKinesisanalyticsv2Mod.Blob | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-05-23` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

