package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesisanalytics", "KinesisAnalytics")
@js.native
object KinesisAnalyticsNs extends js.Object {
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    /**
      * The Kinesis Analytics application name.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Provides the CloudWatch log stream Amazon Resource Name (ARN) and the IAM role ARN. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
      */
    var CloudWatchLoggingOption: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CloudWatchLoggingOption
    /**
      * The version ID of the Kinesis Analytics application.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
  }
  
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object
  
  trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
    /**
      * Name of the application to which you want to add the input processing configuration.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the input configuration to add the input processing configuration to. You can get a list of the input IDs for an application using the DescribeApplication operation.
      */
    var InputId: Id
    /**
      * The InputProcessingConfiguration to add to the application.
      */
    var InputProcessingConfiguration: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.InputProcessingConfiguration
  }
  
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object
  
  trait AddApplicationInputRequest extends js.Object {
    /**
      * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Current version of your Amazon Kinesis Analytics application. You can use the DescribeApplication operation to find the current application version.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The Input to add.
      */
    var Input: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.Input
  }
  
  trait AddApplicationInputResponse extends js.Object
  
  trait AddApplicationOutputRequest extends js.Object {
    /**
      * Name of the application to which you want to add the output configuration.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Version of the application to which you want to add the output configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * An array of objects, each describing one output configuration. In the output configuration, you specify the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
      */
    var Output: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.Output
  }
  
  trait AddApplicationOutputResponse extends js.Object
  
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    /**
      * Name of an existing application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Version of the application for which you are adding the reference data source. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and the resulting in-application table that is created. You must also provide an IAM role with the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
      */
    var ReferenceDataSource: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ReferenceDataSource
  }
  
  trait AddApplicationReferenceDataSourceResponse extends js.Object
  
  trait ApplicationDetail extends js.Object {
    /**
      * ARN of the application.
      */
    var ApplicationARN: ResourceARN
    /**
      * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
      */
    var ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined
    /**
      * Description of the application.
      */
    var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
    /**
      * Name of the application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Status of the application.
      */
    var ApplicationStatus: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationStatus
    /**
      * Provides the current application version.
      */
    var ApplicationVersionId: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationVersionId
    /**
      * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
      */
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
    /**
      * Time stamp when the application version was created.
      */
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Describes the application input configuration. For more information, see Configuring Application Input. 
      */
    var InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
    /**
      * Time stamp when the application was last updated.
      */
    var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Describes the application output configuration. For more information, see Configuring Application Output. 
      */
    var OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
    /**
      * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
      */
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
  }
  
  trait ApplicationSummary extends js.Object {
    /**
      * ARN of the application.
      */
    var ApplicationARN: ResourceARN
    /**
      * Name of the application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Status of the application.
      */
    var ApplicationStatus: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationStatus
  }
  
  trait ApplicationUpdate extends js.Object {
    /**
      * Describes application code updates.
      */
    var ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.undefined
    /**
      * Describes application CloudWatch logging option updates.
      */
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined
    /**
      * Describes application input configuration updates.
      */
    var InputUpdates: js.UndefOr[InputUpdates] = js.undefined
    /**
      * Describes application output configuration updates.
      */
    var OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined
    /**
      * Describes application reference data source updates.
      */
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined
  }
  
  trait CSVMappingParameters extends js.Object {
    /**
      * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
      */
    var RecordColumnDelimiter: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordColumnDelimiter
    /**
      * Row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
      */
    var RecordRowDelimiter: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordRowDelimiter
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchLoggingOption extends js.Object {
    /**
      * ARN of the CloudWatch log to receive application messages.
      */
    var LogStreamARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.LogStreamARN
    /**
      * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait CloudWatchLoggingOptionDescription extends js.Object {
    /**
      * ID of the CloudWatch logging option description.
      */
    var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
    /**
      * ARN of the CloudWatch log to receive application messages.
      */
    var LogStreamARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.LogStreamARN
    /**
      * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    /**
      * ID of the CloudWatch logging option to update
      */
    var CloudWatchLoggingOptionId: Id
    /**
      * ARN of the CloudWatch log to receive application messages.
      */
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
    /**
      * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait CreateApplicationRequest extends js.Object {
    /**
      * One or more SQL statements that read input data, transform it, and generate output. For example, you can write a SQL statement that reads data from one in-application stream, generates a running average of the number of advertisement clicks by vendor, and insert resulting rows in another in-application stream using pumps. For more information about the typical pattern, see Application Code.  You can provide such series of SQL statements, where output of one statement can be used as the input for the next statement. You store intermediate results by creating in-application streams and pumps. Note that the application code must create the streams with names specified in the Outputs. For example, if your Outputs defines output streams named ExampleOutputStream1 and ExampleOutputStream2, then your application code must create these streams. 
      */
    var ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined
    /**
      * Summary description of the application.
      */
    var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
    /**
      * Name of your Amazon Kinesis Analytics application (for example, sample-app).
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Use this parameter to configure a CloudWatch log stream to monitor application configuration errors. For more information, see Working with Amazon CloudWatch Logs.
      */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
      * Use this parameter to configure the application input. You can configure your application to receive input from a single streaming source. In this configuration, you map this streaming source to an in-application stream that is created. Your application code can then query the in-application stream like a table (you can think of it as a constantly updating table). For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis Analytics can assume to read this stream on your behalf. To create the in-application stream, you need to specify a schema to transform your data into a schematized version used in SQL. In the schema, you provide the necessary mapping of the data elements in the streaming source to record columns in the in-app stream.
      */
    var Inputs: js.UndefOr[Inputs] = js.undefined
    /**
      * You can configure application output to write data from any of the in-application streams to up to three destinations. These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose delivery streams, AWS Lambda destinations, or any combination of the three. In the configuration, you specify the in-application stream name, the destination stream or Lambda function Amazon Resource Name (ARN), and the format to use when writing data. You must also provide an IAM role that Amazon Kinesis Analytics can assume to write to the destination stream or Lambda function on your behalf. In the output configuration, you also provide the output stream or Lambda function ARN. For stream destinations, you provide the format of data in the stream (for example, JSON, CSV). You also must provide an IAM role that Amazon Kinesis Analytics can assume to write to the stream or Lambda function on your behalf.
      */
    var Outputs: js.UndefOr[Outputs] = js.undefined
  }
  
  trait CreateApplicationResponse extends js.Object {
    /**
      * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
      */
    var ApplicationSummary: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationSummary
  }
  
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    /**
      * The Kinesis Analytics application name.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * The CloudWatchLoggingOptionId of the CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
      */
    var CloudWatchLoggingOptionId: Id
    /**
      * The version ID of the Kinesis Analytics application.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
  }
  
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object
  
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    /**
      * The Kinesis Analytics application name.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * The version ID of the Kinesis Analytics application.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the input configuration from which to delete the input processing configuration. You can get a list of the input IDs for an application by using the DescribeApplication operation.
      */
    var InputId: Id
  }
  
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object
  
  trait DeleteApplicationOutputRequest extends js.Object {
    /**
      * Amazon Kinesis Analytics application name.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Amazon Kinesis Analytics application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * The ID of the configuration to delete. Each output configuration that is added to the application, either when the application is created or later using the AddApplicationOutput operation, has a unique ID. You need to provide the ID to uniquely identify the output configuration that you want to delete from the application configuration. You can use the DescribeApplication operation to get the specific OutputId. 
      */
    var OutputId: Id
  }
  
  trait DeleteApplicationOutputResponse extends js.Object
  
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    /**
      * Name of an existing application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Version of the application. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
    /**
      * ID of the reference data source. When you add a reference data source to your application using the AddApplicationReferenceDataSource, Amazon Kinesis Analytics assigns an ID. You can use the DescribeApplication operation to get the reference ID. 
      */
    var ReferenceId: Id
  }
  
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object
  
  trait DeleteApplicationRequest extends js.Object {
    /**
      * Name of the Amazon Kinesis Analytics application to delete.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      *  You can use the DescribeApplication operation to get this value. 
      */
    var CreateTimestamp: Timestamp
  }
  
  trait DeleteApplicationResponse extends js.Object
  
  trait DescribeApplicationRequest extends js.Object {
    /**
      * Name of the application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
  }
  
  trait DescribeApplicationResponse extends js.Object {
    /**
      * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest version, and input and output configuration details.
      */
    var ApplicationDetail: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationDetail
  }
  
  trait DestinationSchema extends js.Object {
    /**
      * Specifies the format of the records on the output stream.
      */
    var RecordFormatType: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordFormatType
  }
  
  trait DiscoverInputSchemaRequest extends js.Object {
    /**
      * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
      */
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined
    /**
      * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source discovery purposes.
      */
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined
    /**
      * Amazon Resource Name (ARN) of the streaming source.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * Specify this parameter to discover a schema from data in an Amazon S3 object.
      */
    var S3Configuration: js.UndefOr[S3Configuration] = js.undefined
  }
  
  trait DiscoverInputSchemaResponse extends js.Object {
    /**
      * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
      */
    var InputSchema: js.UndefOr[SourceSchema] = js.undefined
    /**
      * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
      */
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords] = js.undefined
    /**
      * Stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
      */
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords] = js.undefined
    /**
      * Raw stream data that was sampled to infer the schema.
      */
    var RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined
  }
  
  trait Input extends js.Object {
    /**
      * Describes the number of in-application streams to create.  Data from your source is routed to these in-application input streams.  (see Configuring Application Input.
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
      * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
      */
    var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined
    /**
      * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
      */
    var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
    /**
      * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
      */
    var NamePrefix: InAppStreamName
  }
  
  trait InputConfiguration extends js.Object {
    /**
      * Input source ID. You can get this ID by calling the DescribeApplication operation.
      */
    var Id: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.Id
    /**
      * Point at which you want the application to start processing records from the streaming source.
      */
    var InputStartingPositionConfiguration: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.InputStartingPositionConfiguration
  }
  
  trait InputDescription extends js.Object {
    /**
      * Returns the in-application stream names that are mapped to the stream source.
      */
    var InAppStreamNames: js.UndefOr[InAppStreamNames] = js.undefined
    /**
      * Input ID associated with the application input. This is the ID that Amazon Kinesis Analytics assigns to each input configuration you add to your application. 
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
      * Point at which the application is configured to read from the input stream.
      */
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined
    /**
      * If an Amazon Kinesis Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
      */
    var KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription] = js.undefined
    /**
      * If an Amazon Kinesis stream is configured as streaming source, provides Amazon Kinesis stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
      */
    var KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription] = js.undefined
    /**
      * In-application name prefix.
      */
    var NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
  }
  
  trait InputLambdaProcessor extends js.Object {
    /**
      * The ARN of the AWS Lambda function that operates on records in the stream.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * The ARN of the IAM role that is used to access the AWS Lambda function.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait InputLambdaProcessorDescription extends js.Object {
    /**
      * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The ARN of the IAM role that is used to access the AWS Lambda function.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait InputLambdaProcessorUpdate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The ARN of the new IAM role that is used to access the AWS Lambda function.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait InputParallelism extends js.Object {
    /**
      * Number of in-application streams to create. For more information, see Limits. 
      */
    var Count: js.UndefOr[InputParallelismCount] = js.undefined
  }
  
  trait InputParallelismUpdate extends js.Object {
    /**
      * Number of in-application streams to create for the specified streaming source.
      */
    var CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined
  }
  
  trait InputProcessingConfiguration extends js.Object {
    /**
      * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
      */
    var InputLambdaProcessor: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.InputLambdaProcessor
  }
  
  trait InputProcessingConfigurationDescription extends js.Object {
    /**
      * Provides configuration information about the associated InputLambdaProcessorDescription.
      */
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined
  }
  
  trait InputProcessingConfigurationUpdate extends js.Object {
    /**
      * Provides update information for an InputLambdaProcessor.
      */
    var InputLambdaProcessorUpdate: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.InputLambdaProcessorUpdate
  }
  
  trait InputSchemaUpdate extends js.Object {
    /**
      * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream. 
      */
    var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined
    /**
      * Specifies the encoding of the records in the streaming source. For example, UTF-8.
      */
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined
    /**
      * Specifies the format of the records on the streaming source.
      */
    var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
  }
  
  trait InputStartingPositionConfiguration extends js.Object {
    /**
      * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, start at the request time stamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
      */
    var InputStartingPosition: js.UndefOr[InputStartingPosition] = js.undefined
  }
  
  trait InputUpdate extends js.Object {
    /**
      * Input ID of the application input to be updated.
      */
    var InputId: Id
    /**
      * Describes the parallelism updates (the number in-application streams Amazon Kinesis Analytics creates for the specific streaming source).
      */
    var InputParallelismUpdate: js.UndefOr[InputParallelismUpdate] = js.undefined
    /**
      * Describes updates for an input processing configuration.
      */
    var InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate] = js.undefined
    /**
      * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
      */
    var InputSchemaUpdate: js.UndefOr[InputSchemaUpdate] = js.undefined
    /**
      * If an Amazon Kinesis Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN and IAM role ARN.
      */
    var KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate] = js.undefined
    /**
      * If an Amazon Kinesis stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN) and IAM role ARN.
      */
    var KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate] = js.undefined
    /**
      * Name prefix for in-application streams that Amazon Kinesis Analytics creates for the specific streaming source.
      */
    var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
  }
  
  trait JSONMappingParameters extends js.Object {
    /**
      * Path to the top-level parent that contains the records.
      */
    var RecordRowPath: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordRowPath
  }
  
  trait KinesisFirehoseInput extends js.Object {
    /**
      * ARN of the input delivery stream.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to make sure that the role has the necessary permissions to access the stream.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait KinesisFirehoseInputDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics assumes to access the stream.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisFirehoseInputUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the input Amazon Kinesis Firehose delivery stream to read.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisFirehoseOutput extends js.Object {
    /**
      * ARN of the destination Amazon Kinesis Firehose delivery stream to write to.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait KinesisFirehoseOutputDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisFirehoseOutputUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream to write to.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsInput extends js.Object {
    /**
      * ARN of the input Amazon Kinesis stream to read.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait KinesisStreamsInputDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis stream.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsInputUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the input Amazon Kinesis stream to read.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsOutput extends js.Object {
    /**
      * ARN of the destination Amazon Kinesis stream to write to.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait KinesisStreamsOutputDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis stream.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait KinesisStreamsOutputUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait LambdaOutput extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the destination Lambda function to write to.
      */
    var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ResourceARN
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait LambdaOutputDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the destination Lambda function.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait LambdaOutputUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the destination Lambda function.
      */
    var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
      */
    var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait ListApplicationsRequest extends js.Object {
    /**
      * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to specify this parameter in the first request. However, in subsequent requests, you add the last application name from the previous response to get the next page of applications.
      */
    var ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * Maximum number of applications to list.
      */
    var Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
  }
  
  trait ListApplicationsResponse extends js.Object {
    /**
      * List of ApplicationSummary objects. 
      */
    var ApplicationSummaries: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationSummaries
    /**
      * Returns true if there are more applications to retrieve.
      */
    var HasMoreApplications: BooleanObject
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
  
  trait Output extends js.Object {
    /**
      * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
      */
    var DestinationSchema: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DestinationSchema
    /**
      * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
      */
    var KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput] = js.undefined
    /**
      * Identifies an Amazon Kinesis stream as the destination.
      */
    var KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput] = js.undefined
    /**
      * Identifies an AWS Lambda function as the destination.
      */
    var LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined
    /**
      * Name of the in-application stream.
      */
    var Name: InAppStreamName
  }
  
  trait OutputDescription extends js.Object {
    /**
      * Data format used for writing data to the destination.
      */
    var DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined
    /**
      * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
      */
    var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined
    /**
      * Describes Amazon Kinesis stream configured as the destination where output is written.
      */
    var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined
    /**
      * Describes the AWS Lambda function configured as the destination where output is written.
      */
    var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined
    /**
      * Name of the in-application stream configured as output.
      */
    var Name: js.UndefOr[InAppStreamName] = js.undefined
    /**
      * A unique identifier for the output configuration.
      */
    var OutputId: js.UndefOr[Id] = js.undefined
  }
  
  trait OutputUpdate extends js.Object {
    /**
      * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
      */
    var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined
    /**
      * Describes an Amazon Kinesis Firehose delivery stream as the destination for the output.
      */
    var KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate] = js.undefined
    /**
      * Describes an Amazon Kinesis stream as the destination for the output.
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
  
  trait RecordColumn extends js.Object {
    /**
      * Reference to the data element in the streaming input of the reference data source.
      */
    var Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
    /**
      * Name of the column created in the in-application input stream or reference table.
      */
    var Name: RecordColumnName
    /**
      * Type of column created in the in-application input stream or reference table.
      */
    var SqlType: RecordColumnSqlType
  }
  
  trait RecordFormat extends js.Object {
    /**
      * When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
      */
    var MappingParameters: js.UndefOr[MappingParameters] = js.undefined
    /**
      * The type of record format.
      */
    var RecordFormatType: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordFormatType
  }
  
  trait ReferenceDataSource extends js.Object {
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
      */
    var ReferenceSchema: SourceSchema
    /**
      * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
      */
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined
    /**
      * Name of the in-application table to create.
      */
    var TableName: InAppTableName
  }
  
  trait ReferenceDataSourceDescription extends js.Object {
    /**
      * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference data source to your application using the AddApplicationReferenceDataSource operation.
      */
    var ReferenceId: Id
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
      */
    var ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
    /**
      * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application reference table.
      */
    var S3ReferenceDataSourceDescription: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.S3ReferenceDataSourceDescription
    /**
      * The in-application table name created by the specific reference data source configuration.
      */
    var TableName: InAppTableName
  }
  
  trait ReferenceDataSourceUpdate extends js.Object {
    /**
      * ID of the reference data source being updated. You can use the DescribeApplication operation to get this value.
      */
    var ReferenceId: Id
    /**
      * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
      */
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined
    /**
      * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
      */
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate] = js.undefined
    /**
      * In-application table name that is created by this update.
      */
    var TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined
  }
  
  trait S3Configuration extends js.Object {
    /**
      * ARN of the S3 bucket that contains the data.
      */
    var BucketARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.BucketARN
    /**
      * The name of the object that contains the data.
      */
    var FileKey: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.FileKey
    /**
      * IAM ARN of the role used to access the data.
      */
    var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RoleARN
  }
  
  trait S3ReferenceDataSource extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.BucketARN
    /**
      * Object key name containing reference data.
      */
    var FileKey: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.FileKey
    /**
      * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for the s3:GetObject action on the object and trust policy that allows Amazon Kinesis Analytics service principal to assume this role.
      */
    var ReferenceRoleARN: RoleARN
  }
  
  trait S3ReferenceDataSourceDescription extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARN: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.BucketARN
    /**
      * Amazon S3 object key name.
      */
    var FileKey: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.FileKey
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.
      */
    var ReferenceRoleARN: RoleARN
  }
  
  trait S3ReferenceDataSourceUpdate extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the S3 bucket.
      */
    var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
    /**
      * Object key name.
      */
    var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
    /**
      * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
      */
    var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
  }
  
  trait SourceSchema extends js.Object {
    /**
      * A list of RecordColumn objects.
      */
    var RecordColumns: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordColumns
    /**
      * Specifies the encoding of the records in the streaming source. For example, UTF-8.
      */
    var RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined
    /**
      * Specifies the format of the records on the streaming source.
      */
    var RecordFormat: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.RecordFormat
  }
  
  trait StartApplicationRequest extends js.Object {
    /**
      * Name of the application.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts reading the streaming source associated with the input. You can also specify where in the streaming source you want Amazon Kinesis Analytics to start reading.
      */
    var InputConfigurations: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.InputConfigurations
  }
  
  trait StartApplicationResponse extends js.Object
  
  trait StopApplicationRequest extends js.Object {
    /**
      * Name of the running application to stop.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
  }
  
  trait StopApplicationResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
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
      * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
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
      *  Adds a streaming source to your Amazon Kinesis application. For conceptual information, see Configuring Application Input.  You can add a streaming source either when you create an application or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.  This operation requires permissions to perform the kinesisanalytics:AddApplicationInput action.
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
      *  Adds a streaming source to your Amazon Kinesis application. For conceptual information, see Configuring Application Input.  You can add a streaming source either when you create an application or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.  This operation requires permissions to perform the kinesisanalytics:AddApplicationInput action.
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
      * Adds an InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
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
      * Adds an InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
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
      * Adds an external destination to your Amazon Kinesis Analytics application. If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors. For more information, see Understanding Application Output (Destination).   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. For the limits on the number of application inputs and outputs you can configure, see Limits. This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.
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
      * Adds an external destination to your Amazon Kinesis Analytics application. If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors. For more information, see Understanding Application Output (Destination).   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. For the limits on the number of application inputs and outputs you can configure, see Limits. This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.
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
      * Adds a reference data source to an existing application. Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object maps to columns in the resulting in-application table.  For conceptual information, see Configuring Application Input. For the limits on data sources you can add to your application, see Limits.   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action. 
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
      * Adds a reference data source to an existing application. Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object maps to columns in the resulting in-application table.  For conceptual information, see Configuring Application Input. For the limits on data sources you can add to your application, see Limits.   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action. 
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
      *  Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as input, application code to process the input, and up to three destinations where you want Amazon Kinesis Analytics to write the output data from your application. For an overview, see How it Works.  In the input configuration, you map the streaming source to an in-application stream, which you can think of as a constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each data column in the in-application stream to a data element in the streaming source. Your application code is one or more SQL statements that read input data, transform it, and generate output. Your application code can create one or more SQL artifacts like SQL streams or pumps. In the output configuration, you can configure the application to write data from in-application streams created in your applications to up to three destinations.  To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform the kinesisanalytics:CreateApplication action.   For introductory exercises to create an Amazon Kinesis Analytics application, see Getting Started. 
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
      *  Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as input, application code to process the input, and up to three destinations where you want Amazon Kinesis Analytics to write the output data from your application. For an overview, see How it Works.  In the input configuration, you map the streaming source to an in-application stream, which you can think of as a constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each data column in the in-application stream to a data element in the streaming source. Your application code is one or more SQL statements that read input data, transform it, and generate output. Your application code can create one or more SQL artifacts like SQL streams or pumps. In the output configuration, you can configure the application to write data from in-application streams created in your applications to up to three destinations.  To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform the kinesisanalytics:CreateApplication action.   For introductory exercises to create an Amazon Kinesis Analytics application, see Getting Started. 
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
      * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the application, including any application artifacts (such as in-application streams, reference table, and application code). This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.
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
      * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the application, including any application artifacts (such as in-application streams, reference table, and application code). This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.
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
      * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
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
      * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
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
      * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no longer write data from the corresponding in-application stream to the external output destination. This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.
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
      * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no longer write data from the corresponding in-application stream to the external output destination. This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.
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
      * Deletes a reference data source configuration from the specified application configuration. If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation.  This operation requires permissions to perform the kinesisanalytics.DeleteApplicationReferenceDataSource action.
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
      * Deletes a reference data source configuration from the specified application configuration. If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation.  This operation requires permissions to perform the kinesisanalytics.DeleteApplicationReferenceDataSource action.
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
      * Returns information about a specific Amazon Kinesis Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation. This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You can use DescribeApplication to get the current application versionId, which you need to call other operations such as Update. 
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
      * Returns information about a specific Amazon Kinesis Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation. This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You can use DescribeApplication to get the current application versionId, which you need to call other operations such as Update. 
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
      * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. For conceptual information, see Configuring Application Input. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses this operation to infer a schema and show it in the console user interface.   This operation requires permissions to perform the kinesisanalytics:DiscoverInputSchema action. 
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
      * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. For conceptual information, see Configuring Application Input. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses this operation to infer a schema and show it in the console user interface.   This operation requires permissions to perform the kinesisanalytics:DiscoverInputSchema action. 
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
      * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status. If the response returns the HasMoreApplications value as true, you can send another request by adding the ExclusiveStartApplicationName in the request body, and set the value of this to the last application name from the previous response.  If you want detailed information about a specific application, use DescribeApplication. This operation requires permissions to perform the kinesisanalytics:ListApplications action.
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
      * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status. If the response returns the HasMoreApplications value as true, you can send another request by adding the ExclusiveStartApplicationName in the request body, and set the value of this to the last application name from the previous response.  If you want detailed information about a specific application, use DescribeApplication. This operation requires permissions to perform the kinesisanalytics:ListApplications action.
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
      * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively call this operation to start your application. After the application starts, it begins consuming the input data, processes it, and writes the output to the configured destination.  The application status must be READY for you to start an application. You can get the application status in the console or using the DescribeApplication operation. After you start the application, you can stop the application from processing the input by calling the StopApplication operation. This operation requires permissions to perform the kinesisanalytics:StartApplication action.
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
      * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively call this operation to start your application. After the application starts, it begins consuming the input data, processes it, and writes the output to the configured destination.  The application status must be READY for you to start an application. You can get the application status in the console or using the DescribeApplication operation. After you start the application, you can stop the application from processing the input by calling the StopApplication operation. This operation requires permissions to perform the kinesisanalytics:StartApplication action.
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
      * Stops the application from processing input data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and there is no output written to the destination.  This operation requires permissions to perform the kinesisanalytics:StopApplication action.
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
      * Stops the application from processing input data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and there is no output written to the destination.  This operation requires permissions to perform the kinesisanalytics:StopApplication action.
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
      * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input configuration, and output configuration.  Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your application.  This operation requires permission for the kinesisanalytics:UpdateApplication action.
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
      * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input configuration, and output configuration.  Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your application.  This operation requires permission for the kinesisanalytics:UpdateApplication action.
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
      * Name of the Amazon Kinesis Analytics application to update.
      */
    var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationName
    /**
      * Describes application updates.
      */
    var ApplicationUpdate: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ApplicationUpdate
    /**
      * The current application version ID. You can use the DescribeApplication operation to get this value.
      */
    var CurrentApplicationVersionId: ApplicationVersionId
  }
  
  trait UpdateApplicationResponse extends js.Object
  
  trait _ApplicationStatus extends js.Object
  
  trait _InputStartingPosition extends js.Object
  
  trait _RecordFormatType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ApplicationCode = java.lang.String
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = _ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = java.lang.String
  type InputConfigurations = js.Array[InputConfiguration]
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOW
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = _InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type ListApplicationsInputLimit = scala.Double
  type LogStreamARN = java.lang.String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = _RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-08-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

