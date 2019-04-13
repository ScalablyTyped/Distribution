package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisAnalyticsV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KinesisAnalyticsV2: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

