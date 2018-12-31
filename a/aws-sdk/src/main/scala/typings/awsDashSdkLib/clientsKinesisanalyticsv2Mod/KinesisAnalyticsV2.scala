package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisAnalyticsV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KinesisAnalyticsV2: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ClientConfiguration = js.native
  /**
    * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
    */
  def addApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationCloudWatchLoggingOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
    */
  def addApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
    */
  def addApplicationInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
    */
  def addApplicationInput(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInput(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
    */
  def addApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
    */
  def addApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
    */
  def addApplicationOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
    */
  def addApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
    */
  def addApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationReferenceDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
    */
  def addApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.   SQL is not enabled for this private beta release. Using SQL parameters (such as SqlApplicationConfiguration) will result in an error. 
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.   SQL is not enabled for this private beta release. Using SQL parameters (such as SqlApplicationConfiguration) will result in an error. 
    */
  def createApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of the application's state data.
    */
  def createApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplicationSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of the application's state data.
    */
  def createApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.CreateApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
    */
  def deleteApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application. 
    */
  def deleteApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application. 
    */
  def deleteApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
    */
  def deleteApplicationOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
    */
  def deleteApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
    */
  def deleteApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationReferenceDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
    */
  def deleteApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a snapshot of application state.
    */
  def deleteApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a snapshot of application state.
    */
  def deleteApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DeleteApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
    */
  def describeApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
    */
  def describeApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a snapshot of application state data.
    */
  def describeApplicationSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplicationSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a snapshot of application state data.
    */
  def describeApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplicationSnapshot(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DescribeApplicationSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
    */
  def discoverInputSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverInputSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
    */
  def discoverInputSchema(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverInputSchema(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about the current application snapshots.
    */
  def listApplicationSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplicationSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about the current application snapshots.
    */
  def listApplicationSnapshots(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplicationSnapshots(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationSnapshotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
    */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
    */
  def listApplications(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplications(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.  SQL is not enabled for this private beta. Using SQL parameters (such as RunConfiguration$SqlRunConfigurations) will result in an error. 
    */
  def startApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.  SQL is not enabled for this private beta. Using SQL parameters (such as RunConfiguration$SqlRunConfigurations) will result in an error. 
    */
  def startApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the application from processing data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. 
    */
  def stopApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the application from processing data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. 
    */
  def stopApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   SQL is not enabled for this private beta. Using SQL parameters (such as SqlApplicationConfigurationUpdate) will result in an error. 
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   SQL is not enabled for this private beta. Using SQL parameters (such as SqlApplicationConfigurationUpdate) will result in an error. 
    */
  def updateApplication(params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsv2Mod.KinesisAnalyticsV2Ns.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

